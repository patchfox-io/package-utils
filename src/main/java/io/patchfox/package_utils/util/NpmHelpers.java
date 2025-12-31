package io.patchfox.package_utils.util;
// package io.patchfox.ingest.util;


// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.github.packageurl.MalformedPackageURLException;
// import io.patchfox.ingest.json.pkg.Dependency;
// import io.patchfox.ingest.json.pkg.npm.NpmArtifact;
// import io.patchfox.ingest.json.pkg.npm.Semantic;
// import io.patchfox.ingest.json.pkg.npm.Version;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import java.io.File;
// import java.util.*;
// import java.util.stream.Collectors;


// public class NpmHelpers {
    
//     private static final Logger LOG = LoggerFactory.getLogger(NpmHelpers.class);

//     @JsonIgnoreProperties(ignoreUnknown = true)
//     private static class NpmDepgraph extends NpmDependency {
//         public String name;
//     }

//     @JsonIgnoreProperties(ignoreUnknown = true)
//     private static class NpmDependency {
//         public String version;
//         public Map<String, NpmDependency> dependencies;
//     }

//     /**
//      * Given a depgraph file, this parses the file and returns a list of the dependencies paired with their depth.
//      * The file is expected to contain json information about the dependency structure and will fail otherwise
//      * @param depgraphFile the file to be processed
//      * @param projectName name of the project
//      * @return a list of depth/dependency pairs
//      * @throws IllegalArgumentException if this method was passed something malformed or unparseable
//      * @throws MalformedPackageURLException if a Purl object could not be constructed in an Artifact
//      */
//     public static Dependency unmarshallDepgraph(File depgraphFile, String projectName)
//                 throws IllegalArgumentException, MalformedPackageURLException {
//         ObjectMapper mapper = new ObjectMapper();
//         NpmDepgraph depgraph;
//         try {
//             depgraph = mapper.readValue(depgraphFile, NpmDepgraph.class);
//             LOG.debug("deserialized");
//         } catch (Exception e) {
//             LOG.error("failed deserialization", e);
//             throw new IllegalArgumentException("failed parsing depgraph file");
//         }

//         Dependency rootNode = npmDepToDependency(depgraph.name, depgraph, projectName);
//         rootNode.setIsRoot(true);
//         rootNode.setChildren(parseDependencies(depgraph.dependencies, projectName));
//         return rootNode;
//     }

//     /**
//      * recursively builds a list of dependencies, going through the depth of artifacts
//      * @param depgraph dependency graph to parse
//      * @param projectName name of the project
//      * @return a list of depth/dependency pairs
//      * @throws MalformedPackageURLException if a purl object cannot be built
//      */
//     private static List<Dependency> parseDependencies(Map<String, NpmDependency> depgraph, String projectName)
//                 throws MalformedPackageURLException {
//         if (depgraph.isEmpty()) {
//             return List.of();
//         }

//         List<Dependency> depList = new ArrayList<>();
//         for (Map.Entry<String, NpmDependency> entry: depgraph.entrySet()) {
//             Dependency dependency = NpmHelpers.npmDepToDependency(entry.getKey(), entry.getValue(), projectName);

//             Map<String, NpmDependency> children = entry.getValue().dependencies;

//             if (children != null) {
//                 // parse and add any dependents
//                 dependency.setChildren(parseDependencies(children, projectName));
//             }


//             depList.add(dependency);
//         }
//         return depList;
//     }

//     /**
//      * Converts the provided npmDependency to a Dependency object. This assumes that the name and dependency are in
//      * the same Map object
//      * @param npmDependency map entry containing name as the key and dependency object as the value
//      * @param projectName name of the project
//      * @return a Dependency object to be used elsewhere
//      * @throws MalformedPackageURLException if we can't build a good Purl object
//      */
//     private static Dependency npmDepToDependency(String name, NpmDependency npmDependency, String projectName)
//                 throws MalformedPackageURLException {
//         NpmArtifact artifact = getArtifact(name, npmDependency);
//         return DependencyHelpers.getDependencyForNpmArtifact(artifact, projectName);
//     }

//     /**
//      * Builds an Artifact for the given dependency and its name
//      * @param name name of the dependency (no, this isn't in the npm dependency object)
//      * @param npmDependency information about the dependency
//      * @return Artifact object
//      */
//     private static NpmArtifact getArtifact(String name, NpmDependency npmDependency) {
//         Version version = getVersion(npmDependency);
//         return new NpmArtifact()
//                 .withArtifactId(name)
//                 .withVersion(version);
//     }

//     /**
//      * Fetch version for the dependency
//      *
//      * @param npmDependency dependency from which to grab a version
//      * @return Version object representing the dependency's version
//      */
//     private static Version getVersion(NpmDependency npmDependency) {
//         return new Version()
//                 .withSemantic(getSemanticVersion(npmDependency))
//                 .withVersion(npmDependency.version);
//     }

//     /**
//      * Determines the Semantic version of the provided NpmDependency Note that, due to the way npm works,
//      * the versions should _always_ be of the format `x.y.z`, but we'll be a bit safe about it
//      * @param npmDependency the dependency to parse
//      * @return semantic version representation of the dependency's version
//      */
//     private static Semantic getSemanticVersion(NpmDependency npmDependency) {
//         Integer major = 0, minor = 0, patch = 0;
//         String tag = "";

//         // apparently, some dependencies in NPM are allowed to just like not have a version, which is
//         // super awesome. If we can't detect a true version, we'll just use 0.0.0 with a tag of "unidentified"
//         // for now; at least that way we have more data and can filter it out when reading
//         if (npmDependency.version == null) {
//             return Semantic.blankVersion().withTag("unidentified");
//         }

//         String[] parts = npmDependency.version.split("\\.");
//         if (parts.length < 1) {
//             throw new IllegalArgumentException(
//                     String.format("version was a malformed string: [%s]", npmDependency.version)
//             );
//         }
//         major = Integer.parseInt(parts[0]);
//         if (parts.length >= 2) {
//             minor = Integer.parseInt(parts[1]);
//         }
//         if (parts.length >= 3) {
//             // there _may_ be a space and a tag as part of this portion, so we'll look for that
//             String[] patchParts = parts[2].split("-");
//             patch = Integer.parseInt(patchParts[0]);
//             if (patchParts.length >= 2) {
//                 tag = patchParts[1];
//             }
//         }
//         return new Semantic()
//                 .withMajor(major)
//                 .withMinor(minor)
//                 .withPatch(patch)
//                 .withTag(tag);
//     }



//     private static List<Pair<Integer, NpmDependency>> toDepthList(Map<String, NpmDependency> dependencyMap, Integer depth) {
//         return dependencyMap.values()
//             .stream()
//             .map(it -> {
//                 return new Pair<>(depth, it);
//             })
//             .collect(Collectors.toCollection(ArrayList::new));
//     }
// }


