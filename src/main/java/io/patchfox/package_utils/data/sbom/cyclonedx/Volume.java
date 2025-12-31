package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Volume
 * <p>
 * An identifiable, logical unit of data storage tied to a physical device.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uid",
    "name",
    "mode",
    "path",
    "sizeAllocated",
    "persistent",
    "remote",
    "properties"
})
public class Volume {

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the volume instance within its deployment context.
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("The unique identifier for the volume instance within its deployment context.")
    private String uid;
    /**
     * Name
     * <p>
     * The name of the volume instance
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the volume instance")
    private String name;
    /**
     * Mode
     * <p>
     * The mode for the volume instance.
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("The mode for the volume instance.")
    private Volume.Mode mode = Volume.Mode.fromValue("filesystem");
    /**
     * Path
     * <p>
     * The underlying path created from the actual volume.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("The underlying path created from the actual volume.")
    private String path;
    /**
     * Size allocated
     * <p>
     * The allocated size of the volume accessible to the associated workspace. This should include the scalar size as well as IEC standard unit in either decimal or binary form.
     * 
     */
    @JsonProperty("sizeAllocated")
    @JsonPropertyDescription("The allocated size of the volume accessible to the associated workspace. This should include the scalar size as well as IEC standard unit in either decimal or binary form.")
    private String sizeAllocated;
    /**
     * Persistent
     * <p>
     * Indicates if the volume persists beyond the life of the resource it is associated with.
     * 
     */
    @JsonProperty("persistent")
    @JsonPropertyDescription("Indicates if the volume persists beyond the life of the resource it is associated with.")
    private Boolean persistent;
    /**
     * Remote
     * <p>
     * Indicates if the volume is remotely (i.e., network) attached.
     * 
     */
    @JsonProperty("remote")
    @JsonPropertyDescription("Indicates if the volume is remotely (i.e., network) attached.")
    private Boolean remote;
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the volume instance within its deployment context.
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier for the volume instance within its deployment context.
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Name
     * <p>
     * The name of the volume instance
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the volume instance
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mode
     * <p>
     * The mode for the volume instance.
     * 
     */
    @JsonProperty("mode")
    public Volume.Mode getMode() {
        return mode;
    }

    /**
     * Mode
     * <p>
     * The mode for the volume instance.
     * 
     */
    @JsonProperty("mode")
    public void setMode(Volume.Mode mode) {
        this.mode = mode;
    }

    /**
     * Path
     * <p>
     * The underlying path created from the actual volume.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Path
     * <p>
     * The underlying path created from the actual volume.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Size allocated
     * <p>
     * The allocated size of the volume accessible to the associated workspace. This should include the scalar size as well as IEC standard unit in either decimal or binary form.
     * 
     */
    @JsonProperty("sizeAllocated")
    public String getSizeAllocated() {
        return sizeAllocated;
    }

    /**
     * Size allocated
     * <p>
     * The allocated size of the volume accessible to the associated workspace. This should include the scalar size as well as IEC standard unit in either decimal or binary form.
     * 
     */
    @JsonProperty("sizeAllocated")
    public void setSizeAllocated(String sizeAllocated) {
        this.sizeAllocated = sizeAllocated;
    }

    /**
     * Persistent
     * <p>
     * Indicates if the volume persists beyond the life of the resource it is associated with.
     * 
     */
    @JsonProperty("persistent")
    public Boolean getPersistent() {
        return persistent;
    }

    /**
     * Persistent
     * <p>
     * Indicates if the volume persists beyond the life of the resource it is associated with.
     * 
     */
    @JsonProperty("persistent")
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * Remote
     * <p>
     * Indicates if the volume is remotely (i.e., network) attached.
     * 
     */
    @JsonProperty("remote")
    public Boolean getRemote() {
        return remote;
    }

    /**
     * Remote
     * <p>
     * Indicates if the volume is remotely (i.e., network) attached.
     * 
     */
    @JsonProperty("remote")
    public void setRemote(Boolean remote) {
        this.remote = remote;
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
        sb.append(Volume.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("sizeAllocated");
        sb.append('=');
        sb.append(((this.sizeAllocated == null)?"<null>":this.sizeAllocated));
        sb.append(',');
        sb.append("persistent");
        sb.append('=');
        sb.append(((this.persistent == null)?"<null>":this.persistent));
        sb.append(',');
        sb.append("remote");
        sb.append('=');
        sb.append(((this.remote == null)?"<null>":this.remote));
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
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.sizeAllocated == null)? 0 :this.sizeAllocated.hashCode()));
        result = ((result* 31)+((this.persistent == null)? 0 :this.persistent.hashCode()));
        result = ((result* 31)+((this.remote == null)? 0 :this.remote.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Volume) == false) {
            return false;
        }
        Volume rhs = ((Volume) other);
        return (((((((((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode)))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.sizeAllocated == rhs.sizeAllocated)||((this.sizeAllocated!= null)&&this.sizeAllocated.equals(rhs.sizeAllocated))))&&((this.persistent == rhs.persistent)||((this.persistent!= null)&&this.persistent.equals(rhs.persistent))))&&((this.remote == rhs.remote)||((this.remote!= null)&&this.remote.equals(rhs.remote))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }


    /**
     * Mode
     * <p>
     * The mode for the volume instance.
     * 
     */
    public enum Mode {

        FILESYSTEM("filesystem"),
        BLOCK("block");
        private final String value;
        private final static Map<String, Volume.Mode> CONSTANTS = new HashMap<String, Volume.Mode>();

        static {
            for (Volume.Mode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Mode(String value) {
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
        public static Volume.Mode fromValue(String value) {
            Volume.Mode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
