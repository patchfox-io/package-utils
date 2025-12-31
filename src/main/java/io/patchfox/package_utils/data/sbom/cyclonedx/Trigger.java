package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.Date;
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
 * Trigger
 * <p>
 * Represents a resource that can conditionally activate (or fire) tasks based upon associated events and their data.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "uid",
    "name",
    "description",
    "resourceReferences",
    "type",
    "event",
    "conditions",
    "timeActivated",
    "inputs",
    "outputs",
    "properties"
})
public class Trigger {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * (Required)
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the resource instance within its deployment context.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("The unique identifier for the resource instance within its deployment context.")
    private String uid;
    /**
     * Name
     * <p>
     * The name of the resource instance.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the resource instance.")
    private String name;
    /**
     * Description
     * <p>
     * A description of the resource instance.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the resource instance.")
    private String description;
    /**
     * Resource references
     * <p>
     * References to component or service resources that are used to realize the resource instance.
     * 
     */
    @JsonProperty("resourceReferences")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("References to component or service resources that are used to realize the resource instance.")
    private Set<ResourceReferenceChoice> resourceReferences = new LinkedHashSet<ResourceReferenceChoice>();
    /**
     * Type
     * <p>
     * The source type of event which caused the trigger to fire.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The source type of event which caused the trigger to fire.")
    private Trigger.Type type;
    /**
     * Event
     * <p>
     * Represents something that happened that may trigger a response.
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("Represents something that happened that may trigger a response.")
    private Event event;
    @JsonProperty("conditions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<Condition> conditions = new LinkedHashSet<Condition>();
    /**
     * Time activated
     * <p>
     * The date and time (timestamp) when the trigger was activated.
     * 
     */
    @JsonProperty("timeActivated")
    @JsonPropertyDescription("The date and time (timestamp) when the trigger was activated.")
    private Date timeActivated;
    /**
     * Inputs
     * <p>
     * Represents resources and data brought into a task at runtime by executor or task commands
     * 
     */
    @JsonProperty("inputs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Represents resources and data brought into a task at runtime by executor or task commands")
    private Set<InputType> inputs = new LinkedHashSet<InputType>();
    /**
     * Outputs
     * <p>
     * Represents resources and data output from a task at runtime by executor or task commands
     * 
     */
    @JsonProperty("outputs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Represents resources and data output from a task at runtime by executor or task commands")
    private Set<OutputType> outputs = new LinkedHashSet<OutputType>();
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * (Required)
     * 
     */
    @JsonProperty("bom-ref")
    public String getBomRef() {
        return bomRef;
    }

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * (Required)
     * 
     */
    @JsonProperty("bom-ref")
    public void setBomRef(String bomRef) {
        this.bomRef = bomRef;
    }

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the resource instance within its deployment context.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the resource instance within its deployment context.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Name
     * <p>
     * The name of the resource instance.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the resource instance.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description
     * <p>
     * A description of the resource instance.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the resource instance.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Resource references
     * <p>
     * References to component or service resources that are used to realize the resource instance.
     * 
     */
    @JsonProperty("resourceReferences")
    public Set<ResourceReferenceChoice> getResourceReferences() {
        return resourceReferences;
    }

    /**
     * Resource references
     * <p>
     * References to component or service resources that are used to realize the resource instance.
     * 
     */
    @JsonProperty("resourceReferences")
    public void setResourceReferences(Set<ResourceReferenceChoice> resourceReferences) {
        this.resourceReferences = resourceReferences;
    }

    /**
     * Type
     * <p>
     * The source type of event which caused the trigger to fire.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Trigger.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The source type of event which caused the trigger to fire.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Trigger.Type type) {
        this.type = type;
    }

    /**
     * Event
     * <p>
     * Represents something that happened that may trigger a response.
     * 
     */
    @JsonProperty("event")
    public Event getEvent() {
        return event;
    }

    /**
     * Event
     * <p>
     * Represents something that happened that may trigger a response.
     * 
     */
    @JsonProperty("event")
    public void setEvent(Event event) {
        this.event = event;
    }

    @JsonProperty("conditions")
    public Set<Condition> getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Set<Condition> conditions) {
        this.conditions = conditions;
    }

    /**
     * Time activated
     * <p>
     * The date and time (timestamp) when the trigger was activated.
     * 
     */
    @JsonProperty("timeActivated")
    public Date getTimeActivated() {
        return timeActivated;
    }

    /**
     * Time activated
     * <p>
     * The date and time (timestamp) when the trigger was activated.
     * 
     */
    @JsonProperty("timeActivated")
    public void setTimeActivated(Date timeActivated) {
        this.timeActivated = timeActivated;
    }

    /**
     * Inputs
     * <p>
     * Represents resources and data brought into a task at runtime by executor or task commands
     * 
     */
    @JsonProperty("inputs")
    public Set<InputType> getInputs() {
        return inputs;
    }

    /**
     * Inputs
     * <p>
     * Represents resources and data brought into a task at runtime by executor or task commands
     * 
     */
    @JsonProperty("inputs")
    public void setInputs(Set<InputType> inputs) {
        this.inputs = inputs;
    }

    /**
     * Outputs
     * <p>
     * Represents resources and data output from a task at runtime by executor or task commands
     * 
     */
    @JsonProperty("outputs")
    public Set<OutputType> getOutputs() {
        return outputs;
    }

    /**
     * Outputs
     * <p>
     * Represents resources and data output from a task at runtime by executor or task commands
     * 
     */
    @JsonProperty("outputs")
    public void setOutputs(Set<OutputType> outputs) {
        this.outputs = outputs;
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
        sb.append(Trigger.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("resourceReferences");
        sb.append('=');
        sb.append(((this.resourceReferences == null)?"<null>":this.resourceReferences));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("timeActivated");
        sb.append('=');
        sb.append(((this.timeActivated == null)?"<null>":this.timeActivated));
        sb.append(',');
        sb.append("inputs");
        sb.append('=');
        sb.append(((this.inputs == null)?"<null>":this.inputs));
        sb.append(',');
        sb.append("outputs");
        sb.append('=');
        sb.append(((this.outputs == null)?"<null>":this.outputs));
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
        result = ((result* 31)+((this.outputs == null)? 0 :this.outputs.hashCode()));
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.resourceReferences == null)? 0 :this.resourceReferences.hashCode()));
        result = ((result* 31)+((this.timeActivated == null)? 0 :this.timeActivated.hashCode()));
        result = ((result* 31)+((this.inputs == null)? 0 :this.inputs.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trigger) == false) {
            return false;
        }
        Trigger rhs = ((Trigger) other);
        return (((((((((((((this.outputs == rhs.outputs)||((this.outputs!= null)&&this.outputs.equals(rhs.outputs)))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.resourceReferences == rhs.resourceReferences)||((this.resourceReferences!= null)&&this.resourceReferences.equals(rhs.resourceReferences))))&&((this.timeActivated == rhs.timeActivated)||((this.timeActivated!= null)&&this.timeActivated.equals(rhs.timeActivated))))&&((this.inputs == rhs.inputs)||((this.inputs!= null)&&this.inputs.equals(rhs.inputs))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }


    /**
     * Type
     * <p>
     * The source type of event which caused the trigger to fire.
     * 
     */
    public enum Type {

        MANUAL("manual"),
        API("api"),
        WEBHOOK("webhook"),
        SCHEDULED("scheduled");
        private final String value;
        private final static Map<String, Trigger.Type> CONSTANTS = new HashMap<String, Trigger.Type>();

        static {
            for (Trigger.Type c: values()) {
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
        public static Trigger.Type fromValue(String value) {
            Trigger.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
