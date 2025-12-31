
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
    "artifactOfs",
    "attributionTexts",
    "checksums",
    "comment",
    "copyrightText",
    "fileContributors",
    "fileDependencies",
    "fileName",
    "fileTypes",
    "licenseComments",
    "licenseConcluded",
    "licenseInfoInFiles",
    "noticeText"
})
@Generated("jsonschema2pojo")
public class File {

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
    private List<Annotation__2> annotations;
    /**
     * Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.
     * 
     */
    @JsonProperty("artifactOfs")
    @JsonPropertyDescription("Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.")
    private List<ArtifactOf> artifactOfs;
    /**
     * This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     */
    @JsonProperty("attributionTexts")
    @JsonPropertyDescription("This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.")
    private List<String> attributionTexts;
    /**
     * The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * (Required)
     * 
     */
    @JsonProperty("checksums")
    @JsonPropertyDescription("The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.")
    private List<Checksum__2> checksums;
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
     * This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.
     * 
     */
    @JsonProperty("fileContributors")
    @JsonPropertyDescription("This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.")
    private List<String> fileContributors;
    /**
     * This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships.
     * 
     */
    @JsonProperty("fileDependencies")
    @JsonPropertyDescription("This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships.")
    private List<String> fileDependencies;
    /**
     * The name of the file relative to the root of the package.
     * (Required)
     * 
     */
    @JsonProperty("fileName")
    @JsonPropertyDescription("The name of the file relative to the root of the package.")
    private String fileName;
    /**
     * The type of the file.
     * 
     */
    @JsonProperty("fileTypes")
    @JsonPropertyDescription("The type of the file.")
    private List<FileType> fileTypes;
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
     * Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.
     * 
     * If the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoInFiles")
    @JsonPropertyDescription("Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.\n\nIf the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION.")
    private List<String> licenseInfoInFiles;
    /**
     * This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.
     * 
     */
    @JsonProperty("noticeText")
    @JsonPropertyDescription("This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.")
    private String noticeText;

    /**
     * No args constructor for use in serialization
     * 
     */
    public File() {
    }

