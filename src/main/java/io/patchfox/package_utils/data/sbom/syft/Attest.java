
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
    "key",
    "cert",
    "noUpload",
    "force",
    "recursive",
    "replace",
    "fulcioUrl",
    "fulcio_identity_token",
    "insecure_skip_verify",
    "rekorUrl",
    "oidcIssuer",
    "oidcClientId",
    "OIDCRedirectURL"
})
@Generated("jsonschema2pojo")
public class Attest {

    @JsonProperty("key")
    private String key;
    @JsonProperty("cert")
    private String cert;
    @JsonProperty("noUpload")
    private Boolean noUpload;
    @JsonProperty("force")
    private Boolean force;
    @JsonProperty("recursive")
    private Boolean recursive;
    @JsonProperty("replace")
    private Boolean replace;
    @JsonProperty("fulcioUrl")
    private String fulcioUrl;
    @JsonProperty("fulcio_identity_token")
    private String fulcioIdentityToken;
    @JsonProperty("insecure_skip_verify")
    private Boolean insecureSkipVerify;
    @JsonProperty("rekorUrl")
    private String rekorUrl;
    @JsonProperty("oidcIssuer")
    private String oidcIssuer;
    @JsonProperty("oidcClientId")
    private String oidcClientId;
    @JsonProperty("OIDCRedirectURL")
    private String oIDCRedirectURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attest() {
    }

    /**
     * 
     * @param oidcClientId
     * @param replace
     * @param cert
     * @param recursive
     * @param oIDCRedirectURL
     * @param oidcIssuer
     * @param rekorUrl
     * @param insecureSkipVerify
     * @param force
     * @param fulcioUrl
     * @param fulcioIdentityToken
     * @param key
     * @param noUpload
     */
    public Attest(String key, String cert, Boolean noUpload, Boolean force, Boolean recursive, Boolean replace, String fulcioUrl, String fulcioIdentityToken, Boolean insecureSkipVerify, String rekorUrl, String oidcIssuer, String oidcClientId, String oIDCRedirectURL) {
        super();
        this.key = key;
        this.cert = cert;
        this.noUpload = noUpload;
        this.force = force;
        this.recursive = recursive;
        this.replace = replace;
        this.fulcioUrl = fulcioUrl;
        this.fulcioIdentityToken = fulcioIdentityToken;
        this.insecureSkipVerify = insecureSkipVerify;
        this.rekorUrl = rekorUrl;
        this.oidcIssuer = oidcIssuer;
        this.oidcClientId = oidcClientId;
        this.oIDCRedirectURL = oIDCRedirectURL;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    @JsonProperty("noUpload")
    public Boolean getNoUpload() {
        return noUpload;
    }

    @JsonProperty("noUpload")
    public void setNoUpload(Boolean noUpload) {
        this.noUpload = noUpload;
    }

    @JsonProperty("force")
    public Boolean getForce() {
        return force;
    }

    @JsonProperty("force")
    public void setForce(Boolean force) {
        this.force = force;
    }

    @JsonProperty("recursive")
    public Boolean getRecursive() {
        return recursive;
    }

    @JsonProperty("recursive")
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    @JsonProperty("replace")
    public Boolean getReplace() {
        return replace;
    }

    @JsonProperty("replace")
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    @JsonProperty("fulcioUrl")
    public String getFulcioUrl() {
        return fulcioUrl;
    }

    @JsonProperty("fulcioUrl")
    public void setFulcioUrl(String fulcioUrl) {
        this.fulcioUrl = fulcioUrl;
    }

    @JsonProperty("fulcio_identity_token")
    public String getFulcioIdentityToken() {
        return fulcioIdentityToken;
    }

    @JsonProperty("fulcio_identity_token")
    public void setFulcioIdentityToken(String fulcioIdentityToken) {
        this.fulcioIdentityToken = fulcioIdentityToken;
    }

    @JsonProperty("insecure_skip_verify")
    public Boolean getInsecureSkipVerify() {
        return insecureSkipVerify;
    }

    @JsonProperty("insecure_skip_verify")
    public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
        this.insecureSkipVerify = insecureSkipVerify;
    }

    @JsonProperty("rekorUrl")
    public String getRekorUrl() {
        return rekorUrl;
    }

    @JsonProperty("rekorUrl")
    public void setRekorUrl(String rekorUrl) {
        this.rekorUrl = rekorUrl;
    }

    @JsonProperty("oidcIssuer")
    public String getOidcIssuer() {
        return oidcIssuer;
    }

    @JsonProperty("oidcIssuer")
    public void setOidcIssuer(String oidcIssuer) {
        this.oidcIssuer = oidcIssuer;
    }

    @JsonProperty("oidcClientId")
    public String getOidcClientId() {
        return oidcClientId;
    }

    @JsonProperty("oidcClientId")
    public void setOidcClientId(String oidcClientId) {
        this.oidcClientId = oidcClientId;
    }

    @JsonProperty("OIDCRedirectURL")
    public String getOIDCRedirectURL() {
        return oIDCRedirectURL;
    }

    @JsonProperty("OIDCRedirectURL")
    public void setOIDCRedirectURL(String oIDCRedirectURL) {
        this.oIDCRedirectURL = oIDCRedirectURL;
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
        sb.append(Attest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("cert");
        sb.append('=');
        sb.append(((this.cert == null)?"<null>":this.cert));
        sb.append(',');
        sb.append("noUpload");
        sb.append('=');
        sb.append(((this.noUpload == null)?"<null>":this.noUpload));
        sb.append(',');
        sb.append("force");
        sb.append('=');
        sb.append(((this.force == null)?"<null>":this.force));
        sb.append(',');
        sb.append("recursive");
        sb.append('=');
        sb.append(((this.recursive == null)?"<null>":this.recursive));
        sb.append(',');
        sb.append("replace");
        sb.append('=');
        sb.append(((this.replace == null)?"<null>":this.replace));
        sb.append(',');
        sb.append("fulcioUrl");
        sb.append('=');
        sb.append(((this.fulcioUrl == null)?"<null>":this.fulcioUrl));
        sb.append(',');
        sb.append("fulcioIdentityToken");
        sb.append('=');
        sb.append(((this.fulcioIdentityToken == null)?"<null>":this.fulcioIdentityToken));
        sb.append(',');
        sb.append("insecureSkipVerify");
        sb.append('=');
        sb.append(((this.insecureSkipVerify == null)?"<null>":this.insecureSkipVerify));
        sb.append(',');
        sb.append("rekorUrl");
        sb.append('=');
        sb.append(((this.rekorUrl == null)?"<null>":this.rekorUrl));
        sb.append(',');
        sb.append("oidcIssuer");
        sb.append('=');
        sb.append(((this.oidcIssuer == null)?"<null>":this.oidcIssuer));
        sb.append(',');
        sb.append("oidcClientId");
        sb.append('=');
        sb.append(((this.oidcClientId == null)?"<null>":this.oidcClientId));
        sb.append(',');
        sb.append("oIDCRedirectURL");
        sb.append('=');
        sb.append(((this.oIDCRedirectURL == null)?"<null>":this.oIDCRedirectURL));
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
