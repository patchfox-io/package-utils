
package io.patchfox.package_utils.data.oss.anchore.grype;

import java.util.LinkedHashMap;
import java.util.List;
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
    "vulnerability",
    "relatedVulnerabilities",
    "matchDetails",
    "artifact"
})
@Generated("jsonschema2pojo")
public class Match {

    @JsonProperty("vulnerability")
    private Vulnerability vulnerability;
    @JsonProperty("relatedVulnerabilities")
    private List<Object> relatedVulnerabilities;
    @JsonProperty("matchDetails")
    private List<MatchDetail> matchDetails;
    @JsonProperty("artifact")
    private Artifact artifact;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Match() {
    }

    /**
     * 
     * @param artifact
     * @param relatedVulnerabilities
     * @param matchDetails
     * @param vulnerability
     */
    public Match(Vulnerability vulnerability, List<Object> relatedVulnerabilities, List<MatchDetail> matchDetails, Artifact artifact) {
        super();
        this.vulnerability = vulnerability;
        this.relatedVulnerabilities = relatedVulnerabilities;
        this.matchDetails = matchDetails;
        this.artifact = artifact;
    }

    @JsonProperty("vulnerability")
    public Vulnerability getVulnerability() {
        return vulnerability;
    }

    @JsonProperty("vulnerability")
    public void setVulnerability(Vulnerability vulnerability) {
        this.vulnerability = vulnerability;
    }

    @JsonProperty("relatedVulnerabilities")
    public List<Object> getRelatedVulnerabilities() {
        return relatedVulnerabilities;
    }

    @JsonProperty("relatedVulnerabilities")
    public void setRelatedVulnerabilities(List<Object> relatedVulnerabilities) {
        this.relatedVulnerabilities = relatedVulnerabilities;
    }

    @JsonProperty("matchDetails")
    public List<MatchDetail> getMatchDetails() {
        return matchDetails;
    }

    @JsonProperty("matchDetails")
    public void setMatchDetails(List<MatchDetail> matchDetails) {
        this.matchDetails = matchDetails;
    }

    @JsonProperty("artifact")
    public Artifact getArtifact() {
        return artifact;
    }

    @JsonProperty("artifact")
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
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
        sb.append(Match.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vulnerability");
        sb.append('=');
        sb.append(((this.vulnerability == null)?"<null>":this.vulnerability));
        sb.append(',');
        sb.append("relatedVulnerabilities");
        sb.append('=');
        sb.append(((this.relatedVulnerabilities == null)?"<null>":this.relatedVulnerabilities));
        sb.append(',');
        sb.append("matchDetails");
        sb.append('=');
        sb.append(((this.matchDetails == null)?"<null>":this.matchDetails));
        sb.append(',');
        sb.append("artifact");
        sb.append('=');
        sb.append(((this.artifact == null)?"<null>":this.artifact));
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
