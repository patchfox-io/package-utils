package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Considerations
 * <p>
 * What considerations should be taken into account regarding the model's construction, training, and application?
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "users",
    "useCases",
    "technicalLimitations",
    "performanceTradeoffs",
    "ethicalConsiderations",
    "fairnessAssessments"
})
public class Considerations {

    /**
     * Users
     * <p>
     * Who are the intended users of the model?
     * 
     */
    @JsonProperty("users")
    @JsonPropertyDescription("Who are the intended users of the model?")
    private List<String> users = new ArrayList<String>();
    /**
     * Use Cases
     * <p>
     * What are the intended use cases of the model?
     * 
     */
    @JsonProperty("useCases")
    @JsonPropertyDescription("What are the intended use cases of the model?")
    private List<String> useCases = new ArrayList<String>();
    /**
     * Technical Limitations
     * <p>
     * What are the known technical limitations of the model? E.g. What kind(s) of data should the model be expected not to perform well on? What are the factors that might degrade model performance?
     * 
     */
    @JsonProperty("technicalLimitations")
    @JsonPropertyDescription("What are the known technical limitations of the model? E.g. What kind(s) of data should the model be expected not to perform well on? What are the factors that might degrade model performance?")
    private List<String> technicalLimitations = new ArrayList<String>();
    /**
     * Performance Tradeoffs
     * <p>
     * What are the known tradeoffs in accuracy/performance of the model?
     * 
     */
    @JsonProperty("performanceTradeoffs")
    @JsonPropertyDescription("What are the known tradeoffs in accuracy/performance of the model?")
    private List<String> performanceTradeoffs = new ArrayList<String>();
    /**
     * Ethical Considerations
     * <p>
     * What are the ethical (or environmental) risks involved in the application of this model?
     * 
     */
    @JsonProperty("ethicalConsiderations")
    @JsonPropertyDescription("What are the ethical (or environmental) risks involved in the application of this model?")
    private List<Risk> ethicalConsiderations = new ArrayList<Risk>();
    /**
     * Fairness Assessments
     * <p>
     * How does the model affect groups at risk of being systematically disadvantaged? What are the harms and benefits to the various affected groups?
     * 
     */
    @JsonProperty("fairnessAssessments")
    @JsonPropertyDescription("How does the model affect groups at risk of being systematically disadvantaged? What are the harms and benefits to the various affected groups?")
    private List<FairnessAssessment> fairnessAssessments = new ArrayList<FairnessAssessment>();

    /**
     * Users
     * <p>
     * Who are the intended users of the model?
     * 
     */
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    /**
     * Users
     * <p>
     * Who are the intended users of the model?
     * 
     */
    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    /**
     * Use Cases
     * <p>
     * What are the intended use cases of the model?
     * 
     */
    @JsonProperty("useCases")
    public List<String> getUseCases() {
        return useCases;
    }

    /**
     * Use Cases
     * <p>
     * What are the intended use cases of the model?
     * 
     */
    @JsonProperty("useCases")
    public void setUseCases(List<String> useCases) {
        this.useCases = useCases;
    }

    /**
     * Technical Limitations
     * <p>
     * What are the known technical limitations of the model? E.g. What kind(s) of data should the model be expected not to perform well on? What are the factors that might degrade model performance?
     * 
     */
    @JsonProperty("technicalLimitations")
    public List<String> getTechnicalLimitations() {
        return technicalLimitations;
    }

    /**
     * Technical Limitations
     * <p>
     * What are the known technical limitations of the model? E.g. What kind(s) of data should the model be expected not to perform well on? What are the factors that might degrade model performance?
     * 
     */
    @JsonProperty("technicalLimitations")
    public void setTechnicalLimitations(List<String> technicalLimitations) {
        this.technicalLimitations = technicalLimitations;
    }

    /**
     * Performance Tradeoffs
     * <p>
     * What are the known tradeoffs in accuracy/performance of the model?
     * 
     */
    @JsonProperty("performanceTradeoffs")
    public List<String> getPerformanceTradeoffs() {
        return performanceTradeoffs;
    }

