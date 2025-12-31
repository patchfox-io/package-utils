package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Annotator
 * <p>
 * The organization, person, component, or service which created the textual content of the annotation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organization",
    "individual",
    "component",
    "service"
})
public class Annotator {

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
    @JsonProperty("individual")
    @JsonPropertyDescription("")
    private OrganizationalContact individual;
    /**
     * Component Object
     * <p>
     * 
     * 
     */
    @JsonProperty("component")
    private Component component;
    /**
     * Service Object
     * <p>
     * 
     * 
     */
    @JsonProperty("service")
    private Service service;

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
    @JsonProperty("individual")
    public OrganizationalContact getIndividual() {
        return individual;
    }

    /**
     * Organizational Contact Object
     * <p>
     * 
     * 
     */
    @JsonProperty("individual")
    public void setIndividual(OrganizationalContact individual) {
        this.individual = individual;
    }

    /**
     * Component Object
     * <p>
     * 
     * 
     */
    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    /**
     * Component Object
     * <p>
     * 
     * 
     */
    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Service Object
     * <p>
     * 
     * 
     */
    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    /**
     * Service Object
     * <p>
     * 
     * 
     */
    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Annotator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("individual");
        sb.append('=');
        sb.append(((this.individual == null)?"<null>":this.individual));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
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
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.individual == null)? 0 :this.individual.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Annotator) == false) {
            return false;
        }
        Annotator rhs = ((Annotator) other);
        return (((((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component)))&&((this.individual == rhs.individual)||((this.individual!= null)&&this.individual.equals(rhs.individual))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))));
    }

}
