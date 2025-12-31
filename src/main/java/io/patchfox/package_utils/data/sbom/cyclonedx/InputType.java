package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Input type
 * <p>
 * Type that represents various input data types and formats.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "target",
    "resource",
    "parameters",
    "environmentVars",
    "data",
    "properties"
})
public class InputType {

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
     * Parameters
     * <p>
     * Inputs that have the form of parameters with names and values.
     * 
     */
    @JsonProperty("parameters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Inputs that have the form of parameters with names and values.")
    private Set<Parameter> parameters = new LinkedHashSet<Parameter>();
    /**
     * Environment variables
     * <p>
     * Inputs that have the form of parameters with names and values.
     * 
     */
    @JsonProperty("environmentVars")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Inputs that have the form of parameters with names and values.")
    private Set<Object> environmentVars = new LinkedHashSet<Object>();
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
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

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
     * Parameters
     * <p>
     * Inputs that have the form of parameters with names and values.
     * 
     */
    @JsonProperty("parameters")
    public Set<Parameter> getParameters() {
        return parameters;
    }

    /**
     * Parameters
     * <p>
     * Inputs that have the form of parameters with names and values.
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(Set<Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * Environment variables
     * <p>
     * Inputs that have the form of parameters with names and values.
     * 
     */
    @JsonProperty("environmentVars")
    public Set<Object> getEnvironmentVars() {
        return environmentVars;
    }

    /**
     * Environment variables
     * <p>
     * Inputs that have the form of parameters with names and values.
     * 
     */
    @JsonProperty("environmentVars")
    public void setEnvironmentVars(Set<Object> environmentVars) {
        this.environmentVars = environmentVars;
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
        sb.append(InputType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("environmentVars");
        sb.append('=');
        sb.append(((this.environmentVars == null)?"<null>":this.environmentVars));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputType) == false) {
            return false;
        }
        InputType rhs = ((InputType) other);
        return ((((((((this.environmentVars == rhs.environmentVars)||((this.environmentVars!= null)&&this.environmentVars.equals(rhs.environmentVars)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }

}
