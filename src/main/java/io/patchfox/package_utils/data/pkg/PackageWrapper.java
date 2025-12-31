package io.patchfox.package_utils.data.pkg;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;
import com.github.packageurl.PackageURLBuilder;

import io.patchfox.package_utils.data.oss.OssPackageData;
import io.patchfox.package_utils.data.oss.OssReportPackageData;
import io.patchfox.package_utils.data.pkg.PackageData.PackageDataType;
import io.patchfox.package_utils.data.pkg.java.Artifact;
import io.patchfox.package_utils.util.PackageDataMapJsonDeserializer;
import io.patchfox.package_utils.util.PackageUrlJsonDeserializer;
import io.patchfox.package_utils.util.PackageWrapperHelpers;


/*
 * see https://github.com/package-url/purl-spec/blob/master/PURL-SPECIFICATION.rst
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "purl",
    "dependencyType",
    "projectName",
    "packageData",
    "children",
})
public class PackageWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(PackageWrapper.class);

    // because we can't use a switch statement with the result of Clazz.class.getName()
    public static final String CLASSNAME = "io.patchfox.package_utils.data.pkg.PackageWrapper";  

    public static final String GENERIC_PACKAGE_TYPE = "generic";

    // 

    public PackageWrapper() throws MalformedPackageURLException {
        this.purl = PackageURLBuilder.aPackageURL().withName("foo").withType(GENERIC_PACKAGE_TYPE).build();
        this.dependencyType = null;
    }

    @JsonDeserialize(using = PackageUrlJsonDeserializer.class)
    @JsonProperty("purl")
    private final PackageURL purl;

    @JsonProperty("dependencyType")
    private final DependencyTypeEnum dependencyType;

    @JsonProperty("projectName")
    private String projectName;

    @JsonDeserialize(using = PackageDataMapJsonDeserializer.class)
    @JsonProperty("packageData")
    private Map<PackageData.PackageDataType, List<PackageData>> dependencyData = new HashMap<>();

    @JsonProperty("children")
    private List<PackageWrapper> children = new ArrayList<>();

    @JsonProperty("isRoot")
    private boolean isRoot;

    //

    @JsonIgnore
    private Optional <? extends IndexPackageData<?>> packageDependencyData;

    //

    /**
     * 
     * @param purl
     * @param projectName
     * @param dependencyData
     * @param children
     */
    private PackageWrapper(
            PackageURL purl, 
            String projectName, 
            Map<PackageData.PackageDataType, List<PackageData>> dependencyData,
            List<PackageWrapper> children,
            boolean isRoot,
            Optional<? extends IndexPackageData<?>> dependencyPackageData
        ) { 

        try {
            // because sometimes this happens
            // pkg:npm/%40ag-grid-community/angular@31.0.1
            //var decodedPurl =  DependencyHelpers.urlDecode(purl.toString());
            //LOG.debug("purl is: {}  decodedPurl: {}", purl, decodedPurl);
            this.purl = new PackageURL(purl.toString()); // if you decode the string sometimes there are parsing errors 
        } catch (MalformedPackageURLException e) {
            LOG.error("caught unexpected exception: {}", e);
            // literally can't happen because the source string is from a valid purl
            throw new IllegalArgumentException();
        }
        
        // https://github.com/package-url/purl-spec/blob/master/PURL-TYPES.rst
        switch (purl.getType()) {
            case "maven":
                this.dependencyType = DependencyTypeEnum.MAVEN;
                break;
            case "npm":
                this.dependencyType = DependencyTypeEnum.NPM;
                break;
            default:
                this.dependencyType = DependencyTypeEnum.UNRECOGNIZED;
        }

        this.projectName = projectName;
        this.dependencyData = dependencyData;
        this.children = children;
        this.isRoot = isRoot;
        this.packageDependencyData = dependencyPackageData;
    }

    //

    /**
     * 
     * @return
     */
    public static PackageWrapper getDummy() {
        return PackageWrapper.getDummyWithFields().get();
    }


    /**
     * 
     * @return
     */
    public static Optional<PackageWrapper> getDummyWithFields(String... fields) {
        try {
            var dummy = new PackageWrapper.Builder()
                                      .withType(fields.length > 0 ? fields[0] : "generic")
                                      .withNamespace(fields.length > 1 ? fields[1] : "DUMMY")
                                      .withName(fields.length > 2 ? fields[2] : "DUMMY")
                                      .withProjectName(fields.length > 2 ? fields[2] : "DUMMY")
                                      .withVersion(fields.length > 3 ? fields[3] : "DUMMY")
                                      .build();

            return Optional.of(dummy);
        } catch (MalformedPackageURLException e) {
            LOG.error("something went very wrong - we should not be here", e);
            return Optional.empty();
        }
    }


    /**
     * 
     * @param name
     * @return
     */
    public static Optional<PackageWrapper> getMavenDummy(String name) {
        return getDummyWithFields("maven", "DUMMY_JAVA", name);
    }

    //

    public static class Builder {

        private PackageURLBuilder purlBuilder = PackageURLBuilder.aPackageURL();

        private PackageURL purl;

        private String projectName = "UNKNOWN";

        //private List<DependencyData> dependencyData = new ArrayList<>();
        private Map<PackageData.PackageDataType, List<PackageData>> dependencyData = new HashMap<>();

        private List<PackageWrapper> children = new ArrayList<>();

        private boolean isRoot = false;

        Optional<? extends IndexPackageData<?>> packageDependencyData = Optional.empty();

        //

        public Builder withPurl(PackageURL purl) {
                this.purl = purl;
                return this;
        }

        public Builder withType(String type) {
            purlBuilder.withType(type);
            return this;
        }

        /**
         * 
         * @param nameSpace
         * @return
         */
        public Builder withNamespace(String nameSpace) {
            // because sometimes this happens
            // pkg:npm/%40ag-grid-community/angular@31.0.1
            var decodedNameSpace =  PackageWrapperHelpers.urlDecode(nameSpace);
            
            purlBuilder.withNamespace(decodedNameSpace);
            return this;
        }

        /**
         * 
         * @param name
         * @return
         */
        public Builder withName(String name) {
            // because sometimes this happens
            // pkg:npm/%40ag-grid-community/angular@31.0.1
            var decodedName = PackageWrapperHelpers.urlDecode(name);

            purlBuilder.withName(decodedName);
            return this;
        }

        /**
         * 
         * @param version
         * @return
         */
        public Builder withVersion(String version) {
            purlBuilder.withVersion(version);
            return this;
        }

        /**
         * 
         * @param k
         * @param v
         * @return
         */
        public Builder withQualifier(String k, String v) {
            purlBuilder.withQualifier(k, v);
            return this;
        }

        /**
         * 
         * @param qualifiers
         * @return
         */
        public Builder withQualifiers(Map<String, String> qualifiers) {
            for (var entry : qualifiers.entrySet()) {
                purlBuilder.withQualifier(entry.getKey(), entry.getValue());
            }
            return this;
        }        

        /**
         * 
         * @param subPath
         * @return
         */
        public Builder withSubPath(String subPath) {
            // because sometimes this happens
            // pkg:npm/%40ag-grid-community/angular@31.0.1
            var decodedSubPath = PackageWrapperHelpers.urlDecode(subPath);

            purlBuilder.withSubpath(decodedSubPath);
            return this;
        }

        //

        /**
         * 
         * @param projectName
         * @return
         */
        public Builder withProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        //

        /**
         * 
         * @param data
         * @return
         */
        // public Builder withDependencyData(List<DependencyData> data) { 
        //     this.dependencyData = data; 
        //     return this;
        // }
        public Builder withDependencyData(Map<PackageData.PackageDataType, List<PackageData>> data) {
            this.dependencyData = data;
            return this;
        }

        /**
         * 
         * @param dependencyData
         * @return
         */
        // public Builder withDependencyDataElement(DependencyData dependencyData) { 
        //     this.dependencyData.add(dependencyData); 
        //     return this;
        // }        
        public Builder withDependencyDataElement(PackageData data) { 
            var type = data.getPackageDataType();
            if (this.dependencyData.keySet().contains(type)) {
                this.dependencyData.get(type).add(data);
            } else {
                this.dependencyData.put(type, List.of(data));
            }

            return this;
        }

        /**
         * 
         * @param children
         * @return
         */
        public Builder withChildren(List<PackageWrapper> children) { 
            this.children = children; 
            return this;
        }

        /**
         * 
         * @param dependency
         * @return
         */
        public Builder withChild(PackageWrapper dependency) {
            this.children.add(dependency);
            return this;
        }

        //

        /**
         * 
         * @param isRoot
         * @return
         */
        public Builder withIsRoot(boolean isRoot) {
            this.isRoot = isRoot;
            return this;
        }

        //

        public Builder withDependencyPackageData(IndexPackageData<?> dependencyPackageData) {
            this.packageDependencyData = Optional.of(dependencyPackageData);
            return this;
        }

        //

        /**
         * 
         * @return
         * @throws MalformedPackageURLException
         */
        public PackageWrapper build() throws MalformedPackageURLException {
            // check to see if packageDependencyData is present and use that purl as source of truth for purl.
            // if packageDependencyData is not present attempt to use either the purl object the caller placed 
            // in builder, or, failing that, try to build the purl components the caller put in the builder. 
            //
            // if caller did all of the above, what packageDependencyData reports is king, followed by whatever 
            // fully formed purl object they placed in the builder, then last the attempt to create a purl from 
            // components found in the builder. 
            //
            // the intention here is to make the builder flexible enough to support multiple methods of use. 
            //      1. passing in only the packageDependencyData object 
            //      2. passing in only a purl object and nothing else 
            //      3. manually assembling the purl by way of the builder
            //      4. the ability to withstand the caller doing some unexpected combination of the above 
            //         without things getting weird.
            //
            // dh 30dec23
            if (packageDependencyData.isPresent()) {
                try {
                    LOG.debug(
                        "overriding purl: {} with {} from packageDependencyData", 
                        this.purl,
                        this.packageDependencyData.get().getPurl()
                    );
                    this.purl = packageDependencyData.get().getPurl();
                    this.withDependencyDataElement(packageDependencyData.get());
                } catch (MalformedPackageURLException e) {
                    LOG.warn(
                        "provided packageDependencyData obj malformed. " +
                        "defaulting to purl and removing bad object reference."
                    );
                    packageDependencyData = Optional.empty();
                    this.purl = this.purl == null ? purlBuilder.build() : this.purl;
                }

            } else {
                this.purl = this.purl == null ? purlBuilder.build() : this.purl;
            }

            return new PackageWrapper(
                purl, 
                projectName, 
                dependencyData, 
                children, 
                isRoot,
                packageDependencyData
            );
        }
    }
    
    //

    /**
     * mirrors PURL type
     */
    private enum DependencyTypeEnum {
        MAVEN {

            @Override
            public <Artifact> Optional<Artifact> getPackageDependencyData(
                    Optional<? extends IndexPackageData<?>> packageDependencyData
            ) { 
                return (Optional<Artifact>)packageDependencyData;
            }

            @Override
            public Class<Artifact> returnsClass() { return Artifact.class; }

        },
        NPM {
            @Override
            public <Package> Optional<Package> getPackageDependencyData(
                    Optional<? extends IndexPackageData<?>> packageDependencyData
            ) {
                return (Optional<Package>) packageDependencyData;
            }

            @Override
            public Class<?> returnsClass() {
                return PackageWrapper.class;
            }
        },
        UNRECOGNIZED {
            // noop
        };


        /**
         * 
         * @param <T>
         * @return
         */
        public <T> Optional<T> getPackageDependencyData(
                Optional<? extends IndexPackageData<?>> packageDependencyData
        ) { 
            return Optional.empty(); 
        }


        /**
         * 
         * @return
         */
        public Class<?> returnsClass() { return Object.class; }

    }

    //

    /**
     * 
     * @param <T>
     * @return
     */
    public <T> Optional<? extends IndexPackageData<?>> getPackageDependencyData() { 
        return dependencyType.getPackageDependencyData(this.packageDependencyData); 
    }

    /**
     * 
     * @return
     */
    public String returnsRecognizedDependencyClass() { return dependencyType.returnsClass().getName(); }

    //

    /**
     * 
     * @return
     */
    public PackageURL getPurl() { return this.purl; }

    /**
     * 
     * @return
     */
    @JsonIgnore
    public String getPurlFamily() { 
        final StringBuilder purlFamilyOnly = new StringBuilder();
        purlFamilyOnly.append(this.purl.getScheme()).append(":");
        purlFamilyOnly.append(this.purl.getType());
        purlFamilyOnly.append("/");

        if (this.purl.getNamespace() != null) {
            purlFamilyOnly.append(this.purl.getNamespace());
            purlFamilyOnly.append("/");
        }

        purlFamilyOnly.append(this.purl.getName());
        return purlFamilyOnly.toString();
    }

    //

    /**
     * 
     * @return
     */
    @JsonIgnore
    public String getType() { return this.dependencyType.toString(); }

    //

    /**
     * 
     * @param projectName
     */
    public void setProjectName(String projectName) { 
        this.projectName = projectName; 
    
        Stack<PackageWrapper> parentStack = new Stack<>();
        parentStack.push(this);
        while ( !parentStack.isEmpty() ) {
            var currentNode = parentStack.pop();
            for(var child : currentNode.getChildren()) { child.setProjectName(projectName); }
            parentStack.addAll(currentNode.getChildren());
        }
    }

    /**
     * 
     * @return
     */
    public String getProjectName() { return projectName; }

    //

    /**
     * 
     * @param data
     */
    public void setDependencyData(Map<PackageData.PackageDataType, List<PackageData>> data) { 
        this.dependencyData = data; 
    }
    
    /**
     * 
     * @return
     */
    public Map<PackageData.PackageDataType, List<PackageData>> getDependencyData() { 
        return this.dependencyData; 
    }

    /**
     * 
     * 
     * @param data
     */
    public void addDepenencyData(PackageData.PackageDataType type, PackageData data) { 
        if (this.dependencyData.containsKey(type)) {
            this.dependencyData.get(type).add(data);
        }
        else {
            // because List.of(...) produces an immutable list 
            var dependencyDataList = new ArrayList<>(List.of(data));
            this.dependencyData.put(type, dependencyDataList);
        }

    }

    /**
     * 
     * @param data
     */
    public void addAllDependencyData(List<PackageData> data) {
        for (var d : data) {
            addDepenencyData(d.getPackageDataType(), d);
        }
        LOG.debug("dependencyData is: {}", getDependencyData());
    }

    /**
     * this is intended to be used when the Dependency object is the root node of a dependency tree (ie - a repository).
     * During the ingest flow, once all OssReportDependencyData objects have been added (or a new one has been added 
     * later) this method ensures all children nodes have OssDependencyData objects attached to them that contain 
     * summaries of the OSS data germane to that dependency. Method "populateOssDependencyDataFor()" ensures the same
     * findings reported by multiple tools result in only one object being added to the child dependency. 
     * 
     */
    @SuppressWarnings("unchecked")
    public void disseminateOssDataToChildren() {

        if (dependencyData.containsKey(PackageDataType.OSS_REPORT)) {
            var ossReports = (List<OssReportPackageData>)(Object)dependencyData.get(PackageDataType.OSS_REPORT);
            for (var ossReport : ossReports) {
                List<OssPackageData> ossDependencyDataList = new ArrayList<>();
                try {
                    ossDependencyDataList = ossReport.getOssDependencyData();
                    LOG.debug("found: {} OssDependencyData objects", ossDependencyDataList.size());
                    LOG.debug("ossDependencyDataList: {}", ossDependencyDataList.stream().map(x -> x.getData().getPurl().getCoordinates()).toList());
                    LOG.debug("ossDependencyDataList: {}", ossDependencyDataList.stream().map(x -> x.getData().getVulnerabilityId()).toList());

                } catch (IllegalArgumentException e) {
                    LOG.warn("caught illegal argument exception while processing ossReport: {}", ossReport);
                    continue;
                }
                Map<String, List<OssPackageData>> dependencyToOssReportMap = new HashMap<>();
                
                // first create a map keyed to the dependencies the vulns in the report are attached to
                for (var ossDependencyData : ossDependencyDataList) {
                    var coordinates = ossDependencyData.getData()
                                                       .getPurl()
                                                       .getCoordinates();
        
                    if (dependencyToOssReportMap.containsKey(coordinates)) {
                        dependencyToOssReportMap.get(coordinates).add(ossDependencyData);
                    } else {
                        var newList = new ArrayList<OssPackageData>();
                        newList.add(ossDependencyData);
                        dependencyToOssReportMap.put(coordinates, newList);
                    }
                }
                LOG.debug("dependencyToOssReportMap is: {}", dependencyToOssReportMap);
                LOG.debug("dependencyToOssReportMap size: {}", dependencyToOssReportMap.size());
                if (dependencyToOssReportMap.isEmpty()) { continue; }

                // now go through the provided dependency list and add any reports tied to the dependency purl to the 
                // dependency object. "addOssDependencyData()" ensures OssDependencyData objects aren't double added
                Stack<PackageWrapper> parentStack = new Stack<>();
                parentStack.push(this);
                List<String> matchedCoordinates = new ArrayList<>();
                while ( !parentStack.isEmpty() ) {
                    var currentNode = parentStack.pop();
                    parentStack.addAll(currentNode.getChildren());

                    for (var dependency : currentNode.getChildren()) {
                        // no need to process for children who identify as non-real
                        if (dependency.packageDependencyData.isPresent() 
                                && !dependency.packageDependencyData.get().getIsReal()) {

                            continue;
                        }

                        var dependencyCoordinates = dependency.getPurl().getCoordinates();                                      
                        LOG.debug("dependencyCoordinates to match is: {}", dependencyCoordinates);
                        if (dependencyToOssReportMap.containsKey(dependencyCoordinates)) {
                            LOG.debug("match found for {}", dependencyCoordinates);
                            matchedCoordinates.add(dependencyCoordinates);
                            var newOssDependencyDataList = dependencyToOssReportMap.get(dependencyCoordinates);
                            for (var newOssDependencyData : newOssDependencyDataList) {
                                LOG.debug("adding {} to dependency obj {}", newOssDependencyData.getData(), dependency.getPurl());
                                dependency.addOssDependencyData(newOssDependencyData);
                            }
                        }
                    }
                }

                // there are times when the OSS scanner picks up on something that - for whatever reason - doesn't match
                // one of the children. this can be because of dirty data, a failure of something to parse the purl 
                // correctly for either the oss tool or the dependency child obj, or because there are multiple build 
                // files and we parsed only one of them into a build graph. 
                // 
                // when this happens we add the ossSummary obj to the root node to ensure we capture the OSS output data 
                for (var matchedCoordinate : matchedCoordinates) { dependencyToOssReportMap.remove(matchedCoordinate); }
                for (var unmatchedCoordinate : dependencyToOssReportMap.keySet()) {
                    LOG.warn("failed to find match for: {}, adding ossSummary to root node", unmatchedCoordinate);
                    for (var newOssDependencyData : dependencyToOssReportMap.get(unmatchedCoordinate)) {
                        this.addOssDependencyData(newOssDependencyData);
                    }
                    
                }
            }
        }
    }

    /**
     * ensures OssDependencyData does not get double added
     * 
     * @param data
     */
    @SuppressWarnings("unchecked")
    public void addOssDependencyData(OssPackageData data) {
        LOG.debug("dependencyData was: {}", this.getDependencyData().get(PackageData.PackageDataType.OSS_SUMMARY));
        var type = PackageData.PackageDataType.OSS_SUMMARY;
        var newVulnerabilityId = data.getData().getVulnerabilityId();
        if (this.dependencyData.containsKey(type)) {
            var ossDependencyDataList = (List<OssPackageData>)(Object)this.dependencyData.get(type);
            boolean added = false;
            for (var existingData : ossDependencyDataList) {
                var existingVulnerabilityId = existingData.getData().getVulnerabilityId();
                if (newVulnerabilityId.equals(existingVulnerabilityId)) {
                    var newReporters = data.getData().getReporters();
                    existingData.getData().addReporters(newReporters);
                    added = true;
                    break;
                }
            }
            
            if ( !added ) { addDepenencyData(type, data); }
        } else {
            addDepenencyData(type, data);
        }
        LOG.debug("dependencyData is now: {}", this.getDependencyData().get(PackageData.PackageDataType.OSS_SUMMARY));
    }

    //

    /**
     * 
     * @param children
     */
    public void setChildren(List<PackageWrapper> children) { this.children = children; }

    /**
     * 
     * @return
     */
    public List<PackageWrapper> getChildren() { return this.children; }

    /**
     * returns a COPY of the children list 
     * 
     * @return
     */
    @JsonIgnore
    public List<PackageWrapper> getChildrenSafe() { return new ArrayList<>(this.children); }

    /**
     * returns a list of all child dependencies as a flattened list 
     * 
     * @return
     */
    @JsonIgnore
    public List<PackageWrapper> getAllChildren(boolean getOnlyPresentChildren) { 
        List<PackageWrapper> rv = new ArrayList<>();
        Stack<PackageWrapper> parentStack = new Stack<>();
        parentStack.push(this);
        while ( !parentStack.isEmpty() ) {
            var currentNode = parentStack.pop();
            List<PackageWrapper> childlessChildren = new ArrayList<>();
            LOG.debug("currentNode.getChildren() is: {}", currentNode.getChildren());
            if (getOnlyPresentChildren) {
                for (var child : currentNode.getChildren()) {
                    var childNoChildren = child.getThisNoChildren();
                    if (getOnlyPresentChildren 
                            && child.getPackageDependencyData().isPresent()
                            && !child.getPackageDependencyData().get().getIsReal()
                    ) {
                        continue;
                    } 

                    childlessChildren.add(childNoChildren);
                }

            } else {
                for(var child : currentNode.getChildren()) {
                    childlessChildren.add(child.getThisNoChildren());
                }
            }
            LOG.debug("childlessChildren is: {}", childlessChildren);
            rv.addAll(childlessChildren);
            parentStack.addAll(currentNode.getChildren());
        }

        return rv;
    }

    /**
     * 
     * @param dependency
     */
    public void addChild(PackageWrapper dependency) { this.children.add(dependency); }

    //

    /**
     *
     * @return
     */
    @JsonIgnore
    public Set<PackageWrapper> getAllChildrenTypes() {
        Set<PackageWrapper> allChildren = new HashSet<>(this.getChildren());
        Queue<PackageWrapper> childQueue = new LinkedList<>(this.getChildren());

        while (childQueue.isEmpty() == false) {
            PackageWrapper currentNode = childQueue.remove();
            childQueue.addAll(currentNode.getChildren());
            allChildren.add(currentNode);
        }

        return allChildren;
    }


    /**
     * 
     * @param dependency
     * @return
     */
    public boolean isChild(PackageWrapper dependency) {
        return this.getAllChildrenTypes().contains(dependency);
    }

    //

    /**
     * supports getAllChildren() so each child Dependency object does contain local copies of its siblings 
     * 
     * @return
     */
    @JsonIgnore
    public PackageWrapper getThisNoChildren() {
        try {
            var rv = new PackageWrapper(
                new PackageURL(this.purl.toString()), 
                this.projectName, 
                new HashMap<PackageData.PackageDataType, List<PackageData>>(dependencyData), 
                new ArrayList<PackageWrapper>(), 
                this.isRoot, 
                this.packageDependencyData
            );
    
            return rv;
        } catch (MalformedPackageURLException e) {
            // we should never be here because we've formed the new PackageURL object from an already built, and thus
            // valid, PackageURL obj. 
            LOG.error("the thing that should be possible happened somehow :-/ ", e);
            LOG.error("returning this obj instead of the parentless copy");
            return this;
        }

    }

    //

    /**
     * 
     * @param isRoot
     */
    public void setIsRoot(boolean isRoot) { this.isRoot = isRoot; }

    /**
     * 
     * @return
     */
    public boolean getIsRoot() { return this.isRoot; }

    //

    /**
     * 
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageWrapper that = (PackageWrapper) o;
        return getPurl().equals(that.getPurl());
    }


    /**
     * 
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPurl(), getChildren());
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return getPurl().toString();
    }
}
