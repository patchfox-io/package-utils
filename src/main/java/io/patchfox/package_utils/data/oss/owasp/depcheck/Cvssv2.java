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
        "score",
        "accessVector",
        "accessComplexity",
        "authenticationr",
        "confidentialImpact",
        "integrityImpact",
        "availabilityImpact",
        "severity",
        "version",
        "exploitabilityScore",
        "impactScore"
})
@Generated("jsonschema2pojo")
public class Cvssv2 {

    @JsonProperty("score")
    private Double score;
    @JsonProperty("accessVector")
    private String accessVector;
    @JsonProperty("accessComplexity")
    private String accessComplexity;
    @JsonProperty("authenticationr")
    private String authenticationr;
    @JsonProperty("confidentialImpact")
    private String confidentialImpact;
    @JsonProperty("integrityImpact")
    private String integrityImpact;
    @JsonProperty("availabilityImpact")
    private String availabilityImpact;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("version")
    private String version;
    @JsonProperty("exploitabilityScore")
    private String exploitabilityScore;
    @JsonProperty("impactScore")
    private String impactScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    public Cvssv2 withScore(Double score) {
        this.score = score;
        return this;
    }

    @JsonProperty("accessVector")
    public String getAccessVector() {
        return accessVector;
    }

    @JsonProperty("accessVector")
    public void setAccessVector(String accessVector) {
        this.accessVector = accessVector;
    }

    public Cvssv2 withAccessVector(String accessVector) {
        this.accessVector = accessVector;
        return this;
    }

    @JsonProperty("accessComplexity")
    public String getAccessComplexity() {
        return accessComplexity;
    }

    @JsonProperty("accessComplexity")
    public void setAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    public Cvssv2 withAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity;
        return this;
    }

    @JsonProperty("authenticationr")
    public String getAuthenticationr() {
        return authenticationr;
    }

    @JsonProperty("authenticationr")
    public void setAuthenticationr(String authenticationr) {
        this.authenticationr = authenticationr;
    }

    public Cvssv2 withAuthenticationr(String authenticationr) {
        this.authenticationr = authenticationr;
        return this;
    }

    @JsonProperty("confidentialImpact")
    public String getConfidentialImpact() {
        return confidentialImpact;
    }

    @JsonProperty("confidentialImpact")
    public void setConfidentialImpact(String confidentialImpact) {
        this.confidentialImpact = confidentialImpact;
    }

    public Cvssv2 withConfidentialImpact(String confidentialImpact) {
        this.confidentialImpact = confidentialImpact;
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

    public Cvssv2 withIntegrityImpact(String integrityImpact) {
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

    public Cvssv2 withAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
        return this;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Cvssv2 withSeverity(String severity) {
        this.severity = severity;
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

    public Cvssv2 withVersion(String version) {
        this.version = version;
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

    public Cvssv2 withExploitabilityScore(String exploitabilityScore) {
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

    public Cvssv2 withImpactScore(String impactScore) {
        this.impactScore = impactScore;
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

    public Cvssv2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
