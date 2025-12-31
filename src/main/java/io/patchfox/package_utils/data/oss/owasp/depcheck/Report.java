package io.patchfox.package_utils.data.oss.owasp.depcheck;


import java.util.ArrayList;
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
        "reportSchema",
        "scanInfo",
        "projectInfo",
        "dependencies"
})
@Generated("jsonschema2pojo")
public class Report {

    @JsonProperty("reportSchema")
    private String reportSchema;
    @JsonProperty("scanInfo")
    private ScanInfo scanInfo;
    @JsonProperty("projectInfo")
    private ProjectInfo projectInfo;
    @JsonProperty("dependencies")
    private List<Dependency> dependencies = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reportSchema")
    public String getReportSchema() {
        return reportSchema;
    }

    @JsonProperty("reportSchema")
    public void setReportSchema(String reportSchema) {
        this.reportSchema = reportSchema;
    }

    public Report withReportSchema(String reportSchema) {
        this.reportSchema = reportSchema;
        return this;
    }

    @JsonProperty("scanInfo")
    public ScanInfo getScanInfo() {
        return scanInfo;
    }

    @JsonProperty("scanInfo")
    public void setScanInfo(ScanInfo scanInfo) {
        this.scanInfo = scanInfo;
    }

    public Report withScanInfo(ScanInfo scanInfo) {
        this.scanInfo = scanInfo;
        return this;
    }

    @JsonProperty("projectInfo")
    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    @JsonProperty("projectInfo")
    public void setProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
    }

    public Report withProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }

    @JsonProperty("dependencies")
    public List<Dependency> getDependencies() {
        return dependencies;
    }

    @JsonProperty("dependencies")
    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public Report withDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
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

    public Report withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
