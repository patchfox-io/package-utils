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
 * Workspace
 * <p>
 * A named filesystem or data resource shareable by workflow tasks.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "uid",
    "name",
    "aliases",
    "description",
    "resourceReferences",
    "accessMode",
    "mountPath",
    "managedDataType",
    "volumeRequest",
    "volume",
    "properties"
})
public class Workspace {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * (Required)
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the resource instance within its deployment context.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("The unique identifier for the resource instance within its deployment context.")
    private String uid;
    /**
     * Name
     * <p>
     * The name of the resource instance.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the resource instance.")
    private String name;
    /**
     * Aliases
     * <p>
     * The names for the workspace as referenced by other workflow tasks. Effectively, a name mapping so other tasks can use their own local name in their steps.
     * 
     */
    @JsonProperty("aliases")
    @JsonPropertyDescription("The names for the workspace as referenced by other workflow tasks. Effectively, a name mapping so other tasks can use their own local name in their steps.")
    private List<String> aliases = new ArrayList<String>();
    /**
     * Description
     * <p>
     * A description of the resource instance.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the resource instance.")
    private String description;
    /**
     * Resource references
     * <p>
     * References to component or service resources that are used to realize the resource instance.
     * 
     */
    @JsonProperty("resourceReferences")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("References to component or service resources that are used to realize the resource instance.")
    private Set<ResourceReferenceChoice> resourceReferences = new LinkedHashSet<ResourceReferenceChoice>();
    /**
     * Access mode
     * <p>
     * Describes the read-write access control for the workspace relative to the owning resource instance.
     * 
     */
    @JsonProperty("accessMode")
    @JsonPropertyDescription("Describes the read-write access control for the workspace relative to the owning resource instance.")
    private Workspace.AccessMode accessMode;
    /**
     * Mount path
     * <p>
     * A path to a location on disk where the workspace will be available to the associated task's steps.
     * 
     */
    @JsonProperty("mountPath")
    @JsonPropertyDescription("A path to a location on disk where the workspace will be available to the associated task's steps.")
    private String mountPath;
    /**
     * Managed data type
     * <p>
     * The name of a domain-specific data type the workspace represents.This property is for CI/CD frameworks that are able to provide access to structured, managed data at a more granular level than a filesystem.
     * 
     */
    @JsonProperty("managedDataType")
    @JsonPropertyDescription("The name of a domain-specific data type the workspace represents.")
    private String managedDataType;
    /**
     * Volume request
     * <p>
     * Identifies the reference to the request for a specific volume type and parameters.
     * 
     */
    @JsonProperty("volumeRequest")
    @JsonPropertyDescription("Identifies the reference to the request for a specific volume type and parameters.")
    private String volumeRequest;
    /**
     * Volume
     * <p>
     * An identifiable, logical unit of data storage tied to a physical device.
     * 
     */
    @JsonProperty("volume")
    @JsonPropertyDescription("An identifiable, logical unit of data storage tied to a physical device.")
    private Volume volume;
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
     * (Required)
     * 
     */
    @JsonProperty("bom-ref")
    public String getBomRef() {
        return bomRef;
    }

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * (Required)
     * 
     */
    @JsonProperty("bom-ref")
    public void setBomRef(String bomRef) {
        this.bomRef = bomRef;
    }

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the resource instance within its deployment context.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the resource instance within its deployment context.
     * (Required)
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Name
     * <p>
     * The name of the resource instance.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the resource instance.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Aliases
     * <p>
     * The names for the workspace as referenced by other workflow tasks. Effectively, a name mapping so other tasks can use their own local name in their steps.
     * 
     */
    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Aliases
     * <p>
     * The names for the workspace as referenced by other workflow tasks. Effectively, a name mapping so other tasks can use their own local name in their steps.
     * 
     */
    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * Description
     * <p>
     * A description of the resource instance.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the resource instance.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Resource references
     * <p>
     * References to component or service resources that are used to realize the resource instance.
     * 
     */
    @JsonProperty("resourceReferences")
    public Set<ResourceReferenceChoice> getResourceReferences() {
        return resourceReferences;
    }

    /**
     * Resource references
     * <p>
     * References to component or service resources that are used to realize the resource instance.
     * 
     */
    @JsonProperty("resourceReferences")
    public void setResourceReferences(Set<ResourceReferenceChoice> resourceReferences) {
        this.resourceReferences = resourceReferences;
    }

    /**
     * Access mode
     * <p>
     * Describes the read-write access control for the workspace relative to the owning resource instance.
     * 
     */
    @JsonProperty("accessMode")
    public Workspace.AccessMode getAccessMode() {
        return accessMode;
    }

    /**
     * Access mode
     * <p>
     * Describes the read-write access control for the workspace relative to the owning resource instance.
     * 
     */
    @JsonProperty("accessMode")
    public void setAccessMode(Workspace.AccessMode accessMode) {
        this.accessMode = accessMode;
    }

