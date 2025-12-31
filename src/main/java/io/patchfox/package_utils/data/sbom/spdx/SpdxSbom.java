
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SPDX 2.3
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SPDXID",
    "annotations",
    "comment",
    "creationInfo",
    "dataLicense",
    "externalDocumentRefs",
    "hasExtractedLicensingInfos",
    "name",
    "revieweds",
    "spdxVersion",
    "documentNamespace",
    "documentDescribes",
    "packages",
    "files",
    "snippets",
    "relationships"
})
@Generated("jsonschema2pojo")
public class SpdxSbom {

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
    private List<Annotation> annotations;
    @JsonProperty("comment")
    private String comment;
    /**
     * One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.
     * (Required)
     * 
     */
    @JsonProperty("creationInfo")
    @JsonPropertyDescription("One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.")
    private CreationInfo creationInfo;
    /**
     * License expression for dataLicense. See SPDX Annex D for the license expression syntax.  Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of "database rights" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you "as-is" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.
     * (Required)
     * 
     */
    @JsonProperty("dataLicense")
    @JsonPropertyDescription("License expression for dataLicense. See SPDX Annex D for the license expression syntax.  Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields (\"SPDX-Metadata\"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of \"database rights\" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you \"as-is\" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.")
    private String dataLicense;
    /**
     * Identify any external SPDX documents referenced within this SPDX document.
     * 
     */
    @JsonProperty("externalDocumentRefs")
    @JsonPropertyDescription("Identify any external SPDX documents referenced within this SPDX document.")
    private List<ExternalDocumentRef> externalDocumentRefs;
    /**
     * Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.
     * 
     */
    @JsonProperty("hasExtractedLicensingInfos")
    @JsonPropertyDescription("Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.")
    private List<HasExtractedLicensingInfo> hasExtractedLicensingInfos;
    /**
     * Identify name of this SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Identify name of this SpdxElement.")
    private String name;
    /**
     * Reviewed
     * 
     */
    @JsonProperty("revieweds")
    @JsonPropertyDescription("Reviewed")
    private List<Reviewed> revieweds;
    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.
     * (Required)
     * 
     */
    @JsonProperty("spdxVersion")
    @JsonPropertyDescription("Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.")
    private String spdxVersion;
    /**
     * The URI provides an unambiguous mechanism for other SPDX documents to reference SPDX elements within this SPDX document.
     * 
     */
    @JsonProperty("documentNamespace")
    @JsonPropertyDescription("The URI provides an unambiguous mechanism for other SPDX documents to reference SPDX elements within this SPDX document.")
    private String documentNamespace;
    /**
     * Packages, files and/or Snippets described by this SPDX document
     * 
     */
    @JsonProperty("documentDescribes")
    @JsonPropertyDescription("Packages, files and/or Snippets described by this SPDX document")
    private List<String> documentDescribes;
    /**
     * Packages referenced in the SPDX document
     * 
     */
    @JsonProperty("packages")
    @JsonPropertyDescription("Packages referenced in the SPDX document")
    private List<Package> packages;
    /**
     * Files referenced in the SPDX document
     * 
     */
    @JsonProperty("files")
    @JsonPropertyDescription("Files referenced in the SPDX document")
    private List<File> files;
    /**
     * Snippets referenced in the SPDX document
     * 
     */
    @JsonProperty("snippets")
    @JsonPropertyDescription("Snippets referenced in the SPDX document")
    private List<Snippet> snippets;
    /**
     * Relationships referenced in the SPDX document
     * 
     */
    @JsonProperty("relationships")
    @JsonPropertyDescription("Relationships referenced in the SPDX document")
    private List<Relationship> relationships;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SpdxSbom() {
    }

