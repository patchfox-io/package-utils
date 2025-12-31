package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Quantitative Analysis
 * <p>
 * A quantitative analysis of the model
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "performanceMetrics",
    "graphics"
})
public class QuantitativeAnalysis {

    /**
     * Performance Metrics
     * <p>
     * The model performance metrics being reported. Examples may include accuracy, F1 score, precision, top-3 error rates, MSC, etc.
     * 
     */
    @JsonProperty("performanceMetrics")
    @JsonPropertyDescription("The model performance metrics being reported. Examples may include accuracy, F1 score, precision, top-3 error rates, MSC, etc.")
    private List<PerformanceMetric> performanceMetrics = new ArrayList<PerformanceMetric>();
    /**
     * Graphics Collection
     * <p>
     * A collection of graphics that represent various measurements.
     * 
     */
    @JsonProperty("graphics")
    @JsonPropertyDescription("A collection of graphics that represent various measurements.")
    private GraphicsCollection graphics;

    /**
     * Performance Metrics
     * <p>
     * The model performance metrics being reported. Examples may include accuracy, F1 score, precision, top-3 error rates, MSC, etc.
     * 
     */
    @JsonProperty("performanceMetrics")
    public List<PerformanceMetric> getPerformanceMetrics() {
        return performanceMetrics;
    }

    /**
     * Performance Metrics
     * <p>
     * The model performance metrics being reported. Examples may include accuracy, F1 score, precision, top-3 error rates, MSC, etc.
     * 
     */
    @JsonProperty("performanceMetrics")
    public void setPerformanceMetrics(List<PerformanceMetric> performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }

    /**
     * Graphics Collection
     * <p>
     * A collection of graphics that represent various measurements.
     * 
     */
    @JsonProperty("graphics")
    public GraphicsCollection getGraphics() {
        return graphics;
    }

    /**
     * Graphics Collection
     * <p>
     * A collection of graphics that represent various measurements.
     * 
     */
    @JsonProperty("graphics")
    public void setGraphics(GraphicsCollection graphics) {
        this.graphics = graphics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuantitativeAnalysis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("performanceMetrics");
        sb.append('=');
        sb.append(((this.performanceMetrics == null)?"<null>":this.performanceMetrics));
        sb.append(',');
        sb.append("graphics");
        sb.append('=');
        sb.append(((this.graphics == null)?"<null>":this.graphics));
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
        result = ((result* 31)+((this.performanceMetrics == null)? 0 :this.performanceMetrics.hashCode()));
        result = ((result* 31)+((this.graphics == null)? 0 :this.graphics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuantitativeAnalysis) == false) {
            return false;
        }
        QuantitativeAnalysis rhs = ((QuantitativeAnalysis) other);
        return (((this.performanceMetrics == rhs.performanceMetrics)||((this.performanceMetrics!= null)&&this.performanceMetrics.equals(rhs.performanceMetrics)))&&((this.graphics == rhs.graphics)||((this.graphics!= null)&&this.graphics.equals(rhs.graphics))));
    }

}
