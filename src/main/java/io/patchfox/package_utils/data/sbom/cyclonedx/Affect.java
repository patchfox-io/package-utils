package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref",
    "versions"
})
public class Affect {

    /**
     * Reference
     * <p>
     * References a component or service by the objects bom-ref
     * (Required)
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("References a component or service by the objects bom-ref")
    private Object ref;
    /**
     * Versions
     * <p>
     * Zero or more individual versions or range of versions.
     * 
     */
    @JsonProperty("versions")
    @JsonPropertyDescription("Zero or more individual versions or range of versions.")
    private List<Version> versions = new ArrayList<Version>();

    /**
     * Reference
     * <p>
     * References a component or service by the objects bom-ref
     * (Required)
     * 
     */
    @JsonProperty("ref")
    public Object getRef() {
        return ref;
    }

    /**
     * Reference
     * <p>
     * References a component or service by the objects bom-ref
     * (Required)
     * 
     */
    @JsonProperty("ref")
    public void setRef(Object ref) {
        this.ref = ref;
    }

    /**
     * Versions
     * <p>
     * Zero or more individual versions or range of versions.
     * 
     */
    @JsonProperty("versions")
    public List<Version> getVersions() {
        return versions;
    }

    /**
     * Versions
     * <p>
     * Zero or more individual versions or range of versions.
     * 
     */
    @JsonProperty("versions")
    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Affect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
        sb.append(',');
        sb.append("versions");
        sb.append('=');
        sb.append(((this.versions == null)?"<null>":this.versions));
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
        result = ((result* 31)+((this.versions == null)? 0 :this.versions.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Affect) == false) {
            return false;
        }
        Affect rhs = ((Affect) other);
        return (((this.versions == rhs.versions)||((this.versions!= null)&&this.versions.equals(rhs.versions)))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))));
    }

}
