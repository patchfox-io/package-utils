
package io.patchfox.package_utils.data.oss.anchore.grype;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "searchUpstreamBySha1",
    "baseUrl"
})
@Generated("jsonschema2pojo")
public class Maven {

    @JsonProperty("searchUpstreamBySha1")
    private Boolean searchUpstreamBySha1;
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Maven() {
    }

    /**
     * 
     * @param baseUrl
     * @param searchUpstreamBySha1
     */
    public Maven(Boolean searchUpstreamBySha1, String baseUrl) {
        super();
        this.searchUpstreamBySha1 = searchUpstreamBySha1;
        this.baseUrl = baseUrl;
    }

    @JsonProperty("searchUpstreamBySha1")
    public Boolean getSearchUpstreamBySha1() {
        return searchUpstreamBySha1;
    }

    @JsonProperty("searchUpstreamBySha1")
    public void setSearchUpstreamBySha1(Boolean searchUpstreamBySha1) {
        this.searchUpstreamBySha1 = searchUpstreamBySha1;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Maven.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("searchUpstreamBySha1");
        sb.append('=');
        sb.append(((this.searchUpstreamBySha1 == null)?"<null>":this.searchUpstreamBySha1));
        sb.append(',');
        sb.append("baseUrl");
        sb.append('=');
        sb.append(((this.baseUrl == null)?"<null>":this.baseUrl));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
