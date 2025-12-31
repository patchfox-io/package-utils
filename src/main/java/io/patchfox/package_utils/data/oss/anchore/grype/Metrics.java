
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
    "baseScore",
    "exploitabilityScore",
    "impactScore"
})
@Generated("jsonschema2pojo")
public class Metrics {

    @JsonProperty("baseScore")
    private Double baseScore;
    @JsonProperty("exploitabilityScore")
    private Integer exploitabilityScore;
    @JsonProperty("impactScore")
    private Double impactScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metrics() {
    }

    /**
     * 
     * @param exploitabilityScore
     * @param baseScore
     * @param impactScore
     */
    public Metrics(Double baseScore, Integer exploitabilityScore, Double impactScore) {
        super();
        this.baseScore = baseScore;
        this.exploitabilityScore = exploitabilityScore;
        this.impactScore = impactScore;
    }

    @JsonProperty("baseScore")
    public Double getBaseScore() {
        return baseScore;
    }

    @JsonProperty("baseScore")
    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    @JsonProperty("exploitabilityScore")
    public Integer getExploitabilityScore() {
        return exploitabilityScore;
    }

    @JsonProperty("exploitabilityScore")
    public void setExploitabilityScore(Integer exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
    }

    @JsonProperty("impactScore")
    public Double getImpactScore() {
        return impactScore;
    }

    @JsonProperty("impactScore")
    public void setImpactScore(Double impactScore) {
        this.impactScore = impactScore;
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
        sb.append(Metrics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseScore");
        sb.append('=');
        sb.append(((this.baseScore == null)?"<null>":this.baseScore));
        sb.append(',');
        sb.append("exploitabilityScore");
        sb.append('=');
        sb.append(((this.exploitabilityScore == null)?"<null>":this.exploitabilityScore));
        sb.append(',');
        sb.append("impactScore");
        sb.append('=');
        sb.append(((this.impactScore == null)?"<null>":this.impactScore));
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
