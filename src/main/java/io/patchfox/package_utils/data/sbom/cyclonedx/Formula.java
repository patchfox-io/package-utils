package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Formula
 * <p>
 * Describes workflows and resources that captures rules and other aspects of how the associated BOM component or service was formed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "components",
    "services",
    "workflows",
    "properties"
})
public class Formula {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Components
     * <p>
     * Transient components that are used in tasks that constitute one or more of this formula's workflows
     * 
     */
    @JsonProperty("components")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Transient components that are used in tasks that constitute one or more of this formula's workflows")
    private Set<Component> components = new LinkedHashSet<Component>();
    /**
     * Services
     * <p>
     * Transient services that are used in tasks that constitute one or more of this formula's workflows
     * 
     */
    @JsonProperty("services")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Transient services that are used in tasks that constitute one or more of this formula's workflows")
    private Set<Service> services = new LinkedHashSet<Service>();
    /**
     * Workflows
     * <p>
     * List of workflows that can be declared to accomplish specific orchestrated goals and independently triggered.Different workflows can be designed to work together to perform end-to-end CI/CD builds and deployments.
     * 
     */
    @JsonProperty("workflows")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of workflows that can be declared to accomplish specific orchestrated goals and independently triggered.")
    private Set<Workflow> workflows = new LinkedHashSet<Workflow>();
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

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
     * Components
     * <p>
     * Transient components that are used in tasks that constitute one or more of this formula's workflows
     * 
     */
    @JsonProperty("components")
    public Set<Component> getComponents() {
        return components;
    }

    /**
     * Components
     * <p>
     * Transient components that are used in tasks that constitute one or more of this formula's workflows
     * 
     */
    @JsonProperty("components")
    public void setComponents(Set<Component> components) {
        this.components = components;
    }

    /**
     * Services
     * <p>
     * Transient services that are used in tasks that constitute one or more of this formula's workflows
     * 
     */
    @JsonProperty("services")
    public Set<Service> getServices() {
        return services;
    }

    /**
     * Services
     * <p>
     * Transient services that are used in tasks that constitute one or more of this formula's workflows
     * 
     */
    @JsonProperty("services")
    public void setServices(Set<Service> services) {
        this.services = services;
    }

    /**
     * Workflows
     * <p>
     * List of workflows that can be declared to accomplish specific orchestrated goals and independently triggered.Different workflows can be designed to work together to perform end-to-end CI/CD builds and deployments.
     * 
     */
    @JsonProperty("workflows")
    public Set<Workflow> getWorkflows() {
        return workflows;
    }

    /**
     * Workflows
     * <p>
     * List of workflows that can be declared to accomplish specific orchestrated goals and independently triggered.Different workflows can be designed to work together to perform end-to-end CI/CD builds and deployments.
     * 
     */
    @JsonProperty("workflows")
    public void setWorkflows(Set<Workflow> workflows) {
        this.workflows = workflows;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Formula.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("workflows");
        sb.append('=');
        sb.append(((this.workflows == null)?"<null>":this.workflows));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
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
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.services == null)? 0 :this.services.hashCode()));
        result = ((result* 31)+((this.workflows == null)? 0 :this.workflows.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Formula) == false) {
            return false;
        }
        Formula rhs = ((Formula) other);
        return ((((((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef)))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.services == rhs.services)||((this.services!= null)&&this.services.equals(rhs.services))))&&((this.workflows == rhs.workflows)||((this.workflows!= null)&&this.workflows.equals(rhs.workflows))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
