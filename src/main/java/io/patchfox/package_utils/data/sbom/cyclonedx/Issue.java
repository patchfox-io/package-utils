package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Diff
 * <p>
 * An individual issue that has been resolved.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "name",
    "description",
    "source",
    "references"
})
public class Issue {

    /**
     * Type
     * <p>
     * Specifies the type of issue
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Specifies the type of issue")
    private Issue.Type type;
    /**
     * ID
     * <p>
     * The identifier of the issue assigned by the source of the issue
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The identifier of the issue assigned by the source of the issue")
    private String id;
    /**
     * Name
     * <p>
     * The name of the issue
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the issue")
    private String name;
    /**
     * Description
     * <p>
     * A description of the issue
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the issue")
    private String description;
    /**
     * Source
     * <p>
     * The source of the issue where it is documented
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the issue where it is documented")
    private Source source;
    /**
     * References
     * <p>
     * A collection of URL's for reference. Multiple URLs are allowed.
     * 
     */
    @JsonProperty("references")
    @JsonPropertyDescription("A collection of URL's for reference. Multiple URLs are allowed.")
    private List<String> references = new ArrayList<String>();

    /**
     * Type
     * <p>
     * Specifies the type of issue
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Issue.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Specifies the type of issue
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Issue.Type type) {
        this.type = type;
    }

    /**
     * ID
     * <p>
     * The identifier of the issue assigned by the source of the issue
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The identifier of the issue assigned by the source of the issue
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Name
     * <p>
     * The name of the issue
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the issue
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description
     * <p>
     * A description of the issue
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the issue
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Source
     * <p>
     * The source of the issue where it is documented
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the issue where it is documented
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * References
     * <p>
     * A collection of URL's for reference. Multiple URLs are allowed.
     * 
     */
    @JsonProperty("references")
    public List<String> getReferences() {
        return references;
    }

    /**
     * References
     * <p>
     * A collection of URL's for reference. Multiple URLs are allowed.
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<String> references) {
        this.references = references;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Issue) == false) {
            return false;
        }
        Issue rhs = ((Issue) other);
        return (((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))));
    }


    /**
     * Type
     * <p>
     * Specifies the type of issue
     * 
     */
    public enum Type {

        DEFECT("defect"),
        ENHANCEMENT("enhancement"),
        SECURITY("security");
        private final String value;
        private final static Map<String, Issue.Type> CONSTANTS = new HashMap<String, Issue.Type>();

        static {
            for (Issue.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Issue.Type fromValue(String value) {
            Issue.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
