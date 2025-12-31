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
        "engineVersion",
        "dataSource"
})
@Generated("jsonschema2pojo")
public class ScanInfo {

    @JsonProperty("engineVersion")
    private String engineVersion;
    @JsonProperty("dataSource")
    private List<DataSource> dataSource = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("engineVersion")
    public String getEngineVersion() {
        return engineVersion;
    }

    @JsonProperty("engineVersion")
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ScanInfo withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    @JsonProperty("dataSource")
    public List<DataSource> getDataSource() {
        return dataSource;
    }

    @JsonProperty("dataSource")
    public void setDataSource(List<DataSource> dataSource) {
        this.dataSource = dataSource;
    }

    public ScanInfo withDataSource(List<DataSource> dataSource) {
        this.dataSource = dataSource;
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

    public ScanInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
