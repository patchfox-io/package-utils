package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organization",
    "contact"
})
public class DataGovernanceResponsibleParty {

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("")
    private OrganizationalEntity organization;
    /**
     * Organizational Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("")
    private OrganizationalContact contact;

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("organization")
    public OrganizationalEntity getOrganization() {
        return organization;
    }

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(OrganizationalEntity organization) {
        this.organization = organization;
    }

    /**
     * Organizational Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("contact")
    public OrganizationalContact getContact() {
        return contact;
    }

    /**
     * Organizational Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("contact")
    public void setContact(OrganizationalContact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataGovernanceResponsibleParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
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
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataGovernanceResponsibleParty) == false) {
            return false;
        }
        DataGovernanceResponsibleParty rhs = ((DataGovernanceResponsibleParty) other);
        return (((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization)))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))));
    }

}
