package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Organizational Entity Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "name",
    "url",
    "contact"
})
public class OrganizationalEntity {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Name
     * <p>
     * The name of the organization
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the organization")
    private String name;
    /**
     * URL
     * <p>
     * The URL of the organization. Multiple URLs are allowed.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL of the organization. Multiple URLs are allowed.")
    private List<String> url = new ArrayList<String>();
    /**
     * Contact
     * <p>
     * A contact at the organization. Multiple contacts are allowed.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("A contact at the organization. Multiple contacts are allowed.")
    private List<OrganizationalContact> contact = new ArrayList<OrganizationalContact>();

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
     * Name
     * <p>
     * The name of the organization
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the organization
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * URL
     * <p>
     * The URL of the organization. Multiple URLs are allowed.
     * 
     */
    @JsonProperty("url")
    public List<String> getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * The URL of the organization. Multiple URLs are allowed.
     * 
     */
    @JsonProperty("url")
    public void setUrl(List<String> url) {
        this.url = url;
    }

    /**
     * Contact
     * <p>
     * A contact at the organization. Multiple contacts are allowed.
     * 
     */
    @JsonProperty("contact")
    public List<OrganizationalContact> getContact() {
        return contact;
    }

    /**
     * Contact
     * <p>
     * A contact at the organization. Multiple contacts are allowed.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<OrganizationalContact> contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationalEntity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationalEntity) == false) {
            return false;
        }
        OrganizationalEntity rhs = ((OrganizationalEntity) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))));
    }

}
