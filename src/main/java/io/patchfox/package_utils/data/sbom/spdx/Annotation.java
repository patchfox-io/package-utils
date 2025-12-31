
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * An Annotation is a comment on an SpdxItem by an agent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annotationDate",
    "annotationType",
    "annotator",
    "comment"
})
@Generated("jsonschema2pojo")
public class Annotation {

    /**
     * Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.
     * (Required)
     * 
     */
    @JsonProperty("annotationDate")
    @JsonPropertyDescription("Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.")
    private String annotationDate;
    /**
     * Type of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("annotationType")
    @JsonPropertyDescription("Type of the annotation.")
    private Annotation.AnnotationType annotationType;
    /**
     * This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document.
     * (Required)
     * 
     */
    @JsonProperty("annotator")
    @JsonPropertyDescription("This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document.")
    private String annotator;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comment")
    private String comment;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Annotation() {
    }

    /**
     * 
     * @param annotationDate
     * @param annotationType
     * @param comment
     * @param annotator
     */
    public Annotation(String annotationDate, Annotation.AnnotationType annotationType, String annotator, String comment) {
        super();
        this.annotationDate = annotationDate;
        this.annotationType = annotationType;
        this.annotator = annotator;
        this.comment = comment;
    }

    /**
     * Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.
     * (Required)
     * 
     */
    @JsonProperty("annotationDate")
    public String getAnnotationDate() {
        return annotationDate;
    }

    /**
     * Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.
     * (Required)
     * 
     */
    @JsonProperty("annotationDate")
    public void setAnnotationDate(String annotationDate) {
        this.annotationDate = annotationDate;
    }

    /**
     * Type of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("annotationType")
    public Annotation.AnnotationType getAnnotationType() {
        return annotationType;
    }

    /**
     * Type of the annotation.
     * (Required)
     * 
     */
    @JsonProperty("annotationType")
    public void setAnnotationType(Annotation.AnnotationType annotationType) {
        this.annotationType = annotationType;
    }

    /**
     * This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document.
     * (Required)
     * 
     */
    @JsonProperty("annotator")
    public String getAnnotator() {
        return annotator;
    }

    /**
     * This field identifies the person, organization, or tool that has commented on a file, package, snippet, or the entire document.
     * (Required)
     * 
     */
    @JsonProperty("annotator")
    public void setAnnotator(String annotator) {
        this.annotator = annotator;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Annotation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annotationDate");
        sb.append('=');
        sb.append(((this.annotationDate == null)?"<null>":this.annotationDate));
        sb.append(',');
        sb.append("annotationType");
        sb.append('=');
        sb.append(((this.annotationType == null)?"<null>":this.annotationType));
        sb.append(',');
        sb.append("annotator");
        sb.append('=');
        sb.append(((this.annotator == null)?"<null>":this.annotator));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.annotationType == null)? 0 :this.annotationType.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.annotator == null)? 0 :this.annotator.hashCode()));
        result = ((result* 31)+((this.annotationDate == null)? 0 :this.annotationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Annotation) == false) {
            return false;
        }
        Annotation rhs = ((Annotation) other);
        return (((((this.annotationType == rhs.annotationType)||((this.annotationType!= null)&&this.annotationType.equals(rhs.annotationType)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.annotator == rhs.annotator)||((this.annotator!= null)&&this.annotator.equals(rhs.annotator))))&&((this.annotationDate == rhs.annotationDate)||((this.annotationDate!= null)&&this.annotationDate.equals(rhs.annotationDate))));
    }


    /**
     * Type of the annotation.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AnnotationType {

        OTHER("OTHER"),
        REVIEW("REVIEW");
        private final String value;
        private final static Map<String, Annotation.AnnotationType> CONSTANTS = new HashMap<String, Annotation.AnnotationType>();

        static {
            for (Annotation.AnnotationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AnnotationType(String value) {
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
        public static Annotation.AnnotationType fromValue(String value) {
            Annotation.AnnotationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
