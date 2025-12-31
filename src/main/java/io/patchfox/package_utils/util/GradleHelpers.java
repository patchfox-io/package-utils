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
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class GradleHelpers {
    
    private static final Logger LOG = LoggerFactory.getLogger(GradleHelpers.class);

    // *!* see comments in MavenHelpers as to what these numbers are...
    public static final int GRADLE_TREE_DEPTH_DELTA_DIRECT_DEPENDENCIES = 4;
    public static final int GRADLE_TREE_DEPTH_DELTA_TRANSITIVE_DEPENDENCIES = 5; 

    // keeps code that might need this clean  
    public static final Pair<Integer, Integer> TREE_DEPTH = 
        new Pair<>(
            GRADLE_TREE_DEPTH_DELTA_DIRECT_DEPENDENCIES, 
            GRADLE_TREE_DEPTH_DELTA_TRANSITIVE_DEPENDENCIES
        );

    public static Pair<Integer, Artifact> getGradleArtifact(String depgraphLine) {

        Integer version_major = 0;
        Integer version_minor = 0;
        Integer version_patch = 0;
        String version_tag = "";

        String scope = "";
        String notes = "";

        // for every record the first instance of "- " will precede the record and tell us (1) where
        // in the string the record starts (2) who the parent of the record is.
        Integer treeDepth = depgraphLine.indexOf("- ");
        Integer recordStartIndex = treeDepth + 1;
        String record = depgraphLine.substring(recordStartIndex);

        String[] depgraphLineSplitString = record.split(":");
        String groupId = depgraphLineSplitString[0].strip(); // in case the first element is prepended with a ' '.
        String artifactId = depgraphLineSplitString[1];
        String versionString = depgraphLineSplitString[2];
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
                // here we are looking for both the patch version value and any output annotations 
                // https://docs.gradle.org/current/userguide/viewing_debugging_dependencies.html#output_annotations
                var splitVersionPatch = versionSplitString[2].split(" ");
                version_patch = Integer.parseInt(splitVersionPatch[0]);
                if (splitVersionPatch.length > 1) {
                    var notesList = Arrays.asList(splitVersionPatch)
                                          .subList(1, splitVersionPatch.length);
                    
                    notes = String.join(" ", notesList);
                }
                                        
            } catch (NumberFormatException e) {
                version_tag = versionSplitString[1] + " " + versionSplitString[2];
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

    public static List<Pair<Integer, PackageWrapper>> 
            unmarshallGradleDepgraph(File gradleDepgraphFile, String projectName) 
                throws IllegalArgumentException, MalformedPackageURLException {

        try {
            List<String> depgraphLines = Files.readAllLines(gradleDepgraphFile.toPath());
            String runtimeClasspathStartMarker = "runtimeClasspath -";
            // in gradle depgraph land '\n' should be the first char of the last line of the section - which is recorded
            // in depgraphLines when printed as a space (" ") but in reality is an empty string (""). 
            String runtimeClasspathEndMarker = ""; 

            // exception is caught if optional is empty
            var runtimeClassPathStartIndex = 
                findFrom(runtimeClasspathStartMarker, 0, depgraphLines).get() + 1;

            LOG.debug("runtimeClassPathStartIndex is: {}", runtimeClassPathStartIndex);
            LOG.debug(
                "list at index {} is {}", 
                runtimeClassPathStartIndex, 
                depgraphLines.get(runtimeClassPathStartIndex)
            );
            LOG.debug("depgraphLines: {}", depgraphLines);
            var runtimeClassPathEndIndex = 
                findFromExact(runtimeClasspathEndMarker, runtimeClassPathStartIndex, depgraphLines).get();

            LOG.debug("runtimeClasspathEndIndex is: {}", runtimeClassPathEndIndex);
            LOG.debug(
                "list at index {} is {}", 
                runtimeClassPathEndIndex, 
                depgraphLines.get(runtimeClassPathEndIndex)
            );

            // this catches a case where there is a runTimeClassPath defined but the data set is empty
            if (depgraphLines.get(runtimeClassPathStartIndex).equals("No dependencies")) {
                throw new IllegalArgumentException("unable to process provided gradle build file");
            }

            List<Pair<Integer, PackageWrapper>> depgraphPairs = new ArrayList<>();
            for (var line : depgraphLines.subList(runtimeClassPathStartIndex, runtimeClassPathEndIndex)) {
                LOG.debug("line is: {}", line);
                var artifactPair = GradleHelpers.getGradleArtifact(line);
                LOG.debug("artifactPair is: {}", artifactPair);
                var index = artifactPair.getLeft();
                var artifact = artifactPair.getRight();
                var dependency = PackageWrapperHelpers.getDependencyForJavaArtifact(artifact, projectName);
                depgraphPairs.add(new Pair<>(index, dependency));
            }

            LOG.debug(
                "depgraphLines sublist: {}", 
                depgraphLines.subList(runtimeClassPathStartIndex, runtimeClassPathEndIndex)
            );
            LOG.debug("depgraphPairs: {}", depgraphPairs);

            /* */
            LOG.debug("adding empty artifact at list head to accomidate a delta between gradle and maven reporting...");

            // the type is still "maven" because that's the name for the package ecosystem most of javaland uses 
            // regardless of whether or not the build system is actually "maven"

            var dummyDependency = PackageWrapper.getMavenDummy(projectName).get();
            var emptyRootPair = new Pair<>(-1, dummyDependency);
            depgraphPairs.add(0, emptyRootPair);
            /* */
            LOG.debug("depgraph pairs is: {}", depgraphPairs);
            return depgraphPairs;
        } catch (IOException e) {
            LOG.error("caught exception:", e);
            LOG.error("something went wrong reading depgraph file: {}", gradleDepgraphFile);
            throw new RuntimeException("something went wrong reading depgraph file");
        } catch (NoSuchElementException ee) {
            LOG.error("caught exception: ", ee);
            throw new IllegalArgumentException("unable to process provided gradle build file");
        }


    }


    private static Optional<Integer> findFrom(String startsWithValue, int index, List<String> list) {

        if (index >= list.size()) {
            throw new IllegalArgumentException(
                String.format("requested index {} exceeds list size of {}", index, list.size())
            );
        }

        var foundIndexList = IntStream.range(index, list.size())
                                      .filter(i -> list.get(i).startsWith(startsWithValue))
                                      .boxed() // because int stream isn't a stream of Integers...
                                      .collect(Collectors.toList());

        Optional<Integer> rv = foundIndexList.isEmpty() ? Optional.empty() : Optional.of(foundIndexList.get(0));
        return rv;
    }

    private static Optional<Integer> findFromExact(String value, int index, List<String> list) {

        if (index >= list.size()) {
            throw new IllegalArgumentException(
                String.format("requested index {} exceeds list size of {}", index, list.size())
            );
        }
        
        var foundIndexList = IntStream.range(index, list.size())
                                      .filter(i -> list.get(i).equals(value))
                                      .boxed() // because int stream isn't a stream of Integers...
                                      .collect(Collectors.toList());

        Optional<Integer> rv = foundIndexList.isEmpty() ? Optional.empty() : Optional.of(foundIndexList.get(0));
        return rv;
    }


}


