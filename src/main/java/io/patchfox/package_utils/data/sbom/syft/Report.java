
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
    "artifacts",
    "artifactRelationships",
    "source",
    "distro",
    "descriptor",
    "schema"
})
@Generated("jsonschema2pojo")
public class Report {

    @JsonProperty("artifacts")
    private List<Artifact> artifacts;
    @JsonProperty("artifactRelationships")
    private List<ArtifactRelationship> artifactRelationships;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("distro")
    private Distro distro;
    @JsonProperty("descriptor")
    private Descriptor descriptor;
    @JsonProperty("schema")
    private Schema schema;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Report() {
    }

    /**
     * 
     * @param schema
     * @param distro
     * @param source
     * @param descriptor
     * @param artifactRelationships
     * @param artifacts
     */
    public Report(List<Artifact> artifacts, List<ArtifactRelationship> artifactRelationships, Source source, Distro distro, Descriptor descriptor, Schema schema) {
        super();
        this.artifacts = artifacts;
        this.artifactRelationships = artifactRelationships;
        this.source = source;
        this.distro = distro;
        this.descriptor = descriptor;
        this.schema = schema;
    }

    @JsonProperty("artifacts")
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    @JsonProperty("artifacts")
    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    @JsonProperty("artifactRelationships")
    public List<ArtifactRelationship> getArtifactRelationships() {
        return artifactRelationships;
    }

    @JsonProperty("artifactRelationships")
    public void setArtifactRelationships(List<ArtifactRelationship> artifactRelationships) {
        this.artifactRelationships = artifactRelationships;
    }

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    @JsonProperty("distro")
    public Distro getDistro() {
        return distro;
    }

    @JsonProperty("distro")
    public void setDistro(Distro distro) {
        this.distro = distro;
    }

    @JsonProperty("descriptor")
    public Descriptor getDescriptor() {
        return descriptor;
    }

    @JsonProperty("descriptor")
    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    @JsonProperty("schema")
    public Schema getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(Schema schema) {
        this.schema = schema;
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
        sb.append(Report.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("artifacts");
        sb.append('=');
        sb.append(((this.artifacts == null)?"<null>":this.artifacts));
        sb.append(',');
        sb.append("artifactRelationships");
        sb.append('=');
        sb.append(((this.artifactRelationships == null)?"<null>":this.artifactRelationships));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("distro");
        sb.append('=');
        sb.append(((this.distro == null)?"<null>":this.distro));
        sb.append(',');
        sb.append("descriptor");
        sb.append('=');
        sb.append(((this.descriptor == null)?"<null>":this.descriptor));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null)?"<null>":this.schema));
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
