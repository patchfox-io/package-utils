
package io.patchfox.package_utils.data.oss.anchore.grype;

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
    "id",
    "name",
    "version",
    "type",
    "locations",
    "language",
    "licenses",
    "cpes",
    "purl",
    "upstreams",
    "metadataType",
    "metadata"
})
@Generated("jsonschema2pojo")
public class Artifact {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("version")
    private String version;
    @JsonProperty("type")
    private String type;
    @JsonProperty("locations")
    private List<Location> locations;
    @JsonProperty("language")
    private String language;
    @JsonProperty("licenses")
    private List<Object> licenses;
    @JsonProperty("cpes")
    private List<String> cpes;
    @JsonProperty("purl")
    private String purl;
    @JsonProperty("upstreams")
    private List<Object> upstreams;
    @JsonProperty("metadataType")
    private String metadataType;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artifact() {
    }

    /**
     * 
     * @param licenses
     * @param metadata
     * @param cpes
     * @param upstreams
     * @param name
     * @param locations
     * @param language
     * @param id
     * @param purl
     * @param type
     * @param version
     * @param metadataType
     */
    public Artifact(String id, String name, String version, String type, List<Location> locations, String language, List<Object> licenses, List<String> cpes, String purl, List<Object> upstreams, String metadataType, Metadata metadata) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.type = type;
        this.locations = locations;
        this.language = language;
        this.licenses = licenses;
        this.cpes = cpes;
        this.purl = purl;
        this.upstreams = upstreams;
        this.metadataType = metadataType;
        this.metadata = metadata;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("licenses")
    public List<Object> getLicenses() {
        return licenses;
    }

    @JsonProperty("licenses")
    public void setLicenses(List<Object> licenses) {
        this.licenses = licenses;
    }

    @JsonProperty("cpes")
    public List<String> getCpes() {
        return cpes;
    }

    @JsonProperty("cpes")
    public void setCpes(List<String> cpes) {
        this.cpes = cpes;
    }

    @JsonProperty("purl")
    public String getPurl() {
        return purl;
    }

    @JsonProperty("purl")
    public void setPurl(String purl) {
        this.purl = purl;
    }

    @JsonProperty("upstreams")
    public List<Object> getUpstreams() {
        return upstreams;
    }

    @JsonProperty("upstreams")
    public void setUpstreams(List<Object> upstreams) {
        this.upstreams = upstreams;
    }

    @JsonProperty("metadataType")
    public String getMetadataType() {
        return metadataType;
    }

    @JsonProperty("metadataType")
    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
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
        sb.append(Artifact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("licenses");
        sb.append('=');
        sb.append(((this.licenses == null)?"<null>":this.licenses));
        sb.append(',');
        sb.append("cpes");
        sb.append('=');
        sb.append(((this.cpes == null)?"<null>":this.cpes));
        sb.append(',');
        sb.append("purl");
        sb.append('=');
        sb.append(((this.purl == null)?"<null>":this.purl));
        sb.append(',');
        sb.append("upstreams");
        sb.append('=');
        sb.append(((this.upstreams == null)?"<null>":this.upstreams));
        sb.append(',');
        sb.append("metadataType");
        sb.append('=');
        sb.append(((this.metadataType == null)?"<null>":this.metadataType));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
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
