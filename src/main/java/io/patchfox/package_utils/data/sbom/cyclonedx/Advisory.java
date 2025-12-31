package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advisory
 * <p>
 * Title and location where advisory information can be obtained. An advisory is a notification of a threat to a component, service, or system.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "url"
})
public class Advisory {

    /**
     * Title
     * <p>
     * An optional name of the advisory.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("An optional name of the advisory.")
    private String title;
    /**
     * URL
     * <p>
     * Location where the advisory can be obtained.
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("Location where the advisory can be obtained.")
    private String url;

    /**
     * Title
     * <p>
     * An optional name of the advisory.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * An optional name of the advisory.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * URL
     * <p>
     * Location where the advisory can be obtained.
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * Location where the advisory can be obtained.
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Advisory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Advisory) == false) {
            return false;
        }
        Advisory rhs = ((Advisory) other);
        return (((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
