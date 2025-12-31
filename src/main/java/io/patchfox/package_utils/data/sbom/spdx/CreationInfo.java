
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment",
    "created",
    "creators",
    "licenseListVersion"
})
@Generated("jsonschema2pojo")
public class CreationInfo {

    @JsonProperty("comment")
    private String comment;
    /**
     * Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard.
     * (Required)
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard.")
    private String created;
    /**
     * Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate.
     * (Required)
     * 
     */
    @JsonProperty("creators")
    @JsonPropertyDescription("Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as \u201canonymous\u201d if appropriate.")
    private List<String> creators;
    /**
     * An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.
     * 
     */
    @JsonProperty("licenseListVersion")
    @JsonPropertyDescription("An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.")
    private String licenseListVersion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CreationInfo() {
    }

    /**
     * 
     * @param licenseListVersion
     * @param created
     * @param creators
     * @param comment
     */
    public CreationInfo(String comment, String created, List<String> creators, String licenseListVersion) {
        super();
        this.comment = comment;
        this.created = created;
        this.creators = creators;
        this.licenseListVersion = licenseListVersion;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * Identify when the SPDX document was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate.
     * (Required)
     * 
     */
    @JsonProperty("creators")
    public List<String> getCreators() {
        return creators;
    }

    /**
     * Identify who (or what, in the case of a tool) created the SPDX document. If the SPDX document was created by an individual, indicate the person's name. If the SPDX document was created on behalf of a company or organization, indicate the entity name. If the SPDX document was created using a software tool, indicate the name and version for that tool. If multiple participants or tools were involved, use multiple instances of this field. Person name or organization name may be designated as “anonymous” if appropriate.
     * (Required)
     * 
     */
    @JsonProperty("creators")
    public void setCreators(List<String> creators) {
        this.creators = creators;
    }

    /**
     * An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.
     * 
     */
    @JsonProperty("licenseListVersion")
    public String getLicenseListVersion() {
        return licenseListVersion;
    }

    /**
     * An optional field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created.
     * 
     */
    @JsonProperty("licenseListVersion")
    public void setLicenseListVersion(String licenseListVersion) {
        this.licenseListVersion = licenseListVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreationInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("creators");
        sb.append('=');
        sb.append(((this.creators == null)?"<null>":this.creators));
        sb.append(',');
        sb.append("licenseListVersion");
        sb.append('=');
        sb.append(((this.licenseListVersion == null)?"<null>":this.licenseListVersion));
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
        result = ((result* 31)+((this.licenseListVersion == null)? 0 :this.licenseListVersion.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.creators == null)? 0 :this.creators.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreationInfo) == false) {
            return false;
        }
        CreationInfo rhs = ((CreationInfo) other);
        return (((((this.licenseListVersion == rhs.licenseListVersion)||((this.licenseListVersion!= null)&&this.licenseListVersion.equals(rhs.licenseListVersion)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.creators == rhs.creators)||((this.creators!= null)&&this.creators.equals(rhs.creators))));
    }

}
