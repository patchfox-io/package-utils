package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Release notes
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "title",
    "featuredImage",
    "socialImage",
    "description",
    "timestamp",
    "aliases",
    "tags",
    "resolves",
    "notes",
    "properties"
})
public class ReleaseNotes {

    /**
     * The software versioning type. It is RECOMMENDED that the release type use one of 'major', 'minor', 'patch', 'pre-release', or 'internal'. Representing all possible software release types is not practical, so standardizing on the recommended values, whenever possible, is strongly encouraged.
     * 
     * * __major__ = A major release may contain significant changes or may introduce breaking changes.
     * * __minor__ = A minor release, also known as an update, may contain a smaller number of changes than major releases.
     * * __patch__ = Patch releases are typically unplanned and may resolve defects or important security issues.
     * * __pre-release__ = A pre-release may include alpha, beta, or release candidates and typically have limited support. They provide the ability to preview a release prior to its general availability.
     * * __internal__ = Internal releases are not for public consumption and are intended to be used exclusively by the project or manufacturer that produced it.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The software versioning type. It is RECOMMENDED that the release type use one of 'major', 'minor', 'patch', 'pre-release', or 'internal'. Representing all possible software release types is not practical, so standardizing on the recommended values, whenever possible, is strongly encouraged.\n\n* __major__ = A major release may contain significant changes or may introduce breaking changes.\n* __minor__ = A minor release, also known as an update, may contain a smaller number of changes than major releases.\n* __patch__ = Patch releases are typically unplanned and may resolve defects or important security issues.\n* __pre-release__ = A pre-release may include alpha, beta, or release candidates and typically have limited support. They provide the ability to preview a release prior to its general availability.\n* __internal__ = Internal releases are not for public consumption and are intended to be used exclusively by the project or manufacturer that produced it.")
    private String type;
    /**
     * Title
     * <p>
     * The title of the release.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the release.")
    private String title;
    /**
     * Featured image
     * <p>
     * The URL to an image that may be prominently displayed with the release note.
     * 
     */
    @JsonProperty("featuredImage")
    @JsonPropertyDescription("The URL to an image that may be prominently displayed with the release note.")
    private String featuredImage;
    /**
     * Social image
     * <p>
     * The URL to an image that may be used in messaging on social media platforms.
     * 
     */
    @JsonProperty("socialImage")
    @JsonPropertyDescription("The URL to an image that may be used in messaging on social media platforms.")
    private String socialImage;
    /**
     * Description
     * <p>
     * A short description of the release.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A short description of the release.")
    private String description;
    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the release note was created.
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("The date and time (timestamp) when the release note was created.")
    private Date timestamp;
    /**
     * Aliases
     * <p>
     * One or more alternate names the release may be referred to. This may include unofficial terms used by development and marketing teams (e.g. code names).
     * 
     */
    @JsonProperty("aliases")
    @JsonPropertyDescription("One or more alternate names the release may be referred to. This may include unofficial terms used by development and marketing teams (e.g. code names).")
    private List<String> aliases = new ArrayList<String>();
    /**
     * Tags
     * <p>
     * One or more tags that may aid in search or retrieval of the release note.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("One or more tags that may aid in search or retrieval of the release note.")
    private List<String> tags = new ArrayList<String>();
    /**
     * Resolves
     * <p>
     * A collection of issues that have been resolved.
     * 
     */
    @JsonProperty("resolves")
    @JsonPropertyDescription("A collection of issues that have been resolved.")
    private List<Issue> resolves = new ArrayList<Issue>();
    /**
     * Notes
     * <p>
     * Zero or more release notes containing the locale and content. Multiple note objects may be specified to support release notes in a wide variety of languages.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Zero or more release notes containing the locale and content. Multiple note objects may be specified to support release notes in a wide variety of languages.")
    private List<Note> notes = new ArrayList<Note>();
    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * The software versioning type. It is RECOMMENDED that the release type use one of 'major', 'minor', 'patch', 'pre-release', or 'internal'. Representing all possible software release types is not practical, so standardizing on the recommended values, whenever possible, is strongly encouraged.
     * 
     * * __major__ = A major release may contain significant changes or may introduce breaking changes.
     * * __minor__ = A minor release, also known as an update, may contain a smaller number of changes than major releases.
     * * __patch__ = Patch releases are typically unplanned and may resolve defects or important security issues.
     * * __pre-release__ = A pre-release may include alpha, beta, or release candidates and typically have limited support. They provide the ability to preview a release prior to its general availability.
     * * __internal__ = Internal releases are not for public consumption and are intended to be used exclusively by the project or manufacturer that produced it.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The software versioning type. It is RECOMMENDED that the release type use one of 'major', 'minor', 'patch', 'pre-release', or 'internal'. Representing all possible software release types is not practical, so standardizing on the recommended values, whenever possible, is strongly encouraged.
     * 
     * * __major__ = A major release may contain significant changes or may introduce breaking changes.
     * * __minor__ = A minor release, also known as an update, may contain a smaller number of changes than major releases.
     * * __patch__ = Patch releases are typically unplanned and may resolve defects or important security issues.
     * * __pre-release__ = A pre-release may include alpha, beta, or release candidates and typically have limited support. They provide the ability to preview a release prior to its general availability.
     * * __internal__ = Internal releases are not for public consumption and are intended to be used exclusively by the project or manufacturer that produced it.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Title
     * <p>
     * The title of the release.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The title of the release.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Featured image
     * <p>
     * The URL to an image that may be prominently displayed with the release note.
     * 
     */
    @JsonProperty("featuredImage")
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     * Featured image
     * <p>
     * The URL to an image that may be prominently displayed with the release note.
     * 
     */
    @JsonProperty("featuredImage")
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     * Social image
     * <p>
     * The URL to an image that may be used in messaging on social media platforms.
     * 
     */
    @JsonProperty("socialImage")
    public String getSocialImage() {
        return socialImage;
    }

