
package io.patchfox.package_utils.data.sbom.spdx;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "endPointer",
    "startPointer"
})
@Generated("jsonschema2pojo")
public class Range {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endPointer")
    private EndPointer endPointer;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPointer")
    private StartPointer startPointer;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Range() {
    }

    /**
     * 
     * @param startPointer
     * @param endPointer
     */
    public Range(EndPointer endPointer, StartPointer startPointer) {
        super();
        this.endPointer = endPointer;
        this.startPointer = startPointer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endPointer")
    public EndPointer getEndPointer() {
        return endPointer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endPointer")
    public void setEndPointer(EndPointer endPointer) {
        this.endPointer = endPointer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPointer")
    public StartPointer getStartPointer() {
        return startPointer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startPointer")
    public void setStartPointer(StartPointer startPointer) {
        this.startPointer = startPointer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Range.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endPointer");
        sb.append('=');
        sb.append(((this.endPointer == null)?"<null>":this.endPointer));
        sb.append(',');
        sb.append("startPointer");
        sb.append('=');
        sb.append(((this.startPointer == null)?"<null>":this.startPointer));
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
        result = ((result* 31)+((this.endPointer == null)? 0 :this.endPointer.hashCode()));
        result = ((result* 31)+((this.startPointer == null)? 0 :this.startPointer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Range) == false) {
            return false;
        }
        Range rhs = ((Range) other);
        return (((this.endPointer == rhs.endPointer)||((this.endPointer!= null)&&this.endPointer.equals(rhs.endPointer)))&&((this.startPointer == rhs.startPointer)||((this.startPointer!= null)&&this.startPointer.equals(rhs.startPointer))));
    }

}
