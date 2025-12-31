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
        "name",
        "reportDate",
        "credits"
})
@Generated("jsonschema2pojo")
public class ProjectInfo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("reportDate")
    private String reportDate;
    @JsonProperty("credits")
    private Credits credits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ProjectInfo withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("reportDate")
    public String getReportDate() {
        return reportDate;
    }

    @JsonProperty("reportDate")
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public ProjectInfo withReportDate(String reportDate) {
        this.reportDate = reportDate;
        return this;
    }

    @JsonProperty("credits")
    public Credits getCredits() {
        return credits;
    }

    @JsonProperty("credits")
    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    public ProjectInfo withCredits(Credits credits) {
        this.credits = credits;
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

    public ProjectInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
