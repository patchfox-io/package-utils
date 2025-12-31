package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Executes specific commands or tools in order to accomplish its owning task as part of a sequence.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "commands",
    "properties"
})
public class Step {

    /**
     * Name
     * <p>
     * A name for the step.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A name for the step.")
    private String name;
    /**
     * Description
     * <p>
     * A description of the step.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the step.")
    private String description;
    /**
     * Commands
     * <p>
     * Ordered list of commands or directives for the step
     * 
     */
    @JsonProperty("commands")
    @JsonPropertyDescription("Ordered list of commands or directives for the step")
    private List<Command> commands = new ArrayList<Command>();
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Name
     * <p>
     * A name for the step.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * A name for the step.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description
     * <p>
     * A description of the step.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the step.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Commands
     * <p>
     * Ordered list of commands or directives for the step
     * 
     */
    @JsonProperty("commands")
    public List<Command> getCommands() {
        return commands;
    }

    /**
     * Commands
     * <p>
     * Ordered list of commands or directives for the step
     * 
     */
    @JsonProperty("commands")
    public void setCommands(List<Command> commands) {
        this.commands = commands;
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
        sb.append(Step.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("commands");
        sb.append('=');
        sb.append(((this.commands == null)?"<null>":this.commands));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.commands == null)? 0 :this.commands.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Step) == false) {
            return false;
        }
        Step rhs = ((Step) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.commands == rhs.commands)||((this.commands!= null)&&this.commands.equals(rhs.commands))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
