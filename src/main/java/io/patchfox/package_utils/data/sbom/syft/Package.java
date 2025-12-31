
package io.patchfox.package_utils.data.sbom.syft;

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
    "cataloger",
    "search-unindexed-archives",
    "search-indexed-archives"
})
@Generated("jsonschema2pojo")
public class Package {

    @JsonProperty("cataloger")
    private Cataloger cataloger;
    @JsonProperty("search-unindexed-archives")
    private Boolean searchUnindexedArchives;
    @JsonProperty("search-indexed-archives")
    private Boolean searchIndexedArchives;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Package() {
    }

    /**
     * 
     * @param cataloger
     * @param searchUnindexedArchives
     * @param searchIndexedArchives
     */
    public Package(Cataloger cataloger, Boolean searchUnindexedArchives, Boolean searchIndexedArchives) {
        super();
        this.cataloger = cataloger;
        this.searchUnindexedArchives = searchUnindexedArchives;
        this.searchIndexedArchives = searchIndexedArchives;
    }

    @JsonProperty("cataloger")
    public Cataloger getCataloger() {
        return cataloger;
    }

    @JsonProperty("cataloger")
    public void setCataloger(Cataloger cataloger) {
        this.cataloger = cataloger;
    }

    @JsonProperty("search-unindexed-archives")
    public Boolean getSearchUnindexedArchives() {
        return searchUnindexedArchives;
    }

    @JsonProperty("search-unindexed-archives")
    public void setSearchUnindexedArchives(Boolean searchUnindexedArchives) {
        this.searchUnindexedArchives = searchUnindexedArchives;
    }

    @JsonProperty("search-indexed-archives")
    public Boolean getSearchIndexedArchives() {
        return searchIndexedArchives;
    }

    @JsonProperty("search-indexed-archives")
    public void setSearchIndexedArchives(Boolean searchIndexedArchives) {
        this.searchIndexedArchives = searchIndexedArchives;
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
        sb.append(Package.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cataloger");
        sb.append('=');
        sb.append(((this.cataloger == null)?"<null>":this.cataloger));
        sb.append(',');
        sb.append("searchUnindexedArchives");
        sb.append('=');
        sb.append(((this.searchUnindexedArchives == null)?"<null>":this.searchUnindexedArchives));
        sb.append(',');
        sb.append("searchIndexedArchives");
        sb.append('=');
        sb.append(((this.searchIndexedArchives == null)?"<null>":this.searchIndexedArchives));
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
