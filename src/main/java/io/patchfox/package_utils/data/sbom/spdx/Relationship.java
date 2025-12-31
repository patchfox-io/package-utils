
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "spdxElementId",
    "comment",
    "relatedSpdxElement",
    "relationshipType"
})
@Generated("jsonschema2pojo")
public class Relationship {

    /**
     * Id to which the SPDX element is related
     * (Required)
     * 
     */
    @JsonProperty("spdxElementId")
    @JsonPropertyDescription("Id to which the SPDX element is related")
    private String spdxElementId;
    @JsonProperty("comment")
    private String comment;
    /**
     * SPDX ID for SpdxElement.  A related SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("relatedSpdxElement")
    @JsonPropertyDescription("SPDX ID for SpdxElement.  A related SpdxElement.")
    private String relatedSpdxElement;
    /**
     * Describes the type of relationship between two SPDX elements.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    @JsonPropertyDescription("Describes the type of relationship between two SPDX elements.")
    private Relationship.RelationshipType relationshipType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Relationship() {
    }

    /**
     * 
     * @param relationshipType
     * @param spdxElementId
     * @param relatedSpdxElement
     * @param comment
     */
    public Relationship(String spdxElementId, String comment, String relatedSpdxElement, Relationship.RelationshipType relationshipType) {
        super();
        this.spdxElementId = spdxElementId;
        this.comment = comment;
        this.relatedSpdxElement = relatedSpdxElement;
        this.relationshipType = relationshipType;
    }

    /**
     * Id to which the SPDX element is related
     * (Required)
     * 
     */
    @JsonProperty("spdxElementId")
    public String getSpdxElementId() {
        return spdxElementId;
    }

    /**
     * Id to which the SPDX element is related
     * (Required)
     * 
     */
    @JsonProperty("spdxElementId")
    public void setSpdxElementId(String spdxElementId) {
        this.spdxElementId = spdxElementId;
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
     * SPDX ID for SpdxElement.  A related SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("relatedSpdxElement")
    public String getRelatedSpdxElement() {
        return relatedSpdxElement;
    }

    /**
     * SPDX ID for SpdxElement.  A related SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("relatedSpdxElement")
    public void setRelatedSpdxElement(String relatedSpdxElement) {
        this.relatedSpdxElement = relatedSpdxElement;
    }

    /**
     * Describes the type of relationship between two SPDX elements.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public Relationship.RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Describes the type of relationship between two SPDX elements.
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public void setRelationshipType(Relationship.RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Relationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spdxElementId");
        sb.append('=');
        sb.append(((this.spdxElementId == null)?"<null>":this.spdxElementId));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("relatedSpdxElement");
        sb.append('=');
        sb.append(((this.relatedSpdxElement == null)?"<null>":this.relatedSpdxElement));
        sb.append(',');
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null)?"<null>":this.relationshipType));
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
        result = ((result* 31)+((this.relatedSpdxElement == null)? 0 :this.relatedSpdxElement.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.relationshipType == null)? 0 :this.relationshipType.hashCode()));
        result = ((result* 31)+((this.spdxElementId == null)? 0 :this.spdxElementId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Relationship) == false) {
            return false;
        }
        Relationship rhs = ((Relationship) other);
        return (((((this.relatedSpdxElement == rhs.relatedSpdxElement)||((this.relatedSpdxElement!= null)&&this.relatedSpdxElement.equals(rhs.relatedSpdxElement)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType))))&&((this.spdxElementId == rhs.spdxElementId)||((this.spdxElementId!= null)&&this.spdxElementId.equals(rhs.spdxElementId))));
    }


    /**
     * Describes the type of relationship between two SPDX elements.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RelationshipType {

        VARIANT_OF("VARIANT_OF"),
        COPY_OF("COPY_OF"),
        PATCH_FOR("PATCH_FOR"),
        TEST_DEPENDENCY_OF("TEST_DEPENDENCY_OF"),
        CONTAINED_BY("CONTAINED_BY"),
        DATA_FILE_OF("DATA_FILE_OF"),
        OPTIONAL_COMPONENT_OF("OPTIONAL_COMPONENT_OF"),
        ANCESTOR_OF("ANCESTOR_OF"),
        GENERATES("GENERATES"),
        CONTAINS("CONTAINS"),
        OPTIONAL_DEPENDENCY_OF("OPTIONAL_DEPENDENCY_OF"),
        FILE_ADDED("FILE_ADDED"),
        REQUIREMENT_DESCRIPTION_FOR("REQUIREMENT_DESCRIPTION_FOR"),
        DEV_DEPENDENCY_OF("DEV_DEPENDENCY_OF"),
        DEPENDENCY_OF("DEPENDENCY_OF"),
        BUILD_DEPENDENCY_OF("BUILD_DEPENDENCY_OF"),
        DESCRIBES("DESCRIBES"),
        PREREQUISITE_FOR("PREREQUISITE_FOR"),
        HAS_PREREQUISITE("HAS_PREREQUISITE"),
        PROVIDED_DEPENDENCY_OF("PROVIDED_DEPENDENCY_OF"),
        DYNAMIC_LINK("DYNAMIC_LINK"),
        DESCRIBED_BY("DESCRIBED_BY"),
        METAFILE_OF("METAFILE_OF"),
        DEPENDENCY_MANIFEST_OF("DEPENDENCY_MANIFEST_OF"),
        PATCH_APPLIED("PATCH_APPLIED"),
        RUNTIME_DEPENDENCY_OF("RUNTIME_DEPENDENCY_OF"),
        TEST_OF("TEST_OF"),
        TEST_TOOL_OF("TEST_TOOL_OF"),
        DEPENDS_ON("DEPENDS_ON"),
        SPECIFICATION_FOR("SPECIFICATION_FOR"),
        FILE_MODIFIED("FILE_MODIFIED"),
        DISTRIBUTION_ARTIFACT("DISTRIBUTION_ARTIFACT"),
        AMENDS("AMENDS"),
        DOCUMENTATION_OF("DOCUMENTATION_OF"),
        GENERATED_FROM("GENERATED_FROM"),
        STATIC_LINK("STATIC_LINK"),
        OTHER("OTHER"),
        BUILD_TOOL_OF("BUILD_TOOL_OF"),
        TEST_CASE_OF("TEST_CASE_OF"),
        PACKAGE_OF("PACKAGE_OF"),
        DESCENDANT_OF("DESCENDANT_OF"),
        FILE_DELETED("FILE_DELETED"),
        EXPANDED_FROM_ARCHIVE("EXPANDED_FROM_ARCHIVE"),
        DEV_TOOL_OF("DEV_TOOL_OF"),
        EXAMPLE_OF("EXAMPLE_OF");
        private final String value;
        private final static Map<String, Relationship.RelationshipType> CONSTANTS = new HashMap<String, Relationship.RelationshipType>();

        static {
            for (Relationship.RelationshipType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RelationshipType(String value) {
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
        public static Relationship.RelationshipType fromValue(String value) {
            Relationship.RelationshipType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
