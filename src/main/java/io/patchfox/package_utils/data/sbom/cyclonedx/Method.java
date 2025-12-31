package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "technique",
    "confidence",
    "value"
})
public class Method {

    /**
     * Technique
     * <p>
     * The technique used in this method of analysis.
     * (Required)
     * 
     */
    @JsonProperty("technique")
    @JsonPropertyDescription("The technique used in this method of analysis.")
    private Method.Technique technique;
    /**
     * Confidence
     * <p>
     * The confidence of the evidence from 0 - 1, where 1 is 100% confidence. Confidence is specific to the technique used. Each technique of analysis can have independent confidence.
     * (Required)
     * 
     */
    @JsonProperty("confidence")
    @JsonPropertyDescription("The confidence of the evidence from 0 - 1, where 1 is 100% confidence. Confidence is specific to the technique used. Each technique of analysis can have independent confidence.")
    private Double confidence;
    /**
     * Value
     * <p>
     * The value or contents of the evidence.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value or contents of the evidence.")
    private String value;

    /**
     * Technique
     * <p>
     * The technique used in this method of analysis.
     * (Required)
     * 
     */
    @JsonProperty("technique")
    public Method.Technique getTechnique() {
        return technique;
    }

    /**
     * Technique
     * <p>
     * The technique used in this method of analysis.
     * (Required)
     * 
     */
    @JsonProperty("technique")
    public void setTechnique(Method.Technique technique) {
        this.technique = technique;
    }

    /**
     * Confidence
     * <p>
     * The confidence of the evidence from 0 - 1, where 1 is 100% confidence. Confidence is specific to the technique used. Each technique of analysis can have independent confidence.
     * (Required)
     * 
     */
    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    /**
     * Confidence
     * <p>
     * The confidence of the evidence from 0 - 1, where 1 is 100% confidence. Confidence is specific to the technique used. Each technique of analysis can have independent confidence.
     * (Required)
     * 
     */
    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * Value
     * <p>
     * The value or contents of the evidence.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The value or contents of the evidence.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Method.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("technique");
        sb.append('=');
        sb.append(((this.technique == null)?"<null>":this.technique));
        sb.append(',');
        sb.append("confidence");
        sb.append('=');
        sb.append(((this.confidence == null)?"<null>":this.confidence));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.technique == null)? 0 :this.technique.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.confidence == null)? 0 :this.confidence.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Method) == false) {
            return false;
        }
        Method rhs = ((Method) other);
        return ((((this.technique == rhs.technique)||((this.technique!= null)&&this.technique.equals(rhs.technique)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.confidence == rhs.confidence)||((this.confidence!= null)&&this.confidence.equals(rhs.confidence))));
    }


    /**
     * Technique
     * <p>
     * The technique used in this method of analysis.
     * 
     */
    public enum Technique {

        SOURCE_CODE_ANALYSIS("source-code-analysis"),
        BINARY_ANALYSIS("binary-analysis"),
        MANIFEST_ANALYSIS("manifest-analysis"),
        AST_FINGERPRINT("ast-fingerprint"),
        HASH_COMPARISON("hash-comparison"),
        INSTRUMENTATION("instrumentation"),
        DYNAMIC_ANALYSIS("dynamic-analysis"),
        FILENAME("filename"),
        ATTESTATION("attestation"),
        OTHER("other");
        private final String value;
        private final static Map<String, Method.Technique> CONSTANTS = new HashMap<String, Method.Technique>();

        static {
            for (Method.Technique c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Technique(String value) {
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
        public static Method.Technique fromValue(String value) {
            Method.Technique constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