    /**
     * 
     * @param annotations
     * @param packages
     * @param hasExtractedLicensingInfos
     * @param creationInfo
     * @param dataLicense
     * @param relationships
     * @param documentNamespace
     * @param spdxVersion
     * @param snippets
     * @param name
     * @param documentDescribes
     * @param files
     * @param spdxid
     * @param comment
     * @param externalDocumentRefs
     * @param revieweds
     */
    public SpdxSbom(String spdxid, List<Annotation> annotations, String comment, CreationInfo creationInfo, String dataLicense, List<ExternalDocumentRef> externalDocumentRefs, List<HasExtractedLicensingInfo> hasExtractedLicensingInfos, String name, List<Reviewed> revieweds, String spdxVersion, String documentNamespace, List<String> documentDescribes, List<Package> packages, List<File> files, List<Snippet> snippets, List<Relationship> relationships) {
        super();
        this.spdxid = spdxid;
        this.annotations = annotations;
        this.comment = comment;
        this.creationInfo = creationInfo;
        this.dataLicense = dataLicense;
        this.externalDocumentRefs = externalDocumentRefs;
        this.hasExtractedLicensingInfos = hasExtractedLicensingInfos;
        this.name = name;
        this.revieweds = revieweds;
        this.spdxVersion = spdxVersion;
        this.documentNamespace = documentNamespace;
        this.documentDescribes = documentDescribes;
        this.packages = packages;
        this.files = files;
        this.snippets = snippets;
        this.relationships = relationships;
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
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    /**
     * Provide additional information about an SpdxElement.
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
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
     * One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.
     * (Required)
     * 
     */
    @JsonProperty("creationInfo")
    public CreationInfo getCreationInfo() {
        return creationInfo;
    }

    /**
     * One instance is required for each SPDX file produced. It provides the necessary information for forward and backward compatibility for processing tools.
     * (Required)
     * 
     */
    @JsonProperty("creationInfo")
    public void setCreationInfo(CreationInfo creationInfo) {
        this.creationInfo = creationInfo;
    }

    /**
     * License expression for dataLicense. See SPDX Annex D for the license expression syntax.  Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of "database rights" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you "as-is" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.
     * (Required)
     * 
     */
    @JsonProperty("dataLicense")
    public String getDataLicense() {
        return dataLicense;
    }

    /**
     * License expression for dataLicense. See SPDX Annex D for the license expression syntax.  Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of "database rights" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you "as-is" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.
     * (Required)
     * 
     */
    @JsonProperty("dataLicense")
    public void setDataLicense(String dataLicense) {
        this.dataLicense = dataLicense;
    }

    /**
     * Identify any external SPDX documents referenced within this SPDX document.
     * 
     */
    @JsonProperty("externalDocumentRefs")
    public List<ExternalDocumentRef> getExternalDocumentRefs() {
        return externalDocumentRefs;
    }

    /**
     * Identify any external SPDX documents referenced within this SPDX document.
     * 
     */
    @JsonProperty("externalDocumentRefs")
    public void setExternalDocumentRefs(List<ExternalDocumentRef> externalDocumentRefs) {
        this.externalDocumentRefs = externalDocumentRefs;
    }

    /**
     * Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.
     * 
     */
    @JsonProperty("hasExtractedLicensingInfos")
    public List<HasExtractedLicensingInfo> getHasExtractedLicensingInfos() {
        return hasExtractedLicensingInfos;
    }

    /**
     * Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.
     * 
     */
    @JsonProperty("hasExtractedLicensingInfos")
    public void setHasExtractedLicensingInfos(List<HasExtractedLicensingInfo> hasExtractedLicensingInfos) {
        this.hasExtractedLicensingInfos = hasExtractedLicensingInfos;
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
     * Reviewed
     * 
     */
    @JsonProperty("revieweds")
    public List<Reviewed> getRevieweds() {
        return revieweds;
    }

    /**
     * Reviewed
     * 
     */
    @JsonProperty("revieweds")
    public void setRevieweds(List<Reviewed> revieweds) {
        this.revieweds = revieweds;
    }

    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.
     * (Required)
     * 
     */
    @JsonProperty("spdxVersion")
    public String getSpdxVersion() {
        return spdxVersion;
    }

    /**
     * Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.
     * (Required)
     * 
     */
    @JsonProperty("spdxVersion")
    public void setSpdxVersion(String spdxVersion) {
        this.spdxVersion = spdxVersion;
    }

    /**
     * The URI provides an unambiguous mechanism for other SPDX documents to reference SPDX elements within this SPDX document.
     * 
     */
    @JsonProperty("documentNamespace")
    public String getDocumentNamespace() {
        return documentNamespace;
    }

    /**
     * The URI provides an unambiguous mechanism for other SPDX documents to reference SPDX elements within this SPDX document.
     * 
     */
    @JsonProperty("documentNamespace")
    public void setDocumentNamespace(String documentNamespace) {
        this.documentNamespace = documentNamespace;
    }

    /**
     * Packages, files and/or Snippets described by this SPDX document
     * 
     */
    @JsonProperty("documentDescribes")
    public List<String> getDocumentDescribes() {
        return documentDescribes;
    }

    /**
     * Packages, files and/or Snippets described by this SPDX document
     * 
     */
    @JsonProperty("documentDescribes")
    public void setDocumentDescribes(List<String> documentDescribes) {
        this.documentDescribes = documentDescribes;
    }

    /**
     * Packages referenced in the SPDX document
     * 
     */
    @JsonProperty("packages")
    public List<Package> getPackages() {
        return packages;
    }

    /**
     * Packages referenced in the SPDX document
     * 
     */
    @JsonProperty("packages")
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    /**
     * Files referenced in the SPDX document
     * 
     */
    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    /**
     * Files referenced in the SPDX document
     * 
     */
    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    /**
     * Snippets referenced in the SPDX document
     * 
     */
    @JsonProperty("snippets")
    public List<Snippet> getSnippets() {
        return snippets;
    }

    /**
     * Snippets referenced in the SPDX document
     * 
     */
    @JsonProperty("snippets")
    public void setSnippets(List<Snippet> snippets) {
        this.snippets = snippets;
    }

    /**
     * Relationships referenced in the SPDX document
     * 
     */
    @JsonProperty("relationships")
    public List<Relationship> getRelationships() {
        return relationships;
    }

    /**
     * Relationships referenced in the SPDX document
     * 
     */
    @JsonProperty("relationships")
    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpdxSbom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spdxid");
        sb.append('=');
        sb.append(((this.spdxid == null)?"<null>":this.spdxid));
        sb.append(',');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("creationInfo");
        sb.append('=');
        sb.append(((this.creationInfo == null)?"<null>":this.creationInfo));
        sb.append(',');
        sb.append("dataLicense");
        sb.append('=');
        sb.append(((this.dataLicense == null)?"<null>":this.dataLicense));
        sb.append(',');
        sb.append("externalDocumentRefs");
        sb.append('=');
        sb.append(((this.externalDocumentRefs == null)?"<null>":this.externalDocumentRefs));
        sb.append(',');
        sb.append("hasExtractedLicensingInfos");
        sb.append('=');
        sb.append(((this.hasExtractedLicensingInfos == null)?"<null>":this.hasExtractedLicensingInfos));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("revieweds");
        sb.append('=');
        sb.append(((this.revieweds == null)?"<null>":this.revieweds));
        sb.append(',');
        sb.append("spdxVersion");
        sb.append('=');
        sb.append(((this.spdxVersion == null)?"<null>":this.spdxVersion));
        sb.append(',');
        sb.append("documentNamespace");
        sb.append('=');
        sb.append(((this.documentNamespace == null)?"<null>":this.documentNamespace));
        sb.append(',');
        sb.append("documentDescribes");
        sb.append('=');
        sb.append(((this.documentDescribes == null)?"<null>":this.documentDescribes));
        sb.append(',');
        sb.append("packages");
        sb.append('=');
        sb.append(((this.packages == null)?"<null>":this.packages));
        sb.append(',');
        sb.append("files");
        sb.append('=');
        sb.append(((this.files == null)?"<null>":this.files));
        sb.append(',');
        sb.append("snippets");
        sb.append('=');
        sb.append(((this.snippets == null)?"<null>":this.snippets));
        sb.append(',');
        sb.append("relationships");
        sb.append('=');
        sb.append(((this.relationships == null)?"<null>":this.relationships));
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
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.packages == null)? 0 :this.packages.hashCode()));
        result = ((result* 31)+((this.hasExtractedLicensingInfos == null)? 0 :this.hasExtractedLicensingInfos.hashCode()));
        result = ((result* 31)+((this.creationInfo == null)? 0 :this.creationInfo.hashCode()));
        result = ((result* 31)+((this.dataLicense == null)? 0 :this.dataLicense.hashCode()));
        result = ((result* 31)+((this.relationships == null)? 0 :this.relationships.hashCode()));
        result = ((result* 31)+((this.documentNamespace == null)? 0 :this.documentNamespace.hashCode()));
        result = ((result* 31)+((this.spdxVersion == null)? 0 :this.spdxVersion.hashCode()));
        result = ((result* 31)+((this.snippets == null)? 0 :this.snippets.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.documentDescribes == null)? 0 :this.documentDescribes.hashCode()));
        result = ((result* 31)+((this.files == null)? 0 :this.files.hashCode()));
        result = ((result* 31)+((this.spdxid == null)? 0 :this.spdxid.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.externalDocumentRefs == null)? 0 :this.externalDocumentRefs.hashCode()));
        result = ((result* 31)+((this.revieweds == null)? 0 :this.revieweds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpdxSbom) == false) {
            return false;
        }
        SpdxSbom rhs = ((SpdxSbom) other);
        return (((((((((((((((((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations)))&&((this.packages == rhs.packages)||((this.packages!= null)&&this.packages.equals(rhs.packages))))&&((this.hasExtractedLicensingInfos == rhs.hasExtractedLicensingInfos)||((this.hasExtractedLicensingInfos!= null)&&this.hasExtractedLicensingInfos.equals(rhs.hasExtractedLicensingInfos))))&&((this.creationInfo == rhs.creationInfo)||((this.creationInfo!= null)&&this.creationInfo.equals(rhs.creationInfo))))&&((this.dataLicense == rhs.dataLicense)||((this.dataLicense!= null)&&this.dataLicense.equals(rhs.dataLicense))))&&((this.relationships == rhs.relationships)||((this.relationships!= null)&&this.relationships.equals(rhs.relationships))))&&((this.documentNamespace == rhs.documentNamespace)||((this.documentNamespace!= null)&&this.documentNamespace.equals(rhs.documentNamespace))))&&((this.spdxVersion == rhs.spdxVersion)||((this.spdxVersion!= null)&&this.spdxVersion.equals(rhs.spdxVersion))))&&((this.snippets == rhs.snippets)||((this.snippets!= null)&&this.snippets.equals(rhs.snippets))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.documentDescribes == rhs.documentDescribes)||((this.documentDescribes!= null)&&this.documentDescribes.equals(rhs.documentDescribes))))&&((this.files == rhs.files)||((this.files!= null)&&this.files.equals(rhs.files))))&&((this.spdxid == rhs.spdxid)||((this.spdxid!= null)&&this.spdxid.equals(rhs.spdxid))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.externalDocumentRefs == rhs.externalDocumentRefs)||((this.externalDocumentRefs!= null)&&this.externalDocumentRefs.equals(rhs.externalDocumentRefs))))&&((this.revieweds == rhs.revieweds)||((this.revieweds!= null)&&this.revieweds.equals(rhs.revieweds))));
    }

}
