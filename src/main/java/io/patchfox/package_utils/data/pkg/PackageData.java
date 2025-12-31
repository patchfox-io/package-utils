package io.patchfox.package_utils.data.pkg;

import java.util.HashMap;
import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.patchfox.package_utils.data.DataFile;
import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.build.GitBuildFilePackageData;
import io.patchfox.package_utils.data.metadata.EtlMetadataPackageData;
import io.patchfox.package_utils.data.oss.anchore.grype.GrypeOssReportPackageData;
import io.patchfox.package_utils.data.oss.owasp.depcheck.OwaspOssReportPackageData;
import io.patchfox.package_utils.data.sbom.cyclonedx.CycloneDxSbomPackageData;
import io.patchfox.package_utils.data.sbom.spdx.SpdxSbomPackageData;
import io.patchfox.package_utils.data.sbom.syft.SyftSbomPackageData;
import io.patchfox.package_utils.util.PackageDataJsonDeserializer;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/*
 * WORK LOG 12SEP24 DH
 * 
 * This class and all it's sub classes have been updated to create a common deserialization scheme. For some reason 
 * BuildGitBlame was not working at all in the previous paradigm. That one - and only that one - now has its own 
 * special deserializer. Jackson doesn't seem to appreciate collections of other custom json entities. 
 * 
 * What's super odd is that the @JsonTypeInfo annotation should be helping us out here and it's not. Leaving all that
 * in there for now because it works but I believe the changes to DataFile to report wrapper and data classes for 
 * wrapped objects makes the JsonTypeInfo stuff moot. 
 * 
 */

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(
    use = Id.CLASS,
    include = As.PROPERTY,
    property = "@class"
)
@JsonSubTypes({
    @Type(value = EtlMetadataPackageData.class, name = "EtlMetadataPackageData"),
    @Type(value = GitBuildFilePackageData.class, name = "GitBuildFilePackageData"),
    @Type(value = OwaspOssReportPackageData.class, name = "OwaspOssReportPackageData"),
    @Type(value = GrypeOssReportPackageData.class, name = "GrypeOssReportPackageData"),
    @Type(value = NpmIndexPackageData.class, name = "NpmIndexPackageData"),
    @Type(value = MavenIndexPackageData.class, name = "MavenIndexPackageData"),
    @Type(value = OwaspOssReportPackageData.class, name = "OwaspOssReportPackageData"),
    @Type(value = SyftSbomPackageData.class, name = "SyftSbomPackageData"), 
    @Type(value = SpdxSbomPackageData.class, name = "SpdxSbomPackageData"),
    @Type(value = CycloneDxSbomPackageData.class, name = "CycloneDxSbomPackageData"),
})
@JsonDeserialize(using = PackageDataJsonDeserializer.class)
public abstract class PackageData<T> {
    
    private static final Logger LOG = LoggerFactory.getLogger(PackageData.class);

    // because we can't use a switch statement with the result of Clazz.class.getName()
    public static final String CLASSNAME = "io.patchfox.package_utils.data.pkg.PackageData";  

    public enum PackageDataType {
        ETL_BUILD_METADATA,
        GIT_ANNOTATED_BUILD_FILE,
        OSS_REPORT,
        OSS_SUMMARY, // TODO this one doesn't extend PackageData and I'm not sure why...
        PACKAGE,
        SBOM,
        UNKNOWN
    }

    @JsonIgnore
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private final ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

    @NotNull
    private final T data;

    private final PackageDataType packageDataType;

    private final DataFile.DataFileTypeEnum dataFileType;


    /**
     * 
     * @param data
     * 
     * @throws IllegalArgumentException
     */
    public PackageData(T data) { 
        try {
            mapper.writeValueAsString(data);
            packageDataType = PackageDataType.UNKNOWN;
            dataFileType = DataFileTypeEnum.UNKNOWN;
        } catch (JsonProcessingException e) {
            //LOG.error("caught exception {}", e);
            throw new IllegalArgumentException("argument 'data' must be json obj");
        }

        this.data = data; 
    }

    /**
     * 
     * @param data
     * 
     * @throws IllegalArgumentException
     */
    public PackageData(T data, PackageDataType dependencyDataType) { 
        try {
            mapper.writeValueAsString(data);
            this.packageDataType = dependencyDataType;
            dataFileType = DataFileTypeEnum.UNKNOWN;
        } catch (JsonProcessingException e) {
            LOG.error(e.getMessage());
            throw new IllegalArgumentException("argument 'data' of type: " + dependencyDataType + " must be json obj");
        }

        this.data = data; 
    }

    /**
     * 
     * @param data
     * 
     * @throws IllegalArgumentException
     */
    public PackageData(T data, PackageDataType dependencyDataType, DataFile.DataFileTypeEnum dataType) { 
        try {
            mapper.writeValueAsString(data);
            this.packageDataType = dependencyDataType;
            this.dataFileType = dataType;
        } catch (JsonProcessingException e) {
            LOG.error(e.getMessage());
            throw new IllegalArgumentException("argument 'data' of type: " + dependencyDataType + " must be json obj");
        }

        this.data = data; 
    }

    @JsonIgnore
    public Class<?> getDataClass() { return data.getClass(); }

    @JsonIgnore
    public String getDataClassName() { return data.getClass().getCanonicalName(); }

    @JsonIgnore
    public String getWrapperClassName() { return this.getClass().getCanonicalName(); }

}
