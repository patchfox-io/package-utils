package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Task
 * <p>
 * Describes the inputs, sequence of steps and resources used to accomplish a task and its output.Tasks are building blocks for constructing assemble CI/CD workflows or pipelines.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "uid",
    "name",
    "description",
    "resourceReferences",
    "taskTypes",
    "trigger",
    "steps",
    "inputs",
    "outputs",
    "timeStart",
    "timeEnd",
    "workspaces",
    "runtimeTopology",
    "properties"
})
public class Task {

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
     * Task types
     * <p>
     * Indicates the types of activities performed by the set of workflow tasks.Currently, these types reflect common CI/CD actions.
     * (Required)
     * 
     */
    @JsonProperty("taskTypes")
    @JsonPropertyDescription("Indicates the types of activities performed by the set of workflow tasks.")
    private List<TaskType> taskTypes = new ArrayList<TaskType>();
    /**
     * Trigger
     * <p>
     * Represents a resource that can conditionally activate (or fire) tasks based upon associated events and their data.
     * 
     */
    @JsonProperty("trigger")
    @JsonPropertyDescription("Represents a resource that can conditionally activate (or fire) tasks based upon associated events and their data.")
    private Trigger trigger;
    /**
     * Steps
     * <p>
     * The sequence of steps for the task.
     * 
     */
    @JsonProperty("steps")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The sequence of steps for the task.")
    private Set<Step> steps = new LinkedHashSet<Step>();
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
     * Time start
     * <p>
     * The date and time (timestamp) when the task started.
     * 
     */
    @JsonProperty("timeStart")
    @JsonPropertyDescription("The date and time (timestamp) when the task started.")
    private Date timeStart;
    /**
     * Time end
     * <p>
     * The date and time (timestamp) when the task ended.
     * 
     */
    @JsonProperty("timeEnd")
    @JsonPropertyDescription("The date and time (timestamp) when the task ended.")
    private Date timeEnd;
    /**
     * Workspaces
     * <p>
     * A set of named filesystem or data resource shareable by workflow tasks.
     * 
     */
    @JsonProperty("workspaces")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A set of named filesystem or data resource shareable by workflow tasks.")
    private Set<Workspace> workspaces = new LinkedHashSet<Workspace>();
    /**
     * Runtime topology
     * <p>
     * A graph of the component runtime topology for task's instance.A description of the runtime component and service topology.  This can describe a partial or complete topology used to host and execute the task (e.g., hardware, operating systems, configurations, etc.),
     * 
     */
    @JsonProperty("runtimeTopology")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A graph of the component runtime topology for task's instance.")
    private Set<Dependency> runtimeTopology = new LinkedHashSet<Dependency>();
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
     * Task types
     * <p>
     * Indicates the types of activities performed by the set of workflow tasks.Currently, these types reflect common CI/CD actions.
     * (Required)
     * 
     */
    @JsonProperty("taskTypes")
    public List<TaskType> getTaskTypes() {
        return taskTypes;
    }

    /**
     * Task types
     * <p>
     * Indicates the types of activities performed by the set of workflow tasks.Currently, these types reflect common CI/CD actions.
     * (Required)
     * 
     */
    @JsonProperty("taskTypes")
    public void setTaskTypes(List<TaskType> taskTypes) {
        this.taskTypes = taskTypes;
    }

    /**
     * Trigger
     * <p>
     * Represents a resource that can conditionally activate (or fire) tasks based upon associated events and their data.
     * 
     */
    @JsonProperty("trigger")
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * Trigger
     * <p>
     * Represents a resource that can conditionally activate (or fire) tasks based upon associated events and their data.
     * 
     */
    @JsonProperty("trigger")
    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    /**
     * Steps
     * <p>
     * The sequence of steps for the task.
     * 
     */
    @JsonProperty("steps")
    public Set<Step> getSteps() {
        return steps;
    }

