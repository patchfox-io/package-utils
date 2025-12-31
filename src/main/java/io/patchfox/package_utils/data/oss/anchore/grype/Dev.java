
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
    "profile-cpu",
    "profile-mem"
})
@Generated("jsonschema2pojo")
public class Dev {

    @JsonProperty("profile-cpu")
    private Boolean profileCpu;
    @JsonProperty("profile-mem")
    private Boolean profileMem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dev() {
    }

    /**
     * 
     * @param profileCpu
     * @param profileMem
     */
    public Dev(Boolean profileCpu, Boolean profileMem) {
        super();
        this.profileCpu = profileCpu;
        this.profileMem = profileMem;
    }

    @JsonProperty("profile-cpu")
    public Boolean getProfileCpu() {
        return profileCpu;
    }

    @JsonProperty("profile-cpu")
    public void setProfileCpu(Boolean profileCpu) {
        this.profileCpu = profileCpu;
    }

    @JsonProperty("profile-mem")
    public Boolean getProfileMem() {
        return profileMem;
    }

    @JsonProperty("profile-mem")
    public void setProfileMem(Boolean profileMem) {
        this.profileMem = profileMem;
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
        sb.append(Dev.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profileCpu");
        sb.append('=');
        sb.append(((this.profileCpu == null)?"<null>":this.profileCpu));
        sb.append(',');
        sb.append("profileMem");
        sb.append('=');
        sb.append(((this.profileMem == null)?"<null>":this.profileMem));
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
