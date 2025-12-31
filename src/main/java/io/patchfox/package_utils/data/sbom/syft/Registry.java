
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
    "insecure-skip-tls-verify",
    "insecure-use-http",
    "auth"
})
@Generated("jsonschema2pojo")
public class Registry {

    @JsonProperty("insecure-skip-tls-verify")
    private Boolean insecureSkipTlsVerify;
    @JsonProperty("insecure-use-http")
    private Boolean insecureUseHttp;
    @JsonProperty("auth")
    private List<Object> auth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Registry() {
    }

    /**
     * 
     * @param insecureUseHttp
     * @param auth
     * @param insecureSkipTlsVerify
     */
    public Registry(Boolean insecureSkipTlsVerify, Boolean insecureUseHttp, List<Object> auth) {
        super();
        this.insecureSkipTlsVerify = insecureSkipTlsVerify;
        this.insecureUseHttp = insecureUseHttp;
        this.auth = auth;
    }

    @JsonProperty("insecure-skip-tls-verify")
    public Boolean getInsecureSkipTlsVerify() {
        return insecureSkipTlsVerify;
    }

    @JsonProperty("insecure-skip-tls-verify")
    public void setInsecureSkipTlsVerify(Boolean insecureSkipTlsVerify) {
        this.insecureSkipTlsVerify = insecureSkipTlsVerify;
    }

    @JsonProperty("insecure-use-http")
    public Boolean getInsecureUseHttp() {
        return insecureUseHttp;
    }

    @JsonProperty("insecure-use-http")
    public void setInsecureUseHttp(Boolean insecureUseHttp) {
        this.insecureUseHttp = insecureUseHttp;
    }

    @JsonProperty("auth")
    public List<Object> getAuth() {
        return auth;
    }

    @JsonProperty("auth")
    public void setAuth(List<Object> auth) {
        this.auth = auth;
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
        sb.append(Registry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("insecureSkipTlsVerify");
        sb.append('=');
        sb.append(((this.insecureSkipTlsVerify == null)?"<null>":this.insecureSkipTlsVerify));
        sb.append(',');
        sb.append("insecureUseHttp");
        sb.append('=');
        sb.append(((this.insecureUseHttp == null)?"<null>":this.insecureUseHttp));
        sb.append(',');
        sb.append("auth");
        sb.append('=');
        sb.append(((this.auth == null)?"<null>":this.auth));
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
