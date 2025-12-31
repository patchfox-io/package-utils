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
        "major",
        "minor",
        "patch",
        "tag"
})
public class Semantic {

    @JsonProperty("major")
    private Integer major;

    @JsonProperty("minor")
    private Integer minor;

    @JsonProperty("patch")
    private Integer patch;

    @JsonProperty("tag")
    private String tag;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    // major
    @JsonProperty("major")
    public Integer getMajor() { return major; }

    @JsonProperty("major")
    public void setMajor(Integer major) {
        if (major < 0) {
            throw new IllegalArgumentException("major value must be a positive integer");
        }
        this.major = major;
    }

    @JsonProperty("major")
    public Semantic withMajor(Integer major) {
        this.setMajor(major);
        return this;
    }


    // minor
    @JsonProperty("minor")
    public Integer getMinor() { return minor; }

    @JsonProperty("minor")
    public void setMinor(Integer minor) {
        if (minor < 0) {
            throw new IllegalArgumentException("minor value must be a positive integer");
        }
        this.minor = minor;
    }

    @JsonProperty("minor")
    public Semantic withMinor(Integer minor) {
        this.setMinor(minor);
        return this;
    }


    // patch
    @JsonProperty("patch")
    public Integer getPatch() { return patch; }

    @JsonProperty("patch")
    public void setPatch(Integer patch) {
        if (patch < 0) {
            throw new IllegalArgumentException("patch value must be a positive integer");
        }
        this.patch = patch;
    }

    @JsonProperty("patch")
    public Semantic withPatch(Integer patch) {
        this.setPatch(patch);
        return this;
    }


    // tag
    @JsonProperty("tag")
    public String getTag() { return tag; }

    @JsonProperty("tag")
    public void setTag(String tag) { this.tag = tag; }

    @JsonProperty("tag")
    public Semantic withTag(String tag) {
        this.setTag(tag);
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

    public Semantic withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Semantic semantic = (Semantic) o;
        return getMajor().equals(semantic.getMajor())
                && getMinor().equals(semantic.getMinor())
                && getPatch().equals(semantic.getPatch())
                && getTag().equals(semantic.getTag())
                && getAdditionalProperties().equals(semantic.getAdditionalProperties());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMajor(), getMinor(), getPatch(), getTag(), getAdditionalProperties());
    }

    public static Semantic blankVersion() {
        return new Semantic()
                .withMajor(0)
                .withMinor(0)
                .withPatch(0);
    }
}