    /**
     * Performance Tradeoffs
     * <p>
     * What are the known tradeoffs in accuracy/performance of the model?
     * 
     */
    @JsonProperty("performanceTradeoffs")
    public void setPerformanceTradeoffs(List<String> performanceTradeoffs) {
        this.performanceTradeoffs = performanceTradeoffs;
    }

    /**
     * Ethical Considerations
     * <p>
     * What are the ethical (or environmental) risks involved in the application of this model?
     * 
     */
    @JsonProperty("ethicalConsiderations")
    public List<Risk> getEthicalConsiderations() {
        return ethicalConsiderations;
    }

    /**
     * Ethical Considerations
     * <p>
     * What are the ethical (or environmental) risks involved in the application of this model?
     * 
     */
    @JsonProperty("ethicalConsiderations")
    public void setEthicalConsiderations(List<Risk> ethicalConsiderations) {
        this.ethicalConsiderations = ethicalConsiderations;
    }

    /**
     * Fairness Assessments
     * <p>
     * How does the model affect groups at risk of being systematically disadvantaged? What are the harms and benefits to the various affected groups?
     * 
     */
    @JsonProperty("fairnessAssessments")
    public List<FairnessAssessment> getFairnessAssessments() {
        return fairnessAssessments;
    }

    /**
     * Fairness Assessments
     * <p>
     * How does the model affect groups at risk of being systematically disadvantaged? What are the harms and benefits to the various affected groups?
     * 
     */
    @JsonProperty("fairnessAssessments")
    public void setFairnessAssessments(List<FairnessAssessment> fairnessAssessments) {
        this.fairnessAssessments = fairnessAssessments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Considerations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("users");
        sb.append('=');
        sb.append(((this.users == null)?"<null>":this.users));
        sb.append(',');
        sb.append("useCases");
        sb.append('=');
        sb.append(((this.useCases == null)?"<null>":this.useCases));
        sb.append(',');
        sb.append("technicalLimitations");
        sb.append('=');
        sb.append(((this.technicalLimitations == null)?"<null>":this.technicalLimitations));
        sb.append(',');
        sb.append("performanceTradeoffs");
        sb.append('=');
        sb.append(((this.performanceTradeoffs == null)?"<null>":this.performanceTradeoffs));
        sb.append(',');
        sb.append("ethicalConsiderations");
        sb.append('=');
        sb.append(((this.ethicalConsiderations == null)?"<null>":this.ethicalConsiderations));
        sb.append(',');
        sb.append("fairnessAssessments");
        sb.append('=');
        sb.append(((this.fairnessAssessments == null)?"<null>":this.fairnessAssessments));
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
        result = ((result* 31)+((this.useCases == null)? 0 :this.useCases.hashCode()));
        result = ((result* 31)+((this.performanceTradeoffs == null)? 0 :this.performanceTradeoffs.hashCode()));
        result = ((result* 31)+((this.ethicalConsiderations == null)? 0 :this.ethicalConsiderations.hashCode()));
        result = ((result* 31)+((this.users == null)? 0 :this.users.hashCode()));
        result = ((result* 31)+((this.technicalLimitations == null)? 0 :this.technicalLimitations.hashCode()));
        result = ((result* 31)+((this.fairnessAssessments == null)? 0 :this.fairnessAssessments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Considerations) == false) {
            return false;
        }
        Considerations rhs = ((Considerations) other);
        return (((((((this.useCases == rhs.useCases)||((this.useCases!= null)&&this.useCases.equals(rhs.useCases)))&&((this.performanceTradeoffs == rhs.performanceTradeoffs)||((this.performanceTradeoffs!= null)&&this.performanceTradeoffs.equals(rhs.performanceTradeoffs))))&&((this.ethicalConsiderations == rhs.ethicalConsiderations)||((this.ethicalConsiderations!= null)&&this.ethicalConsiderations.equals(rhs.ethicalConsiderations))))&&((this.users == rhs.users)||((this.users!= null)&&this.users.equals(rhs.users))))&&((this.technicalLimitations == rhs.technicalLimitations)||((this.technicalLimitations!= null)&&this.technicalLimitations.equals(rhs.technicalLimitations))))&&((this.fairnessAssessments == rhs.fairnessAssessments)||((this.fairnessAssessments!= null)&&this.fairnessAssessments.equals(rhs.fairnessAssessments))));
    }

}
