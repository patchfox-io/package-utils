package io.patchfox.package_utils.data.oss.owasp.depcheck;


import java.util.HashMap;
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
        "id",
        "vulnerabilityIdMatched",
        "versionEndExcluding"
})
@Generated("jsonschema2pojo")
public class Software {

    @JsonProperty("id")
    private String id;
    @JsonProperty("vulnerabilityIdMatched")
    private String vulnerabilityIdMatched;
    @JsonProperty("versionEndExcluding")
    private String versionEndExcluding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Software withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("vulnerabilityIdMatched")
    public String getVulnerabilityIdMatched() {
        return vulnerabilityIdMatched;
    }

    @JsonProperty("vulnerabilityIdMatched")
    public void setVulnerabilityIdMatched(String vulnerabilityIdMatched) {
        this.vulnerabilityIdMatched = vulnerabilityIdMatched;
    }

    public Software withVulnerabilityIdMatched(String vulnerabilityIdMatched) {
        this.vulnerabilityIdMatched = vulnerabilityIdMatched;
        return this;
    }

    @JsonProperty("versionEndExcluding")
    public String getVersionEndExcluding() {
        return versionEndExcluding;
    }

    @JsonProperty("versionEndExcluding")
    public void setVersionEndExcluding(String versionEndExcluding) {
        this.versionEndExcluding = versionEndExcluding;
    }

    public Software withVersionEndExcluding(String versionEndExcluding) {
        this.versionEndExcluding = versionEndExcluding;
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

    public Software withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
