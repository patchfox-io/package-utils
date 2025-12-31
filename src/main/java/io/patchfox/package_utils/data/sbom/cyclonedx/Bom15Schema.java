package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CycloneDX Software Bill of Materials Standard
 * <p>
 * CycloneDX JSON schema is published under the terms of the Apache License 2.0.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$schema",
    "bomFormat",
    "specVersion",
    "serialNumber",
    "version",
    "metadata",
    "components",
    "services",
    "externalReferences",
    "dependencies",
    "compositions",
    "vulnerabilities",
    "annotations",
    "formulation",
    "properties",
    "signature"
})
public class Bom15Schema {

    @JsonProperty("$schema")
    private Bom15Schema.$schema $schema;
    /**
     * BOM Format
     * <p>
     * Specifies the format of the BOM. This helps to identify the file as CycloneDX since BOMs do not have a filename convention nor does JSON schema support namespaces. This value MUST be "CycloneDX".
     * (Required)
     * 
     */
    @JsonProperty("bomFormat")
    @JsonPropertyDescription("Specifies the format of the BOM. This helps to identify the file as CycloneDX since BOMs do not have a filename convention nor does JSON schema support namespaces. This value MUST be \"CycloneDX\".")
    private Bom15Schema.BomFormat bomFormat;
    /**
     * CycloneDX Specification Version
     * <p>
     * The version of the CycloneDX specification a BOM conforms to (starting at version 1.2).
     * (Required)
     * 
     */
    @JsonProperty("specVersion")
    @JsonPropertyDescription("The version of the CycloneDX specification a BOM conforms to (starting at version 1.2).")
    private String specVersion;
    /**
     * BOM Serial Number
     * <p>
     * Every BOM generated SHOULD have a unique serial number, even if the contents of the BOM have not changed over time. If specified, the serial number MUST conform to RFC-4122. Use of serial numbers are RECOMMENDED.
     * 
     */
    @JsonProperty("serialNumber")
    @JsonPropertyDescription("Every BOM generated SHOULD have a unique serial number, even if the contents of the BOM have not changed over time. If specified, the serial number MUST conform to RFC-4122. Use of serial numbers are RECOMMENDED.")
    private String serialNumber;
    /**
     * BOM Version
     * <p>
     * Whenever an existing BOM is modified, either manually or through automated processes, the version of the BOM SHOULD be incremented by 1. When a system is presented with multiple BOMs with identical serial numbers, the system SHOULD use the most recent version of the BOM. The default version is '1'.
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Whenever an existing BOM is modified, either manually or through automated processes, the version of the BOM SHOULD be incremented by 1. When a system is presented with multiple BOMs with identical serial numbers, the system SHOULD use the most recent version of the BOM. The default version is '1'.")
    private Integer version = 1;
    /**
     * BOM Metadata Object
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    private Metadata metadata;
    /**
     * Components
     * <p>
     * A list of software and hardware components.
     * 
     */
    @JsonProperty("components")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A list of software and hardware components.")
    private Set<Component> components = new LinkedHashSet<Component>();
    /**
     * Services
     * <p>
     * A list of services. This may include microservices, function-as-a-service, and other types of network or intra-process services.
     * 
     */
    @JsonProperty("services")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A list of services. This may include microservices, function-as-a-service, and other types of network or intra-process services.")
    private Set<Service> services = new LinkedHashSet<Service>();
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
     * Dependencies
     * <p>
     * Provides the ability to document dependency relationships.
     * 
     */
    @JsonProperty("dependencies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Provides the ability to document dependency relationships.")
    private Set<Dependency> dependencies = new LinkedHashSet<Dependency>();
    /**
     * Compositions
     * <p>
     * Compositions describe constituent parts (including components, services, and dependency relationships) and their completeness. The completeness of vulnerabilities expressed in a BOM may also be described.
     * 
     */
    @JsonProperty("compositions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Compositions describe constituent parts (including components, services, and dependency relationships) and their completeness. The completeness of vulnerabilities expressed in a BOM may also be described.")
    private Set<Compositions> compositions = new LinkedHashSet<Compositions>();
    /**
     * Vulnerabilities
     * <p>
     * Vulnerabilities identified in components or services.
     * 
     */
    @JsonProperty("vulnerabilities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Vulnerabilities identified in components or services.")
    private Set<Vulnerability> vulnerabilities = new LinkedHashSet<Vulnerability>();
    /**
     * Annotations
     * <p>
     * Comments made by people, organizations, or tools about any object with a bom-ref, such as components, services, vulnerabilities, or the BOM itself. Unlike inventory information, annotations may contain opinion or commentary from various stakeholders. Annotations may be inline (with inventory) or externalized via BOM-Link, and may optionally be signed.
     * 
     */
    @JsonProperty("annotations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Comments made by people, organizations, or tools about any object with a bom-ref, such as components, services, vulnerabilities, or the BOM itself. Unlike inventory information, annotations may contain opinion or commentary from various stakeholders. Annotations may be inline (with inventory) or externalized via BOM-Link, and may optionally be signed.")
    private Set<Annotations> annotations = new LinkedHashSet<Annotations>();
    /**
     * Formulation
     * <p>
     * Describes how a component or service was manufactured or deployed. This is achieved through the use of formulas, workflows, tasks, and steps, which declare the precise steps to reproduce along with the observed formulas describing the steps which transpired in the manufacturing process.
     * 
     */
    @JsonProperty("formulation")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Describes how a component or service was manufactured or deployed. This is achieved through the use of formulas, workflows, tasks, and steps, which declare the precise steps to reproduce along with the observed formulas describing the steps which transpired in the manufacturing process.")
    private Set<Formula> formulation = new LinkedHashSet<Formula>();
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

