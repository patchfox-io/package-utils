
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
    "additional-patterns",
    "exclude-pattern-names",
    "reveal-values",
    "skip-files-above-size"
})
@Generated("jsonschema2pojo")
public class Secrets {

    @JsonProperty("cataloger")
    private Cataloger cataloger;
    @JsonProperty("additional-patterns")
    private AdditionalPatterns additionalPatterns;
    @JsonProperty("exclude-pattern-names")
    private List<Object> excludePatternNames;
    @JsonProperty("reveal-values")
    private Boolean revealValues;
    @JsonProperty("skip-files-above-size")
    private Integer skipFilesAboveSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Secrets() {
    }

    /**
     * 
     * @param cataloger
     * @param excludePatternNames
     * @param revealValues
     * @param skipFilesAboveSize
     * @param additionalPatterns
     */
    public Secrets(Cataloger cataloger, AdditionalPatterns additionalPatterns, List<Object> excludePatternNames, Boolean revealValues, Integer skipFilesAboveSize) {
        super();
        this.cataloger = cataloger;
        this.additionalPatterns = additionalPatterns;
        this.excludePatternNames = excludePatternNames;
        this.revealValues = revealValues;
        this.skipFilesAboveSize = skipFilesAboveSize;
    }

    @JsonProperty("cataloger")
    public Cataloger getCataloger() {
        return cataloger;
    }

    @JsonProperty("cataloger")
    public void setCataloger(Cataloger cataloger) {
        this.cataloger = cataloger;
    }

    @JsonProperty("additional-patterns")
    public AdditionalPatterns getAdditionalPatterns() {
        return additionalPatterns;
    }

    @JsonProperty("additional-patterns")
    public void setAdditionalPatterns(AdditionalPatterns additionalPatterns) {
        this.additionalPatterns = additionalPatterns;
    }

    @JsonProperty("exclude-pattern-names")
    public List<Object> getExcludePatternNames() {
        return excludePatternNames;
    }

    @JsonProperty("exclude-pattern-names")
    public void setExcludePatternNames(List<Object> excludePatternNames) {
        this.excludePatternNames = excludePatternNames;
    }

    @JsonProperty("reveal-values")
    public Boolean getRevealValues() {
        return revealValues;
    }

    @JsonProperty("reveal-values")
    public void setRevealValues(Boolean revealValues) {
        this.revealValues = revealValues;
    }

    @JsonProperty("skip-files-above-size")
    public Integer getSkipFilesAboveSize() {
        return skipFilesAboveSize;
    }

    @JsonProperty("skip-files-above-size")
    public void setSkipFilesAboveSize(Integer skipFilesAboveSize) {
        this.skipFilesAboveSize = skipFilesAboveSize;
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
        sb.append(Secrets.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cataloger");
        sb.append('=');
        sb.append(((this.cataloger == null)?"<null>":this.cataloger));
        sb.append(',');
        sb.append("additionalPatterns");
        sb.append('=');
        sb.append(((this.additionalPatterns == null)?"<null>":this.additionalPatterns));
        sb.append(',');
        sb.append("excludePatternNames");
        sb.append('=');
        sb.append(((this.excludePatternNames == null)?"<null>":this.excludePatternNames));
        sb.append(',');
        sb.append("revealValues");
        sb.append('=');
        sb.append(((this.revealValues == null)?"<null>":this.revealValues));
        sb.append(',');
        sb.append("skipFilesAboveSize");
        sb.append('=');
        sb.append(((this.skipFilesAboveSize == null)?"<null>":this.skipFilesAboveSize));
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
