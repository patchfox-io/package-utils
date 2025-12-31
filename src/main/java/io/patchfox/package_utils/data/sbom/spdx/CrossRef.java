
package io.patchfox.package_utils.data.sbom.spdx;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Cross reference details for the a URL reference
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isLive",
    "isValid",
    "isWayBackLink",
    "match",
    "order",
    "timestamp",
    "url"
})
@Generated("jsonschema2pojo")
public class CrossRef {

    /**
     * Indicate a URL is still a live accessible location on the public internet
     * 
     */
    @JsonProperty("isLive")
    @JsonPropertyDescription("Indicate a URL is still a live accessible location on the public internet")
    private Boolean isLive;
    /**
     * True if the URL is a valid well formed URL
     * 
     */
    @JsonProperty("isValid")
    @JsonPropertyDescription("True if the URL is a valid well formed URL")
    private Boolean isValid;
    /**
     * True if the License SeeAlso URL points to a Wayback archive
     * 
     */
    @JsonProperty("isWayBackLink")
    @JsonPropertyDescription("True if the License SeeAlso URL points to a Wayback archive")
    private Boolean isWayBackLink;
    /**
     * Status of a License List SeeAlso URL reference if it refers to a website that matches the license text.
     * 
     */
    @JsonProperty("match")
    @JsonPropertyDescription("Status of a License List SeeAlso URL reference if it refers to a website that matches the license text.")
    private String match;
    /**
     * The ordinal order of this element within a list
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("The ordinal order of this element within a list")
    private Integer order;
    /**
     * Timestamp
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp")
    private String timestamp;
    /**
     * URL Reference
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("URL Reference")
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CrossRef() {
    }

    /**
     * 
     * @param isLive
     * @param isValid
     * @param isWayBackLink
     * @param match
     * @param url
     * @param order
     * @param timestamp
     */
    public CrossRef(Boolean isLive, Boolean isValid, Boolean isWayBackLink, String match, Integer order, String timestamp, String url) {
        super();
        this.isLive = isLive;
        this.isValid = isValid;
        this.isWayBackLink = isWayBackLink;
        this.match = match;
        this.order = order;
        this.timestamp = timestamp;
        this.url = url;
    }

    /**
     * Indicate a URL is still a live accessible location on the public internet
     * 
     */
    @JsonProperty("isLive")
    public Boolean getIsLive() {
        return isLive;
    }

    /**
     * Indicate a URL is still a live accessible location on the public internet
     * 
     */
    @JsonProperty("isLive")
    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    /**
     * True if the URL is a valid well formed URL
     * 
     */
    @JsonProperty("isValid")
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * True if the URL is a valid well formed URL
     * 
     */
    @JsonProperty("isValid")
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * True if the License SeeAlso URL points to a Wayback archive
     * 
     */
    @JsonProperty("isWayBackLink")
    public Boolean getIsWayBackLink() {
        return isWayBackLink;
    }

    /**
     * True if the License SeeAlso URL points to a Wayback archive
     * 
     */
    @JsonProperty("isWayBackLink")
    public void setIsWayBackLink(Boolean isWayBackLink) {
        this.isWayBackLink = isWayBackLink;
    }

    /**
     * Status of a License List SeeAlso URL reference if it refers to a website that matches the license text.
     * 
     */
    @JsonProperty("match")
    public String getMatch() {
        return match;
    }

    /**
     * Status of a License List SeeAlso URL reference if it refers to a website that matches the license text.
     * 
     */
    @JsonProperty("match")
    public void setMatch(String match) {
        this.match = match;
    }

    /**
     * The ordinal order of this element within a list
     * 
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * The ordinal order of this element within a list
     * 
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Timestamp
     * 
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * URL Reference
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL Reference
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
        sb.append(CrossRef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isLive");
        sb.append('=');
        sb.append(((this.isLive == null)?"<null>":this.isLive));
        sb.append(',');
        sb.append("isValid");
        sb.append('=');
        sb.append(((this.isValid == null)?"<null>":this.isValid));
        sb.append(',');
        sb.append("isWayBackLink");
        sb.append('=');
        sb.append(((this.isWayBackLink == null)?"<null>":this.isWayBackLink));
        sb.append(',');
        sb.append("match");
        sb.append('=');
        sb.append(((this.match == null)?"<null>":this.match));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.isLive == null)? 0 :this.isLive.hashCode()));
        result = ((result* 31)+((this.isValid == null)? 0 :this.isValid.hashCode()));
        result = ((result* 31)+((this.isWayBackLink == null)? 0 :this.isWayBackLink.hashCode()));
        result = ((result* 31)+((this.match == null)? 0 :this.match.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossRef) == false) {
            return false;
        }
        CrossRef rhs = ((CrossRef) other);
        return ((((((((this.isLive == rhs.isLive)||((this.isLive!= null)&&this.isLive.equals(rhs.isLive)))&&((this.isValid == rhs.isValid)||((this.isValid!= null)&&this.isValid.equals(rhs.isValid))))&&((this.isWayBackLink == rhs.isWayBackLink)||((this.isWayBackLink!= null)&&this.isWayBackLink.equals(rhs.isWayBackLink))))&&((this.match == rhs.match)||((this.match!= null)&&this.match.equals(rhs.match))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
