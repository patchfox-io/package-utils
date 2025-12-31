
package io.patchfox.package_utils.data.sbom.syft;

import java.util.LinkedHashMap;
import java.util.List;
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
    "digests"
})
@Generated("jsonschema2pojo")
public class FileMetadata {

    @JsonProperty("cataloger")
    private Cataloger cataloger;
    @JsonProperty("digests")
    private List<String> digests;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileMetadata() {
    }

    /**
     * 
     * @param cataloger
     * @param digests
     */
    public FileMetadata(Cataloger cataloger, List<String> digests) {
        super();
        this.cataloger = cataloger;
        this.digests = digests;
    }

    @JsonProperty("cataloger")
    public Cataloger getCataloger() {
        return cataloger;
    }

    @JsonProperty("cataloger")
    public void setCataloger(Cataloger cataloger) {
        this.cataloger = cataloger;
    }

    @JsonProperty("digests")
    public List<String> getDigests() {
        return digests;
    }

    @JsonProperty("digests")
    public void setDigests(List<String> digests) {
        this.digests = digests;
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
        sb.append(FileMetadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cataloger");
        sb.append('=');
        sb.append(((this.cataloger == null)?"<null>":this.cataloger));
        sb.append(',');
        sb.append("digests");
        sb.append('=');
        sb.append(((this.digests == null)?"<null>":this.digests));
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
