package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Resource reference choice
 * <p>
 * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref",
    "externalReference"
})
public class ResourceReferenceChoice {

    /**
     * BOM Reference
     * <p>
     * References an object by its bom-ref attribute
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("References an object by its bom-ref attribute")
    private Object ref;
    /**
     * External Reference
     * <p>
     * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
     * 
     */
    @JsonProperty("externalReference")
    @JsonPropertyDescription("External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.")
    private ExternalReference externalReference;

    /**
     * BOM Reference
     * <p>
     * References an object by its bom-ref attribute
     * 
     */
    @JsonProperty("ref")
    public Object getRef() {
        return ref;
    }

    /**
     * BOM Reference
     * <p>
     * References an object by its bom-ref attribute
     * 
     */
    @JsonProperty("ref")
    public void setRef(Object ref) {
        this.ref = ref;
    }

    /**
     * External Reference
     * <p>
     * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
     * 
     */
    @JsonProperty("externalReference")
    public ExternalReference getExternalReference() {
        return externalReference;
    }

    /**
     * External Reference
     * <p>
     * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
     * 
     */
    @JsonProperty("externalReference")
    public void setExternalReference(ExternalReference externalReference) {
        this.externalReference = externalReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceReferenceChoice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
        sb.append(',');
        sb.append("externalReference");
        sb.append('=');
        sb.append(((this.externalReference == null)?"<null>":this.externalReference));
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
        result = ((result* 31)+((this.externalReference == null)? 0 :this.externalReference.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceReferenceChoice) == false) {
            return false;
        }
        ResourceReferenceChoice rhs = ((ResourceReferenceChoice) other);
        return (((this.externalReference == rhs.externalReference)||((this.externalReference!= null)&&this.externalReference.equals(rhs.externalReference)))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))));
    }

}
