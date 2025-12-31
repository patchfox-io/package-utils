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
 * Service Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "provider",
    "group",
    "name",
    "version",
    "description",
    "endpoints",
    "authenticated",
    "x-trust-boundary",
    "trustZone",
    "data",
    "licenses",
    "externalReferences",
    "services",
    "releaseNotes",
    "properties",
    "signature"
})
public class Service {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("")
    private OrganizationalEntity provider;
    /**
     * Service Group
     * <p>
     * The grouping name, namespace, or identifier. This will often be a shortened, single name of the company or project that produced the service or domain name. Whitespace and special characters should be avoided.
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("The grouping name, namespace, or identifier. This will often be a shortened, single name of the company or project that produced the service or domain name. Whitespace and special characters should be avoided.")
    private String group;
    /**
     * Service Name
     * <p>
     * The name of the service. This will often be a shortened, single name of the service.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the service. This will often be a shortened, single name of the service.")
    private String name;
    /**
     * Service Version
     * <p>
     * The service version.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("The service version.")
    private String version;
    /**
     * Service Description
     * <p>
     * Specifies a description for the service
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Specifies a description for the service")
    private String description;
    /**
     * Endpoints
     * <p>
     * The endpoint URIs of the service. Multiple endpoints are allowed.
     * 
     */
    @JsonProperty("endpoints")
    @JsonPropertyDescription("The endpoint URIs of the service. Multiple endpoints are allowed.")
    private List<String> endpoints = new ArrayList<String>();
    /**
     * Authentication Required
     * <p>
     * A boolean value indicating if the service requires authentication. A value of true indicates the service requires authentication prior to use. A value of false indicates the service does not require authentication.
     * 
     */
    @JsonProperty("authenticated")
    @JsonPropertyDescription("A boolean value indicating if the service requires authentication. A value of true indicates the service requires authentication prior to use. A value of false indicates the service does not require authentication.")
    private Boolean authenticated;
    /**
     * Crosses Trust Boundary
     * <p>
     * A boolean value indicating if use of the service crosses a trust zone or boundary. A value of true indicates that by using the service, a trust boundary is crossed. A value of false indicates that by using the service, a trust boundary is not crossed.
     * 
     */
    @JsonProperty("x-trust-boundary")
    @JsonPropertyDescription("A boolean value indicating if use of the service crosses a trust zone or boundary. A value of true indicates that by using the service, a trust boundary is crossed. A value of false indicates that by using the service, a trust boundary is not crossed.")
    private Boolean xTrustBoundary;
    /**
     * Trust Zone
     * <p>
     * The name of the trust zone the service resides in.
     * 
     */
    @JsonProperty("trustZone")
    @JsonPropertyDescription("The name of the trust zone the service resides in.")
    private String trustZone;
    /**
     * Data
     * <p>
     * Specifies information about the data including the directional flow of data and the data classification.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Specifies information about the data including the directional flow of data and the data classification.")
    private List<ServiceData> data = new ArrayList<ServiceData>();
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
     * External References
     * <p>
     * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
     * 
     */
    @JsonProperty("externalReferences")
    @JsonPropertyDescription("External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.")
    private List<ExternalReference> externalReferences = new ArrayList<ExternalReference>();
    /**
     * Services
     * <p>
     * A list of services included or deployed behind the parent service. This is not a dependency tree. It provides a way to specify a hierarchical representation of service assemblies.
     * 
     */
    @JsonProperty("services")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A list of services included or deployed behind the parent service. This is not a dependency tree. It provides a way to specify a hierarchical representation of service assemblies.")
    private Set<Service> services = new LinkedHashSet<Service>();
    /**
     * Release notes
     * <p>
     * 
     * 
     */
    @JsonProperty("releaseNotes")
    private ReleaseNotes releaseNotes;
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
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    private Signature signature;

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
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("provider")
    public OrganizationalEntity getProvider() {
        return provider;
    }

    /**
     * Organizational Entity Object
     * <p>
     * 
     * 
     */
    @JsonProperty("provider")
    public void setProvider(OrganizationalEntity provider) {
        this.provider = provider;
    }

    /**
     * Service Group
     * <p>
     * The grouping name, namespace, or identifier. This will often be a shortened, single name of the company or project that produced the service or domain name. Whitespace and special characters should be avoided.
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Service Group
     * <p>
     * The grouping name, namespace, or identifier. This will often be a shortened, single name of the company or project that produced the service or domain name. Whitespace and special characters should be avoided.
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Service Name
     * <p>
     * The name of the service. This will often be a shortened, single name of the service.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Service Name
     * <p>
     * The name of the service. This will often be a shortened, single name of the service.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Service Version
     * <p>
     * The service version.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Service Version
     * <p>
     * The service version.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Service Description
     * <p>
     * Specifies a description for the service
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Service Description
     * <p>
     * Specifies a description for the service
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Endpoints
     * <p>
     * The endpoint URIs of the service. Multiple endpoints are allowed.
     * 
     */
    @JsonProperty("endpoints")
    public List<String> getEndpoints() {
        return endpoints;
    }

    /**
     * Endpoints
     * <p>
     * The endpoint URIs of the service. Multiple endpoints are allowed.
     * 
     */
    @JsonProperty("endpoints")
    public void setEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Authentication Required
     * <p>
     * A boolean value indicating if the service requires authentication. A value of true indicates the service requires authentication prior to use. A value of false indicates the service does not require authentication.
     * 
     */
    @JsonProperty("authenticated")
    public Boolean getAuthenticated() {
        return authenticated;
    }

