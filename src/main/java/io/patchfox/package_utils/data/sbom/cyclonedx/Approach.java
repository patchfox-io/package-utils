package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Approach
 * <p>
 * The overall approach to learning used by the model for problem solving.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
public class Approach {

    /**
     * Learning Type
     * <p>
     * Learning types describing the learning problem or hybrid learning problem.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Learning types describing the learning problem or hybrid learning problem.")
    private Approach.Type type;

    /**
     * Learning Type
     * <p>
     * Learning types describing the learning problem or hybrid learning problem.
     * 
     */
    @JsonProperty("type")
    public Approach.Type getType() {
        return type;
    }

    /**
     * Learning Type
     * <p>
     * Learning types describing the learning problem or hybrid learning problem.
     * 
     */
    @JsonProperty("type")
    public void setType(Approach.Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Approach.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Approach) == false) {
            return false;
        }
        Approach rhs = ((Approach) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Learning Type
     * <p>
     * Learning types describing the learning problem or hybrid learning problem.
     * 
     */
    public enum Type {

        SUPERVISED("supervised"),
        UNSUPERVISED("unsupervised"),
        REINFORCEMENT_LEARNING("reinforcement-learning"),
        SEMI_SUPERVISED("semi-supervised"),
        SELF_SUPERVISED("self-supervised");
        private final String value;
        private final static Map<String, Approach.Type> CONSTANTS = new HashMap<String, Approach.Type>();

        static {
            for (Approach.Type c: values()) {
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
        public static Approach.Type fromValue(String value) {
            Approach.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
