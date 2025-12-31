package io.patchfox.package_utils.data.oss.owasp.depcheck;


import java.util.HashMap;
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
        "attackVector",
        "attackComplexity",
        "privilegesRequired",
        "userInteraction",
        "scope",
        "confidentialityImpact",
        "integrityImpact",
        "availabilityImpact",
        "baseSeverity",
        "exploitabilityScore",
        "impactScore",
        "version"
})
@Generated("jsonschema2pojo")
public class Cvssv3 {

    @JsonProperty("baseScore")
    private Double baseScore;
    @JsonProperty("attackVector")
    private String attackVector;
    @JsonProperty("attackComplexity")
    private String attackComplexity;
    @JsonProperty("privilegesRequired")
    private String privilegesRequired;
    @JsonProperty("userInteraction")
    private String userInteraction;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("confidentialityImpact")
    private String confidentialityImpact;
    @JsonProperty("integrityImpact")
    private String integrityImpact;
    @JsonProperty("availabilityImpact")
    private String availabilityImpact;
    @JsonProperty("baseSeverity")
    private String baseSeverity;
    @JsonProperty("exploitabilityScore")
    private String exploitabilityScore;
    @JsonProperty("impactScore")
    private String impactScore;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("baseScore")
    public Double getBaseScore() {
        return baseScore;
    }

    @JsonProperty("baseScore")
    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    public Cvssv3 withBaseScore(Double baseScore) {
        this.baseScore = baseScore;
        return this;
    }

    @JsonProperty("attackVector")
    public String getAttackVector() {
        return attackVector;
    }

    @JsonProperty("attackVector")
    public void setAttackVector(String attackVector) {
        this.attackVector = attackVector;
    }

    public Cvssv3 withAttackVector(String attackVector) {
        this.attackVector = attackVector;
        return this;
    }

    @JsonProperty("attackComplexity")
    public String getAttackComplexity() {
        return attackComplexity;
    }

    @JsonProperty("attackComplexity")
    public void setAttackComplexity(String attackComplexity) {
        this.attackComplexity = attackComplexity;
    }

    public Cvssv3 withAttackComplexity(String attackComplexity) {
        this.attackComplexity = attackComplexity;
        return this;
    }

    @JsonProperty("privilegesRequired")
    public String getPrivilegesRequired() {
        return privilegesRequired;
    }

    @JsonProperty("privilegesRequired")
    public void setPrivilegesRequired(String privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
    }

    public Cvssv3 withPrivilegesRequired(String privilegesRequired) {
        this.privilegesRequired = privilegesRequired;
        return this;
    }

    @JsonProperty("userInteraction")
    public String getUserInteraction() {
        return userInteraction;
    }

    @JsonProperty("userInteraction")
    public void setUserInteraction(String userInteraction) {
        this.userInteraction = userInteraction;
    }

    public Cvssv3 withUserInteraction(String userInteraction) {
        this.userInteraction = userInteraction;
        return this;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    public Cvssv3 withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @JsonProperty("confidentialityImpact")
    public String getConfidentialityImpact() {
        return confidentialityImpact;
    }

    @JsonProperty("confidentialityImpact")
    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    public Cvssv3 withConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
        return this;
    }

    @JsonProperty("integrityImpact")
    public String getIntegrityImpact() {
        return integrityImpact;
    }

    @JsonProperty("integrityImpact")
    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    public Cvssv3 withIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
        return this;
    }

    @JsonProperty("availabilityImpact")
    public String getAvailabilityImpact() {
        return availabilityImpact;
    }

    @JsonProperty("availabilityImpact")
    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    public Cvssv3 withAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
        return this;
    }

    @JsonProperty("baseSeverity")
    public String getBaseSeverity() {
        return baseSeverity;
    }

    @JsonProperty("baseSeverity")
    public void setBaseSeverity(String baseSeverity) {
        this.baseSeverity = baseSeverity;
    }

    public Cvssv3 withBaseSeverity(String baseSeverity) {
        this.baseSeverity = baseSeverity;
        return this;
    }

    @JsonProperty("exploitabilityScore")
    public String getExploitabilityScore() {
        return exploitabilityScore;
    }

    @JsonProperty("exploitabilityScore")
    public void setExploitabilityScore(String exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
    }

    public Cvssv3 withExploitabilityScore(String exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
        return this;
    }

    @JsonProperty("impactScore")
    public String getImpactScore() {
        return impactScore;
    }

    @JsonProperty("impactScore")
    public void setImpactScore(String impactScore) {
        this.impactScore = impactScore;
    }

    public Cvssv3 withImpactScore(String impactScore) {
        this.impactScore = impactScore;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Cvssv3 withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Cvssv3 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