    /**
     * Authentication Required
     * <p>
     * A boolean value indicating if the service requires authentication. A value of true indicates the service requires authentication prior to use. A value of false indicates the service does not require authentication.
     * 
     */
    @JsonProperty("authenticated")
    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    /**
     * Crosses Trust Boundary
     * <p>
     * A boolean value indicating if use of the service crosses a trust zone or boundary. A value of true indicates that by using the service, a trust boundary is crossed. A value of false indicates that by using the service, a trust boundary is not crossed.
     * 
     */
    @JsonProperty("x-trust-boundary")
    public Boolean getxTrustBoundary() {
        return xTrustBoundary;
    }

    /**
     * Crosses Trust Boundary
     * <p>
     * A boolean value indicating if use of the service crosses a trust zone or boundary. A value of true indicates that by using the service, a trust boundary is crossed. A value of false indicates that by using the service, a trust boundary is not crossed.
     * 
     */
    @JsonProperty("x-trust-boundary")
    public void setxTrustBoundary(Boolean xTrustBoundary) {
        this.xTrustBoundary = xTrustBoundary;
    }

    /**
     * Trust Zone
     * <p>
     * The name of the trust zone the service resides in.
     * 
     */
    @JsonProperty("trustZone")
    public String getTrustZone() {
        return trustZone;
    }

    /**
     * Trust Zone
     * <p>
     * The name of the trust zone the service resides in.
     * 
     */
    @JsonProperty("trustZone")
    public void setTrustZone(String trustZone) {
        this.trustZone = trustZone;
    }

    /**
     * Data
     * <p>
     * Specifies information about the data including the directional flow of data and the data classification.
     * 
     */
    @JsonProperty("data")
    public List<ServiceData> getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * Specifies information about the data including the directional flow of data and the data classification.
     * 
     */
    @JsonProperty("data")
    public void setData(List<ServiceData> data) {
        this.data = data;
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
     * External References
     * <p>
     * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
     * 
     */
    @JsonProperty("externalReferences")
    public List<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    /**
     * External References
     * <p>
     * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
     * 
     */
    @JsonProperty("externalReferences")
    public void setExternalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    /**
     * Services
     * <p>
     * A list of services included or deployed behind the parent service. This is not a dependency tree. It provides a way to specify a hierarchical representation of service assemblies.
     * 
     */
    @JsonProperty("services")
    public Set<Service> getServices() {
        return services;
    }

    /**
     * Services
     * <p>
     * A list of services included or deployed behind the parent service. This is not a dependency tree. It provides a way to specify a hierarchical representation of service assemblies.
     * 
     */
    @JsonProperty("services")
    public void setServices(Set<Service> services) {
        this.services = services;
    }

    /**
     * Release notes
     * <p>
     * 
     * 
     */
    @JsonProperty("releaseNotes")
    public ReleaseNotes getReleaseNotes() {
        return releaseNotes;
    }

    /**
     * Release notes
     * <p>
     * 
     * 
     */
    @JsonProperty("releaseNotes")
    public void setReleaseNotes(ReleaseNotes releaseNotes) {
        this.releaseNotes = releaseNotes;
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

    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    public Signature getSignature() {
        return signature;
    }

    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Service.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("endpoints");
        sb.append('=');
        sb.append(((this.endpoints == null)?"<null>":this.endpoints));
        sb.append(',');
        sb.append("authenticated");
        sb.append('=');
        sb.append(((this.authenticated == null)?"<null>":this.authenticated));
        sb.append(',');
        sb.append("xTrustBoundary");
        sb.append('=');
        sb.append(((this.xTrustBoundary == null)?"<null>":this.xTrustBoundary));
        sb.append(',');
        sb.append("trustZone");
        sb.append('=');
        sb.append(((this.trustZone == null)?"<null>":this.trustZone));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("licenses");
        sb.append('=');
        sb.append(((this.licenses == null)?"<null>":this.licenses));
        sb.append(',');
        sb.append("externalReferences");
        sb.append('=');
        sb.append(((this.externalReferences == null)?"<null>":this.externalReferences));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("releaseNotes");
        sb.append('=');
        sb.append(((this.releaseNotes == null)?"<null>":this.releaseNotes));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
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
        result = ((result* 31)+((this.authenticated == null)? 0 :this.authenticated.hashCode()));
        result = ((result* 31)+((this.endpoints == null)? 0 :this.endpoints.hashCode()));
        result = ((result* 31)+((this.externalReferences == null)? 0 :this.externalReferences.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.services == null)? 0 :this.services.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.trustZone == null)? 0 :this.trustZone.hashCode()));
        result = ((result* 31)+((this.xTrustBoundary == null)? 0 :this.xTrustBoundary.hashCode()));
        result = ((result* 31)+((this.licenses == null)? 0 :this.licenses.hashCode()));
        result = ((result* 31)+((this.releaseNotes == null)? 0 :this.releaseNotes.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return ((((((((((((((((((this.authenticated == rhs.authenticated)||((this.authenticated!= null)&&this.authenticated.equals(rhs.authenticated)))&&((this.endpoints == rhs.endpoints)||((this.endpoints!= null)&&this.endpoints.equals(rhs.endpoints))))&&((this.externalReferences == rhs.externalReferences)||((this.externalReferences!= null)&&this.externalReferences.equals(rhs.externalReferences))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.services == rhs.services)||((this.services!= null)&&this.services.equals(rhs.services))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.trustZone == rhs.trustZone)||((this.trustZone!= null)&&this.trustZone.equals(rhs.trustZone))))&&((this.xTrustBoundary == rhs.xTrustBoundary)||((this.xTrustBoundary!= null)&&this.xTrustBoundary.equals(rhs.xTrustBoundary))))&&((this.licenses == rhs.licenses)||((this.licenses!= null)&&this.licenses.equals(rhs.licenses))))&&((this.releaseNotes == rhs.releaseNotes)||((this.releaseNotes!= null)&&this.releaseNotes.equals(rhs.releaseNotes))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