    /**
     * Mount path
     * <p>
     * A path to a location on disk where the workspace will be available to the associated task's steps.
     * 
     */
    @JsonProperty("mountPath")
    public String getMountPath() {
        return mountPath;
    }

    /**
     * Mount path
     * <p>
     * A path to a location on disk where the workspace will be available to the associated task's steps.
     * 
     */
    @JsonProperty("mountPath")
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * Managed data type
     * <p>
     * The name of a domain-specific data type the workspace represents.This property is for CI/CD frameworks that are able to provide access to structured, managed data at a more granular level than a filesystem.
     * 
     */
    @JsonProperty("managedDataType")
    public String getManagedDataType() {
        return managedDataType;
    }

    /**
     * Managed data type
     * <p>
     * The name of a domain-specific data type the workspace represents.This property is for CI/CD frameworks that are able to provide access to structured, managed data at a more granular level than a filesystem.
     * 
     */
    @JsonProperty("managedDataType")
    public void setManagedDataType(String managedDataType) {
        this.managedDataType = managedDataType;
    }

    /**
     * Volume request
     * <p>
     * Identifies the reference to the request for a specific volume type and parameters.
     * 
     */
    @JsonProperty("volumeRequest")
    public String getVolumeRequest() {
        return volumeRequest;
    }

    /**
     * Volume request
     * <p>
     * Identifies the reference to the request for a specific volume type and parameters.
     * 
     */
    @JsonProperty("volumeRequest")
    public void setVolumeRequest(String volumeRequest) {
        this.volumeRequest = volumeRequest;
    }

    /**
     * Volume
     * <p>
     * An identifiable, logical unit of data storage tied to a physical device.
     * 
     */
    @JsonProperty("volume")
    public Volume getVolume() {
        return volume;
    }

    /**
     * Volume
     * <p>
     * An identifiable, logical unit of data storage tied to a physical device.
     * 
     */
    @JsonProperty("volume")
    public void setVolume(Volume volume) {
        this.volume = volume;
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
        sb.append(Workspace.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("aliases");
        sb.append('=');
        sb.append(((this.aliases == null)?"<null>":this.aliases));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("resourceReferences");
        sb.append('=');
        sb.append(((this.resourceReferences == null)?"<null>":this.resourceReferences));
        sb.append(',');
        sb.append("accessMode");
        sb.append('=');
        sb.append(((this.accessMode == null)?"<null>":this.accessMode));
        sb.append(',');
        sb.append("mountPath");
        sb.append('=');
        sb.append(((this.mountPath == null)?"<null>":this.mountPath));
        sb.append(',');
        sb.append("managedDataType");
        sb.append('=');
        sb.append(((this.managedDataType == null)?"<null>":this.managedDataType));
        sb.append(',');
        sb.append("volumeRequest");
        sb.append('=');
        sb.append(((this.volumeRequest == null)?"<null>":this.volumeRequest));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
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
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.resourceReferences == null)? 0 :this.resourceReferences.hashCode()));
        result = ((result* 31)+((this.mountPath == null)? 0 :this.mountPath.hashCode()));
        result = ((result* 31)+((this.aliases == null)? 0 :this.aliases.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.managedDataType == null)? 0 :this.managedDataType.hashCode()));
        result = ((result* 31)+((this.accessMode == null)? 0 :this.accessMode.hashCode()));
        result = ((result* 31)+((this.volumeRequest == null)? 0 :this.volumeRequest.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace) == false) {
            return false;
        }
        Workspace rhs = ((Workspace) other);
        return (((((((((((((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume)))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.resourceReferences == rhs.resourceReferences)||((this.resourceReferences!= null)&&this.resourceReferences.equals(rhs.resourceReferences))))&&((this.mountPath == rhs.mountPath)||((this.mountPath!= null)&&this.mountPath.equals(rhs.mountPath))))&&((this.aliases == rhs.aliases)||((this.aliases!= null)&&this.aliases.equals(rhs.aliases))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.managedDataType == rhs.managedDataType)||((this.managedDataType!= null)&&this.managedDataType.equals(rhs.managedDataType))))&&((this.accessMode == rhs.accessMode)||((this.accessMode!= null)&&this.accessMode.equals(rhs.accessMode))))&&((this.volumeRequest == rhs.volumeRequest)||((this.volumeRequest!= null)&&this.volumeRequest.equals(rhs.volumeRequest))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }


    /**
     * Access mode
     * <p>
     * Describes the read-write access control for the workspace relative to the owning resource instance.
     * 
     */
    public enum AccessMode {

        READ_ONLY("read-only"),
        READ_WRITE("read-write"),
        READ_WRITE_ONCE("read-write-once"),
        WRITE_ONCE("write-once"),
        WRITE_ONLY("write-only");
        private final String value;
        private final static Map<String, Workspace.AccessMode> CONSTANTS = new HashMap<String, Workspace.AccessMode>();

        static {
            for (Workspace.AccessMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AccessMode(String value) {
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
        public static Workspace.AccessMode fromValue(String value) {
            Workspace.AccessMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
