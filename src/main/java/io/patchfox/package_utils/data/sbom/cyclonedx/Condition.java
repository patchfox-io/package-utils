package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Condition
 * <p>
 * A condition that was used to determine a trigger should be activated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "expression",
    "properties"
})
public class Condition {

    /**
     * Description
     * <p>
     * Describes the set of conditions which cause the trigger to activate.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Describes the set of conditions which cause the trigger to activate.")
    private String description;
    /**
     * Expression
     * <p>
     * The logical expression that was evaluated that determined the trigger should be fired.
     * 
     */
    @JsonProperty("expression")
    @JsonPropertyDescription("The logical expression that was evaluated that determined the trigger should be fired.")
    private String expression;
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Description
     * <p>
     * Describes the set of conditions which cause the trigger to activate.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Describes the set of conditions which cause the trigger to activate.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Expression
     * <p>
     * The logical expression that was evaluated that determined the trigger should be fired.
     * 
     */
    @JsonProperty("expression")
    public String getExpression() {
        return expression;
    }

    /**
     * Expression
     * <p>
     * The logical expression that was evaluated that determined the trigger should be fired.
     * 
     */
    @JsonProperty("expression")
    public void setExpression(String expression) {
        this.expression = expression;
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
        sb.append(Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null)?"<null>":this.expression));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return ((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))));
    }

}
