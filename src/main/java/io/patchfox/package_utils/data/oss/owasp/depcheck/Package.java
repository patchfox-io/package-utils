package io.patchfox.package_utils.data.oss.owasp.depcheck;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "confidence",
        "url"
})
public class Package {

    @JsonProperty("id")
    private String id;

    @JsonProperty("confidence")
    private String confidence;

    @JsonProperty("url")
    private String url;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    // id
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("fileName")
    public void setId(String id) {
        this.id = id;
    }

    public Package withId(String id) {
        this.id = id;
        return this;
    }


    // confidence
    @JsonProperty("confidence")
    public String getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public Package withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }


    // url
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Package withUrl(String url) {
        this.url = url;
        return this;
    }


    // additionalProperties
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Package withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
