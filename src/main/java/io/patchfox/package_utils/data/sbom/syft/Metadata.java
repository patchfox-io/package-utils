
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
    "virtualPath",
    "pomProperties",
    "pomProject"
})
@Generated("jsonschema2pojo")
public class Metadata {

    @JsonProperty("virtualPath")
    private String virtualPath;
    @JsonProperty("pomProperties")
    private PomProperties pomProperties;
    @JsonProperty("pomProject")
    private PomProject pomProject;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param virtualPath
     * @param pomProperties
     * @param pomProject
     */
    public Metadata(String virtualPath, PomProperties pomProperties, PomProject pomProject) {
        super();
        this.virtualPath = virtualPath;
        this.pomProperties = pomProperties;
        this.pomProject = pomProject;
    }

    @JsonProperty("virtualPath")
    public String getVirtualPath() {
        return virtualPath;
    }

    @JsonProperty("virtualPath")
    public void setVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
    }

    @JsonProperty("pomProperties")
    public PomProperties getPomProperties() {
        return pomProperties;
    }

    @JsonProperty("pomProperties")
    public void setPomProperties(PomProperties pomProperties) {
        this.pomProperties = pomProperties;
    }

    @JsonProperty("pomProject")
    public PomProject getPomProject() {
        return pomProject;
    }

    @JsonProperty("pomProject")
    public void setPomProject(PomProject pomProject) {
        this.pomProject = pomProject;
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
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("virtualPath");
        sb.append('=');
        sb.append(((this.virtualPath == null)?"<null>":this.virtualPath));
        sb.append(',');
        sb.append("pomProperties");
        sb.append('=');
        sb.append(((this.pomProperties == null)?"<null>":this.pomProperties));
        sb.append(',');
        sb.append("pomProject");
        sb.append('=');
        sb.append(((this.pomProject == null)?"<null>":this.pomProject));
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
