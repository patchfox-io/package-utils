package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BOM Metadata Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "lifecycles",
    "tools",
    "authors",
    "component",
    "manufacture",
    "supplier",
    "licenses",
    "properties"
})
public class Metadata {

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the BOM was created.
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("The date and time (timestamp) when the BOM was created.")
    private Date timestamp;
    /**
     * Lifecycles
     * <p>
     * 
     * 
     */
    @JsonProperty("lifecycles")
    @JsonPropertyDescription("")
    private List<Lifecycle> lifecycles = new ArrayList<Lifecycle>();
    @JsonProperty("tools")
    private Object tools;
    /**
     * Authors
     * <p>
     * The person(s) who created the BOM. Authors are common in BOMs created through manual processes. BOMs created through automated means may not have authors.
     * 
     */
    @JsonProperty("authors")
    @JsonPropertyDescription("The person(s) who created the BOM. Authors are common in BOMs created through manual processes. BOMs created through automated means may not have authors.")
    private List<OrganizationalContact> authors = new ArrayList<OrganizationalContact>();
    /**
     * Component Object
     * <p>
     * 
     * 
     */
    @JsonProperty("component")
    private Component component;
    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("manufacture")
    @JsonPropertyDescription("")
    private OrganizationalEntity manufacture;
    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("supplier")
    @JsonPropertyDescription("")
    private OrganizationalEntity supplier;
    /**
     * License Choice
     * <p>
     * EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)
     * 
     */
    @JsonProperty("licenses")
    @JsonPropertyDescription("EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)")
    private List<Object> licenses = new ArrayList<Object>();
    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the BOM was created.
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the BOM was created.
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Lifecycles
     * <p>
     * 
     * 
     */
    @JsonProperty("lifecycles")
    public List<Lifecycle> getLifecycles() {
        return lifecycles;
    }

    /**
     * Lifecycles
     * <p>
     * 
     * 
     */
    @JsonProperty("lifecycles")
    public void setLifecycles(List<Lifecycle> lifecycles) {
        this.lifecycles = lifecycles;
    }

    @JsonProperty("tools")
    public Object getTools() {
        return tools;
    }

    @JsonProperty("tools")
    public void setTools(Object tools) {
        this.tools = tools;
    }

    /**
     * Authors
     * <p>
     * The person(s) who created the BOM. Authors are common in BOMs created through manual processes. BOMs created through automated means may not have authors.
     * 
     */
    @JsonProperty("authors")
    public List<OrganizationalContact> getAuthors() {
        return authors;
    }

    /**
     * Authors
     * <p>
     * The person(s) who created the BOM. Authors are common in BOMs created through manual processes. BOMs created through automated means may not have authors.
     * 
     */
    @JsonProperty("authors")
    public void setAuthors(List<OrganizationalContact> authors) {
        this.authors = authors;
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
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("manufacture")
    public OrganizationalEntity getManufacture() {
        return manufacture;
    }

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("manufacture")
    public void setManufacture(OrganizationalEntity manufacture) {
        this.manufacture = manufacture;
    }

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("supplier")
    public OrganizationalEntity getSupplier() {
        return supplier;
    }

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("supplier")
    public void setSupplier(OrganizationalEntity supplier) {
        this.supplier = supplier;
    }

    /**
     * License Choice
     * <p>
     * EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)
     * 
     */
    @JsonProperty("licenses")
    public List<Object> getLicenses() {
        return licenses;
    }

    /**
     * License Choice
     * <p>
     * EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)
     * 
     */
    @JsonProperty("licenses")
    public void setLicenses(List<Object> licenses) {
        this.licenses = licenses;
    }

    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("lifecycles");
        sb.append('=');
        sb.append(((this.lifecycles == null)?"<null>":this.lifecycles));
        sb.append(',');
        sb.append("tools");
        sb.append('=');
        sb.append(((this.tools == null)?"<null>":this.tools));
        sb.append(',');
        sb.append("authors");
        sb.append('=');
        sb.append(((this.authors == null)?"<null>":this.authors));
        sb.append(',');
        sb.append("component");
        sb.append('=');
        sb.append(((this.component == null)?"<null>":this.component));
        sb.append(',');
        sb.append("manufacture");
        sb.append('=');
        sb.append(((this.manufacture == null)?"<null>":this.manufacture));
        sb.append(',');
        sb.append("supplier");
        sb.append('=');
        sb.append(((this.supplier == null)?"<null>":this.supplier));
        sb.append(',');
        sb.append("licenses");
        sb.append('=');
        sb.append(((this.licenses == null)?"<null>":this.licenses));
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
        result = ((result* 31)+((this.manufacture == null)? 0 :this.manufacture.hashCode()));
        result = ((result* 31)+((this.component == null)? 0 :this.component.hashCode()));
        result = ((result* 31)+((this.licenses == null)? 0 :this.licenses.hashCode()));
        result = ((result* 31)+((this.supplier == null)? 0 :this.supplier.hashCode()));
        result = ((result* 31)+((this.lifecycles == null)? 0 :this.lifecycles.hashCode()));
        result = ((result* 31)+((this.tools == null)? 0 :this.tools.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.authors == null)? 0 :this.authors.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return ((((((((((this.manufacture == rhs.manufacture)||((this.manufacture!= null)&&this.manufacture.equals(rhs.manufacture)))&&((this.component == rhs.component)||((this.component!= null)&&this.component.equals(rhs.component))))&&((this.licenses == rhs.licenses)||((this.licenses!= null)&&this.licenses.equals(rhs.licenses))))&&((this.supplier == rhs.supplier)||((this.supplier!= null)&&this.supplier.equals(rhs.supplier))))&&((this.lifecycles == rhs.lifecycles)||((this.lifecycles!= null)&&this.lifecycles.equals(rhs.lifecycles))))&&((this.tools == rhs.tools)||((this.tools!= null)&&this.tools.equals(rhs.tools))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.authors == rhs.authors)||((this.authors!= null)&&this.authors.equals(rhs.authors))));
    }

}