    /**
     * 
     * @param checksums
     * @param fileName
     * @param licenseConcluded
     * @param licenseInfoInFiles
     * @param annotations
     * @param licenseComments
     * @param artifactOfs
     * @param fileTypes
     * @param fileDependencies
     * @param spdxid
     * @param comment
     * @param fileContributors
     * @param copyrightText
     * @param noticeText
     * @param attributionTexts
     */
    public File(String spdxid, List<Annotation__2> annotations, List<ArtifactOf> artifactOfs, List<String> attributionTexts, List<Checksum__2> checksums, String comment, String copyrightText, List<String> fileContributors, List<String> fileDependencies, String fileName, List<FileType> fileTypes, String licenseComments, String licenseConcluded, List<String> licenseInfoInFiles, String noticeText) {
        super();
        this.spdxid = spdxid;
        this.annotations = annotations;
        this.artifactOfs = artifactOfs;
        this.attributionTexts = attributionTexts;
        this.checksums = checksums;
        this.comment = comment;
        this.copyrightText = copyrightText;
        this.fileContributors = fileContributors;
        this.fileDependencies = fileDependencies;
        this.fileName = fileName;
        this.fileTypes = fileTypes;
        this.licenseComments = licenseComments;
        this.licenseConcluded = licenseConcluded;
        this.licenseInfoInFiles = licenseInfoInFiles;
        this.noticeText = noticeText;
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
    public List<Annotation__2> getAnnotations() {
        return annotations;
    }

    /**
     * Provide additional information about an SpdxElement.
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(List<Annotation__2> annotations) {
        this.annotations = annotations;
    }

    /**
     * Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.
     * 
     */
    @JsonProperty("artifactOfs")
    public List<ArtifactOf> getArtifactOfs() {
        return artifactOfs;
    }

    /**
     * Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.
     * 
     */
    @JsonProperty("artifactOfs")
    public void setArtifactOfs(List<ArtifactOf> artifactOfs) {
        this.artifactOfs = artifactOfs;
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

    /**
     * The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * (Required)
     * 
     */
    @JsonProperty("checksums")
    public List<Checksum__2> getChecksums() {
        return checksums;
    }

    /**
     * The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * (Required)
     * 
     */
    @JsonProperty("checksums")
    public void setChecksums(List<Checksum__2> checksums) {
        this.checksums = checksums;
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
     * This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.
     * 
     */
    @JsonProperty("fileContributors")
    public List<String> getFileContributors() {
        return fileContributors;
    }

    /**
     * This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.
     * 
     */
    @JsonProperty("fileContributors")
    public void setFileContributors(List<String> fileContributors) {
        this.fileContributors = fileContributors;
    }

    /**
     * This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships.
     * 
     */
    @JsonProperty("fileDependencies")
    public List<String> getFileDependencies() {
        return fileDependencies;
    }

    /**
     * This field is deprecated since SPDX 2.0 in favor of using Section 7 which provides more granularity about relationships.
     * 
     */
    @JsonProperty("fileDependencies")
    public void setFileDependencies(List<String> fileDependencies) {
        this.fileDependencies = fileDependencies;
    }

    /**
     * The name of the file relative to the root of the package.
     * (Required)
     * 
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * The name of the file relative to the root of the package.
     * (Required)
     * 
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * The type of the file.
     * 
     */
    @JsonProperty("fileTypes")
    public List<FileType> getFileTypes() {
        return fileTypes;
    }

    /**
     * The type of the file.
     * 
     */
    @JsonProperty("fileTypes")
    public void setFileTypes(List<FileType> fileTypes) {
        this.fileTypes = fileTypes;
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
     * Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.
     * 
     * If the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoInFiles")
    public List<String> getLicenseInfoInFiles() {
        return licenseInfoInFiles;
    }

    /**
     * Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.
     * 
     * If the licenseInfoInFile field is not present for a file, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoInFiles")
    public void setLicenseInfoInFiles(List<String> licenseInfoInFiles) {
        this.licenseInfoInFiles = licenseInfoInFiles;
    }

    /**
     * This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.
     * 
     */
    @JsonProperty("noticeText")
    public String getNoticeText() {
        return noticeText;
    }

    /**
     * This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.
     * 
     */
    @JsonProperty("noticeText")
    public void setNoticeText(String noticeText) {
        this.noticeText = noticeText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(File.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spdxid");
        sb.append('=');
        sb.append(((this.spdxid == null)?"<null>":this.spdxid));
        sb.append(',');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("artifactOfs");
        sb.append('=');
        sb.append(((this.artifactOfs == null)?"<null>":this.artifactOfs));
        sb.append(',');
        sb.append("attributionTexts");
        sb.append('=');
        sb.append(((this.attributionTexts == null)?"<null>":this.attributionTexts));
        sb.append(',');
        sb.append("checksums");
        sb.append('=');
        sb.append(((this.checksums == null)?"<null>":this.checksums));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("copyrightText");
        sb.append('=');
        sb.append(((this.copyrightText == null)?"<null>":this.copyrightText));
        sb.append(',');
        sb.append("fileContributors");
        sb.append('=');
        sb.append(((this.fileContributors == null)?"<null>":this.fileContributors));
        sb.append(',');
        sb.append("fileDependencies");
        sb.append('=');
        sb.append(((this.fileDependencies == null)?"<null>":this.fileDependencies));
        sb.append(',');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null)?"<null>":this.fileName));
        sb.append(',');
        sb.append("fileTypes");
        sb.append('=');
        sb.append(((this.fileTypes == null)?"<null>":this.fileTypes));
        sb.append(',');
        sb.append("licenseComments");
        sb.append('=');
        sb.append(((this.licenseComments == null)?"<null>":this.licenseComments));
        sb.append(',');
        sb.append("licenseConcluded");
        sb.append('=');
        sb.append(((this.licenseConcluded == null)?"<null>":this.licenseConcluded));
        sb.append(',');
        sb.append("licenseInfoInFiles");
        sb.append('=');
        sb.append(((this.licenseInfoInFiles == null)?"<null>":this.licenseInfoInFiles));
        sb.append(',');
        sb.append("noticeText");
        sb.append('=');
        sb.append(((this.noticeText == null)?"<null>":this.noticeText));
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
        result = ((result* 31)+((this.checksums == null)? 0 :this.checksums.hashCode()));
        result = ((result* 31)+((this.fileName == null)? 0 :this.fileName.hashCode()));
        result = ((result* 31)+((this.licenseConcluded == null)? 0 :this.licenseConcluded.hashCode()));
        result = ((result* 31)+((this.licenseInfoInFiles == null)? 0 :this.licenseInfoInFiles.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.licenseComments == null)? 0 :this.licenseComments.hashCode()));
        result = ((result* 31)+((this.artifactOfs == null)? 0 :this.artifactOfs.hashCode()));
        result = ((result* 31)+((this.fileTypes == null)? 0 :this.fileTypes.hashCode()));
        result = ((result* 31)+((this.fileDependencies == null)? 0 :this.fileDependencies.hashCode()));
        result = ((result* 31)+((this.spdxid == null)? 0 :this.spdxid.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.fileContributors == null)? 0 :this.fileContributors.hashCode()));
        result = ((result* 31)+((this.copyrightText == null)? 0 :this.copyrightText.hashCode()));
        result = ((result* 31)+((this.noticeText == null)? 0 :this.noticeText.hashCode()));
        result = ((result* 31)+((this.attributionTexts == null)? 0 :this.attributionTexts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof File) == false) {
            return false;
        }
        File rhs = ((File) other);
        return ((((((((((((((((this.checksums == rhs.checksums)||((this.checksums!= null)&&this.checksums.equals(rhs.checksums)))&&((this.fileName == rhs.fileName)||((this.fileName!= null)&&this.fileName.equals(rhs.fileName))))&&((this.licenseConcluded == rhs.licenseConcluded)||((this.licenseConcluded!= null)&&this.licenseConcluded.equals(rhs.licenseConcluded))))&&((this.licenseInfoInFiles == rhs.licenseInfoInFiles)||((this.licenseInfoInFiles!= null)&&this.licenseInfoInFiles.equals(rhs.licenseInfoInFiles))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.licenseComments == rhs.licenseComments)||((this.licenseComments!= null)&&this.licenseComments.equals(rhs.licenseComments))))&&((this.artifactOfs == rhs.artifactOfs)||((this.artifactOfs!= null)&&this.artifactOfs.equals(rhs.artifactOfs))))&&((this.fileTypes == rhs.fileTypes)||((this.fileTypes!= null)&&this.fileTypes.equals(rhs.fileTypes))))&&((this.fileDependencies == rhs.fileDependencies)||((this.fileDependencies!= null)&&this.fileDependencies.equals(rhs.fileDependencies))))&&((this.spdxid == rhs.spdxid)||((this.spdxid!= null)&&this.spdxid.equals(rhs.spdxid))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.fileContributors == rhs.fileContributors)||((this.fileContributors!= null)&&this.fileContributors.equals(rhs.fileContributors))))&&((this.copyrightText == rhs.copyrightText)||((this.copyrightText!= null)&&this.copyrightText.equals(rhs.copyrightText))))&&((this.noticeText == rhs.noticeText)||((this.noticeText!= null)&&this.noticeText.equals(rhs.noticeText))))&&((this.attributionTexts == rhs.attributionTexts)||((this.attributionTexts!= null)&&this.attributionTexts.equals(rhs.attributionTexts))));
    }

}
