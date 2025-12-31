package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SWID Tag
 * <p>
 * Specifies metadata and content for ISO-IEC 19770-2 Software Identification (SWID) Tags.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tagId",
    "name",
    "version",
    "tagVersion",
    "patch",
    "text",
    "url"
})
public class Swid {

    /**
     * Tag ID
     * <p>
     * Maps to the tagId of a SoftwareIdentity.
     * (Required)
     * 
     */
    @JsonProperty("tagId")
    @JsonPropertyDescription("Maps to the tagId of a SoftwareIdentity.")
    private String tagId;
    /**
     * Name
     * <p>
     * Maps to the name of a SoftwareIdentity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Maps to the name of a SoftwareIdentity.")
    private String name;
    /**
     * Version
     * <p>
     * Maps to the version of a SoftwareIdentity.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Maps to the version of a SoftwareIdentity.")
    private String version = "0.0";
    /**
     * Tag Version
     * <p>
     * Maps to the tagVersion of a SoftwareIdentity.
     * 
     */
    @JsonProperty("tagVersion")
    @JsonPropertyDescription("Maps to the tagVersion of a SoftwareIdentity.")
    private Integer tagVersion = 0;
    /**
     * Patch
     * <p>
     * Maps to the patch of a SoftwareIdentity.
     * 
     */
    @JsonProperty("patch")
    @JsonPropertyDescription("Maps to the patch of a SoftwareIdentity.")
    private Boolean patch = false;
    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Specifies the metadata and content for an attachment.")
    private Attachment text;
    /**
     * URL
     * <p>
     * The URL to the SWID file.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL to the SWID file.")
    private String url;

    /**
     * Tag ID
     * <p>
     * Maps to the tagId of a SoftwareIdentity.
     * (Required)
     * 
     */
    @JsonProperty("tagId")
    public String getTagId() {
        return tagId;
    }

    /**
     * Tag ID
     * <p>
     * Maps to the tagId of a SoftwareIdentity.
     * (Required)
     * 
     */
    @JsonProperty("tagId")
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    /**
     * Name
     * <p>
     * Maps to the name of a SoftwareIdentity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Maps to the name of a SoftwareIdentity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Version
     * <p>
     * Maps to the version of a SoftwareIdentity.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Version
     * <p>
     * Maps to the version of a SoftwareIdentity.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Tag Version
     * <p>
     * Maps to the tagVersion of a SoftwareIdentity.
     * 
     */
    @JsonProperty("tagVersion")
    public Integer getTagVersion() {
        return tagVersion;
    }

    /**
     * Tag Version
     * <p>
     * Maps to the tagVersion of a SoftwareIdentity.
     * 
     */
    @JsonProperty("tagVersion")
    public void setTagVersion(Integer tagVersion) {
        this.tagVersion = tagVersion;
    }

    /**
     * Patch
     * <p>
     * Maps to the patch of a SoftwareIdentity.
     * 
     */
    @JsonProperty("patch")
    public Boolean getPatch() {
        return patch;
    }

    /**
     * Patch
     * <p>
     * Maps to the patch of a SoftwareIdentity.
     * 
     */
    @JsonProperty("patch")
    public void setPatch(Boolean patch) {
        this.patch = patch;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("text")
    public Attachment getText() {
        return text;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("text")
    public void setText(Attachment text) {
        this.text = text;
    }

    /**
     * URL
     * <p>
     * The URL to the SWID file.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * The URL to the SWID file.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Swid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tagId");
        sb.append('=');
        sb.append(((this.tagId == null)?"<null>":this.tagId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("tagVersion");
        sb.append('=');
        sb.append(((this.tagVersion == null)?"<null>":this.tagVersion));
        sb.append(',');
        sb.append("patch");
        sb.append('=');
        sb.append(((this.patch == null)?"<null>":this.patch));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.patch == null)? 0 :this.patch.hashCode()));
        result = ((result* 31)+((this.tagVersion == null)? 0 :this.tagVersion.hashCode()));
        result = ((result* 31)+((this.tagId == null)? 0 :this.tagId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Swid) == false) {
            return false;
        }
        Swid rhs = ((Swid) other);
        return ((((((((this.patch == rhs.patch)||((this.patch!= null)&&this.patch.equals(rhs.patch)))&&((this.tagVersion == rhs.tagVersion)||((this.tagVersion!= null)&&this.tagVersion.equals(rhs.tagVersion))))&&((this.tagId == rhs.tagId)||((this.tagId!= null)&&this.tagId.equals(rhs.tagId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
