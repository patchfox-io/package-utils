package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Evidence of the components use through the callstack.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "frames"
})
public class Callstack {

    /**
     * Methods
     * <p>
     * 
     * 
     */
    @JsonProperty("frames")
    private List<Frame> frames = new ArrayList<Frame>();

    /**
     * Methods
     * <p>
     * 
     * 
     */
    @JsonProperty("frames")
    public List<Frame> getFrames() {
        return frames;
    }

    /**
     * Methods
     * <p>
     * 
     * 
     */
    @JsonProperty("frames")
    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Callstack.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frames");
        sb.append('=');
        sb.append(((this.frames == null)?"<null>":this.frames));
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
        result = ((result* 31)+((this.frames == null)? 0 :this.frames.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Callstack) == false) {
            return false;
        }
        Callstack rhs = ((Callstack) other);
        return ((this.frames == rhs.frames)||((this.frames!= null)&&this.frames.equals(rhs.frames)));
    }

}
