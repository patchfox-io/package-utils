package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Credits
 * <p>
 * Individuals or organizations credited with the discovery of the vulnerability.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organizations",
    "individuals"
})
public class Credits {

    /**
     * Organizations
     * <p>
     * The organizations credited with vulnerability discovery.
     * 
     */
    @JsonProperty("organizations")
    @JsonPropertyDescription("The organizations credited with vulnerability discovery.")
    private List<OrganizationalEntity> organizations = new ArrayList<OrganizationalEntity>();
    /**
     * Individuals
     * <p>
     * The individuals, not associated with organizations, that are credited with vulnerability discovery.
     * 
     */
    @JsonProperty("individuals")
    @JsonPropertyDescription("The individuals, not associated with organizations, that are credited with vulnerability discovery.")
    private List<OrganizationalContact> individuals = new ArrayList<OrganizationalContact>();

    /**
     * Organizations
     * <p>
     * The organizations credited with vulnerability discovery.
     * 
     */
    @JsonProperty("organizations")
    public List<OrganizationalEntity> getOrganizations() {
        return organizations;
    }

    /**
     * Organizations
     * <p>
     * The organizations credited with vulnerability discovery.
     * 
     */
    @JsonProperty("organizations")
    public void setOrganizations(List<OrganizationalEntity> organizations) {
        this.organizations = organizations;
    }

    /**
     * Individuals
     * <p>
     * The individuals, not associated with organizations, that are credited with vulnerability discovery.
     * 
     */
    @JsonProperty("individuals")
    public List<OrganizationalContact> getIndividuals() {
        return individuals;
    }

    /**
     * Individuals
     * <p>
     * The individuals, not associated with organizations, that are credited with vulnerability discovery.
     * 
     */
    @JsonProperty("individuals")
    public void setIndividuals(List<OrganizationalContact> individuals) {
        this.individuals = individuals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("organizations");
        sb.append('=');
        sb.append(((this.organizations == null)?"<null>":this.organizations));
        sb.append(',');
        sb.append("individuals");
        sb.append('=');
        sb.append(((this.individuals == null)?"<null>":this.individuals));
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
        result = ((result* 31)+((this.organizations == null)? 0 :this.organizations.hashCode()));
        result = ((result* 31)+((this.individuals == null)? 0 :this.individuals.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credits) == false) {
            return false;
        }
        Credits rhs = ((Credits) other);
        return (((this.organizations == rhs.organizations)||((this.organizations!= null)&&this.organizations.equals(rhs.organizations)))&&((this.individuals == rhs.individuals)||((this.individuals!= null)&&this.individuals.equals(rhs.individuals))));
    }

}
