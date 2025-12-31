package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "value",
    "slice",
    "confidenceInterval"
})
public class PerformanceMetric {

    /**
     * The type of performance metric.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of performance metric.")
    private String type;
    /**
     * The value of the performance metric.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value of the performance metric.")
    private String value;
    /**
     * The name of the slice this metric was computed on. By default, assume this metric is not sliced.
     * 
     */
    @JsonProperty("slice")
    @JsonPropertyDescription("The name of the slice this metric was computed on. By default, assume this metric is not sliced.")
    private String slice;
    /**
     * The confidence interval of the metric.
     * 
     */
    @JsonProperty("confidenceInterval")
    @JsonPropertyDescription("The confidence interval of the metric.")
    private ConfidenceInterval confidenceInterval;

    /**
     * The type of performance metric.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of performance metric.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The value of the performance metric.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * The value of the performance metric.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The name of the slice this metric was computed on. By default, assume this metric is not sliced.
     * 
     */
    @JsonProperty("slice")
    public String getSlice() {
        return slice;
    }

    /**
     * The name of the slice this metric was computed on. By default, assume this metric is not sliced.
     * 
     */
    @JsonProperty("slice")
    public void setSlice(String slice) {
        this.slice = slice;
    }

    /**
     * The confidence interval of the metric.
     * 
     */
    @JsonProperty("confidenceInterval")
    public ConfidenceInterval getConfidenceInterval() {
        return confidenceInterval;
    }

    /**
     * The confidence interval of the metric.
     * 
     */
    @JsonProperty("confidenceInterval")
    public void setConfidenceInterval(ConfidenceInterval confidenceInterval) {
        this.confidenceInterval = confidenceInterval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PerformanceMetric.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("slice");
        sb.append('=');
        sb.append(((this.slice == null)?"<null>":this.slice));
        sb.append(',');
        sb.append("confidenceInterval");
        sb.append('=');
        sb.append(((this.confidenceInterval == null)?"<null>":this.confidenceInterval));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.confidenceInterval == null)? 0 :this.confidenceInterval.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.slice == null)? 0 :this.slice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PerformanceMetric) == false) {
            return false;
        }
        PerformanceMetric rhs = ((PerformanceMetric) other);
        return (((((this.confidenceInterval == rhs.confidenceInterval)||((this.confidenceInterval!= null)&&this.confidenceInterval.equals(rhs.confidenceInterval)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.slice == rhs.slice)||((this.slice!= null)&&this.slice.equals(rhs.slice))));
    }

}
