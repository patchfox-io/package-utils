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
 * Component Object
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "mime-type",
    "bom-ref",
    "supplier",
    "author",
    "publisher",
    "group",
    "name",
    "version",
    "description",
    "scope",
    "hashes",
    "licenses",
    "copyright",
    "cpe",
    "purl",
    "swid",
    "modified",
    "pedigree",
    "externalReferences",
    "components",
    "evidence",
    "releaseNotes",
    "modelCard",
    "data",
    "properties",
    "signature"
})
public class Component {

    /**
     * Component Type
     * <p>
     * Specifies the type of component. For software components, classify as application if no more specific appropriate classification is available or cannot be determined for the component. Types include:
     * 
     * * __application__ = A software application. Refer to [https://en.wikipedia.org/wiki/Application_software](https://en.wikipedia.org/wiki/Application_software) for information about applications.
     * * __framework__ = A software framework. Refer to [https://en.wikipedia.org/wiki/Software_framework](https://en.wikipedia.org/wiki/Software_framework) for information on how frameworks vary slightly from libraries.
     * * __library__ = A software library. Refer to [https://en.wikipedia.org/wiki/Library_(computing)](https://en.wikipedia.org/wiki/Library_(computing))
     *  for information about libraries. All third-party and open source reusable components will likely be a library. If the library also has key features of a framework, then it should be classified as a framework. If not, or is unknown, then specifying library is RECOMMENDED.
     * * __container__ = A packaging and/or runtime format, not specific to any particular technology, which isolates software inside the container from software outside of a container through virtualization technology. Refer to [https://en.wikipedia.org/wiki/OS-level_virtualization](https://en.wikipedia.org/wiki/OS-level_virtualization)
     * * __platform__ = A runtime environment which interprets or executes software. This may include runtimes such as those that execute bytecode or low-code/no-code application platforms.
     * * __operating-system__ = A software operating system without regard to deployment model (i.e. installed on physical hardware, virtual machine, image, etc) Refer to [https://en.wikipedia.org/wiki/Operating_system](https://en.wikipedia.org/wiki/Operating_system)
     * * __device__ = A hardware device such as a processor, or chip-set. A hardware device containing firmware SHOULD include a component for the physical hardware itself, and another component of type 'firmware' or 'operating-system' (whichever is relevant), describing information about the software running on the device.
     *   See also the list of [known device properties](https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md).
     * * __device-driver__ = A special type of software that operates or controls a particular type of device. Refer to [https://en.wikipedia.org/wiki/Device_driver](https://en.wikipedia.org/wiki/Device_driver)
     * * __firmware__ = A special type of software that provides low-level control over a devices hardware. Refer to [https://en.wikipedia.org/wiki/Firmware](https://en.wikipedia.org/wiki/Firmware)
     * * __file__ = A computer file. Refer to [https://en.wikipedia.org/wiki/Computer_file](https://en.wikipedia.org/wiki/Computer_file) for information about files.
     * * __machine-learning-model__ = A model based on training data that can make predictions or decisions without being explicitly programmed to do so.
     * * __data__ = A collection of discrete values that convey information.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Specifies the type of component. For software components, classify as application if no more specific appropriate classification is available or cannot be determined for the component. Types include:\n\n* __application__ = A software application. Refer to [https://en.wikipedia.org/wiki/Application_software](https://en.wikipedia.org/wiki/Application_software) for information about applications.\n* __framework__ = A software framework. Refer to [https://en.wikipedia.org/wiki/Software_framework](https://en.wikipedia.org/wiki/Software_framework) for information on how frameworks vary slightly from libraries.\n* __library__ = A software library. Refer to [https://en.wikipedia.org/wiki/Library_(computing)](https://en.wikipedia.org/wiki/Library_(computing))\n for information about libraries. All third-party and open source reusable components will likely be a library. If the library also has key features of a framework, then it should be classified as a framework. If not, or is unknown, then specifying library is RECOMMENDED.\n* __container__ = A packaging and/or runtime format, not specific to any particular technology, which isolates software inside the container from software outside of a container through virtualization technology. Refer to [https://en.wikipedia.org/wiki/OS-level_virtualization](https://en.wikipedia.org/wiki/OS-level_virtualization)\n* __platform__ = A runtime environment which interprets or executes software. This may include runtimes such as those that execute bytecode or low-code/no-code application platforms.\n* __operating-system__ = A software operating system without regard to deployment model (i.e. installed on physical hardware, virtual machine, image, etc) Refer to [https://en.wikipedia.org/wiki/Operating_system](https://en.wikipedia.org/wiki/Operating_system)\n* __device__ = A hardware device such as a processor, or chip-set. A hardware device containing firmware SHOULD include a component for the physical hardware itself, and another component of type 'firmware' or 'operating-system' (whichever is relevant), describing information about the software running on the device.\n  See also the list of [known device properties](https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md).\n* __device-driver__ = A special type of software that operates or controls a particular type of device. Refer to [https://en.wikipedia.org/wiki/Device_driver](https://en.wikipedia.org/wiki/Device_driver)\n* __firmware__ = A special type of software that provides low-level control over a devices hardware. Refer to [https://en.wikipedia.org/wiki/Firmware](https://en.wikipedia.org/wiki/Firmware)\n* __file__ = A computer file. Refer to [https://en.wikipedia.org/wiki/Computer_file](https://en.wikipedia.org/wiki/Computer_file) for information about files.\n* __machine-learning-model__ = A model based on training data that can make predictions or decisions without being explicitly programmed to do so.\n* __data__ = A collection of discrete values that convey information.")
    private Component.Type type;
    /**
     * Mime-Type
     * <p>
     * The optional mime-type of the component. When used on file components, the mime-type can provide additional context about the kind of file being represented such as an image, font, or executable. Some library or framework components may also have an associated mime-type.
     * 
     */
    @JsonProperty("mime-type")
    @JsonPropertyDescription("The optional mime-type of the component. When used on file components, the mime-type can provide additional context about the kind of file being represented such as an image, font, or executable. Some library or framework components may also have an associated mime-type.")
    private String mimeType;
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
    @JsonProperty("supplier")
    @JsonPropertyDescription("")
    private OrganizationalEntity supplier;
    /**
     * Component Author
     * <p>
     * The person(s) or organization(s) that authored the component
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("The person(s) or organization(s) that authored the component")
    private String author;
    /**
     * Component Publisher
     * <p>
     * The person(s) or organization(s) that published the component
     * 
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("The person(s) or organization(s) that published the component")
    private String publisher;
    /**
     * Component Group
     * <p>
     * The grouping name or identifier. This will often be a shortened, single name of the company or project that produced the component, or the source package or domain name. Whitespace and special characters should be avoided. Examples include: apache, org.apache.commons, and apache.org.
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("The grouping name or identifier. This will often be a shortened, single name of the company or project that produced the component, or the source package or domain name. Whitespace and special characters should be avoided. Examples include: apache, org.apache.commons, and apache.org.")
    private String group;
    /**
     * Component Name
     * <p>
     * The name of the component. This will often be a shortened, single name of the component. Examples: commons-lang3 and jquery
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the component. This will often be a shortened, single name of the component. Examples: commons-lang3 and jquery")
    private String name;
    /**
     * Component Version
     * <p>
     * The component version. The version should ideally comply with semantic versioning but is not enforced.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("The component version. The version should ideally comply with semantic versioning but is not enforced.")
    private String version;
    /**
     * Component Description
     * <p>
     * Specifies a description for the component
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Specifies a description for the component")
    private String description;
    /**
     * Component Scope
     * <p>
     * Specifies the scope of the component. If scope is not specified, 'required' scope SHOULD be assumed by the consumer of the BOM.
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("Specifies the scope of the component. If scope is not specified, 'required' scope SHOULD be assumed by the consumer of the BOM.")
    private Component.Scope scope = Component.Scope.fromValue("required");
    /**
     * Component Hashes
     * <p>
     * 
     * 
     */
    @JsonProperty("hashes")
    private List<Hash> hashes = new ArrayList<Hash>();
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
     * Component Copyright
     * <p>
     * A copyright notice informing users of the underlying claims to copyright ownership in a published work.
     * 
     */
    @JsonProperty("copyright")
    @JsonPropertyDescription("A copyright notice informing users of the underlying claims to copyright ownership in a published work.")
    private String copyright;
    /**
     * Component Common Platform Enumeration (CPE)
     * <p>
     * Specifies a well-formed CPE name that conforms to the CPE 2.2 or 2.3 specification. See [https://nvd.nist.gov/products/cpe](https://nvd.nist.gov/products/cpe)
     * 
     */
    @JsonProperty("cpe")
    @JsonPropertyDescription("Specifies a well-formed CPE name that conforms to the CPE 2.2 or 2.3 specification. See [https://nvd.nist.gov/products/cpe](https://nvd.nist.gov/products/cpe)")
    private String cpe;
    /**
     * Component Package URL (purl)
     * <p>
     * Specifies the package-url (purl). The purl, if specified, MUST be valid and conform to the specification defined at: [https://github.com/package-url/purl-spec](https://github.com/package-url/purl-spec)
     * 
     */
    @JsonProperty("purl")
    @JsonPropertyDescription("Specifies the package-url (purl). The purl, if specified, MUST be valid and conform to the specification defined at: [https://github.com/package-url/purl-spec](https://github.com/package-url/purl-spec)")
    private String purl;
    /**
     * SWID Tag
     * <p>
     * Specifies metadata and content for ISO-IEC 19770-2 Software Identification (SWID) Tags.
     * 
     */
    @JsonProperty("swid")
    @JsonPropertyDescription("Specifies metadata and content for ISO-IEC 19770-2 Software Identification (SWID) Tags.")
    private Swid swid;
    /**
     * Component Modified From Original
     * <p>
     * [Deprecated] - DO NOT USE. This will be removed in a future version. Use the pedigree element instead to supply information on exactly how the component was modified. A boolean value indicating if the component has been modified from the original. A value of true indicates the component is a derivative of the original. A value of false indicates the component has not been modified from the original.
     * 
     */
    @JsonProperty("modified")
    @JsonPropertyDescription("[Deprecated] - DO NOT USE. This will be removed in a future version. Use the pedigree element instead to supply information on exactly how the component was modified. A boolean value indicating if the component has been modified from the original. A value of true indicates the component is a derivative of the original. A value of false indicates the component has not been modified from the original.")
    private Boolean modified;
    /**
     * Component Pedigree
     * <p>
     * Component pedigree is a way to document complex supply chain scenarios where components are created, distributed, modified, redistributed, combined with other components, etc. Pedigree supports viewing this complex chain from the beginning, the end, or anywhere in the middle. It also provides a way to document variants where the exact relation may not be known.
     * 
     */
    @JsonProperty("pedigree")
    @JsonPropertyDescription("Component pedigree is a way to document complex supply chain scenarios where components are created, distributed, modified, redistributed, combined with other components, etc. Pedigree supports viewing this complex chain from the beginning, the end, or anywhere in the middle. It also provides a way to document variants where the exact relation may not be known.")
    private Pedigree pedigree;
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
     * Components
     * <p>
     * A list of software and hardware components included in the parent component. This is not a dependency tree. It provides a way to specify a hierarchical representation of component assemblies, similar to system &#8594; subsystem &#8594; parts assembly in physical supply chains.
     * 
     */
    @JsonProperty("components")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A list of software and hardware components included in the parent component. This is not a dependency tree. It provides a way to specify a hierarchical representation of component assemblies, similar to system &#8594; subsystem &#8594; parts assembly in physical supply chains.")
    private Set<Component> components = new LinkedHashSet<Component>();
    /**
     * Evidence
     * <p>
     * Provides the ability to document evidence collected through various forms of extraction or analysis.
     * 
     */
    @JsonProperty("evidence")
    @JsonPropertyDescription("Provides the ability to document evidence collected through various forms of extraction or analysis.")
    private ComponentEvidence evidence;
    /**
     * Release notes
     * <p>
     * 
     * 
     */
    @JsonProperty("releaseNotes")
    private ReleaseNotes releaseNotes;
    /**
     * Model Card
     * <p>
     * A model card describes the intended uses of a machine learning model and potential limitations, including biases and ethical considerations. Model cards typically contain the training parameters, which datasets were used to train the model, performance metrics, and other relevant data useful for ML transparency. This object SHOULD be specified for any component of type `machine-learning-model` and MUST NOT be specified for other component types.Model card support in CycloneDX is derived from TensorFlow Model Card Toolkit released under the Apache 2.0 license and available from https://github.com/tensorflow/model-card-toolkit/blob/main/model_card_toolkit/schema/v0.0.2/model_card.schema.json. In addition, CycloneDX model card support includes portions of VerifyML, also released under the Apache 2.0 license and available from https://github.com/cylynx/verifyml/blob/main/verifyml/model_card_toolkit/schema/v0.0.4/model_card.schema.json.
     * 
     */
    @JsonProperty("modelCard")
    @JsonPropertyDescription("A model card describes the intended uses of a machine learning model and potential limitations, including biases and ethical considerations. Model cards typically contain the training parameters, which datasets were used to train the model, performance metrics, and other relevant data useful for ML transparency. This object SHOULD be specified for any component of type `machine-learning-model` and MUST NOT be specified for other component types.")
    private ModelCard modelCard;
    /**
     * Data
     * <p>
     * This object SHOULD be specified for any component of type `data` and MUST NOT be specified for other component types.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("This object SHOULD be specified for any component of type `data` and MUST NOT be specified for other component types.")
    private List<ComponentData> data = new ArrayList<ComponentData>();
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
     * Component Type
     * <p>
     * Specifies the type of component. For software components, classify as application if no more specific appropriate classification is available or cannot be determined for the component. Types include:
     * 
     * * __application__ = A software application. Refer to [https://en.wikipedia.org/wiki/Application_software](https://en.wikipedia.org/wiki/Application_software) for information about applications.
     * * __framework__ = A software framework. Refer to [https://en.wikipedia.org/wiki/Software_framework](https://en.wikipedia.org/wiki/Software_framework) for information on how frameworks vary slightly from libraries.
     * * __library__ = A software library. Refer to [https://en.wikipedia.org/wiki/Library_(computing)](https://en.wikipedia.org/wiki/Library_(computing))
     *  for information about libraries. All third-party and open source reusable components will likely be a library. If the library also has key features of a framework, then it should be classified as a framework. If not, or is unknown, then specifying library is RECOMMENDED.
     * * __container__ = A packaging and/or runtime format, not specific to any particular technology, which isolates software inside the container from software outside of a container through virtualization technology. Refer to [https://en.wikipedia.org/wiki/OS-level_virtualization](https://en.wikipedia.org/wiki/OS-level_virtualization)
     * * __platform__ = A runtime environment which interprets or executes software. This may include runtimes such as those that execute bytecode or low-code/no-code application platforms.
     * * __operating-system__ = A software operating system without regard to deployment model (i.e. installed on physical hardware, virtual machine, image, etc) Refer to [https://en.wikipedia.org/wiki/Operating_system](https://en.wikipedia.org/wiki/Operating_system)
     * * __device__ = A hardware device such as a processor, or chip-set. A hardware device containing firmware SHOULD include a component for the physical hardware itself, and another component of type 'firmware' or 'operating-system' (whichever is relevant), describing information about the software running on the device.
     *   See also the list of [known device properties](https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md).
     * * __device-driver__ = A special type of software that operates or controls a particular type of device. Refer to [https://en.wikipedia.org/wiki/Device_driver](https://en.wikipedia.org/wiki/Device_driver)
     * * __firmware__ = A special type of software that provides low-level control over a devices hardware. Refer to [https://en.wikipedia.org/wiki/Firmware](https://en.wikipedia.org/wiki/Firmware)
     * * __file__ = A computer file. Refer to [https://en.wikipedia.org/wiki/Computer_file](https://en.wikipedia.org/wiki/Computer_file) for information about files.
     * * __machine-learning-model__ = A model based on training data that can make predictions or decisions without being explicitly programmed to do so.
     * * __data__ = A collection of discrete values that convey information.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Component.Type getType() {
        return type;
    }

    /**
     * Component Type
     * <p>
     * Specifies the type of component. For software components, classify as application if no more specific appropriate classification is available or cannot be determined for the component. Types include:
     * 
     * * __application__ = A software application. Refer to [https://en.wikipedia.org/wiki/Application_software](https://en.wikipedia.org/wiki/Application_software) for information about applications.
     * * __framework__ = A software framework. Refer to [https://en.wikipedia.org/wiki/Software_framework](https://en.wikipedia.org/wiki/Software_framework) for information on how frameworks vary slightly from libraries.
     * * __library__ = A software library. Refer to [https://en.wikipedia.org/wiki/Library_(computing)](https://en.wikipedia.org/wiki/Library_(computing))
     *  for information about libraries. All third-party and open source reusable components will likely be a library. If the library also has key features of a framework, then it should be classified as a framework. If not, or is unknown, then specifying library is RECOMMENDED.
     * * __container__ = A packaging and/or runtime format, not specific to any particular technology, which isolates software inside the container from software outside of a container through virtualization technology. Refer to [https://en.wikipedia.org/wiki/OS-level_virtualization](https://en.wikipedia.org/wiki/OS-level_virtualization)
     * * __platform__ = A runtime environment which interprets or executes software. This may include runtimes such as those that execute bytecode or low-code/no-code application platforms.
     * * __operating-system__ = A software operating system without regard to deployment model (i.e. installed on physical hardware, virtual machine, image, etc) Refer to [https://en.wikipedia.org/wiki/Operating_system](https://en.wikipedia.org/wiki/Operating_system)
     * * __device__ = A hardware device such as a processor, or chip-set. A hardware device containing firmware SHOULD include a component for the physical hardware itself, and another component of type 'firmware' or 'operating-system' (whichever is relevant), describing information about the software running on the device.
     *   See also the list of [known device properties](https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md).
     * * __device-driver__ = A special type of software that operates or controls a particular type of device. Refer to [https://en.wikipedia.org/wiki/Device_driver](https://en.wikipedia.org/wiki/Device_driver)
     * * __firmware__ = A special type of software that provides low-level control over a devices hardware. Refer to [https://en.wikipedia.org/wiki/Firmware](https://en.wikipedia.org/wiki/Firmware)
     * * __file__ = A computer file. Refer to [https://en.wikipedia.org/wiki/Computer_file](https://en.wikipedia.org/wiki/Computer_file) for information about files.
     * * __machine-learning-model__ = A model based on training data that can make predictions or decisions without being explicitly programmed to do so.
     * * __data__ = A collection of discrete values that convey information.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Component.Type type) {
        this.type = type;
    }

    /**
     * Mime-Type
     * <p>
     * The optional mime-type of the component. When used on file components, the mime-type can provide additional context about the kind of file being represented such as an image, font, or executable. Some library or framework components may also have an associated mime-type.
     * 
     */
    @JsonProperty("mime-type")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Mime-Type
     * <p>
     * The optional mime-type of the component. When used on file components, the mime-type can provide additional context about the kind of file being represented such as an image, font, or executable. Some library or framework components may also have an associated mime-type.
     * 
     */
    @JsonProperty("mime-type")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

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
     * Component Author
     * <p>
     * The person(s) or organization(s) that authored the component
     * 
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     * Component Author
     * <p>
     * The person(s) or organization(s) that authored the component
     * 
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Component Publisher
     * <p>
     * The person(s) or organization(s) that published the component
     * 
     */
    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    /**
     * Component Publisher
     * <p>
     * The person(s) or organization(s) that published the component
     * 
     */
    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Component Group
     * <p>
     * The grouping name or identifier. This will often be a shortened, single name of the company or project that produced the component, or the source package or domain name. Whitespace and special characters should be avoided. Examples include: apache, org.apache.commons, and apache.org.
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Component Group
     * <p>
     * The grouping name or identifier. This will often be a shortened, single name of the company or project that produced the component, or the source package or domain name. Whitespace and special characters should be avoided. Examples include: apache, org.apache.commons, and apache.org.
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Component Name
     * <p>
     * The name of the component. This will often be a shortened, single name of the component. Examples: commons-lang3 and jquery
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Component Name
     * <p>
     * The name of the component. This will often be a shortened, single name of the component. Examples: commons-lang3 and jquery
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Component Version
     * <p>
     * The component version. The version should ideally comply with semantic versioning but is not enforced.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Component Version
     * <p>
     * The component version. The version should ideally comply with semantic versioning but is not enforced.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Component Description
     * <p>
     * Specifies a description for the component
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Component Description
     * <p>
     * Specifies a description for the component
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Component Scope
     * <p>
     * Specifies the scope of the component. If scope is not specified, 'required' scope SHOULD be assumed by the consumer of the BOM.
     * 
     */
    @JsonProperty("scope")
    public Component.Scope getScope() {
        return scope;
    }

