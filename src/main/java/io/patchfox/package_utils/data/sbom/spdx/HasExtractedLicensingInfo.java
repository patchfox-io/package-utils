
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An ExtractedLicensingInfo represents a license or licensing notice that was found in a package, file or snippet. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment",
    "crossRefs",
    "extractedText",
    "licenseId",
    "name",
    "seeAlsos"
})
@Generated("jsonschema2pojo")
public class HasExtractedLicensingInfo {

    @JsonProperty("comment")
    private String comment;
    /**
     * Cross Reference Detail for a license SeeAlso URL
     * 
     */
    @JsonProperty("crossRefs")
    @JsonPropertyDescription("Cross Reference Detail for a license SeeAlso URL")
    private List<CrossRef> crossRefs;
    /**
     * Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis.
     * (Required)
     * 
     */
    @JsonProperty("extractedText")
    @JsonPropertyDescription("Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis.")
    private String extractedText;
    /**
     * A human readable short form license identifier for a license. The license ID is either on the standard license list or the form "LicenseRef-[idString]" where [idString] is a unique string containing letters, numbers, "." or "-".  When used within a license expression, the license ID can optionally include a reference to an external document in the form "DocumentRef-[docrefIdString]:LicenseRef-[idString]" where docRefIdString is an ID for an external document reference.
     * (Required)
     * 
     */
    @JsonProperty("licenseId")
    @JsonPropertyDescription("A human readable short form license identifier for a license. The license ID is either on the standard license list or the form \"LicenseRef-[idString]\" where [idString] is a unique string containing letters, numbers, \".\" or \"-\".  When used within a license expression, the license ID can optionally include a reference to an external document in the form \"DocumentRef-[docrefIdString]:LicenseRef-[idString]\" where docRefIdString is an ID for an external document reference.")
    private String licenseId;
    /**
     * Identify name of this SpdxElement.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Identify name of this SpdxElement.")
    private String name;
    @JsonProperty("seeAlsos")
    private List<String> seeAlsos;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HasExtractedLicensingInfo() {
    }

    /**
     * 
     * @param seeAlsos
     * @param name
     * @param crossRefs
     * @param extractedText
     * @param comment
     * @param licenseId
     */
    public HasExtractedLicensingInfo(String comment, List<CrossRef> crossRefs, String extractedText, String licenseId, String name, List<String> seeAlsos) {
        super();
        this.comment = comment;
        this.crossRefs = crossRefs;
        this.extractedText = extractedText;
        this.licenseId = licenseId;
        this.name = name;
        this.seeAlsos = seeAlsos;
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
     * Cross Reference Detail for a license SeeAlso URL
     * 
     */
    @JsonProperty("crossRefs")
    public List<CrossRef> getCrossRefs() {
        return crossRefs;
    }

    /**
     * Cross Reference Detail for a license SeeAlso URL
     * 
     */
    @JsonProperty("crossRefs")
    public void setCrossRefs(List<CrossRef> crossRefs) {
        this.crossRefs = crossRefs;
    }

    /**
     * Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis.
     * (Required)
     * 
     */
    @JsonProperty("extractedText")
    public String getExtractedText() {
        return extractedText;
    }

    /**
     * Provide a copy of the actual text of the license reference extracted from the package, file or snippet that is associated with the License Identifier to aid in future analysis.
     * (Required)
     * 
     */
    @JsonProperty("extractedText")
    public void setExtractedText(String extractedText) {
        this.extractedText = extractedText;
    }

    /**
     * A human readable short form license identifier for a license. The license ID is either on the standard license list or the form "LicenseRef-[idString]" where [idString] is a unique string containing letters, numbers, "." or "-".  When used within a license expression, the license ID can optionally include a reference to an external document in the form "DocumentRef-[docrefIdString]:LicenseRef-[idString]" where docRefIdString is an ID for an external document reference.
     * (Required)
     * 
     */
    @JsonProperty("licenseId")
    public String getLicenseId() {
        return licenseId;
    }

    /**
     * A human readable short form license identifier for a license. The license ID is either on the standard license list or the form "LicenseRef-[idString]" where [idString] is a unique string containing letters, numbers, "." or "-".  When used within a license expression, the license ID can optionally include a reference to an external document in the form "DocumentRef-[docrefIdString]:LicenseRef-[idString]" where docRefIdString is an ID for an external document reference.
     * (Required)
     * 
     */
    @JsonProperty("licenseId")
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    /**
     * Identify name of this SpdxElement.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Identify name of this SpdxElement.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("seeAlsos")
    public List<String> getSeeAlsos() {
        return seeAlsos;
    }

    @JsonProperty("seeAlsos")
    public void setSeeAlsos(List<String> seeAlsos) {
        this.seeAlsos = seeAlsos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HasExtractedLicensingInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("crossRefs");
        sb.append('=');
        sb.append(((this.crossRefs == null)?"<null>":this.crossRefs));
        sb.append(',');
        sb.append("extractedText");
        sb.append('=');
        sb.append(((this.extractedText == null)?"<null>":this.extractedText));
        sb.append(',');
        sb.append("licenseId");
        sb.append('=');
        sb.append(((this.licenseId == null)?"<null>":this.licenseId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("seeAlsos");
        sb.append('=');
        sb.append(((this.seeAlsos == null)?"<null>":this.seeAlsos));
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
        result = ((result* 31)+((this.seeAlsos == null)? 0 :this.seeAlsos.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.crossRefs == null)? 0 :this.crossRefs.hashCode()));
        result = ((result* 31)+((this.extractedText == null)? 0 :this.extractedText.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.licenseId == null)? 0 :this.licenseId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HasExtractedLicensingInfo) == false) {
            return false;
        }
        HasExtractedLicensingInfo rhs = ((HasExtractedLicensingInfo) other);
        return (((((((this.seeAlsos == rhs.seeAlsos)||((this.seeAlsos!= null)&&this.seeAlsos.equals(rhs.seeAlsos)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.crossRefs == rhs.crossRefs)||((this.crossRefs!= null)&&this.crossRefs.equals(rhs.crossRefs))))&&((this.extractedText == rhs.extractedText)||((this.extractedText!= null)&&this.extractedText.equals(rhs.extractedText))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.licenseId == rhs.licenseId)||((this.licenseId!= null)&&this.licenseId.equals(rhs.licenseId))));
    }

}
