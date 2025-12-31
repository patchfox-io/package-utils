package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "source",
    "target",
    "resource",
    "data",
    "environmentVars",
    "properties"
})
public class OutputType {

    /**
     * Type
     * <p>
     * Describes the type of data output.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Describes the type of data output.")
    private OutputType.Type type;
    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.")
    private ResourceReferenceChoice source;
    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.")
    private ResourceReferenceChoice target;
    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.")
    private ResourceReferenceChoice resource;
    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Specifies the metadata and content for an attachment.")
    private Attachment data;
    /**
     * Environment variables
     * <p>
     * Outputs that have the form of environment variables.
     * 
     */
    @JsonProperty("environmentVars")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Outputs that have the form of environment variables.")
    private Set<Object> environmentVars = new LinkedHashSet<Object>();
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Type
     * <p>
     * Describes the type of data output.
     * 
     */
    @JsonProperty("type")
    public OutputType.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Describes the type of data output.
     * 
     */
    @JsonProperty("type")
    public void setType(OutputType.Type type) {
        this.type = type;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("source")
    public ResourceReferenceChoice getSource() {
        return source;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("source")
    public void setSource(ResourceReferenceChoice source) {
        this.source = source;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("target")
    public ResourceReferenceChoice getTarget() {
        return target;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("target")
    public void setTarget(ResourceReferenceChoice target) {
        this.target = target;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("resource")
    public ResourceReferenceChoice getResource() {
        return resource;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("resource")
    public void setResource(ResourceReferenceChoice resource) {
        this.resource = resource;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("data")
    public Attachment getData() {
        return data;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("data")
    public void setData(Attachment data) {
        this.data = data;
    }

    /**
     * Environment variables
     * <p>
     * Outputs that have the form of environment variables.
     * 
     */
    @JsonProperty("environmentVars")
    public Set<Object> getEnvironmentVars() {
        return environmentVars;
    }

    /**
     * Environment variables
     * <p>
     * Outputs that have the form of environment variables.
     * 
     */
    @JsonProperty("environmentVars")
    public void setEnvironmentVars(Set<Object> environmentVars) {
        this.environmentVars = environmentVars;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OutputType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("environmentVars");
        sb.append('=');
        sb.append(((this.environmentVars == null)?"<null>":this.environmentVars));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
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
        result = ((result* 31)+((this.environmentVars == null)? 0 :this.environmentVars.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OutputType) == false) {
            return false;
        }
        OutputType rhs = ((OutputType) other);
        return ((((((((this.environmentVars == rhs.environmentVars)||((this.environmentVars!= null)&&this.environmentVars.equals(rhs.environmentVars)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }


    /**
     * Type
     * <p>
     * Describes the type of data output.
     * 
     */
    public enum Type {

        ARTIFACT("artifact"),
        ATTESTATION("attestation"),
        LOG("log"),
        EVIDENCE("evidence"),
        METRICS("metrics"),
        OTHER("other");
        private final String value;
        private final static Map<String, OutputType.Type> CONSTANTS = new HashMap<String, OutputType.Type>();

        static {
            for (OutputType.Type c: values()) {
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
        public static OutputType.Type fromValue(String value) {
            OutputType.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
