
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
    "scope",
    "unindexed-archives",
    "indexed-archives"
})
@Generated("jsonschema2pojo")
public class Search {

    @JsonProperty("scope")
    private String scope;
    @JsonProperty("unindexed-archives")
    private Boolean unindexedArchives;
    @JsonProperty("indexed-archives")
    private Boolean indexedArchives;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Search() {
    }

    /**
     * 
     * @param indexedArchives
     * @param scope
     * @param unindexedArchives
     */
    public Search(String scope, Boolean unindexedArchives, Boolean indexedArchives) {
        super();
        this.scope = scope;
        this.unindexedArchives = unindexedArchives;
        this.indexedArchives = indexedArchives;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("unindexed-archives")
    public Boolean getUnindexedArchives() {
        return unindexedArchives;
    }

    @JsonProperty("unindexed-archives")
    public void setUnindexedArchives(Boolean unindexedArchives) {
        this.unindexedArchives = unindexedArchives;
    }

    @JsonProperty("indexed-archives")
    public Boolean getIndexedArchives() {
        return indexedArchives;
    }

    @JsonProperty("indexed-archives")
    public void setIndexedArchives(Boolean indexedArchives) {
        this.indexedArchives = indexedArchives;
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
        sb.append(Search.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("unindexedArchives");
        sb.append('=');
        sb.append(((this.unindexedArchives == null)?"<null>":this.unindexedArchives));
        sb.append(',');
        sb.append("indexedArchives");
        sb.append('=');
        sb.append(((this.indexedArchives == null)?"<null>":this.indexedArchives));
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
