package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Input and Output Parameters
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "format"
})
public class InputOutputMLParameters {

    /**
     * The data format for input/output to the model. Example formats include string, image, time-series
     * 
     */
    @JsonProperty("format")
    @JsonPropertyDescription("The data format for input/output to the model. Example formats include string, image, time-series")
    private String format;

    /**
     * The data format for input/output to the model. Example formats include string, image, time-series
     * 
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * The data format for input/output to the model. Example formats include string, image, time-series
     * 
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InputOutputMLParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
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
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InputOutputMLParameters) == false) {
            return false;
        }
        InputOutputMLParameters rhs = ((InputOutputMLParameters) other);
        return ((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format)));
    }

}
