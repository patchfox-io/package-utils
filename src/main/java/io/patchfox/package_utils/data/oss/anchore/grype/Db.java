
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
    "cache-dir",
    "update-url",
    "ca-cert",
    "auto-update",
    "validate-by-hash-on-start",
    "validate-age",
    "max-allowed-built-age"
})
@Generated("jsonschema2pojo")
public class Db {

    @JsonProperty("cache-dir")
    private String cacheDir;
    @JsonProperty("update-url")
    private String updateUrl;
    @JsonProperty("ca-cert")
    private String caCert;
    @JsonProperty("auto-update")
    private Boolean autoUpdate;
    @JsonProperty("validate-by-hash-on-start")
    private Boolean validateByHashOnStart;
    @JsonProperty("validate-age")
    private Boolean validateAge;
    @JsonProperty("max-allowed-built-age")
    private Long maxAllowedBuiltAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Db() {
    }

    /**
     * 
     * @param cacheDir
     * @param autoUpdate
     * @param caCert
     * @param validateByHashOnStart
     * @param validateAge
     * @param updateUrl
     * @param maxAllowedBuiltAge
     */
    public Db(String cacheDir, String updateUrl, String caCert, Boolean autoUpdate, Boolean validateByHashOnStart, Boolean validateAge, Long maxAllowedBuiltAge) {
        super();
        this.cacheDir = cacheDir;
        this.updateUrl = updateUrl;
        this.caCert = caCert;
        this.autoUpdate = autoUpdate;
        this.validateByHashOnStart = validateByHashOnStart;
        this.validateAge = validateAge;
        this.maxAllowedBuiltAge = maxAllowedBuiltAge;
    }

    @JsonProperty("cache-dir")
    public String getCacheDir() {
        return cacheDir;
    }

    @JsonProperty("cache-dir")
    public void setCacheDir(String cacheDir) {
        this.cacheDir = cacheDir;
    }

    @JsonProperty("update-url")
    public String getUpdateUrl() {
        return updateUrl;
    }

    @JsonProperty("update-url")
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    @JsonProperty("ca-cert")
    public String getCaCert() {
        return caCert;
    }

    @JsonProperty("ca-cert")
    public void setCaCert(String caCert) {
        this.caCert = caCert;
    }

    @JsonProperty("auto-update")
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    @JsonProperty("auto-update")
    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    @JsonProperty("validate-by-hash-on-start")
    public Boolean getValidateByHashOnStart() {
        return validateByHashOnStart;
    }

    @JsonProperty("validate-by-hash-on-start")
    public void setValidateByHashOnStart(Boolean validateByHashOnStart) {
        this.validateByHashOnStart = validateByHashOnStart;
    }

    @JsonProperty("validate-age")
    public Boolean getValidateAge() {
        return validateAge;
    }

    @JsonProperty("validate-age")
    public void setValidateAge(Boolean validateAge) {
        this.validateAge = validateAge;
    }

    @JsonProperty("max-allowed-built-age")
    public Long getMaxAllowedBuiltAge() {
        return maxAllowedBuiltAge;
    }

    @JsonProperty("max-allowed-built-age")
    public void setMaxAllowedBuiltAge(Long maxAllowedBuiltAge) {
        this.maxAllowedBuiltAge = maxAllowedBuiltAge;
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
        sb.append(Db.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cacheDir");
        sb.append('=');
        sb.append(((this.cacheDir == null)?"<null>":this.cacheDir));
        sb.append(',');
        sb.append("updateUrl");
        sb.append('=');
        sb.append(((this.updateUrl == null)?"<null>":this.updateUrl));
        sb.append(',');
        sb.append("caCert");
        sb.append('=');
        sb.append(((this.caCert == null)?"<null>":this.caCert));
        sb.append(',');
        sb.append("autoUpdate");
        sb.append('=');
        sb.append(((this.autoUpdate == null)?"<null>":this.autoUpdate));
        sb.append(',');
        sb.append("validateByHashOnStart");
        sb.append('=');
        sb.append(((this.validateByHashOnStart == null)?"<null>":this.validateByHashOnStart));
        sb.append(',');
        sb.append("validateAge");
        sb.append('=');
        sb.append(((this.validateAge == null)?"<null>":this.validateAge));
        sb.append(',');
        sb.append("maxAllowedBuiltAge");
        sb.append('=');
        sb.append(((this.maxAllowedBuiltAge == null)?"<null>":this.maxAllowedBuiltAge));
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
