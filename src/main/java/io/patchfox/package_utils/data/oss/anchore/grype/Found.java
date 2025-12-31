
package io.patchfox.package_utils.data.oss.anchore.grype;

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
    "vulnerabilityID",
    "versionConstraint",
    "cpes"
})
@Generated("jsonschema2pojo")
public class Found {

    @JsonProperty("vulnerabilityID")
    private String vulnerabilityID;
    @JsonProperty("versionConstraint")
    private String versionConstraint;
    @JsonProperty("cpes")
    private List<String> cpes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Found() {
    }

    /**
     * 
     * @param vulnerabilityID
     * @param versionConstraint
     * @param cpes
     */
    public Found(String vulnerabilityID, String versionConstraint, List<String> cpes) {
        super();
        this.vulnerabilityID = vulnerabilityID;
        this.versionConstraint = versionConstraint;
        this.cpes = cpes;
    }

    @JsonProperty("vulnerabilityID")
    public String getVulnerabilityID() {
        return vulnerabilityID;
    }

    @JsonProperty("vulnerabilityID")
    public void setVulnerabilityID(String vulnerabilityID) {
        this.vulnerabilityID = vulnerabilityID;
    }

    @JsonProperty("versionConstraint")
    public String getVersionConstraint() {
        return versionConstraint;
    }

    @JsonProperty("versionConstraint")
    public void setVersionConstraint(String versionConstraint) {
        this.versionConstraint = versionConstraint;
    }

    @JsonProperty("cpes")
    public List<String> getCpes() {
        return cpes;
    }

    @JsonProperty("cpes")
    public void setCpes(List<String> cpes) {
        this.cpes = cpes;
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
        sb.append(Found.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vulnerabilityID");
        sb.append('=');
        sb.append(((this.vulnerabilityID == null)?"<null>":this.vulnerabilityID));
        sb.append(',');
        sb.append("versionConstraint");
        sb.append('=');
        sb.append(((this.versionConstraint == null)?"<null>":this.versionConstraint));
        sb.append(',');
        sb.append("cpes");
        sb.append('=');
        sb.append(((this.cpes == null)?"<null>":this.cpes));
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
