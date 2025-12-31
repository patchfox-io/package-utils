
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
    "type",
    "matcher",
    "searchedBy",
    "found"
})
@Generated("jsonschema2pojo")
public class MatchDetail {

    @JsonProperty("type")
    private String type;
    @JsonProperty("matcher")
    private String matcher;
    @JsonProperty("searchedBy")
    private SearchedBy searchedBy;
    @JsonProperty("found")
    private Found found;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MatchDetail() {
    }

    /**
     * 
     * @param searchedBy
     * @param found
     * @param type
     * @param matcher
     */
    public MatchDetail(String type, String matcher, SearchedBy searchedBy, Found found) {
        super();
        this.type = type;
        this.matcher = matcher;
        this.searchedBy = searchedBy;
        this.found = found;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("matcher")
    public String getMatcher() {
        return matcher;
    }

    @JsonProperty("matcher")
    public void setMatcher(String matcher) {
        this.matcher = matcher;
    }

    @JsonProperty("searchedBy")
    public SearchedBy getSearchedBy() {
        return searchedBy;
    }

    @JsonProperty("searchedBy")
    public void setSearchedBy(SearchedBy searchedBy) {
        this.searchedBy = searchedBy;
    }

    @JsonProperty("found")
    public Found getFound() {
        return found;
    }

    @JsonProperty("found")
    public void setFound(Found found) {
        this.found = found;
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
        sb.append(MatchDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("matcher");
        sb.append('=');
        sb.append(((this.matcher == null)?"<null>":this.matcher));
        sb.append(',');
        sb.append("searchedBy");
        sb.append('=');
        sb.append(((this.searchedBy == null)?"<null>":this.searchedBy));
        sb.append(',');
        sb.append("found");
        sb.append('=');
        sb.append(((this.found == null)?"<null>":this.found));
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
