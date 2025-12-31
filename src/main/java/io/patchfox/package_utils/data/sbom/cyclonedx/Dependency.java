package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Dependency
 * <p>
 * Defines the direct dependencies of a component or service. Components or services that do not have their own dependencies MUST be declared as empty elements within the graph. Components or services that are not represented in the dependency graph MAY have unknown dependencies. It is RECOMMENDED that implementations assume this to be opaque and not an indicator of a object being dependency-free. It is RECOMMENDED to leverage compositions to indicate unknown dependency graphs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref",
    "dependsOn"
})
public class Dependency {

    /**
     * Descriptor for an element identified by the attribute 'bom-ref' in the same BOM document.
     * In contrast to `bomLinkElementType`.
     * (Required)
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("Descriptor for an element identified by the attribute 'bom-ref' in the same BOM document.\nIn contrast to `bomLinkElementType`.")
    private Object ref;
    /**
     * Depends On
     * <p>
     * The bom-ref identifiers of the components or services that are dependencies of this dependency object.
     * 
     */
    @JsonProperty("dependsOn")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The bom-ref identifiers of the components or services that are dependencies of this dependency object.")
    private Set<Object> dependsOn = new LinkedHashSet<Object>();

    /**
     * Descriptor for an element identified by the attribute 'bom-ref' in the same BOM document.
     * In contrast to `bomLinkElementType`.
     * (Required)
     * 
     */
    @JsonProperty("ref")
    public Object getRef() {
        return ref;
    }

    /**
     * Descriptor for an element identified by the attribute 'bom-ref' in the same BOM document.
     * In contrast to `bomLinkElementType`.
     * (Required)
     * 
     */
    @JsonProperty("ref")
    public void setRef(Object ref) {
        this.ref = ref;
    }

    /**
     * Depends On
     * <p>
     * The bom-ref identifiers of the components or services that are dependencies of this dependency object.
     * 
     */
    @JsonProperty("dependsOn")
    public Set<Object> getDependsOn() {
        return dependsOn;
    }

    /**
     * Depends On
     * <p>
     * The bom-ref identifiers of the components or services that are dependencies of this dependency object.
     * 
     */
    @JsonProperty("dependsOn")
    public void setDependsOn(Set<Object> dependsOn) {
        this.dependsOn = dependsOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dependency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
        sb.append(',');
        sb.append("dependsOn");
        sb.append('=');
        sb.append(((this.dependsOn == null)?"<null>":this.dependsOn));
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
        result = ((result* 31)+((this.dependsOn == null)? 0 :this.dependsOn.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dependency) == false) {
            return false;
        }
        Dependency rhs = ((Dependency) other);
        return (((this.dependsOn == rhs.dependsOn)||((this.dependsOn!= null)&&this.dependsOn.equals(rhs.dependsOn)))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))));
    }

}
