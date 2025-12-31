package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The confidence interval of the metric.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lowerBound",
    "upperBound"
})
public class ConfidenceInterval {

    /**
     * The lower bound of the confidence interval.
     * 
     */
    @JsonProperty("lowerBound")
    @JsonPropertyDescription("The lower bound of the confidence interval.")
    private String lowerBound;
    /**
     * The upper bound of the confidence interval.
     * 
     */
    @JsonProperty("upperBound")
    @JsonPropertyDescription("The upper bound of the confidence interval.")
    private String upperBound;

    /**
     * The lower bound of the confidence interval.
     * 
     */
    @JsonProperty("lowerBound")
    public String getLowerBound() {
        return lowerBound;
    }

    /**
     * The lower bound of the confidence interval.
     * 
     */
    @JsonProperty("lowerBound")
    public void setLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
    }

    /**
     * The upper bound of the confidence interval.
     * 
     */
    @JsonProperty("upperBound")
    public String getUpperBound() {
        return upperBound;
    }

    /**
     * The upper bound of the confidence interval.
     * 
     */
    @JsonProperty("upperBound")
    public void setUpperBound(String upperBound) {
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfidenceInterval.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lowerBound");
        sb.append('=');
        sb.append(((this.lowerBound == null)?"<null>":this.lowerBound));
        sb.append(',');
        sb.append("upperBound");
        sb.append('=');
        sb.append(((this.upperBound == null)?"<null>":this.upperBound));
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
        result = ((result* 31)+((this.upperBound == null)? 0 :this.upperBound.hashCode()));
        result = ((result* 31)+((this.lowerBound == null)? 0 :this.lowerBound.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfidenceInterval) == false) {
            return false;
        }
        ConfidenceInterval rhs = ((ConfidenceInterval) other);
        return (((this.upperBound == rhs.upperBound)||((this.upperBound!= null)&&this.upperBound.equals(rhs.upperBound)))&&((this.lowerBound == rhs.lowerBound)||((this.lowerBound!= null)&&this.lowerBound.equals(rhs.lowerBound))));
    }

}