    /**
     * Steps
     * <p>
     * The sequence of steps for the task.
     * 
     */
    @JsonProperty("steps")
    public void setSteps(Set<Step> steps) {
        this.steps = steps;
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
     * Time start
     * <p>
     * The date and time (timestamp) when the task started.
     * 
     */
    @JsonProperty("timeStart")
    public Date getTimeStart() {
        return timeStart;
    }

    /**
     * Time start
     * <p>
     * The date and time (timestamp) when the task started.
     * 
     */
    @JsonProperty("timeStart")
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * Time end
     * <p>
     * The date and time (timestamp) when the task ended.
     * 
     */
    @JsonProperty("timeEnd")
    public Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Time end
     * <p>
     * The date and time (timestamp) when the task ended.
     * 
     */
    @JsonProperty("timeEnd")
    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * Workspaces
     * <p>
     * A set of named filesystem or data resource shareable by workflow tasks.
     * 
     */
    @JsonProperty("workspaces")
    public Set<Workspace> getWorkspaces() {
        return workspaces;
    }

    /**
     * Workspaces
     * <p>
     * A set of named filesystem or data resource shareable by workflow tasks.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(Set<Workspace> workspaces) {
        this.workspaces = workspaces;
    }

    /**
     * Runtime topology
     * <p>
     * A graph of the component runtime topology for task's instance.A description of the runtime component and service topology.  This can describe a partial or complete topology used to host and execute the task (e.g., hardware, operating systems, configurations, etc.),
     * 
     */
    @JsonProperty("runtimeTopology")
    public Set<Dependency> getRuntimeTopology() {
        return runtimeTopology;
    }

    /**
     * Runtime topology
     * <p>
     * A graph of the component runtime topology for task's instance.A description of the runtime component and service topology.  This can describe a partial or complete topology used to host and execute the task (e.g., hardware, operating systems, configurations, etc.),
     * 
     */
    @JsonProperty("runtimeTopology")
    public void setRuntimeTopology(Set<Dependency> runtimeTopology) {
        this.runtimeTopology = runtimeTopology;
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
        sb.append(Task.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("taskTypes");
        sb.append('=');
        sb.append(((this.taskTypes == null)?"<null>":this.taskTypes));
        sb.append(',');
        sb.append("trigger");
        sb.append('=');
        sb.append(((this.trigger == null)?"<null>":this.trigger));
        sb.append(',');
        sb.append("steps");
        sb.append('=');
        sb.append(((this.steps == null)?"<null>":this.steps));
        sb.append(',');
        sb.append("inputs");
        sb.append('=');
        sb.append(((this.inputs == null)?"<null>":this.inputs));
        sb.append(',');
        sb.append("outputs");
        sb.append('=');
        sb.append(((this.outputs == null)?"<null>":this.outputs));
        sb.append(',');
        sb.append("timeStart");
        sb.append('=');
        sb.append(((this.timeStart == null)?"<null>":this.timeStart));
        sb.append(',');
        sb.append("timeEnd");
        sb.append('=');
        sb.append(((this.timeEnd == null)?"<null>":this.timeEnd));
        sb.append(',');
        sb.append("workspaces");
        sb.append('=');
        sb.append(((this.workspaces == null)?"<null>":this.workspaces));
        sb.append(',');
        sb.append("runtimeTopology");
        sb.append('=');
        sb.append(((this.runtimeTopology == null)?"<null>":this.runtimeTopology));
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
        result = ((result* 31)+((this.timeEnd == null)? 0 :this.timeEnd.hashCode()));
        result = ((result* 31)+((this.inputs == null)? 0 :this.inputs.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.trigger == null)? 0 :this.trigger.hashCode()));
        result = ((result* 31)+((this.steps == null)? 0 :this.steps.hashCode()));
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.resourceReferences == null)? 0 :this.resourceReferences.hashCode()));
        result = ((result* 31)+((this.timeStart == null)? 0 :this.timeStart.hashCode()));
        result = ((result* 31)+((this.runtimeTopology == null)? 0 :this.runtimeTopology.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.taskTypes == null)? 0 :this.taskTypes.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Task) == false) {
            return false;
        }
        Task rhs = ((Task) other);
        return ((((((((((((((((this.outputs == rhs.outputs)||((this.outputs!= null)&&this.outputs.equals(rhs.outputs)))&&((this.timeEnd == rhs.timeEnd)||((this.timeEnd!= null)&&this.timeEnd.equals(rhs.timeEnd))))&&((this.inputs == rhs.inputs)||((this.inputs!= null)&&this.inputs.equals(rhs.inputs))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.trigger == rhs.trigger)||((this.trigger!= null)&&this.trigger.equals(rhs.trigger))))&&((this.steps == rhs.steps)||((this.steps!= null)&&this.steps.equals(rhs.steps))))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.resourceReferences == rhs.resourceReferences)||((this.resourceReferences!= null)&&this.resourceReferences.equals(rhs.resourceReferences))))&&((this.timeStart == rhs.timeStart)||((this.timeStart!= null)&&this.timeStart.equals(rhs.timeStart))))&&((this.runtimeTopology == rhs.runtimeTopology)||((this.runtimeTopology!= null)&&this.runtimeTopology.equals(rhs.runtimeTopology))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.taskTypes == rhs.taskTypes)||((this.taskTypes!= null)&&this.taskTypes.equals(rhs.taskTypes))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
