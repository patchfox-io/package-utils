
package io.patchfox.package_utils.data.oss.anchore.grype;

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
    "built",
    "schemaVersion",
    "location",
    "checksum",
    "error"
})
@Generated("jsonschema2pojo")
public class Db__1 {

    @JsonProperty("built")
    private String built;
    @JsonProperty("schemaVersion")
    private String schemaVersion;
    @JsonProperty("location")
    private String location;
    @JsonProperty("checksum")
    private String checksum;
    @JsonProperty("error")
    private Object error;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Db__1() {
    }

    /**
     * 
     * @param schemaVersion
     * @param built
     * @param checksum
     * @param location
     * @param error
     */
    public Db__1(String built, String schemaVersion, String location, String checksum, Object error) {
        super();
        this.built = built;
        this.schemaVersion = schemaVersion;
        this.location = location;
        this.checksum = checksum;
        this.error = error;
    }

    @JsonProperty("built")
    public String getBuilt() {
        return built;
    }

    @JsonProperty("built")
    public void setBuilt(String built) {
        this.built = built;
    }

    @JsonProperty("schemaVersion")
    public String getSchemaVersion() {
        return schemaVersion;
    }

    @JsonProperty("schemaVersion")
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    @JsonProperty("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
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
        sb.append(Db__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("built");
        sb.append('=');
        sb.append(((this.built == null)?"<null>":this.built));
        sb.append(',');
        sb.append("schemaVersion");
        sb.append('=');
        sb.append(((this.schemaVersion == null)?"<null>":this.schemaVersion));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
