package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Annotations
 * <p>
 * A comment, note, explanation, or similar textual content which provides additional context to the object(s) being annotated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "subjects",
    "annotator",
    "timestamp",
    "text",
    "signature"
})
public class Annotations {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * BOM References
     * <p>
     * The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs.
     * (Required)
     * 
     */
    @JsonProperty("subjects")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs.")
    private Set<Object> subjects = new LinkedHashSet<Object>();
    /**
     * Annotator
     * <p>
     * The organization, person, component, or service which created the textual content of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("annotator")
    @JsonPropertyDescription("The organization, person, component, or service which created the textual content of the annotation.")
    private Annotator annotator;
    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the annotation was created.
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("The date and time (timestamp) when the annotation was created.")
    private Date timestamp;
    /**
     * Text
     * <p>
     * The textual content of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("The textual content of the annotation.")
    private String text;
    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    private Signature signature;

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    public String getBomRef() {
        return bomRef;
    }

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    public void setBomRef(String bomRef) {
        this.bomRef = bomRef;
    }

    /**
     * BOM References
     * <p>
     * The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs.
     * (Required)
     * 
     */
    @JsonProperty("subjects")
    public Set<Object> getSubjects() {
        return subjects;
    }

    /**
     * BOM References
     * <p>
     * The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs.
     * (Required)
     * 
     */
    @JsonProperty("subjects")
    public void setSubjects(Set<Object> subjects) {
        this.subjects = subjects;
    }

    /**
     * Annotator
     * <p>
     * The organization, person, component, or service which created the textual content of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("annotator")
    public Annotator getAnnotator() {
        return annotator;
    }

    /**
     * Annotator
     * <p>
     * The organization, person, component, or service which created the textual content of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("annotator")
    public void setAnnotator(Annotator annotator) {
        this.annotator = annotator;
    }

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the annotation was created.
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the annotation was created.
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Text
     * <p>
     * The textual content of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Text
     * <p>
     * The textual content of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    public Signature getSignature() {
        return signature;
    }

    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Annotations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("subjects");
        sb.append('=');
        sb.append(((this.subjects == null)?"<null>":this.subjects));
        sb.append(',');
        sb.append("annotator");
        sb.append('=');
        sb.append(((this.annotator == null)?"<null>":this.annotator));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
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
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.annotator == null)? 0 :this.annotator.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.subjects == null)? 0 :this.subjects.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Annotations) == false) {
            return false;
        }
        Annotations rhs = ((Annotations) other);
        return (((((((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef)))&&((this.annotator == rhs.annotator)||((this.annotator!= null)&&this.annotator.equals(rhs.annotator))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.subjects == rhs.subjects)||((this.subjects!= null)&&this.subjects.equals(rhs.subjects))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