    @JsonProperty("$schema")
    public Bom15Schema.$schema get$schema() {
        return $schema;
    }

    @JsonProperty("$schema")
    public void set$schema(Bom15Schema.$schema $schema) {
        this.$schema = $schema;
    }

    /**
     * BOM Format
     * <p>
     * Specifies the format of the BOM. This helps to identify the file as CycloneDX since BOMs do not have a filename convention nor does JSON schema support namespaces. This value MUST be "CycloneDX".
     * (Required)
     * 
     */
    @JsonProperty("bomFormat")
    public Bom15Schema.BomFormat getBomFormat() {
        return bomFormat;
    }

    /**
     * BOM Format
     * <p>
     * Specifies the format of the BOM. This helps to identify the file as CycloneDX since BOMs do not have a filename convention nor does JSON schema support namespaces. This value MUST be "CycloneDX".
     * (Required)
     * 
     */
    @JsonProperty("bomFormat")
    public void setBomFormat(Bom15Schema.BomFormat bomFormat) {
        this.bomFormat = bomFormat;
    }

    /**
     * CycloneDX Specification Version
     * <p>
     * The version of the CycloneDX specification a BOM conforms to (starting at version 1.2).
     * (Required)
     * 
     */
    @JsonProperty("specVersion")
    public String getSpecVersion() {
        return specVersion;
    }

    /**
     * CycloneDX Specification Version
     * <p>
     * The version of the CycloneDX specification a BOM conforms to (starting at version 1.2).
     * (Required)
     * 
     */
    @JsonProperty("specVersion")
    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    /**
     * BOM Serial Number
     * <p>
     * Every BOM generated SHOULD have a unique serial number, even if the contents of the BOM have not changed over time. If specified, the serial number MUST conform to RFC-4122. Use of serial numbers are RECOMMENDED.
     * 
     */
    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * BOM Serial Number
     * <p>
     * Every BOM generated SHOULD have a unique serial number, even if the contents of the BOM have not changed over time. If specified, the serial number MUST conform to RFC-4122. Use of serial numbers are RECOMMENDED.
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * BOM Version
     * <p>
     * Whenever an existing BOM is modified, either manually or through automated processes, the version of the BOM SHOULD be incremented by 1. When a system is presented with multiple BOMs with identical serial numbers, the system SHOULD use the most recent version of the BOM. The default version is '1'.
     * (Required)
     * 
     */
    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    /**
     * BOM Version
     * <p>
     * Whenever an existing BOM is modified, either manually or through automated processes, the version of the BOM SHOULD be incremented by 1. When a system is presented with multiple BOMs with identical serial numbers, the system SHOULD use the most recent version of the BOM. The default version is '1'.
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * BOM Metadata Object
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * BOM Metadata Object
     * <p>
     * 
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Components
     * <p>
     * A list of software and hardware components.
     * 
     */
    @JsonProperty("components")
    public Set<Component> getComponents() {
        return components;
    }

