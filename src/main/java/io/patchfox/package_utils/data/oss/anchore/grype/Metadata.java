
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
    "virtualPath",
    "pomArtifactID",
    "pomGroupID",
    "manifestName",
    "archiveDigests"
})
@Generated("jsonschema2pojo")
public class Metadata {

    @JsonProperty("virtualPath")
    private String virtualPath;
    @JsonProperty("pomArtifactID")
    private String pomArtifactID;
    @JsonProperty("pomGroupID")
    private String pomGroupID;
    @JsonProperty("manifestName")
    private String manifestName;
    @JsonProperty("archiveDigests")
    private Object archiveDigests;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param virtualPath
     * @param archiveDigests
     * @param manifestName
     * @param pomArtifactID
     * @param pomGroupID
     */
    public Metadata(String virtualPath, String pomArtifactID, String pomGroupID, String manifestName, Object archiveDigests) {
        super();
        this.virtualPath = virtualPath;
        this.pomArtifactID = pomArtifactID;
        this.pomGroupID = pomGroupID;
        this.manifestName = manifestName;
        this.archiveDigests = archiveDigests;
    }

    @JsonProperty("virtualPath")
    public String getVirtualPath() {
        return virtualPath;
    }

    @JsonProperty("virtualPath")
    public void setVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
    }

    @JsonProperty("pomArtifactID")
    public String getPomArtifactID() {
        return pomArtifactID;
    }

    @JsonProperty("pomArtifactID")
    public void setPomArtifactID(String pomArtifactID) {
        this.pomArtifactID = pomArtifactID;
    }

    @JsonProperty("pomGroupID")
    public String getPomGroupID() {
        return pomGroupID;
    }

    @JsonProperty("pomGroupID")
    public void setPomGroupID(String pomGroupID) {
        this.pomGroupID = pomGroupID;
    }

    @JsonProperty("manifestName")
    public String getManifestName() {
        return manifestName;
    }

    @JsonProperty("manifestName")
    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    @JsonProperty("archiveDigests")
    public Object getArchiveDigests() {
        return archiveDigests;
    }

    @JsonProperty("archiveDigests")
    public void setArchiveDigests(Object archiveDigests) {
        this.archiveDigests = archiveDigests;
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
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("virtualPath");
        sb.append('=');
        sb.append(((this.virtualPath == null)?"<null>":this.virtualPath));
        sb.append(',');
        sb.append("pomArtifactID");
        sb.append('=');
        sb.append(((this.pomArtifactID == null)?"<null>":this.pomArtifactID));
        sb.append(',');
        sb.append("pomGroupID");
        sb.append('=');
        sb.append(((this.pomGroupID == null)?"<null>":this.pomGroupID));
        sb.append(',');
        sb.append("manifestName");
        sb.append('=');
        sb.append(((this.manifestName == null)?"<null>":this.manifestName));
        sb.append(',');
        sb.append("archiveDigests");
        sb.append('=');
        sb.append(((this.archiveDigests == null)?"<null>":this.archiveDigests));
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