    /**
     * Component Scope
     * <p>
     * Specifies the scope of the component. If scope is not specified, 'required' scope SHOULD be assumed by the consumer of the BOM.
     * 
     */
    @JsonProperty("scope")
    public void setScope(Component.Scope scope) {
        this.scope = scope;
    }

    /**
     * Component Hashes
     * <p>
     * 
     * 
     */
    @JsonProperty("hashes")
    public List<Hash> getHashes() {
        return hashes;
    }

    /**
     * Component Hashes
     * <p>
     * 
     * 
     */
    @JsonProperty("hashes")
    public void setHashes(List<Hash> hashes) {
        this.hashes = hashes;
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
     * Component Copyright
     * <p>
     * A copyright notice informing users of the underlying claims to copyright ownership in a published work.
     * 
     */
    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    /**
     * Component Copyright
     * <p>
     * A copyright notice informing users of the underlying claims to copyright ownership in a published work.
     * 
     */
    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * Component Common Platform Enumeration (CPE)
     * <p>
     * Specifies a well-formed CPE name that conforms to the CPE 2.2 or 2.3 specification. See [https://nvd.nist.gov/products/cpe](https://nvd.nist.gov/products/cpe)
     * 
     */
    @JsonProperty("cpe")
    public String getCpe() {
        return cpe;
    }

    /**
     * Component Common Platform Enumeration (CPE)
     * <p>
     * Specifies a well-formed CPE name that conforms to the CPE 2.2 or 2.3 specification. See [https://nvd.nist.gov/products/cpe](https://nvd.nist.gov/products/cpe)
     * 
     */
    @JsonProperty("cpe")
    public void setCpe(String cpe) {
        this.cpe = cpe;
    }

    /**
     * Component Package URL (purl)
     * <p>
     * Specifies the package-url (purl). The purl, if specified, MUST be valid and conform to the specification defined at: [https://github.com/package-url/purl-spec](https://github.com/package-url/purl-spec)
     * 
     */
    @JsonProperty("purl")
    public String getPurl() {
        return purl;
    }

    /**
     * Component Package URL (purl)
     * <p>
     * Specifies the package-url (purl). The purl, if specified, MUST be valid and conform to the specification defined at: [https://github.com/package-url/purl-spec](https://github.com/package-url/purl-spec)
     * 
     */
    @JsonProperty("purl")
    public void setPurl(String purl) {
        this.purl = purl;
    }

    /**
     * SWID Tag
     * <p>
     * Specifies metadata and content for ISO-IEC 19770-2 Software Identification (SWID) Tags.
     * 
     */
    @JsonProperty("swid")
    public Swid getSwid() {
        return swid;
    }

    /**
     * SWID Tag
     * <p>
     * Specifies metadata and content for ISO-IEC 19770-2 Software Identification (SWID) Tags.
     * 
     */
    @JsonProperty("swid")
    public void setSwid(Swid swid) {
        this.swid = swid;
    }

    /**
     * Component Modified From Original
     * <p>
     * [Deprecated] - DO NOT USE. This will be removed in a future version. Use the pedigree element instead to supply information on exactly how the component was modified. A boolean value indicating if the component has been modified from the original. A value of true indicates the component is a derivative of the original. A value of false indicates the component has not been modified from the original.
     * 
     */
    @JsonProperty("modified")
    public Boolean getModified() {
        return modified;
    }

    /**
     * Component Modified From Original
     * <p>
     * [Deprecated] - DO NOT USE. This will be removed in a future version. Use the pedigree element instead to supply information on exactly how the component was modified. A boolean value indicating if the component has been modified from the original. A value of true indicates the component is a derivative of the original. A value of false indicates the component has not been modified from the original.
     * 
     */
    @JsonProperty("modified")
    public void setModified(Boolean modified) {
        this.modified = modified;
    }

    /**
     * Component Pedigree
     * <p>
     * Component pedigree is a way to document complex supply chain scenarios where components are created, distributed, modified, redistributed, combined with other components, etc. Pedigree supports viewing this complex chain from the beginning, the end, or anywhere in the middle. It also provides a way to document variants where the exact relation may not be known.
     * 
     */
    @JsonProperty("pedigree")
    public Pedigree getPedigree() {
        return pedigree;
    }

    /**
     * Component Pedigree
     * <p>
     * Component pedigree is a way to document complex supply chain scenarios where components are created, distributed, modified, redistributed, combined with other components, etc. Pedigree supports viewing this complex chain from the beginning, the end, or anywhere in the middle. It also provides a way to document variants where the exact relation may not be known.
     * 
     */
    @JsonProperty("pedigree")
    public void setPedigree(Pedigree pedigree) {
        this.pedigree = pedigree;
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
     * Components
     * <p>
     * A list of software and hardware components included in the parent component. This is not a dependency tree. It provides a way to specify a hierarchical representation of component assemblies, similar to system &#8594; subsystem &#8594; parts assembly in physical supply chains.
     * 
     */
    @JsonProperty("components")
    public Set<Component> getComponents() {
        return components;
    }

    /**
     * Components
     * <p>
     * A list of software and hardware components included in the parent component. This is not a dependency tree. It provides a way to specify a hierarchical representation of component assemblies, similar to system &#8594; subsystem &#8594; parts assembly in physical supply chains.
     * 
     */
    @JsonProperty("components")
    public void setComponents(Set<Component> components) {
        this.components = components;
    }

    /**
     * Evidence
     * <p>
     * Provides the ability to document evidence collected through various forms of extraction or analysis.
     * 
     */
    @JsonProperty("evidence")
    public ComponentEvidence getEvidence() {
        return evidence;
    }

    /**
     * Evidence
     * <p>
     * Provides the ability to document evidence collected through various forms of extraction or analysis.
     * 
     */
    @JsonProperty("evidence")
    public void setEvidence(ComponentEvidence evidence) {
        this.evidence = evidence;
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
     * Model Card
     * <p>
     * A model card describes the intended uses of a machine learning model and potential limitations, including biases and ethical considerations. Model cards typically contain the training parameters, which datasets were used to train the model, performance metrics, and other relevant data useful for ML transparency. This object SHOULD be specified for any component of type `machine-learning-model` and MUST NOT be specified for other component types.Model card support in CycloneDX is derived from TensorFlow Model Card Toolkit released under the Apache 2.0 license and available from https://github.com/tensorflow/model-card-toolkit/blob/main/model_card_toolkit/schema/v0.0.2/model_card.schema.json. In addition, CycloneDX model card support includes portions of VerifyML, also released under the Apache 2.0 license and available from https://github.com/cylynx/verifyml/blob/main/verifyml/model_card_toolkit/schema/v0.0.4/model_card.schema.json.
     * 
     */
    @JsonProperty("modelCard")
    public ModelCard getModelCard() {
        return modelCard;
    }

    /**
     * Model Card
     * <p>
     * A model card describes the intended uses of a machine learning model and potential limitations, including biases and ethical considerations. Model cards typically contain the training parameters, which datasets were used to train the model, performance metrics, and other relevant data useful for ML transparency. This object SHOULD be specified for any component of type `machine-learning-model` and MUST NOT be specified for other component types.Model card support in CycloneDX is derived from TensorFlow Model Card Toolkit released under the Apache 2.0 license and available from https://github.com/tensorflow/model-card-toolkit/blob/main/model_card_toolkit/schema/v0.0.2/model_card.schema.json. In addition, CycloneDX model card support includes portions of VerifyML, also released under the Apache 2.0 license and available from https://github.com/cylynx/verifyml/blob/main/verifyml/model_card_toolkit/schema/v0.0.4/model_card.schema.json.
     * 
     */
    @JsonProperty("modelCard")
    public void setModelCard(ModelCard modelCard) {
        this.modelCard = modelCard;
    }

    /**
     * Data
     * <p>
     * This object SHOULD be specified for any component of type `data` and MUST NOT be specified for other component types.
     * 
     */
    @JsonProperty("data")
    public List<ComponentData> getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * This object SHOULD be specified for any component of type `data` and MUST NOT be specified for other component types.
     * 
     */
    @JsonProperty("data")
    public void setData(List<ComponentData> data) {
        this.data = data;
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
        sb.append(Component.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("mimeType");
        sb.append('=');
        sb.append(((this.mimeType == null)?"<null>":this.mimeType));
        sb.append(',');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("supplier");
        sb.append('=');
        sb.append(((this.supplier == null)?"<null>":this.supplier));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
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
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("hashes");
        sb.append('=');
        sb.append(((this.hashes == null)?"<null>":this.hashes));
        sb.append(',');
        sb.append("licenses");
        sb.append('=');
        sb.append(((this.licenses == null)?"<null>":this.licenses));
        sb.append(',');
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
        sb.append(',');
        sb.append("cpe");
        sb.append('=');
        sb.append(((this.cpe == null)?"<null>":this.cpe));
        sb.append(',');
        sb.append("purl");
        sb.append('=');
        sb.append(((this.purl == null)?"<null>":this.purl));
        sb.append(',');
        sb.append("swid");
        sb.append('=');
        sb.append(((this.swid == null)?"<null>":this.swid));
        sb.append(',');
        sb.append("modified");
        sb.append('=');
        sb.append(((this.modified == null)?"<null>":this.modified));
        sb.append(',');
        sb.append("pedigree");
        sb.append('=');
        sb.append(((this.pedigree == null)?"<null>":this.pedigree));
        sb.append(',');
        sb.append("externalReferences");
        sb.append('=');
        sb.append(((this.externalReferences == null)?"<null>":this.externalReferences));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
        sb.append(',');
        sb.append("evidence");
        sb.append('=');
        sb.append(((this.evidence == null)?"<null>":this.evidence));
        sb.append(',');
        sb.append("releaseNotes");
        sb.append('=');
        sb.append(((this.releaseNotes == null)?"<null>":this.releaseNotes));
        sb.append(',');
        sb.append("modelCard");
        sb.append('=');
        sb.append(((this.modelCard == null)?"<null>":this.modelCard));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.evidence == null)? 0 :this.evidence.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.swid == null)? 0 :this.swid.hashCode()));
        result = ((result* 31)+((this.mimeType == null)? 0 :this.mimeType.hashCode()));
        result = ((result* 31)+((this.purl == null)? 0 :this.purl.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.releaseNotes == null)? 0 :this.releaseNotes.hashCode()));
        result = ((result* 31)+((this.supplier == null)? 0 :this.supplier.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.cpe == null)? 0 :this.cpe.hashCode()));
        result = ((result* 31)+((this.modified == null)? 0 :this.modified.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.externalReferences == null)? 0 :this.externalReferences.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.pedigree == null)? 0 :this.pedigree.hashCode()));
        result = ((result* 31)+((this.licenses == null)? 0 :this.licenses.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.hashes == null)? 0 :this.hashes.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.modelCard == null)? 0 :this.modelCard.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Component) == false) {
            return false;
        }
        Component rhs = ((Component) other);
        return ((((((((((((((((((((((((((((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright)))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.evidence == rhs.evidence)||((this.evidence!= null)&&this.evidence.equals(rhs.evidence))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.swid == rhs.swid)||((this.swid!= null)&&this.swid.equals(rhs.swid))))&&((this.mimeType == rhs.mimeType)||((this.mimeType!= null)&&this.mimeType.equals(rhs.mimeType))))&&((this.purl == rhs.purl)||((this.purl!= null)&&this.purl.equals(rhs.purl))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.releaseNotes == rhs.releaseNotes)||((this.releaseNotes!= null)&&this.releaseNotes.equals(rhs.releaseNotes))))&&((this.supplier == rhs.supplier)||((this.supplier!= null)&&this.supplier.equals(rhs.supplier))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.cpe == rhs.cpe)||((this.cpe!= null)&&this.cpe.equals(rhs.cpe))))&&((this.modified == rhs.modified)||((this.modified!= null)&&this.modified.equals(rhs.modified))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.externalReferences == rhs.externalReferences)||((this.externalReferences!= null)&&this.externalReferences.equals(rhs.externalReferences))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.pedigree == rhs.pedigree)||((this.pedigree!= null)&&this.pedigree.equals(rhs.pedigree))))&&((this.licenses == rhs.licenses)||((this.licenses!= null)&&this.licenses.equals(rhs.licenses))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.hashes == rhs.hashes)||((this.hashes!= null)&&this.hashes.equals(rhs.hashes))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.modelCard == rhs.modelCard)||((this.modelCard!= null)&&this.modelCard.equals(rhs.modelCard))))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }


    /**
     * Component Scope
     * <p>
     * Specifies the scope of the component. If scope is not specified, 'required' scope SHOULD be assumed by the consumer of the BOM.
     * 
     */
    public enum Scope {

        REQUIRED("required"),
        OPTIONAL("optional"),
        EXCLUDED("excluded");
        private final String value;
        private final static Map<String, Component.Scope> CONSTANTS = new HashMap<String, Component.Scope>();

        static {
            for (Component.Scope c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Scope(String value) {
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
        public static Component.Scope fromValue(String value) {
            Component.Scope constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Component Type
     * <p>
     * Specifies the type of component. For software components, classify as application if no more specific appropriate classification is available or cannot be determined for the component. Types include:
     * 
     * * __application__ = A software application. Refer to [https://en.wikipedia.org/wiki/Application_software](https://en.wikipedia.org/wiki/Application_software) for information about applications.
     * * __framework__ = A software framework. Refer to [https://en.wikipedia.org/wiki/Software_framework](https://en.wikipedia.org/wiki/Software_framework) for information on how frameworks vary slightly from libraries.
     * * __library__ = A software library. Refer to [https://en.wikipedia.org/wiki/Library_(computing)](https://en.wikipedia.org/wiki/Library_(computing))
     *  for information about libraries. All third-party and open source reusable components will likely be a library. If the library also has key features of a framework, then it should be classified as a framework. If not, or is unknown, then specifying library is RECOMMENDED.
     * * __container__ = A packaging and/or runtime format, not specific to any particular technology, which isolates software inside the container from software outside of a container through virtualization technology. Refer to [https://en.wikipedia.org/wiki/OS-level_virtualization](https://en.wikipedia.org/wiki/OS-level_virtualization)
     * * __platform__ = A runtime environment which interprets or executes software. This may include runtimes such as those that execute bytecode or low-code/no-code application platforms.
     * * __operating-system__ = A software operating system without regard to deployment model (i.e. installed on physical hardware, virtual machine, image, etc) Refer to [https://en.wikipedia.org/wiki/Operating_system](https://en.wikipedia.org/wiki/Operating_system)
     * * __device__ = A hardware device such as a processor, or chip-set. A hardware device containing firmware SHOULD include a component for the physical hardware itself, and another component of type 'firmware' or 'operating-system' (whichever is relevant), describing information about the software running on the device.
     *   See also the list of [known device properties](https://github.com/CycloneDX/cyclonedx-property-taxonomy/blob/main/cdx/device.md).
     * * __device-driver__ = A special type of software that operates or controls a particular type of device. Refer to [https://en.wikipedia.org/wiki/Device_driver](https://en.wikipedia.org/wiki/Device_driver)
     * * __firmware__ = A special type of software that provides low-level control over a devices hardware. Refer to [https://en.wikipedia.org/wiki/Firmware](https://en.wikipedia.org/wiki/Firmware)
     * * __file__ = A computer file. Refer to [https://en.wikipedia.org/wiki/Computer_file](https://en.wikipedia.org/wiki/Computer_file) for information about files.
     * * __machine-learning-model__ = A model based on training data that can make predictions or decisions without being explicitly programmed to do so.
     * * __data__ = A collection of discrete values that convey information.
     * 
     */
    public enum Type {

        APPLICATION("application"),
        FRAMEWORK("framework"),
        LIBRARY("library"),
        CONTAINER("container"),
        PLATFORM("platform"),
        OPERATING_SYSTEM("operating-system"),
        DEVICE("device"),
        DEVICE_DRIVER("device-driver"),
        FIRMWARE("firmware"),
        FILE("file"),
        MACHINE_LEARNING_MODEL("machine-learning-model"),
        DATA("data");
        private final String value;
        private final static Map<String, Component.Type> CONSTANTS = new HashMap<String, Component.Type>();

        static {
            for (Component.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Component.Type fromValue(String value) {
            Component.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
