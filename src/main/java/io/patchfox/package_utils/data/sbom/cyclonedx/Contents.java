package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Data Contents
 * <p>
 * The contents or references to the contents of the data being described.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attachment",
    "url",
    "properties"
})
public class Contents {

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("attachment")
    @JsonPropertyDescription("Specifies the metadata and content for an attachment.")
    private Attachment attachment;
    /**
     * Data URL
     * <p>
     * The URL to where the data can be retrieved.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL to where the data can be retrieved.")
    private String url;
    /**
     * Configuration Properties
     * <p>
     * Provides the ability to document name-value parameters used for configuration.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Provides the ability to document name-value parameters used for configuration.")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("attachment")
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * Data URL
     * <p>
     * The URL to where the data can be retrieved.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Data URL
     * <p>
     * The URL to where the data can be retrieved.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Configuration Properties
     * <p>
     * Provides the ability to document name-value parameters used for configuration.
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Configuration Properties
     * <p>
     * Provides the ability to document name-value parameters used for configuration.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contents.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachment");
        sb.append('=');
        sb.append(((this.attachment == null)?"<null>":this.attachment));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.attachment == null)? 0 :this.attachment.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contents) == false) {
            return false;
        }
        Contents rhs = ((Contents) other);
        return ((((this.attachment == rhs.attachment)||((this.attachment!= null)&&this.attachment.equals(rhs.attachment)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
