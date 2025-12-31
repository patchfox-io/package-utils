package io.patchfox.package_utils.data.pkg.java;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "semantic"
})
public class Version {

    @JsonProperty("version")
    private String version;

    @JsonProperty("semantic")
    private Semantic semantic;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    // version
    @JsonProperty("version")
    public String getVersion() { return version; }

    @JsonProperty("version")
    public void setVersion(String version) { this.version = version; }

    @JsonProperty("version")
    public Version withVersion(String version) {
        this.setVersion(version);
        return this;
    }

    // semantic
    @JsonProperty("semantic")
    public Semantic getSemantic() { return semantic; }

    @JsonProperty("semantic")
    public void setSemantic(Semantic semantic) { this.semantic = semantic; }

    @JsonProperty("semantic")
    public Version withSemantic(Semantic semantic) {
        this.setSemantic(semantic);
        return this;
    }


    // additional properties
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Version withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Version version1 = (Version) o;
        return getVersion().equals(version1.getVersion())
                && getSemantic().equals(version1.getSemantic())
                && getAdditionalProperties().equals(version1.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVersion(), getSemantic(), getAdditionalProperties());
    }
}
