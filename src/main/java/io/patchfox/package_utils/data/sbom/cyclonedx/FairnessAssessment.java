package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Fairness Assessment
 * <p>
 * Information about the benefits and harms of the model to an identified at risk group.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "groupAtRisk",
    "benefits",
    "harms",
    "mitigationStrategy"
})
public class FairnessAssessment {

    /**
     * The groups or individuals at risk of being systematically disadvantaged by the model.
     * 
     */
    @JsonProperty("groupAtRisk")
    @JsonPropertyDescription("The groups or individuals at risk of being systematically disadvantaged by the model.")
    private String groupAtRisk;
    /**
     * Expected benefits to the identified groups.
     * 
     */
    @JsonProperty("benefits")
    @JsonPropertyDescription("Expected benefits to the identified groups.")
    private String benefits;
    /**
     * Expected harms to the identified groups.
     * 
     */
    @JsonProperty("harms")
    @JsonPropertyDescription("Expected harms to the identified groups.")
    private String harms;
    /**
     * With respect to the benefits and harms outlined, please describe any mitigation strategy implemented.
     * 
     */
    @JsonProperty("mitigationStrategy")
    @JsonPropertyDescription("With respect to the benefits and harms outlined, please describe any mitigation strategy implemented.")
    private String mitigationStrategy;

    /**
     * The groups or individuals at risk of being systematically disadvantaged by the model.
     * 
     */
    @JsonProperty("groupAtRisk")
    public String getGroupAtRisk() {
        return groupAtRisk;
    }

    /**
     * The groups or individuals at risk of being systematically disadvantaged by the model.
     * 
     */
    @JsonProperty("groupAtRisk")
    public void setGroupAtRisk(String groupAtRisk) {
        this.groupAtRisk = groupAtRisk;
    }

    /**
     * Expected benefits to the identified groups.
     * 
     */
    @JsonProperty("benefits")
    public String getBenefits() {
        return benefits;
    }

    /**
     * Expected benefits to the identified groups.
     * 
     */
    @JsonProperty("benefits")
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    /**
     * Expected harms to the identified groups.
     * 
     */
    @JsonProperty("harms")
    public String getHarms() {
        return harms;
    }

    /**
     * Expected harms to the identified groups.
     * 
     */
    @JsonProperty("harms")
    public void setHarms(String harms) {
        this.harms = harms;
    }

    /**
     * With respect to the benefits and harms outlined, please describe any mitigation strategy implemented.
     * 
     */
    @JsonProperty("mitigationStrategy")
    public String getMitigationStrategy() {
        return mitigationStrategy;
    }

    /**
     * With respect to the benefits and harms outlined, please describe any mitigation strategy implemented.
     * 
     */
    @JsonProperty("mitigationStrategy")
    public void setMitigationStrategy(String mitigationStrategy) {
        this.mitigationStrategy = mitigationStrategy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FairnessAssessment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupAtRisk");
        sb.append('=');
        sb.append(((this.groupAtRisk == null)?"<null>":this.groupAtRisk));
        sb.append(',');
        sb.append("benefits");
        sb.append('=');
        sb.append(((this.benefits == null)?"<null>":this.benefits));
        sb.append(',');
        sb.append("harms");
        sb.append('=');
        sb.append(((this.harms == null)?"<null>":this.harms));
        sb.append(',');
        sb.append("mitigationStrategy");
        sb.append('=');
        sb.append(((this.mitigationStrategy == null)?"<null>":this.mitigationStrategy));
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
        result = ((result* 31)+((this.benefits == null)? 0 :this.benefits.hashCode()));
        result = ((result* 31)+((this.harms == null)? 0 :this.harms.hashCode()));
        result = ((result* 31)+((this.mitigationStrategy == null)? 0 :this.mitigationStrategy.hashCode()));
        result = ((result* 31)+((this.groupAtRisk == null)? 0 :this.groupAtRisk.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FairnessAssessment) == false) {
            return false;
        }
        FairnessAssessment rhs = ((FairnessAssessment) other);
        return (((((this.benefits == rhs.benefits)||((this.benefits!= null)&&this.benefits.equals(rhs.benefits)))&&((this.harms == rhs.harms)||((this.harms!= null)&&this.harms.equals(rhs.harms))))&&((this.mitigationStrategy == rhs.mitigationStrategy)||((this.mitigationStrategy!= null)&&this.mitigationStrategy.equals(rhs.mitigationStrategy))))&&((this.groupAtRisk == rhs.groupAtRisk)||((this.groupAtRisk!= null)&&this.groupAtRisk.equals(rhs.groupAtRisk))));
    }

}
