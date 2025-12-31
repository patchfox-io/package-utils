package io.patchfox.package_utils.util;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Stack;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.packageurl.MalformedPackageURLException;

import io.patchfox.package_utils.data.pkg.MavenIndexPackageData;
import io.patchfox.package_utils.data.pkg.NpmIndexPackageData;
import io.patchfox.package_utils.data.pkg.PackageWrapper;
import io.patchfox.package_utils.data.pkg.java.Artifact;
import io.patchfox.package_utils.data.pkg.npm.Package;


public class PackageWrapperHelpers {

    private static final Logger LOG = LoggerFactory.getLogger(PackageWrapperHelpers.class);

    /**
     *
     * @param packagePairs
     * @param projectName
     * @param depGraphDepth
     * @return
     * @throws MalformedPackageURLException
     */
    public static PackageWrapper buildDepgraphTree (
                @NotNull List<Pair<Integer, PackageWrapper>> packagePairs, 
                @NotNull String projectName,
                @NotNull Pair<Integer, Integer> depGraphDepth) throws MalformedPackageURLException {

        Integer treeDepthDeltaDirectDependencies = depGraphDepth.getLeft();
        Integer treeDepthDeltaTransitiveDependencies = depGraphDepth.getRight();

        Pair<Integer, PackageWrapper> rootPair = packagePairs.get(0);
        PackageWrapper rootNode = rootPair.getRight();

        // stop here if there's only one element in depgraphPairs
        if (packagePairs.size() == 1) { return rootNode; }
        // isRoot defaults to false. if the root node has children we need to toggle that switch before proceeding 
        else { rootNode.setIsRoot(true); }

        // // iterate through depgraphPairs, starting after the root node, and build an object tree representing the
        // // maven dependency graph.
        Stack<Pair<Integer, PackageWrapper>> parentStack = new Stack<>();
        parentStack.push(rootPair);
        Pair<Integer, PackageWrapper> lastPairProcessed = rootPair;
        for (Pair<Integer, PackageWrapper> dependencyPair : packagePairs.subList(1, packagePairs.size())) {
            LOG.debug("****");
            LOG.debug("rootNode children size: {}", rootNode.getAllChildrenTypes().size());
            LOG.debug("parentStack is: {}", parentStack);
            Integer treeDepth = dependencyPair.getLeft();
            PackageWrapper dependency = dependencyPair.getRight();
            LOG.debug("dependency is: {}", dependency.getPurl());                                                  

            Integer currentParentTreeDepth = parentStack.peek().getLeft();
            Integer treeDepthDelta = treeDepth - currentParentTreeDepth;

            LOG.debug("treedepth is: {}  currentParentTreeDepth: {}  treeDepthDelta: {}", 
                treeDepth, currentParentTreeDepth, treeDepthDelta);

            // if treeDepthDelta is one standard unit we want to add the current node to the current parent
            if (treeDepthDelta.equals(treeDepthDeltaDirectDependencies)
                    || treeDepthDelta.equals(treeDepthDeltaTransitiveDependencies)) {

                parentStack.peek().getRight().addChild(dependency); //getChildren().add(dependency);
            }
            // if the treeDepthDelta grows it will only ever be by a single level of tree depth.
            // what that means is the current node is child of the last node we processed.
            else if (treeDepthDelta > treeDepthDeltaTransitiveDependencies) {

                // the root node will already be present in the stack so make sure we don't double add it
                if ( ! parentStack.peek().equals(lastPairProcessed)) {
                //if (lastPairProcessed.getLeft() != -1) {
                    parentStack.push(lastPairProcessed);
                }

                parentStack.peek().getRight().addChild(dependency);
            }
            // if treeDepthDelta is zero it means we're adding a node to the existing level
            // the second check is to check for case where what's at the head of the parent stack has the same 
            // parent as "dependency"
            else if (treeDepthDelta == 0 && parentStack.peek().getLeft() != treeDepth) {
                parentStack.peek().getRight().addChild(dependency);
            }
            // if we're here it means treeDepthDelta has gone negative, indicating we've reached the last node in the
            // branch and need to pop parents out of the parentStack until we find the one to which the current
            // depgraphNode is a child of.
            else {
                boolean done = false;
                while (done == false) {
                    LOG.debug("************************************************* popping parent stack");
                    parentStack.pop();
                    LOG.debug("parent stack is now: {}", parentStack);
                    currentParentTreeDepth = parentStack.peek().getLeft();
                    treeDepthDelta = treeDepth - currentParentTreeDepth;
                    LOG.debug("currentParentTreeDepth: {}  treeDepthDelta: {}", currentParentTreeDepth, treeDepthDelta);
                    LOG.debug("treeDepthDeltaDirectDependencies: {}  treeDepthDeltaTransitiveDependencies: {}", 
                        treeDepthDeltaDirectDependencies, treeDepthDeltaTransitiveDependencies);
                    // add node to current parent
                    if (treeDepthDelta == treeDepthDeltaDirectDependencies
                            || treeDepthDelta == treeDepthDeltaTransitiveDependencies) {
                        
                        LOG.debug("adding: {} to current parent: {}", 
                            dependency.getPurl(), 
                            parentStack.peek().getRight().getPurl());

                        parentStack.peek().getRight().addChild(dependency);
                        done = true;
                    }

                    // this should never happen...
                    if (done == false && parentStack.isEmpty()) {
                        LOG.error("something went wrong finding a parent for node {}", dependency);
                        throw new RuntimeException();
                    }

                }

            }

            lastPairProcessed = new Pair<>(treeDepth, dependency);
        }

        LOG.debug("returning rootNode with childSize: {}", rootNode.getAllChildrenTypes().size());
        return rootNode;
    }   

    
    /**
     * 
     * @param artifact
     * @return
     * @throws MalformedPackageURLException
     */
    public static PackageWrapper getDependencyForJavaArtifact(
                    Artifact artifact, String projectName) throws MalformedPackageURLException {
        LOG.debug("artifact is: {}", artifact.getArtifactString());

        return new PackageWrapper.Builder()
                                 .withProjectName(projectName)
                                 .withDependencyPackageData(new MavenIndexPackageData(artifact))
                                 .build();
    }


    /**
     * 
     * @param pkg
     * @param projectName
     * @return
     * @throws MalformedPackageURLException
     */
    public static PackageWrapper getDependencyForNpmArtifact(
                    Package pkg, String projectName) throws MalformedPackageURLException {

        return new PackageWrapper.Builder()
                                 .withProjectName(projectName)
                                 .withDependencyPackageData(new NpmIndexPackageData(pkg))
                                 .build();
    }


    /**
     * 
     * @param decodeMe
     * @return
     */
    public static String urlDecode(String decodeMe) {
        return java.net.URLDecoder.decode(decodeMe, StandardCharsets.UTF_8);
    }

}
