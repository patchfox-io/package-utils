
package io.patchfox.package_utils.data.sbom.syft;

import java.util.LinkedHashMap;
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
    "structured",
    "level",
    "file-location"
})
@Generated("jsonschema2pojo")
public class Log {

    @JsonProperty("structured")
    private Boolean structured;
    @JsonProperty("level")
    private String level;
    @JsonProperty("file-location")
    private String fileLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Log() {
    }

    /**
     * 
     * @param level
     * @param structured
     * @param fileLocation
     */
    public Log(Boolean structured, String level, String fileLocation) {
        super();
        this.structured = structured;
        this.level = level;
        this.fileLocation = fileLocation;
    }

    @JsonProperty("structured")
    public Boolean getStructured() {
        return structured;
    }

    @JsonProperty("structured")
    public void setStructured(Boolean structured) {
        this.structured = structured;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("file-location")
    public String getFileLocation() {
        return fileLocation;
    }

    @JsonProperty("file-location")
    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
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
        sb.append(Log.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("structured");
        sb.append('=');
        sb.append(((this.structured == null)?"<null>":this.structured));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("fileLocation");
        sb.append('=');
        sb.append(((this.fileLocation == null)?"<null>":this.fileLocation));
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
