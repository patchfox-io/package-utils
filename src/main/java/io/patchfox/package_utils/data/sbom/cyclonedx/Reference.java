package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "source"
})
public class Reference {

    /**
     * ID
     * <p>
     * An identifier that uniquely identifies the vulnerability.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("An identifier that uniquely identifies the vulnerability.")
    private String id;
    /**
     * Source
     * <p>
     * The source of vulnerability information. This is often the organization that published the vulnerability.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of vulnerability information. This is often the organization that published the vulnerability.")
    private VulnerabilitySource source;

    /**
     * ID
     * <p>
     * An identifier that uniquely identifies the vulnerability.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * An identifier that uniquely identifies the vulnerability.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Source
     * <p>
     * The source of vulnerability information. This is often the organization that published the vulnerability.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public VulnerabilitySource getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of vulnerability information. This is often the organization that published the vulnerability.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(VulnerabilitySource source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reference) == false) {
            return false;
        }
        Reference rhs = ((Reference) other);
        return (((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }

}
