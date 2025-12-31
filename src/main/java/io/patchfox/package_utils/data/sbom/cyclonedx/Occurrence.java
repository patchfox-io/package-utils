package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "location"
})
public class Occurrence {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Location
     * <p>
     * The location or path to where the component was found.
     * (Required)
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location or path to where the component was found.")
    private String location;

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    public String getBomRef() {
        return bomRef;
    }

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    public void setBomRef(String bomRef) {
        this.bomRef = bomRef;
    }

    /**
     * Location
     * <p>
     * The location or path to where the component was found.
     * (Required)
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * The location or path to where the component was found.
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Occurrence.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Occurrence) == false) {
            return false;
        }
        Occurrence rhs = ((Occurrence) other);
        return (((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))));
    }

}
