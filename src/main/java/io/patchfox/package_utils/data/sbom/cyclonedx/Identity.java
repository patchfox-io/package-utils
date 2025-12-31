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


/**
 * Evidence that substantiates the identity of a component.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "confidence",
    "methods",
    "tools"
})
public class Identity {

    /**
     * Field
     * <p>
     * The identity field of the component which the evidence describes.
     * (Required)
     * 
     */
    @JsonProperty("field")
    @JsonPropertyDescription("The identity field of the component which the evidence describes.")
    private Identity.Field field;
    /**
     * Confidence
     * <p>
     * The overall confidence of the evidence from 0 - 1, where 1 is 100% confidence.
     * 
     */
    @JsonProperty("confidence")
    @JsonPropertyDescription("The overall confidence of the evidence from 0 - 1, where 1 is 100% confidence.")
    private Double confidence;
    /**
     * Methods
     * <p>
     * The methods used to extract and/or analyze the evidence.
     * 
     */
    @JsonProperty("methods")
    @JsonPropertyDescription("The methods used to extract and/or analyze the evidence.")
    private List<Method> methods = new ArrayList<Method>();
    /**
     * BOM References
     * <p>
     * The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs. Tools used for analysis should already be defined in the BOM, either in the metadata/tools, components, or formulation.
     * 
     */
    @JsonProperty("tools")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs. Tools used for analysis should already be defined in the BOM, either in the metadata/tools, components, or formulation.")
    private Set<Object> tools = new LinkedHashSet<Object>();

    /**
     * Field
     * <p>
     * The identity field of the component which the evidence describes.
     * (Required)
     * 
     */
    @JsonProperty("field")
    public Identity.Field getField() {
        return field;
    }

    /**
     * Field
     * <p>
     * The identity field of the component which the evidence describes.
     * (Required)
     * 
     */
    @JsonProperty("field")
    public void setField(Identity.Field field) {
        this.field = field;
    }

    /**
     * Confidence
     * <p>
     * The overall confidence of the evidence from 0 - 1, where 1 is 100% confidence.
     * 
     */
    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    /**
     * Confidence
     * <p>
     * The overall confidence of the evidence from 0 - 1, where 1 is 100% confidence.
     * 
     */
    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * Methods
     * <p>
     * The methods used to extract and/or analyze the evidence.
     * 
     */
    @JsonProperty("methods")
    public List<Method> getMethods() {
        return methods;
    }

    /**
     * Methods
     * <p>
     * The methods used to extract and/or analyze the evidence.
     * 
     */
    @JsonProperty("methods")
    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    /**
     * BOM References
     * <p>
     * The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs. Tools used for analysis should already be defined in the BOM, either in the metadata/tools, components, or formulation.
     * 
     */
    @JsonProperty("tools")
    public Set<Object> getTools() {
        return tools;
    }

    /**
     * BOM References
     * <p>
     * The object in the BOM identified by its bom-ref. This is often a component or service, but may be any object type supporting bom-refs. Tools used for analysis should already be defined in the BOM, either in the metadata/tools, components, or formulation.
     * 
     */
    @JsonProperty("tools")
    public void setTools(Set<Object> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Identity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("confidence");
        sb.append('=');
        sb.append(((this.confidence == null)?"<null>":this.confidence));
        sb.append(',');
        sb.append("methods");
        sb.append('=');
        sb.append(((this.methods == null)?"<null>":this.methods));
        sb.append(',');
        sb.append("tools");
        sb.append('=');
        sb.append(((this.tools == null)?"<null>":this.tools));
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
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.tools == null)? 0 :this.tools.hashCode()));
        result = ((result* 31)+((this.methods == null)? 0 :this.methods.hashCode()));
        result = ((result* 31)+((this.confidence == null)? 0 :this.confidence.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identity) == false) {
            return false;
        }
        Identity rhs = ((Identity) other);
        return (((((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field)))&&((this.tools == rhs.tools)||((this.tools!= null)&&this.tools.equals(rhs.tools))))&&((this.methods == rhs.methods)||((this.methods!= null)&&this.methods.equals(rhs.methods))))&&((this.confidence == rhs.confidence)||((this.confidence!= null)&&this.confidence.equals(rhs.confidence))));
    }


    /**
     * Field
     * <p>
     * The identity field of the component which the evidence describes.
     * 
     */
    public enum Field {

        GROUP("group"),
        NAME("name"),
        VERSION("version"),
        PURL("purl"),
        CPE("cpe"),
        SWID("swid"),
        HASH("hash");
        private final String value;
        private final static Map<String, Identity.Field> CONSTANTS = new HashMap<String, Identity.Field>();

        static {
            for (Identity.Field c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Field(String value) {
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
        public static Identity.Field fromValue(String value) {
            Identity.Field constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
