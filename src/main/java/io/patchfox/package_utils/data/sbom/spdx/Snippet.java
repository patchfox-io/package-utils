
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SPDXID",
    "annotations",
    "attributionTexts",
    "comment",
    "copyrightText",
    "licenseComments",
    "licenseConcluded",
    "licenseInfoInSnippets",
    "name",
    "ranges",
    "snippetFromFile"
})
@Generated("jsonschema2pojo")
public class Snippet {

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements.
     * (Required)
     * 
     */
    @JsonProperty("SPDXID")
    @JsonPropertyDescription("Uniquely identify any element in an SPDX document which may be referenced by other elements.")
    private String spdxid;
    /**
     * Provide additional information about an SpdxElement.
     * 
     */
    @JsonProperty("annotations")
    @JsonPropertyDescription("Provide additional information about an SpdxElement.")
    private List<Annotation__3> annotations;
    /**
     * This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     */
    @JsonProperty("attributionTexts")
    @JsonPropertyDescription("This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.")
    private List<String> attributionTexts;
    @JsonProperty("comment")
    private String comment;
    /**
     * The text of copyright declarations recited in the package, file or snippet.
     * 
     * If the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("copyrightText")
    @JsonPropertyDescription("The text of copyright declarations recited in the package, file or snippet.\n\nIf the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION.")
    private String copyrightText;
    /**
     * The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.
     * 
     */
    @JsonProperty("licenseComments")
    @JsonPropertyDescription("The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.")
    private String licenseComments;
    /**
     * License expression for licenseConcluded. See SPDX Annex D for the license expression syntax.  The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.
     * 
     * If the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseConcluded")
    @JsonPropertyDescription("License expression for licenseConcluded. See SPDX Annex D for the license expression syntax.  The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.\n\nIf the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION.")
    private String licenseConcluded;
    /**
     * Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * If the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoInSnippets")
    @JsonPropertyDescription("Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.\n\nIf the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION.")
    private List<String> licenseInfoInSnippets;
    /**
     * Identify name of this SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Identify name of this SpdxElement.")
    private String name;
    /**
     * This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * (Required)
     * 
     */
    @JsonProperty("ranges")
    @JsonPropertyDescription("This field defines the byte range in the original host file (in X.2) that the snippet information applies to")
    private List<Range> ranges;
    /**
     * SPDX ID for File.  File containing the SPDX element (e.g. the file contaning a snippet).
     * (Required)
     * 
     */
    @JsonProperty("snippetFromFile")
    @JsonPropertyDescription("SPDX ID for File.  File containing the SPDX element (e.g. the file contaning a snippet).")
    private String snippetFromFile;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Snippet() {
    }