    /**
     * Social image
     * <p>
     * The URL to an image that may be used in messaging on social media platforms.
     * 
     */
    @JsonProperty("socialImage")
    public void setSocialImage(String socialImage) {
        this.socialImage = socialImage;
    }

    /**
     * Description
     * <p>
     * A short description of the release.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A short description of the release.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the release note was created.
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * <p>
     * The date and time (timestamp) when the release note was created.
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Aliases
     * <p>
     * One or more alternate names the release may be referred to. This may include unofficial terms used by development and marketing teams (e.g. code names).
     * 
     */
    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Aliases
     * <p>
     * One or more alternate names the release may be referred to. This may include unofficial terms used by development and marketing teams (e.g. code names).
     * 
     */
    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * Tags
     * <p>
     * One or more tags that may aid in search or retrieval of the release note.
     * 
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * Tags
     * <p>
     * One or more tags that may aid in search or retrieval of the release note.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Resolves
     * <p>
     * A collection of issues that have been resolved.
     * 
     */
    @JsonProperty("resolves")
    public List<Issue> getResolves() {
        return resolves;
    }

    /**
     * Resolves
     * <p>
     * A collection of issues that have been resolved.
     * 
     */
    @JsonProperty("resolves")
    public void setResolves(List<Issue> resolves) {
        this.resolves = resolves;
    }

    /**
     * Notes
     * <p>
     * Zero or more release notes containing the locale and content. Multiple note objects may be specified to support release notes in a wide variety of languages.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Zero or more release notes containing the locale and content. Multiple note objects may be specified to support release notes in a wide variety of languages.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReleaseNotes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("featuredImage");
        sb.append('=');
        sb.append(((this.featuredImage == null)?"<null>":this.featuredImage));
        sb.append(',');
        sb.append("socialImage");
        sb.append('=');
        sb.append(((this.socialImage == null)?"<null>":this.socialImage));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("aliases");
        sb.append('=');
        sb.append(((this.aliases == null)?"<null>":this.aliases));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("resolves");
        sb.append('=');
        sb.append(((this.resolves == null)?"<null>":this.resolves));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
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
        result = ((result* 31)+((this.resolves == null)? 0 :this.resolves.hashCode()));
        result = ((result* 31)+((this.aliases == null)? 0 :this.aliases.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.featuredImage == null)? 0 :this.featuredImage.hashCode()));
        result = ((result* 31)+((this.socialImage == null)? 0 :this.socialImage.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReleaseNotes) == false) {
            return false;
        }
        ReleaseNotes rhs = ((ReleaseNotes) other);
        return ((((((((((((this.resolves == rhs.resolves)||((this.resolves!= null)&&this.resolves.equals(rhs.resolves)))&&((this.aliases == rhs.aliases)||((this.aliases!= null)&&this.aliases.equals(rhs.aliases))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.featuredImage == rhs.featuredImage)||((this.featuredImage!= null)&&this.featuredImage.equals(rhs.featuredImage))))&&((this.socialImage == rhs.socialImage)||((this.socialImage!= null)&&this.socialImage.equals(rhs.socialImage))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
