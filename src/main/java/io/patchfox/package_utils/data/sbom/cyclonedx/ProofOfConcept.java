package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Proof of Concept
 * <p>
 * Evidence used to reproduce the vulnerability.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reproductionSteps",
    "environment",
    "supportingMaterial"
})
public class ProofOfConcept {

    /**
     * Steps to Reproduce
     * <p>
     * Precise steps to reproduce the vulnerability.
     * 
     */
    @JsonProperty("reproductionSteps")
    @JsonPropertyDescription("Precise steps to reproduce the vulnerability.")
    private String reproductionSteps;
    /**
     * Environment
     * <p>
     * A description of the environment in which reproduction was possible.
     * 
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("A description of the environment in which reproduction was possible.")
    private String environment;
    /**
     * Supporting Material
     * <p>
     * Supporting material that helps in reproducing or understanding how reproduction is possible. This may include screenshots, payloads, and PoC exploit code.
     * 
     */
    @JsonProperty("supportingMaterial")
    @JsonPropertyDescription("Supporting material that helps in reproducing or understanding how reproduction is possible. This may include screenshots, payloads, and PoC exploit code.")
    private List<Attachment> supportingMaterial = new ArrayList<Attachment>();

    /**
     * Steps to Reproduce
     * <p>
     * Precise steps to reproduce the vulnerability.
     * 
     */
    @JsonProperty("reproductionSteps")
    public String getReproductionSteps() {
        return reproductionSteps;
    }

    /**
     * Steps to Reproduce
     * <p>
     * Precise steps to reproduce the vulnerability.
     * 
     */
    @JsonProperty("reproductionSteps")
    public void setReproductionSteps(String reproductionSteps) {
        this.reproductionSteps = reproductionSteps;
    }

    /**
     * Environment
     * <p>
     * A description of the environment in which reproduction was possible.
     * 
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * Environment
     * <p>
     * A description of the environment in which reproduction was possible.
     * 
     */
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Supporting Material
     * <p>
     * Supporting material that helps in reproducing or understanding how reproduction is possible. This may include screenshots, payloads, and PoC exploit code.
     * 
     */
    @JsonProperty("supportingMaterial")
    public List<Attachment> getSupportingMaterial() {
        return supportingMaterial;
    }

    /**
     * Supporting Material
     * <p>
     * Supporting material that helps in reproducing or understanding how reproduction is possible. This may include screenshots, payloads, and PoC exploit code.
     * 
     */
    @JsonProperty("supportingMaterial")
    public void setSupportingMaterial(List<Attachment> supportingMaterial) {
        this.supportingMaterial = supportingMaterial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProofOfConcept.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reproductionSteps");
        sb.append('=');
        sb.append(((this.reproductionSteps == null)?"<null>":this.reproductionSteps));
        sb.append(',');
        sb.append("environment");
        sb.append('=');
        sb.append(((this.environment == null)?"<null>":this.environment));
        sb.append(',');
        sb.append("supportingMaterial");
        sb.append('=');
        sb.append(((this.supportingMaterial == null)?"<null>":this.supportingMaterial));
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
        result = ((result* 31)+((this.reproductionSteps == null)? 0 :this.reproductionSteps.hashCode()));
        result = ((result* 31)+((this.supportingMaterial == null)? 0 :this.supportingMaterial.hashCode()));
        result = ((result* 31)+((this.environment == null)? 0 :this.environment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProofOfConcept) == false) {
            return false;
        }
        ProofOfConcept rhs = ((ProofOfConcept) other);
        return ((((this.reproductionSteps == rhs.reproductionSteps)||((this.reproductionSteps!= null)&&this.reproductionSteps.equals(rhs.reproductionSteps)))&&((this.supportingMaterial == rhs.supportingMaterial)||((this.supportingMaterial!= null)&&this.supportingMaterial.equals(rhs.supportingMaterial))))&&((this.environment == rhs.environment)||((this.environment!= null)&&this.environment.equals(rhs.environment))));
    }

}
