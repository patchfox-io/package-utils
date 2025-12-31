package io.patchfox.package_utils.data.pkg.java;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "group_id",
        "artifact_id",
        "version",
        "artifact_type",
        "notes"
})
public class Artifact {
    private static final Logger LOG = LoggerFactory.getLogger(Artifact.class);

    @JsonProperty("group_id")
    String groupId;

    @JsonProperty("artifact_id")
    String artifactId;

    @JsonProperty("version")
    Version version;

    @JsonProperty("artifact_type")
    String artifactType;

    @JsonProperty("scope")
    String scope;

    @JsonProperty("notes")
    String notes;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    // group_id
    @JsonProperty("group_id")
    public String getGroupId() { return groupId; }

    @JsonProperty("group_id")
    public void setGroupId(String groupId) { this.groupId = groupId; }

    @JsonProperty("group_id")
    public Artifact withGroupId(String groupId) {
        this.setGroupId(groupId);
        return this;
    }


    // artifact_id
    @JsonProperty("artifact_id")
    public String getArtifactId() { return artifactId; }

    @JsonProperty("artifact_id")
    public void setArtifactId(String artifactId) { this.artifactId = artifactId; }

    @JsonProperty("artifact_id")
    public Artifact withArtifactId(String artifactId) {
        this.setArtifactId(artifactId);
        return this;
    }


    // version
    @JsonProperty("version")
    public Version getVersion() { return version; }

    @JsonProperty("version")
    public void setVersion(Version version) { this.version = version; }

    @JsonProperty("version")
    public Artifact withVersion(Version version) {
        this.setVersion(version);
        return this;
    }


    // artifact_type
    @JsonProperty("artifact_type")
    public String getArtifactType() { return artifactType; }

    @JsonProperty("artifact_type")
    public void setArtifactType(String artifactType) { this.artifactType = artifactType; }

    @JsonProperty("artifact_type")
    public Artifact withArtifactType(String artifactType) {
        this.setArtifactType(artifactType);
        return this;
    }


    // scope
    @JsonProperty("scope")
    public String getScope() { return scope; }

    @JsonProperty("scope")
    public void setScope(String scope) { this.scope = scope; }

    @JsonProperty("scope")
    public Artifact withScope(String scope) {
        this.setScope(scope);
        return this;
    }


    // notes
    @JsonProperty("notes")
    public String getNotes() { return notes; }

    @JsonProperty("notes")
    public void setNotes(String notes) { this.notes = notes; }

    @JsonProperty("notes")
    public Artifact withNotes(String notes) {
        this.setNotes(notes);
        return this;
    }


    // additional properties
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Artifact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


    public String getArtifactStringNoVersion() {
        return new StringBuilder().append(getGroupId())
                                  .append("/")
                                  .append(getArtifactId())
                                  .toString();
    }


    //
    //
    //
    // TODO - REMOVE THIS METHOD AND REPLACE WITH CALL TO SUPERCLASS
    //
    //
    public String getArtifactString() {
        return new StringBuilder().append(getGroupId())
                                  .append("/")
                                  .append(getArtifactId())
                                  //.append("/")
                                  .append("@")
                                  .append(getVersion().getVersion())
                                  .toString();
    }


    public boolean isSameArtifactAs(Artifact otherArtifact) {
        return getGroupId().equals(otherArtifact.getGroupId())
                && getArtifactId().equals(otherArtifact.getArtifactId())
                && getVersion().getVersion().equals(otherArtifact.getVersion().getVersion());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artifact artifact = (Artifact) o;
        return artifact.isSameArtifactAs(this);
//        return getGroupId().equals(artifact.getGroupId())
//                && getArtifactId().equals(artifact.getArtifactId())
//                && getVersion().equals(artifact.getVersion())
//                && getArtifactType().equals(artifact.getArtifactType())
//                && getScope().equals(artifact.getScope())
//                && getNotes().equals(artifact.getNotes())
//                && getAdditionalProperties().equals(artifact.getAdditionalProperties());

    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getGroupId(),
                getArtifactId(),
                getVersion()
//                getArtifactType(),
//                getScope(),
//                getNotes(),
//                getAdditionalProperties()
        );
    }
}
