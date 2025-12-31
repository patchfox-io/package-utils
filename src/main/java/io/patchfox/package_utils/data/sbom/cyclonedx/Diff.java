package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Diff
 * <p>
 * The patch file (or diff) that show changes. Refer to https://en.wikipedia.org/wiki/Diff
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "url"
})
public class Diff {

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
     * Specifies the URL to the diff
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("Specifies the URL to the diff")
    private String url;

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
     * Specifies the URL to the diff
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * Specifies the URL to the diff
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Diff.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Diff) == false) {
            return false;
        }
        Diff rhs = ((Diff) other);
        return (((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))));
    }

}
