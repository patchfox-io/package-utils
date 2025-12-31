package io.patchfox.package_utils.data.oss.owasp.depcheck;


import java.util.HashMap;
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
        "vendorEvidence",
        "productEvidence",
        "versionEvidence"
})
@Generated("jsonschema2pojo")
public class EvidenceCollected {

    @JsonProperty("vendorEvidence")
    private List<VendorEvidence> vendorEvidence = null;
    @JsonProperty("productEvidence")
    private List<ProductEvidence> productEvidence = null;
    @JsonProperty("versionEvidence")
    private List<VersionEvidence> versionEvidence = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vendorEvidence")
    public List<VendorEvidence> getVendorEvidence() {
        return vendorEvidence;
    }

    @JsonProperty("vendorEvidence")
    public void setVendorEvidence(List<VendorEvidence> vendorEvidence) {
        this.vendorEvidence = vendorEvidence;
    }

    public EvidenceCollected withVendorEvidence(List<VendorEvidence> vendorEvidence) {
        this.vendorEvidence = vendorEvidence;
        return this;
    }

    @JsonProperty("productEvidence")
    public List<ProductEvidence> getProductEvidence() {
        return productEvidence;
    }

    @JsonProperty("productEvidence")
    public void setProductEvidence(List<ProductEvidence> productEvidence) {
        this.productEvidence = productEvidence;
    }

    public EvidenceCollected withProductEvidence(List<ProductEvidence> productEvidence) {
        this.productEvidence = productEvidence;
        return this;
    }

    @JsonProperty("versionEvidence")
    public List<VersionEvidence> getVersionEvidence() {
        return versionEvidence;
    }

    @JsonProperty("versionEvidence")
    public void setVersionEvidence(List<VersionEvidence> versionEvidence) {
        this.versionEvidence = versionEvidence;
    }

    public EvidenceCollected withVersionEvidence(List<VersionEvidence> versionEvidence) {
        this.versionEvidence = versionEvidence;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public EvidenceCollected withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
