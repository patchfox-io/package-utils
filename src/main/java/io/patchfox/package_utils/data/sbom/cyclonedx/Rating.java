package io.patchfox.package_utils.data.sbom.cyclonedx;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Rating
 * <p>
 * Defines the severity or risk ratings of a vulnerability.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "score",
    "severity",
    "method",
    "vector",
    "justification"
})
public class Rating {

    /**
     * Source
     * <p>
     * The source of vulnerability information. This is often the organization that published the vulnerability.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of vulnerability information. This is often the organization that published the vulnerability.")
    private VulnerabilitySource source;
    /**
     * Score
     * <p>
     * The numerical score of the rating.
     * 
     */
    @JsonProperty("score")
    @JsonPropertyDescription("The numerical score of the rating.")
    private Double score;
    /**
     * Severity
     * <p>
     * Textual representation of the severity of the vulnerability adopted by the analysis method. If the analysis method uses values other than what is provided, the user is expected to translate appropriately.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Textual representation of the severity of the vulnerability adopted by the analysis method. If the analysis method uses values other than what is provided, the user is expected to translate appropriately.")
    private Rating.Severity severity;
    /**
     * Method
     * <p>
     * Specifies the severity or risk scoring methodology or standard used.
     * 
     * * CVSSv2 - [Common Vulnerability Scoring System v2](https://www.first.org/cvss/v2/)
     * * CVSSv3 - [Common Vulnerability Scoring System v3](https://www.first.org/cvss/v3-0/)
     * * CVSSv31 - [Common Vulnerability Scoring System v3.1](https://www.first.org/cvss/v3-1/)
     * * CVSSv4 - [Common Vulnerability Scoring System v4](https://www.first.org/cvss/v4-0/)
     * * OWASP - [OWASP Risk Rating Methodology](https://owasp.org/www-community/OWASP_Risk_Rating_Methodology)
     * * SSVC - [Stakeholder Specific Vulnerability Categorization](https://github.com/CERTCC/SSVC) (all versions)
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("Specifies the severity or risk scoring methodology or standard used.\n\n* CVSSv2 - [Common Vulnerability Scoring System v2](https://www.first.org/cvss/v2/)\n* CVSSv3 - [Common Vulnerability Scoring System v3](https://www.first.org/cvss/v3-0/)\n* CVSSv31 - [Common Vulnerability Scoring System v3.1](https://www.first.org/cvss/v3-1/)\n* CVSSv4 - [Common Vulnerability Scoring System v4](https://www.first.org/cvss/v4-0/)\n* OWASP - [OWASP Risk Rating Methodology](https://owasp.org/www-community/OWASP_Risk_Rating_Methodology)\n* SSVC - [Stakeholder Specific Vulnerability Categorization](https://github.com/CERTCC/SSVC) (all versions)")
    private Rating.ScoreMethod method;
    /**
     * Vector
     * <p>
     * Textual representation of the metric values used to score the vulnerability
     * 
     */
    @JsonProperty("vector")
    @JsonPropertyDescription("Textual representation of the metric values used to score the vulnerability")
    private String vector;
    /**
     * Justification
     * <p>
     * An optional reason for rating the vulnerability as it was
     * 
     */
    @JsonProperty("justification")
    @JsonPropertyDescription("An optional reason for rating the vulnerability as it was")
    private String justification;

    /**
     * Source
     * <p>
     * The source of vulnerability information. This is often the organization that published the vulnerability.
     * 
     */
    @JsonProperty("source")
    public VulnerabilitySource getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of vulnerability information. This is often the organization that published the vulnerability.
     * 
     */
    @JsonProperty("source")
    public void setSource(VulnerabilitySource source) {
        this.source = source;
    }

    /**
     * Score
     * <p>
     * The numerical score of the rating.
     * 
     */
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    /**
     * Score
     * <p>
     * The numerical score of the rating.
     * 
     */
    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Severity
     * <p>
     * Textual representation of the severity of the vulnerability adopted by the analysis method. If the analysis method uses values other than what is provided, the user is expected to translate appropriately.
     * 
     */
    @JsonProperty("severity")
    public Rating.Severity getSeverity() {
        return severity;
    }