    /**
     * 
     * @param snippetFromFile
     * @param licenseConcluded
     * @param ranges
     * @param licenseInfoInSnippets
     * @param name
     * @param annotations
     * @param spdxid
     * @param comment
     * @param copyrightText
     * @param licenseComments
     * @param attributionTexts
     */
    public Snippet(String spdxid, List<Annotation__3> annotations, List<String> attributionTexts, String comment, String copyrightText, String licenseComments, String licenseConcluded, List<String> licenseInfoInSnippets, String name, List<Range> ranges, String snippetFromFile) {
        super();
        this.spdxid = spdxid;
        this.annotations = annotations;
        this.attributionTexts = attributionTexts;
        this.comment = comment;
        this.copyrightText = copyrightText;
        this.licenseComments = licenseComments;
        this.licenseConcluded = licenseConcluded;
        this.licenseInfoInSnippets = licenseInfoInSnippets;
        this.name = name;
        this.ranges = ranges;
        this.snippetFromFile = snippetFromFile;
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements.
     * (Required)
     * 
     */
    @JsonProperty("SPDXID")
    public String getSpdxid() {
        return spdxid;
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements.
     * (Required)
     * 
     */
    @JsonProperty("SPDXID")
    public void setSpdxid(String spdxid) {
        this.spdxid = spdxid;
    }

    /**
     * Provide additional information about an SpdxElement.
     * 
     */
    @JsonProperty("annotations")
    public List<Annotation__3> getAnnotations() {
        return annotations;
    }

    /**
     * Provide additional information about an SpdxElement.
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(List<Annotation__3> annotations) {
        this.annotations = annotations;
    }

    /**
     * This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     */
    @JsonProperty("attributionTexts")
    public List<String> getAttributionTexts() {
        return attributionTexts;
    }

    /**
     * This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     */
    @JsonProperty("attributionTexts")
    public void setAttributionTexts(List<String> attributionTexts) {
        this.attributionTexts = attributionTexts;
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
     * The text of copyright declarations recited in the package, file or snippet.
     * 
     * If the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("copyrightText")
    public String getCopyrightText() {
        return copyrightText;
    }

    /**
     * The text of copyright declarations recited in the package, file or snippet.
     * 
     * If the copyrightText field is not present, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("copyrightText")
    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    /**
     * The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.
     * 
     */
    @JsonProperty("licenseComments")
    public String getLicenseComments() {
        return licenseComments;
    }

    /**
     * The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.
     * 
     */
    @JsonProperty("licenseComments")
    public void setLicenseComments(String licenseComments) {
        this.licenseComments = licenseComments;
    }

    /**
     * License expression for licenseConcluded. See SPDX Annex D for the license expression syntax.  The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.
     * 
     * If the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseConcluded")
    public String getLicenseConcluded() {
        return licenseConcluded;
    }

    /**
     * License expression for licenseConcluded. See SPDX Annex D for the license expression syntax.  The licensing that the preparer of this SPDX document has concluded, based on the evidence, actually applies to the SPDX Item.
     * 
     * If the licenseConcluded field is not present for an SPDX Item, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseConcluded")
    public void setLicenseConcluded(String licenseConcluded) {
        this.licenseConcluded = licenseConcluded;
    }

    /**
     * Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * If the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoInSnippets")
    public List<String> getLicenseInfoInSnippets() {
        return licenseInfoInSnippets;
    }

    /**
     * Licensing information that was discovered directly in the subject snippet. This is also considered a declared license for the snippet.
     * 
     * If the licenseInfoInSnippet field is not present for a snippet, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoInSnippets")
    public void setLicenseInfoInSnippets(List<String> licenseInfoInSnippets) {
        this.licenseInfoInSnippets = licenseInfoInSnippets;
    }

    /**
     * Identify name of this SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Identify name of this SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * (Required)
     * 
     */
    @JsonProperty("ranges")
    public List<Range> getRanges() {
        return ranges;
    }

    /**
     * This field defines the byte range in the original host file (in X.2) that the snippet information applies to
     * (Required)
     * 
     */
    @JsonProperty("ranges")
    public void setRanges(List<Range> ranges) {
        this.ranges = ranges;
    }

    /**
     * SPDX ID for File.  File containing the SPDX element (e.g. the file contaning a snippet).
     * (Required)
     * 
     */
    @JsonProperty("snippetFromFile")
    public String getSnippetFromFile() {
        return snippetFromFile;
    }

    /**
     * SPDX ID for File.  File containing the SPDX element (e.g. the file contaning a snippet).
     * (Required)
     * 
     */
    @JsonProperty("snippetFromFile")
    public void setSnippetFromFile(String snippetFromFile) {
        this.snippetFromFile = snippetFromFile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Snippet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spdxid");
        sb.append('=');
        sb.append(((this.spdxid == null)?"<null>":this.spdxid));
        sb.append(',');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("attributionTexts");
        sb.append('=');
        sb.append(((this.attributionTexts == null)?"<null>":this.attributionTexts));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("copyrightText");
        sb.append('=');
        sb.append(((this.copyrightText == null)?"<null>":this.copyrightText));
        sb.append(',');
        sb.append("licenseComments");
        sb.append('=');
        sb.append(((this.licenseComments == null)?"<null>":this.licenseComments));
        sb.append(',');
        sb.append("licenseConcluded");
        sb.append('=');
        sb.append(((this.licenseConcluded == null)?"<null>":this.licenseConcluded));
        sb.append(',');
        sb.append("licenseInfoInSnippets");
        sb.append('=');
        sb.append(((this.licenseInfoInSnippets == null)?"<null>":this.licenseInfoInSnippets));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ranges");
        sb.append('=');
        sb.append(((this.ranges == null)?"<null>":this.ranges));
        sb.append(',');
        sb.append("snippetFromFile");
        sb.append('=');
        sb.append(((this.snippetFromFile == null)?"<null>":this.snippetFromFile));
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
        result = ((result* 31)+((this.snippetFromFile == null)? 0 :this.snippetFromFile.hashCode()));
        result = ((result* 31)+((this.licenseConcluded == null)? 0 :this.licenseConcluded.hashCode()));
        result = ((result* 31)+((this.ranges == null)? 0 :this.ranges.hashCode()));
        result = ((result* 31)+((this.licenseInfoInSnippets == null)? 0 :this.licenseInfoInSnippets.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.spdxid == null)? 0 :this.spdxid.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.copyrightText == null)? 0 :this.copyrightText.hashCode()));
        result = ((result* 31)+((this.licenseComments == null)? 0 :this.licenseComments.hashCode()));
        result = ((result* 31)+((this.attributionTexts == null)? 0 :this.attributionTexts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Snippet) == false) {
            return false;
        }
        Snippet rhs = ((Snippet) other);
        return ((((((((((((this.snippetFromFile == rhs.snippetFromFile)||((this.snippetFromFile!= null)&&this.snippetFromFile.equals(rhs.snippetFromFile)))&&((this.licenseConcluded == rhs.licenseConcluded)||((this.licenseConcluded!= null)&&this.licenseConcluded.equals(rhs.licenseConcluded))))&&((this.ranges == rhs.ranges)||((this.ranges!= null)&&this.ranges.equals(rhs.ranges))))&&((this.licenseInfoInSnippets == rhs.licenseInfoInSnippets)||((this.licenseInfoInSnippets!= null)&&this.licenseInfoInSnippets.equals(rhs.licenseInfoInSnippets))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.spdxid == rhs.spdxid)||((this.spdxid!= null)&&this.spdxid.equals(rhs.spdxid))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.copyrightText == rhs.copyrightText)||((this.copyrightText!= null)&&this.copyrightText.equals(rhs.copyrightText))))&&((this.licenseComments == rhs.licenseComments)||((this.licenseComments!= null)&&this.licenseComments.equals(rhs.licenseComments))))&&((this.attributionTexts == rhs.attributionTexts)||((this.attributionTexts!= null)&&this.attributionTexts.equals(rhs.attributionTexts))));
    }

}
