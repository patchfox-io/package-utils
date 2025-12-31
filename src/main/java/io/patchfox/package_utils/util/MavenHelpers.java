package io.patchfox.package_utils.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.packageurl.MalformedPackageURLException;

import io.patchfox.package_utils.data.pkg.PackageWrapper;
import io.patchfox.package_utils.data.pkg.java.Artifact;
import io.patchfox.package_utils.data.pkg.java.Semantic;
import io.patchfox.package_utils.data.pkg.java.Version;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class MavenHelpers {

    private static final Logger LOG = LoggerFactory.getLogger(MavenHelpers.class);

    // when maven prints the dep tree the output is formatted in a manner where the substring tag
    // we look for in processing the record ("- ") is indented a different number of spaces
    // depending on what kind of dependency it is. These magic numbers are here to help us figure
    // out where in the tree structure to attach a given node.
    //
    // *remember* for the root node, the treeDepth value will be (-1) because the substring we
    // look for isn't present. so even though the substring ("- ") starts at index=1 in the string
    // the delta between it and the root-node treeDepth is (1 - (-1) = 2)
    public static final int MAVEN_TREE_DEPTH_DELTA_DIRECT_DEPENDENCIES = 2;
    public static final int MAVEN_TREE_DEPTH_DELTA_TRANSITIVE_DEPENDENCIES = 3; 

    // keeps code that might need this clean  
    public static final Pair<Integer, Integer> TREE_DEPTH = 
        new Pair<>(
            MAVEN_TREE_DEPTH_DELTA_DIRECT_DEPENDENCIES, 
            MAVEN_TREE_DEPTH_DELTA_TRANSITIVE_DEPENDENCIES
        );

    /**
     * Given a string representation of a dependency graph line, will generate a Pair containing
     * the tree depth of this artifact and an Artifact instance.
     * 
     * This function will analyze the depgraph, split up the components which name the artifact,
     * take into consideration how the artifact line is structured, all of which will be used
     * to populate the Artifact object as well as how deep in the artifact tree this dependency
     * is
     * 
     * @param depgraphLine the line to parse
     * @return a Pair containing the tree depth on the Left of the pair, and the Artifact on the Right
     */
    public static Pair<Integer, Artifact> getMavenArtifact(String depgraphLine) {

        Integer version_major = 0;
        Integer version_minor = 0;
        Integer version_patch = 0;
        String version_tag = "";

        String scope = "";
        String notes = "";

        // for every record except the first, the first instance of "- " will precede the record and tell us (1) where
        // in the string the record starts (2) who the parent of the record is.
        Integer treeDepth = depgraphLine.indexOf("- ");
        Integer recordStartIndex = treeDepth + 1;
        String record = depgraphLine.substring(recordStartIndex);

        String[] depgraphLineSplitString = record.split(":");
        String groupId = depgraphLineSplitString[0].strip(); // in case the first element is prepended with a ' '.
        String artifactId = depgraphLineSplitString[1];
        String artifactType = depgraphLineSplitString[2];

        String versionString = depgraphLineSplitString[3];
        String[] versionSplitString = versionString.split(Pattern.quote("."));

        if (versionSplitString.length >= 1) {
            try {
                version_major = Integer.parseInt(versionSplitString[0]);
            } catch (NumberFormatException e) {
                version_tag = versionSplitString[0];
            }
        }

        if (versionSplitString.length >= 2) {

            try {
                version_minor = Integer.parseInt(versionSplitString[1]);
            } catch (NumberFormatException e) {
                version_tag = versionSplitString[1];
            }

        }

        if (versionSplitString.length >= 3) {
            try {
                version_minor = Integer.parseInt(versionSplitString[1]);
                version_patch = Integer.parseInt(versionSplitString[2]);
            } catch (NumberFormatException e) {
                version_tag = versionSplitString[1] + " " + versionSplitString[2];
            }
        }

        if (versionSplitString.length >= 4) {
            try {
                version_patch = Integer.parseInt(versionSplitString[2]);
            } catch (NumberFormatException e) {
                version_tag = versionSplitString[3];
            }
        }

        if (versionSplitString.length >= 4) {
            version_tag = versionSplitString[3];
        }

        if (depgraphLineSplitString.length >= 5) {
            String scopeNotesRaw = depgraphLineSplitString[4];
            if (scopeNotesRaw.indexOf(" ") > -1) {
                scope = scopeNotesRaw.substring(0, scopeNotesRaw.indexOf(" "));
                notes = scopeNotesRaw.substring(scopeNotesRaw.indexOf(" ") + 1);
            } else {
                scope = scopeNotesRaw;
            }
        }


        Semantic semantic = new Semantic().withMajor(version_major)
                                          .withMinor(version_minor)
                                          .withPatch(version_patch)
                                          .withTag(version_tag);

        Version version = new Version().withVersion(versionString)
                                       .withSemantic(semantic);

        Artifact artifact = new Artifact().withGroupId(groupId)
                                          .withArtifactId(artifactId)
                                          .withArtifactType(artifactType)
                                          .withVersion(version)
                                          .withScope(scope)
                                          .withNotes(notes);

        LOG.debug("treeDepth is: {}", treeDepth);
        LOG.debug("node is: {}", artifact.getArtifactId());
        LOG.debug("node version is: {}", artifact.getVersion().getVersion());
        LOG.debug("node version major is: {}", artifact.getVersion().getSemantic().getMajor());
        LOG.debug("node version minor is: {}", artifact.getVersion().getSemantic().getMinor());
        LOG.debug("node version patch is: {}", artifact.getVersion().getSemantic().getPatch());
        LOG.debug("node version tag is: {}", artifact.getVersion().getSemantic().getTag());
        LOG.debug("node artifactType is: {}", artifact.getArtifactType());
        LOG.debug("node scope is: {}", artifact.getScope());
        LOG.debug("node notes is: {}", artifact.getNotes());

        return new Pair<>(treeDepth, artifact);
    }

    /**
     * Parses each of a list of dependency graph lines, building up a Pair with the dependency
     * tree depth on the left of the Pair, and an Artifact containing the data in the line on the right,
     * then collecting them all into a list.
     * 
     * @param depgraphLines
     * @return list of Pairs representing the artifacts and their position in the dependency graph
     */
    public static List<Pair<Integer, PackageWrapper>> 
            processMavenDepgraphLines(List<String> depgraphLines, String projectName) throws MalformedPackageURLException { 

        List<Pair<Integer, PackageWrapper>> rv = new ArrayList<>();
        for (var line : depgraphLines) {
            var artifactPair = MavenHelpers.getMavenArtifact(line);
            var index = artifactPair.getLeft();
            var artifact = artifactPair.getRight();
            var dependency = PackageWrapperHelpers.getDependencyForJavaArtifact(artifact, projectName);
            rv.add(new Pair<>(index, dependency));
        }

        return rv;
    }


    /**
     * Parses a full maven dependency graph file, breaking down each line into a Pair with the dependency
     * tree depth on the left of the Pair, and an Artifact containing the data in the line on the right,
     * then collecting them all into a list.
     * 
     * @param mavenDepgraphFile
     * @return list of Pairs representing the artifacts and their position in the dependency graph
     */
    public static List<Pair<Integer, PackageWrapper>> unmarshallMavenDepgraph(File mavenDepgraphFile, String projectName) {

        try {
            List<String> depgraphLines = Files.readAllLines(mavenDepgraphFile.toPath());
            return processMavenDepgraphLines(depgraphLines, projectName);
        } catch (IOException | MalformedPackageURLException e) {
            LOG.error("caught exception:", e);
            LOG.error("something went wrong reading depgraph file: {}", mavenDepgraphFile);
            throw new RuntimeException("something went wrong reading depgraph file");
        }


    }

}