    /**
     * Severity
     * <p>
     * Textual representation of the severity of the vulnerability adopted by the analysis method. If the analysis method uses values other than what is provided, the user is expected to translate appropriately.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(Rating.Severity severity) {
        this.severity = severity;
    }

    /**
     * Method
     * <p>
     * Specifies the severity or risk scoring methodology or standard used.
     * 
     * * CVSSv2 - [Common Vulnerability Scoring System v2](https://www.first.org/cvss/v2/)
     * * CVSSv3 - [Common Vulnerability Scoring System v3](https://www.first.org/cvss/v3-0/)
     * * CVSSv31 - [Common Vulnerability Scoring System v3.1](https://www.first.org/cvss/v3-1/)
     * * CVSSv4 - [Common Vulnerability Scoring System v4](https://www.first.org/cvss/v4-0/)
     * * OWASP - [OWASP Risk Rating Methodology](https://owasp.org/www-community/OWASP_Risk_Rating_Methodology)
     * * SSVC - [Stakeholder Specific Vulnerability Categorization](https://github.com/CERTCC/SSVC) (all versions)
     * 
     */
    @JsonProperty("method")
    public Rating.ScoreMethod getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * Specifies the severity or risk scoring methodology or standard used.
     * 
     * * CVSSv2 - [Common Vulnerability Scoring System v2](https://www.first.org/cvss/v2/)
     * * CVSSv3 - [Common Vulnerability Scoring System v3](https://www.first.org/cvss/v3-0/)
     * * CVSSv31 - [Common Vulnerability Scoring System v3.1](https://www.first.org/cvss/v3-1/)
     * * CVSSv4 - [Common Vulnerability Scoring System v4](https://www.first.org/cvss/v4-0/)
     * * OWASP - [OWASP Risk Rating Methodology](https://owasp.org/www-community/OWASP_Risk_Rating_Methodology)
     * * SSVC - [Stakeholder Specific Vulnerability Categorization](https://github.com/CERTCC/SSVC) (all versions)
     * 
     */
    @JsonProperty("method")
    public void setMethod(Rating.ScoreMethod method) {
        this.method = method;
    }

    /**
     * Vector
     * <p>
     * Textual representation of the metric values used to score the vulnerability
     * 
     */
    @JsonProperty("vector")
    public String getVector() {
        return vector;
    }

    /**
     * Vector
     * <p>
     * Textual representation of the metric values used to score the vulnerability
     * 
     */
    @JsonProperty("vector")
    public void setVector(String vector) {
        this.vector = vector;
    }

    /**
     * Justification
     * <p>
     * An optional reason for rating the vulnerability as it was
     * 
     */
    @JsonProperty("justification")
    public String getJustification() {
        return justification;
    }

    /**
     * Justification
     * <p>
     * An optional reason for rating the vulnerability as it was
     * 
     */
    @JsonProperty("justification")
    public void setJustification(String justification) {
        this.justification = justification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rating.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("vector");
        sb.append('=');
        sb.append(((this.vector == null)?"<null>":this.vector));
        sb.append(',');
        sb.append("justification");
        sb.append('=');
        sb.append(((this.justification == null)?"<null>":this.justification));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.vector == null)? 0 :this.vector.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.justification == null)? 0 :this.justification.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rating) == false) {
            return false;
        }
        Rating rhs = ((Rating) other);
        return (((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.vector == rhs.vector)||((this.vector!= null)&&this.vector.equals(rhs.vector))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.justification == rhs.justification)||((this.justification!= null)&&this.justification.equals(rhs.justification))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))));
    }


    /**
     * Method
     * <p>
     * Specifies the severity or risk scoring methodology or standard used.
     * 
     * * CVSSv2 - [Common Vulnerability Scoring System v2](https://www.first.org/cvss/v2/)
     * * CVSSv3 - [Common Vulnerability Scoring System v3](https://www.first.org/cvss/v3-0/)
     * * CVSSv31 - [Common Vulnerability Scoring System v3.1](https://www.first.org/cvss/v3-1/)
     * * CVSSv4 - [Common Vulnerability Scoring System v4](https://www.first.org/cvss/v4-0/)
     * * OWASP - [OWASP Risk Rating Methodology](https://owasp.org/www-community/OWASP_Risk_Rating_Methodology)
     * * SSVC - [Stakeholder Specific Vulnerability Categorization](https://github.com/CERTCC/SSVC) (all versions)
     * 
     */
    public enum ScoreMethod {

        CVS_SV_2("CVSSv2"),
        CVS_SV_3("CVSSv3"),
        CVS_SV_31("CVSSv31"),
        CVS_SV_4("CVSSv4"),
        OWASP("OWASP"),
        SSVC("SSVC"),
        OTHER("other");
        private final String value;
        private final static Map<String, Rating.ScoreMethod> CONSTANTS = new HashMap<String, Rating.ScoreMethod>();

        static {
            for (Rating.ScoreMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ScoreMethod(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Rating.ScoreMethod fromValue(String value) {
            Rating.ScoreMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Severity
     * <p>
     * Textual representation of the severity of the vulnerability adopted by the analysis method. If the analysis method uses values other than what is provided, the user is expected to translate appropriately.
     * 
     */
    public enum Severity {

        CRITICAL("critical"),
        HIGH("high"),
        MEDIUM("medium"),
        LOW("low"),
        INFO("info"),
        NONE("none"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Rating.Severity> CONSTANTS = new HashMap<String, Rating.Severity>();

        static {
            for (Rating.Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Rating.Severity fromValue(String value) {
            Rating.Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
