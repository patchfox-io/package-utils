package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "executed",
    "properties"
})
public class Command {

    /**
     * Executed
     * <p>
     * A text representation of the executed command.
     * 
     */
    @JsonProperty("executed")
    @JsonPropertyDescription("A text representation of the executed command.")
    private String executed;
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Executed
     * <p>
     * A text representation of the executed command.
     * 
     */
    @JsonProperty("executed")
    public String getExecuted() {
        return executed;
    }

    /**
     * Executed
     * <p>
     * A text representation of the executed command.
     * 
     */
    @JsonProperty("executed")
    public void setExecuted(String executed) {
        this.executed = executed;
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
        sb.append(Command.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("executed");
        sb.append('=');
        sb.append(((this.executed == null)?"<null>":this.executed));
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
        result = ((result* 31)+((this.executed == null)? 0 :this.executed.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Command) == false) {
            return false;
        }
        Command rhs = ((Command) other);
        return (((this.executed == rhs.executed)||((this.executed!= null)&&this.executed.equals(rhs.executed)))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