    /**
     * Components
     * <p>
     * A list of software and hardware components.
     * 
     */
    @JsonProperty("components")
    public void setComponents(Set<Component> components) {
        this.components = components;
    }

    /**
     * Services
     * <p>
     * A list of services. This may include microservices, function-as-a-service, and other types of network or intra-process services.
     * 
     */
    @JsonProperty("services")
    public Set<Service> getServices() {
        return services;
    }

    /**
     * Services
     * <p>
     * A list of services. This may include microservices, function-as-a-service, and other types of network or intra-process services.
     * 
     */
    @JsonProperty("services")
    public void setServices(Set<Service> services) {
        this.services = services;
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
     * Dependencies
     * <p>
     * Provides the ability to document dependency relationships.
     * 
     */
    @JsonProperty("dependencies")
    public Set<Dependency> getDependencies() {
        return dependencies;
    }

    /**
     * Dependencies
     * <p>
     * Provides the ability to document dependency relationships.
     * 
     */
    @JsonProperty("dependencies")
    public void setDependencies(Set<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * Compositions
     * <p>
     * Compositions describe constituent parts (including components, services, and dependency relationships) and their completeness. The completeness of vulnerabilities expressed in a BOM may also be described.
     * 
     */
    @JsonProperty("compositions")
    public Set<Compositions> getCompositions() {
        return compositions;
    }

    /**
     * Compositions
     * <p>
     * Compositions describe constituent parts (including components, services, and dependency relationships) and their completeness. The completeness of vulnerabilities expressed in a BOM may also be described.
     * 
     */
    @JsonProperty("compositions")
    public void setCompositions(Set<Compositions> compositions) {
        this.compositions = compositions;
    }

    /**
     * Vulnerabilities
     * <p>
     * Vulnerabilities identified in components or services.
     * 
     */
    @JsonProperty("vulnerabilities")
    public Set<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * Vulnerabilities
     * <p>
     * Vulnerabilities identified in components or services.
     * 
     */
    @JsonProperty("vulnerabilities")
    public void setVulnerabilities(Set<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    /**
     * Annotations
     * <p>
     * Comments made by people, organizations, or tools about any object with a bom-ref, such as components, services, vulnerabilities, or the BOM itself. Unlike inventory information, annotations may contain opinion or commentary from various stakeholders. Annotations may be inline (with inventory) or externalized via BOM-Link, and may optionally be signed.
     * 
     */
    @JsonProperty("annotations")
    public Set<Annotations> getAnnotations() {
        return annotations;
    }

    /**
     * Annotations
     * <p>
     * Comments made by people, organizations, or tools about any object with a bom-ref, such as components, services, vulnerabilities, or the BOM itself. Unlike inventory information, annotations may contain opinion or commentary from various stakeholders. Annotations may be inline (with inventory) or externalized via BOM-Link, and may optionally be signed.
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(Set<Annotations> annotations) {
        this.annotations = annotations;
    }

    /**
     * Formulation
     * <p>
     * Describes how a component or service was manufactured or deployed. This is achieved through the use of formulas, workflows, tasks, and steps, which declare the precise steps to reproduce along with the observed formulas describing the steps which transpired in the manufacturing process.
     * 
     */
    @JsonProperty("formulation")
    public Set<Formula> getFormulation() {
        return formulation;
    }

    /**
     * Formulation
     * <p>
     * Describes how a component or service was manufactured or deployed. This is achieved through the use of formulas, workflows, tasks, and steps, which declare the precise steps to reproduce along with the observed formulas describing the steps which transpired in the manufacturing process.
     * 
     */
    @JsonProperty("formulation")
    public void setFormulation(Set<Formula> formulation) {
        this.formulation = formulation;
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
        sb.append(Bom15Schema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("bomFormat");
        sb.append('=');
        sb.append(((this.bomFormat == null)?"<null>":this.bomFormat));
        sb.append(',');
        sb.append("specVersion");
        sb.append('=');
        sb.append(((this.specVersion == null)?"<null>":this.specVersion));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("externalReferences");
        sb.append('=');
        sb.append(((this.externalReferences == null)?"<null>":this.externalReferences));
        sb.append(',');
        sb.append("dependencies");
        sb.append('=');
        sb.append(((this.dependencies == null)?"<null>":this.dependencies));
        sb.append(',');
        sb.append("compositions");
        sb.append('=');
        sb.append(((this.compositions == null)?"<null>":this.compositions));
        sb.append(',');
        sb.append("vulnerabilities");
        sb.append('=');
        sb.append(((this.vulnerabilities == null)?"<null>":this.vulnerabilities));
        sb.append(',');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("formulation");
        sb.append('=');
        sb.append(((this.formulation == null)?"<null>":this.formulation));
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
        result = ((result* 31)+((this.specVersion == null)? 0 :this.specVersion.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.externalReferences == null)? 0 :this.externalReferences.hashCode()));
        result = ((result* 31)+((this.serialNumber == null)? 0 :this.serialNumber.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.services == null)? 0 :this.services.hashCode()));
        result = ((result* 31)+((this.compositions == null)? 0 :this.compositions.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.dependencies == null)? 0 :this.dependencies.hashCode()));
        result = ((result* 31)+((this.bomFormat == null)? 0 :this.bomFormat.hashCode()));
        result = ((result* 31)+((this.formulation == null)? 0 :this.formulation.hashCode()));
        result = ((result* 31)+((this.vulnerabilities == null)? 0 :this.vulnerabilities.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bom15Schema) == false) {
            return false;
        }
        Bom15Schema rhs = ((Bom15Schema) other);
        return (((((((((((((((((this.specVersion == rhs.specVersion)||((this.specVersion!= null)&&this.specVersion.equals(rhs.specVersion)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.externalReferences == rhs.externalReferences)||((this.externalReferences!= null)&&this.externalReferences.equals(rhs.externalReferences))))&&((this.serialNumber == rhs.serialNumber)||((this.serialNumber!= null)&&this.serialNumber.equals(rhs.serialNumber))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.services == rhs.services)||((this.services!= null)&&this.services.equals(rhs.services))))&&((this.compositions == rhs.compositions)||((this.compositions!= null)&&this.compositions.equals(rhs.compositions))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.dependencies == rhs.dependencies)||((this.dependencies!= null)&&this.dependencies.equals(rhs.dependencies))))&&((this.bomFormat == rhs.bomFormat)||((this.bomFormat!= null)&&this.bomFormat.equals(rhs.bomFormat))))&&((this.formulation == rhs.formulation)||((this.formulation!= null)&&this.formulation.equals(rhs.formulation))))&&((this.vulnerabilities == rhs.vulnerabilities)||((this.vulnerabilities!= null)&&this.vulnerabilities.equals(rhs.vulnerabilities))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

    public enum $schema {

        HTTP_CYCLONEDX_ORG_SCHEMA_BOM_1_5_SCHEMA_JSON("http://cyclonedx.org/schema/bom-1.5.schema.json");
        private final String value;
        private final static Map<String, Bom15Schema.$schema> CONSTANTS = new HashMap<String, Bom15Schema.$schema>();

        static {
            for (Bom15Schema.$schema c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        $schema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Bom15Schema.$schema fromValue(String value) {
            Bom15Schema.$schema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * BOM Format
     * <p>
     * Specifies the format of the BOM. This helps to identify the file as CycloneDX since BOMs do not have a filename convention nor does JSON schema support namespaces. This value MUST be "CycloneDX".
     * 
     */
    public enum BomFormat {

        CYCLONE_DX("CycloneDX");
        private final String value;
        private final static Map<String, Bom15Schema.BomFormat> CONSTANTS = new HashMap<String, Bom15Schema.BomFormat>();

        static {
            for (Bom15Schema.BomFormat c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BomFormat(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Bom15Schema.BomFormat fromValue(String value) {
            Bom15Schema.BomFormat constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
