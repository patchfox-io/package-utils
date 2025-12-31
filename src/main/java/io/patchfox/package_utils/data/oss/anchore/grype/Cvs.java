
package io.patchfox.package_utils.data.oss.anchore.grype;

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
    "source",
    "type",
    "version",
    "vector",
    "metrics",
    "vendorMetadata"
})
@Generated("jsonschema2pojo")
public class Cvs {

    @JsonProperty("source")
    private String source;
    @JsonProperty("type")
    private String type;
    @JsonProperty("version")
    private String version;
    @JsonProperty("vector")
    private String vector;
    @JsonProperty("metrics")
    private Metrics metrics;
    @JsonProperty("vendorMetadata")
    private VendorMetadata vendorMetadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cvs() {
    }

    /**
     * 
     * @param vendorMetadata
     * @param vector
     * @param source
     * @param metrics
     * @param type
     * @param version
     */
    public Cvs(String source, String type, String version, String vector, Metrics metrics, VendorMetadata vendorMetadata) {
        super();
        this.source = source;
        this.type = type;
        this.version = version;
        this.vector = vector;
        this.metrics = metrics;
        this.vendorMetadata = vendorMetadata;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("vector")
    public String getVector() {
        return vector;
    }

    @JsonProperty("vector")
    public void setVector(String vector) {
        this.vector = vector;
    }

    @JsonProperty("metrics")
    public Metrics getMetrics() {
        return metrics;
    }

    @JsonProperty("metrics")
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    @JsonProperty("vendorMetadata")
    public VendorMetadata getVendorMetadata() {
        return vendorMetadata;
    }

    @JsonProperty("vendorMetadata")
    public void setVendorMetadata(VendorMetadata vendorMetadata) {
        this.vendorMetadata = vendorMetadata;
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
        sb.append(Cvs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("vector");
        sb.append('=');
        sb.append(((this.vector == null)?"<null>":this.vector));
        sb.append(',');
        sb.append("metrics");
        sb.append('=');
        sb.append(((this.metrics == null)?"<null>":this.metrics));
        sb.append(',');
        sb.append("vendorMetadata");
        sb.append('=');
        sb.append(((this.vendorMetadata == null)?"<null>":this.vendorMetadata));
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
