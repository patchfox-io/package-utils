
package io.patchfox.package_utils.data.sbom.syft;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cataloger",
    "skip-files-above-size",
    "globs"
})
@Generated("jsonschema2pojo")
public class FileContents {

    @JsonProperty("cataloger")
    private Cataloger cataloger;
    @JsonProperty("skip-files-above-size")
    private Integer skipFilesAboveSize;
    @JsonProperty("globs")
    private List<Object> globs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileContents() {
    }

    /**
     * 
     * @param cataloger
     * @param globs
     * @param skipFilesAboveSize
     */
    public FileContents(Cataloger cataloger, Integer skipFilesAboveSize, List<Object> globs) {
        super();
        this.cataloger = cataloger;
        this.skipFilesAboveSize = skipFilesAboveSize;
        this.globs = globs;
    }

    @JsonProperty("cataloger")
    public Cataloger getCataloger() {
        return cataloger;
    }

    @JsonProperty("cataloger")
    public void setCataloger(Cataloger cataloger) {
        this.cataloger = cataloger;
    }

    @JsonProperty("skip-files-above-size")
    public Integer getSkipFilesAboveSize() {
        return skipFilesAboveSize;
    }

    @JsonProperty("skip-files-above-size")
    public void setSkipFilesAboveSize(Integer skipFilesAboveSize) {
        this.skipFilesAboveSize = skipFilesAboveSize;
    }

    @JsonProperty("globs")
    public List<Object> getGlobs() {
        return globs;
    }

    @JsonProperty("globs")
    public void setGlobs(List<Object> globs) {
        this.globs = globs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FileContents.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cataloger");
        sb.append('=');
        sb.append(((this.cataloger == null)?"<null>":this.cataloger));
        sb.append(',');
        sb.append("skipFilesAboveSize");
        sb.append('=');
        sb.append(((this.skipFilesAboveSize == null)?"<null>":this.skipFilesAboveSize));
        sb.append(',');
        sb.append("globs");
        sb.append('=');
        sb.append(((this.globs == null)?"<null>":this.globs));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


}
