
package io.patchfox.package_utils.data.oss.anchore.grype;

import java.util.LinkedHashMap;
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
    "namespace",
    "cpes",
    "Package"
})
@Generated("jsonschema2pojo")
public class SearchedBy {

    @JsonProperty("namespace")
    private String namespace;
    @JsonProperty("cpes")
    private List<String> cpes;
    @JsonProperty("Package")
    private Package _package;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchedBy() {
    }

    /**
     * 
     * @param _package
     * @param cpes
     * @param namespace
     */
    public SearchedBy(String namespace, List<String> cpes, Package _package) {
        super();
        this.namespace = namespace;
        this.cpes = cpes;
        this._package = _package;
    }

    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @JsonProperty("cpes")
    public List<String> getCpes() {
        return cpes;
    }

    @JsonProperty("cpes")
    public void setCpes(List<String> cpes) {
        this.cpes = cpes;
    }

    @JsonProperty("Package")
    public Package getPackage() {
        return _package;
    }

    @JsonProperty("Package")
    public void setPackage(Package _package) {
        this._package = _package;
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
        sb.append(SearchedBy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("namespace");
        sb.append('=');
        sb.append(((this.namespace == null)?"<null>":this.namespace));
        sb.append(',');
        sb.append("cpes");
        sb.append('=');
        sb.append(((this.cpes == null)?"<null>":this.cpes));
        sb.append(',');
        sb.append("_package");
        sb.append('=');
        sb.append(((this._package == null)?"<null>":this._package));
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
