
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
 * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment",
    "referenceCategory",
    "referenceLocator",
    "referenceType"
})
@Generated("jsonschema2pojo")
public class ExternalRef {

    @JsonProperty("comment")
    private String comment;
    /**
     * Category for the external reference
     * (Required)
     * 
     */
    @JsonProperty("referenceCategory")
    @JsonPropertyDescription("Category for the external reference")
    private ExternalRef.ReferenceCategory referenceCategory;
    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>.
     * (Required)
     * 
     */
    @JsonProperty("referenceLocator")
    @JsonPropertyDescription("The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>.")
    private String referenceLocator;
    /**
     * Type of the external reference. These are definined in an appendix in the SPDX specification.
     * (Required)
     * 
     */
    @JsonProperty("referenceType")
    @JsonPropertyDescription("Type of the external reference. These are definined in an appendix in the SPDX specification.")
    private String referenceType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalRef() {
    }

    /**
     * 
     * @param referenceLocator
     * @param referenceType
     * @param comment
     * @param referenceCategory
     */
    public ExternalRef(String comment, ExternalRef.ReferenceCategory referenceCategory, String referenceLocator, String referenceType) {
        super();
        this.comment = comment;
        this.referenceCategory = referenceCategory;
        this.referenceLocator = referenceLocator;
        this.referenceType = referenceType;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Category for the external reference
     * (Required)
     * 
     */
    @JsonProperty("referenceCategory")
    public ExternalRef.ReferenceCategory getReferenceCategory() {
        return referenceCategory;
    }

    /**
     * Category for the external reference
     * (Required)
     * 
     */
    @JsonProperty("referenceCategory")
    public void setReferenceCategory(ExternalRef.ReferenceCategory referenceCategory) {
        this.referenceCategory = referenceCategory;
    }

    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>.
     * (Required)
     * 
     */
    @JsonProperty("referenceLocator")
    public String getReferenceLocator() {
        return referenceLocator;
    }

    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location. The format of the locator is subject to constraints defined by the <type>.
     * (Required)
     * 
     */
    @JsonProperty("referenceLocator")
    public void setReferenceLocator(String referenceLocator) {
        this.referenceLocator = referenceLocator;
    }

    /**
     * Type of the external reference. These are definined in an appendix in the SPDX specification.
     * (Required)
     * 
     */
    @JsonProperty("referenceType")
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Type of the external reference. These are definined in an appendix in the SPDX specification.
     * (Required)
     * 
     */
    @JsonProperty("referenceType")
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalRef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("referenceCategory");
        sb.append('=');
        sb.append(((this.referenceCategory == null)?"<null>":this.referenceCategory));
        sb.append(',');
        sb.append("referenceLocator");
        sb.append('=');
        sb.append(((this.referenceLocator == null)?"<null>":this.referenceLocator));
        sb.append(',');
        sb.append("referenceType");
        sb.append('=');
        sb.append(((this.referenceType == null)?"<null>":this.referenceType));
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
        result = ((result* 31)+((this.referenceType == null)? 0 :this.referenceType.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.referenceCategory == null)? 0 :this.referenceCategory.hashCode()));
        result = ((result* 31)+((this.referenceLocator == null)? 0 :this.referenceLocator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalRef) == false) {
            return false;
        }
        ExternalRef rhs = ((ExternalRef) other);
        return (((((this.referenceType == rhs.referenceType)||((this.referenceType!= null)&&this.referenceType.equals(rhs.referenceType)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.referenceCategory == rhs.referenceCategory)||((this.referenceCategory!= null)&&this.referenceCategory.equals(rhs.referenceCategory))))&&((this.referenceLocator == rhs.referenceLocator)||((this.referenceLocator!= null)&&this.referenceLocator.equals(rhs.referenceLocator))));
    }


    /**
     * Category for the external reference
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ReferenceCategory {

        OTHER("OTHER"),
        PERSISTENT_ID("PERSISTENT-ID"),
        SECURITY("SECURITY"),
        PACKAGE_MANAGER("PACKAGE-MANAGER");
        private final String value;
        private final static Map<String, ExternalRef.ReferenceCategory> CONSTANTS = new HashMap<String, ExternalRef.ReferenceCategory>();

        static {
            for (ExternalRef.ReferenceCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ReferenceCategory(String value) {
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
        public static ExternalRef.ReferenceCategory fromValue(String value) {
            ExternalRef.ReferenceCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
