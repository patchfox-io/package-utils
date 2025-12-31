
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SPDXID",
    "annotations",
    "attributionTexts",
    "builtDate",
    "checksums",
    "comment",
    "copyrightText",
    "description",
    "downloadLocation",
    "externalRefs",
    "filesAnalyzed",
    "hasFiles",
    "homepage",
    "licenseComments",
    "licenseConcluded",
    "licenseDeclared",
    "licenseInfoFromFiles",
    "name",
    "originator",
    "packageFileName",
    "packageVerificationCode",
    "primaryPackagePurpose",
    "releaseDate",
    "sourceInfo",
    "summary",
    "supplier",
    "validUntilDate",
    "versionInfo"
})
@Generated("jsonschema2pojo")
public class Package {

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
    private List<Annotation__1> annotations;
    /**
     * This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     */
    @JsonProperty("attributionTexts")
    @JsonPropertyDescription("This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include the actual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.")
    private List<String> attributionTexts;
    /**
     * This field provides a place for recording the actual date the package was built.
     * 
     */
    @JsonProperty("builtDate")
    @JsonPropertyDescription("This field provides a place for recording the actual date the package was built.")
    private String builtDate;
    /**
     * The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * 
     */
    @JsonProperty("checksums")
    @JsonPropertyDescription("The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.")
    private List<Checksum__1> checksums;
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
     * Provides a detailed description of the package.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Provides a detailed description of the package.")
    private String description;
    /**
     * The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.
     * (Required)
     * 
     */
    @JsonProperty("downloadLocation")
    @JsonPropertyDescription("The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.")
    private String downloadLocation;
    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
     * 
     */
    @JsonProperty("externalRefs")
    @JsonPropertyDescription("An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.")
    private List<ExternalRef> externalRefs;
    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.
     * 
     */
    @JsonProperty("filesAnalyzed")
    @JsonPropertyDescription("Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.")
    private Boolean filesAnalyzed;
    /**
     * Indicates that a particular file belongs to a package.
     * 
     */
    @JsonProperty("hasFiles")
    @JsonPropertyDescription("Indicates that a particular file belongs to a package.")
    private List<String> hasFiles;
    @JsonProperty("homepage")
    private String homepage;
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
     * License expression for licenseDeclared. See SPDX Annex D for the license expression syntax.  The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist.
     * 
     */
    @JsonProperty("licenseDeclared")
    @JsonPropertyDescription("License expression for licenseDeclared. See SPDX Annex D for the license expression syntax.  The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist.")
    private String licenseDeclared;
    /**
     * The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.
     * 
     * If the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoFromFiles")
    @JsonPropertyDescription("The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.\n\nIf the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION.")
    private List<String> licenseInfoFromFiles;
    /**
     * Identify name of this SpdxElement.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Identify name of this SpdxElement.")
    private String name;
    /**
     * The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.
     * 
     */
    @JsonProperty("originator")
    @JsonPropertyDescription("The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.")
    private String originator;
    /**
     * The base name of the package file name. For example, zlib-1.2.5.tar.gz.
     * 
     */
    @JsonProperty("packageFileName")
    @JsonPropertyDescription("The base name of the package file name. For example, zlib-1.2.5.tar.gz.")
    private String packageFileName;
    /**
     * A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.
     * 
     */
    @JsonProperty("packageVerificationCode")
    @JsonPropertyDescription("A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.")
    private PackageVerificationCode packageVerificationCode;
    /**
     * This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package.
     * 
     */
    @JsonProperty("primaryPackagePurpose")
    @JsonPropertyDescription("This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package.")
    private Package.PrimaryPackagePurpose primaryPackagePurpose;
    /**
     * This field provides a place for recording the date the package was released.
     * 
     */
    @JsonProperty("releaseDate")
    @JsonPropertyDescription("This field provides a place for recording the date the package was released.")
    private String releaseDate;
    /**
     * Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.
     * 
     */
    @JsonProperty("sourceInfo")
    @JsonPropertyDescription("Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.")
    private String sourceInfo;
    /**
     * Provides a short description of the package.
     * 
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Provides a short description of the package.")
    private String summary;
    /**
     * The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.
     * 
     */
    @JsonProperty("supplier")
    @JsonPropertyDescription("The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.")
    private String supplier;
    /**
     * This field provides a place for recording the end of the support period for a package from the supplier.
     * 
     */
    @JsonProperty("validUntilDate")
    @JsonPropertyDescription("This field provides a place for recording the end of the support period for a package from the supplier.")
    private String validUntilDate;
    /**
     * Provides an indication of the version of the package that is described by this SpdxDocument.
     * 
     */
    @JsonProperty("versionInfo")
    @JsonPropertyDescription("Provides an indication of the version of the package that is described by this SpdxDocument.")
    private String versionInfo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Package() {
    }

    /**
     * 
     * @param checksums
     * @param hasFiles
     * @param licenseConcluded
     * @param licenseInfoFromFiles
     * @param externalRefs
     * @param annotations
     * @param description
     * @param downloadLocation
     * @param originator
     * @param validUntilDate
     * @param sourceInfo
     * @param primaryPackagePurpose
     * @param builtDate
     * @param supplier
     * @param spdxid
     * @param licenseDeclared
     * @param attributionTexts
     * @param filesAnalyzed
     * @param summary
     * @param releaseDate
     * @param packageFileName
     * @param licenseComments
     * @param versionInfo
     * @param packageVerificationCode
     * @param name
     * @param comment
     * @param copyrightText
     * @param homepage
     */
    public Package(String spdxid, List<Annotation__1> annotations, List<String> attributionTexts, String builtDate, List<Checksum__1> checksums, String comment, String copyrightText, String description, String downloadLocation, List<ExternalRef> externalRefs, Boolean filesAnalyzed, List<String> hasFiles, String homepage, String licenseComments, String licenseConcluded, String licenseDeclared, List<String> licenseInfoFromFiles, String name, String originator, String packageFileName, PackageVerificationCode packageVerificationCode, Package.PrimaryPackagePurpose primaryPackagePurpose, String releaseDate, String sourceInfo, String summary, String supplier, String validUntilDate, String versionInfo) {
        super();
        this.spdxid = spdxid;
        this.annotations = annotations;
        this.attributionTexts = attributionTexts;
        this.builtDate = builtDate;
        this.checksums = checksums;
        this.comment = comment;
        this.copyrightText = copyrightText;
        this.description = description;
        this.downloadLocation = downloadLocation;
        this.externalRefs = externalRefs;
        this.filesAnalyzed = filesAnalyzed;
        this.hasFiles = hasFiles;
        this.homepage = homepage;
        this.licenseComments = licenseComments;
        this.licenseConcluded = licenseConcluded;
        this.licenseDeclared = licenseDeclared;
        this.licenseInfoFromFiles = licenseInfoFromFiles;
        this.name = name;
        this.originator = originator;
        this.packageFileName = packageFileName;
        this.packageVerificationCode = packageVerificationCode;
        this.primaryPackagePurpose = primaryPackagePurpose;
        this.releaseDate = releaseDate;
        this.sourceInfo = sourceInfo;
        this.summary = summary;
        this.supplier = supplier;
        this.validUntilDate = validUntilDate;
        this.versionInfo = versionInfo;
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
    public List<Annotation__1> getAnnotations() {
        return annotations;
    }

    /**
     * Provide additional information about an SpdxElement.
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(List<Annotation__1> annotations) {
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

    /**
     * This field provides a place for recording the actual date the package was built.
     * 
     */
    @JsonProperty("builtDate")
    public String getBuiltDate() {
        return builtDate;
    }

    /**
     * This field provides a place for recording the actual date the package was built.
     * 
     */
    @JsonProperty("builtDate")
    public void setBuiltDate(String builtDate) {
        this.builtDate = builtDate;
    }

    /**
     * The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * 
     */
    @JsonProperty("checksums")
    public List<Checksum__1> getChecksums() {
        return checksums;
    }

    /**
     * The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * 
     */
    @JsonProperty("checksums")
    public void setChecksums(List<Checksum__1> checksums) {
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
     * Provides a detailed description of the package.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Provides a detailed description of the package.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.
     * (Required)
     * 
     */
    @JsonProperty("downloadLocation")
    public String getDownloadLocation() {
        return downloadLocation;
    }

    /**
     * The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.
     * (Required)
     * 
     */
    @JsonProperty("downloadLocation")
    public void setDownloadLocation(String downloadLocation) {
        this.downloadLocation = downloadLocation;
    }

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
     * 
     */
    @JsonProperty("externalRefs")
    public List<ExternalRef> getExternalRefs() {
        return externalRefs;
    }

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
     * 
     */
    @JsonProperty("externalRefs")
    public void setExternalRefs(List<ExternalRef> externalRefs) {
        this.externalRefs = externalRefs;
    }

    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.
     * 
     */
    @JsonProperty("filesAnalyzed")
    public Boolean getFilesAnalyzed() {
        return filesAnalyzed;
    }

    /**
     * Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.
     * 
     */
    @JsonProperty("filesAnalyzed")
    public void setFilesAnalyzed(Boolean filesAnalyzed) {
        this.filesAnalyzed = filesAnalyzed;
    }

    /**
     * Indicates that a particular file belongs to a package.
     * 
     */
    @JsonProperty("hasFiles")
    public List<String> getHasFiles() {
        return hasFiles;
    }

    /**
     * Indicates that a particular file belongs to a package.
     * 
     */
    @JsonProperty("hasFiles")
    public void setHasFiles(List<String> hasFiles) {
        this.hasFiles = hasFiles;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
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
     * License expression for licenseDeclared. See SPDX Annex D for the license expression syntax.  The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist.
     * 
     */
    @JsonProperty("licenseDeclared")
    public String getLicenseDeclared() {
        return licenseDeclared;
    }

    /**
     * License expression for licenseDeclared. See SPDX Annex D for the license expression syntax.  The licensing that the creators of the software in the package, or the packager, have declared. Declarations by the original software creator should be preferred, if they exist.
     * 
     */
    @JsonProperty("licenseDeclared")
    public void setLicenseDeclared(String licenseDeclared) {
        this.licenseDeclared = licenseDeclared;
    }

    /**
     * The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.
     * 
     * If the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoFromFiles")
    public List<String> getLicenseInfoFromFiles() {
        return licenseInfoFromFiles;
    }

    /**
     * The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.
     * 
     * If the licenseInfoFromFiles field is not present for a package and filesAnalyzed property for that same pacakge is true or omitted, it implies an equivalent meaning to NOASSERTION.
     * 
     */
    @JsonProperty("licenseInfoFromFiles")
    public void setLicenseInfoFromFiles(List<String> licenseInfoFromFiles) {
        this.licenseInfoFromFiles = licenseInfoFromFiles;
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
     * The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.
     * 
     */
    @JsonProperty("originator")
    public String getOriginator() {
        return originator;
    }

    /**
     * The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.
     * 
     */
    @JsonProperty("originator")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    /**
     * The base name of the package file name. For example, zlib-1.2.5.tar.gz.
     * 
     */
    @JsonProperty("packageFileName")
    public String getPackageFileName() {
        return packageFileName;
    }

    /**
     * The base name of the package file name. For example, zlib-1.2.5.tar.gz.
     * 
     */
    @JsonProperty("packageFileName")
    public void setPackageFileName(String packageFileName) {
        this.packageFileName = packageFileName;
    }

    /**
     * A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.
     * 
     */
    @JsonProperty("packageVerificationCode")
    public PackageVerificationCode getPackageVerificationCode() {
        return packageVerificationCode;
    }

    /**
     * A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.
     * 
     */
    @JsonProperty("packageVerificationCode")
    public void setPackageVerificationCode(PackageVerificationCode packageVerificationCode) {
        this.packageVerificationCode = packageVerificationCode;
    }

    /**
     * This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package.
     * 
     */
    @JsonProperty("primaryPackagePurpose")
    public Package.PrimaryPackagePurpose getPrimaryPackagePurpose() {
        return primaryPackagePurpose;
    }

    /**
     * This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package.
     * 
     */
    @JsonProperty("primaryPackagePurpose")
    public void setPrimaryPackagePurpose(Package.PrimaryPackagePurpose primaryPackagePurpose) {
        this.primaryPackagePurpose = primaryPackagePurpose;
    }

    /**
     * This field provides a place for recording the date the package was released.
     * 
     */
    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * This field provides a place for recording the date the package was released.
     * 
     */
    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.
     * 
     */
    @JsonProperty("sourceInfo")
    public String getSourceInfo() {
        return sourceInfo;
    }

    /**
     * Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.
     * 
     */
    @JsonProperty("sourceInfo")
    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    /**
     * Provides a short description of the package.
     * 
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Provides a short description of the package.
     * 
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.
     * 
     */
    @JsonProperty("supplier")
    public String getSupplier() {
        return supplier;
    }

    /**
     * The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.
     * 
     */
    @JsonProperty("supplier")
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * This field provides a place for recording the end of the support period for a package from the supplier.
     * 
     */
    @JsonProperty("validUntilDate")
    public String getValidUntilDate() {
        return validUntilDate;
    }

    /**
     * This field provides a place for recording the end of the support period for a package from the supplier.
     * 
     */
    @JsonProperty("validUntilDate")
    public void setValidUntilDate(String validUntilDate) {
        this.validUntilDate = validUntilDate;
    }

    /**
     * Provides an indication of the version of the package that is described by this SpdxDocument.
     * 
     */
    @JsonProperty("versionInfo")
    public String getVersionInfo() {
        return versionInfo;
    }

    /**
     * Provides an indication of the version of the package that is described by this SpdxDocument.
     * 
     */
    @JsonProperty("versionInfo")
    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Package.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("builtDate");
        sb.append('=');
        sb.append(((this.builtDate == null)?"<null>":this.builtDate));
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("downloadLocation");
        sb.append('=');
        sb.append(((this.downloadLocation == null)?"<null>":this.downloadLocation));
        sb.append(',');
        sb.append("externalRefs");
        sb.append('=');
        sb.append(((this.externalRefs == null)?"<null>":this.externalRefs));
        sb.append(',');
        sb.append("filesAnalyzed");
        sb.append('=');
        sb.append(((this.filesAnalyzed == null)?"<null>":this.filesAnalyzed));
        sb.append(',');
        sb.append("hasFiles");
        sb.append('=');
        sb.append(((this.hasFiles == null)?"<null>":this.hasFiles));
        sb.append(',');
        sb.append("homepage");
        sb.append('=');
        sb.append(((this.homepage == null)?"<null>":this.homepage));
        sb.append(',');
        sb.append("licenseComments");
        sb.append('=');
        sb.append(((this.licenseComments == null)?"<null>":this.licenseComments));
        sb.append(',');
        sb.append("licenseConcluded");
        sb.append('=');
        sb.append(((this.licenseConcluded == null)?"<null>":this.licenseConcluded));
        sb.append(',');
        sb.append("licenseDeclared");
        sb.append('=');
        sb.append(((this.licenseDeclared == null)?"<null>":this.licenseDeclared));
        sb.append(',');
        sb.append("licenseInfoFromFiles");
        sb.append('=');
        sb.append(((this.licenseInfoFromFiles == null)?"<null>":this.licenseInfoFromFiles));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("originator");
        sb.append('=');
        sb.append(((this.originator == null)?"<null>":this.originator));
        sb.append(',');
        sb.append("packageFileName");
        sb.append('=');
        sb.append(((this.packageFileName == null)?"<null>":this.packageFileName));
        sb.append(',');
        sb.append("packageVerificationCode");
        sb.append('=');
        sb.append(((this.packageVerificationCode == null)?"<null>":this.packageVerificationCode));
        sb.append(',');
        sb.append("primaryPackagePurpose");
        sb.append('=');
        sb.append(((this.primaryPackagePurpose == null)?"<null>":this.primaryPackagePurpose));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("sourceInfo");
        sb.append('=');
        sb.append(((this.sourceInfo == null)?"<null>":this.sourceInfo));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("supplier");
        sb.append('=');
        sb.append(((this.supplier == null)?"<null>":this.supplier));
        sb.append(',');
        sb.append("validUntilDate");
        sb.append('=');
        sb.append(((this.validUntilDate == null)?"<null>":this.validUntilDate));
        sb.append(',');
        sb.append("versionInfo");
        sb.append('=');
        sb.append(((this.versionInfo == null)?"<null>":this.versionInfo));
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
        result = ((result* 31)+((this.hasFiles == null)? 0 :this.hasFiles.hashCode()));
        result = ((result* 31)+((this.licenseConcluded == null)? 0 :this.licenseConcluded.hashCode()));
        result = ((result* 31)+((this.licenseInfoFromFiles == null)? 0 :this.licenseInfoFromFiles.hashCode()));
        result = ((result* 31)+((this.externalRefs == null)? 0 :this.externalRefs.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.downloadLocation == null)? 0 :this.downloadLocation.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.validUntilDate == null)? 0 :this.validUntilDate.hashCode()));
        result = ((result* 31)+((this.sourceInfo == null)? 0 :this.sourceInfo.hashCode()));
        result = ((result* 31)+((this.primaryPackagePurpose == null)? 0 :this.primaryPackagePurpose.hashCode()));
        result = ((result* 31)+((this.builtDate == null)? 0 :this.builtDate.hashCode()));
        result = ((result* 31)+((this.supplier == null)? 0 :this.supplier.hashCode()));
        result = ((result* 31)+((this.spdxid == null)? 0 :this.spdxid.hashCode()));
        result = ((result* 31)+((this.licenseDeclared == null)? 0 :this.licenseDeclared.hashCode()));
        result = ((result* 31)+((this.attributionTexts == null)? 0 :this.attributionTexts.hashCode()));
        result = ((result* 31)+((this.filesAnalyzed == null)? 0 :this.filesAnalyzed.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.packageFileName == null)? 0 :this.packageFileName.hashCode()));
        result = ((result* 31)+((this.licenseComments == null)? 0 :this.licenseComments.hashCode()));
        result = ((result* 31)+((this.versionInfo == null)? 0 :this.versionInfo.hashCode()));
        result = ((result* 31)+((this.packageVerificationCode == null)? 0 :this.packageVerificationCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.copyrightText == null)? 0 :this.copyrightText.hashCode()));
        result = ((result* 31)+((this.homepage == null)? 0 :this.homepage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Package) == false) {
            return false;
        }
        Package rhs = ((Package) other);
        return (((((((((((((((((((((((((((((this.checksums == rhs.checksums)||((this.checksums!= null)&&this.checksums.equals(rhs.checksums)))&&((this.hasFiles == rhs.hasFiles)||((this.hasFiles!= null)&&this.hasFiles.equals(rhs.hasFiles))))&&((this.licenseConcluded == rhs.licenseConcluded)||((this.licenseConcluded!= null)&&this.licenseConcluded.equals(rhs.licenseConcluded))))&&((this.licenseInfoFromFiles == rhs.licenseInfoFromFiles)||((this.licenseInfoFromFiles!= null)&&this.licenseInfoFromFiles.equals(rhs.licenseInfoFromFiles))))&&((this.externalRefs == rhs.externalRefs)||((this.externalRefs!= null)&&this.externalRefs.equals(rhs.externalRefs))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.downloadLocation == rhs.downloadLocation)||((this.downloadLocation!= null)&&this.downloadLocation.equals(rhs.downloadLocation))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.validUntilDate == rhs.validUntilDate)||((this.validUntilDate!= null)&&this.validUntilDate.equals(rhs.validUntilDate))))&&((this.sourceInfo == rhs.sourceInfo)||((this.sourceInfo!= null)&&this.sourceInfo.equals(rhs.sourceInfo))))&&((this.primaryPackagePurpose == rhs.primaryPackagePurpose)||((this.primaryPackagePurpose!= null)&&this.primaryPackagePurpose.equals(rhs.primaryPackagePurpose))))&&((this.builtDate == rhs.builtDate)||((this.builtDate!= null)&&this.builtDate.equals(rhs.builtDate))))&&((this.supplier == rhs.supplier)||((this.supplier!= null)&&this.supplier.equals(rhs.supplier))))&&((this.spdxid == rhs.spdxid)||((this.spdxid!= null)&&this.spdxid.equals(rhs.spdxid))))&&((this.licenseDeclared == rhs.licenseDeclared)||((this.licenseDeclared!= null)&&this.licenseDeclared.equals(rhs.licenseDeclared))))&&((this.attributionTexts == rhs.attributionTexts)||((this.attributionTexts!= null)&&this.attributionTexts.equals(rhs.attributionTexts))))&&((this.filesAnalyzed == rhs.filesAnalyzed)||((this.filesAnalyzed!= null)&&this.filesAnalyzed.equals(rhs.filesAnalyzed))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.packageFileName == rhs.packageFileName)||((this.packageFileName!= null)&&this.packageFileName.equals(rhs.packageFileName))))&&((this.licenseComments == rhs.licenseComments)||((this.licenseComments!= null)&&this.licenseComments.equals(rhs.licenseComments))))&&((this.versionInfo == rhs.versionInfo)||((this.versionInfo!= null)&&this.versionInfo.equals(rhs.versionInfo))))&&((this.packageVerificationCode == rhs.packageVerificationCode)||((this.packageVerificationCode!= null)&&this.packageVerificationCode.equals(rhs.packageVerificationCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.copyrightText == rhs.copyrightText)||((this.copyrightText!= null)&&this.copyrightText.equals(rhs.copyrightText))))&&((this.homepage == rhs.homepage)||((this.homepage!= null)&&this.homepage.equals(rhs.homepage))));
    }


    /**
     * This field provides information about the primary purpose of the identified package. Package Purpose is intrinsic to how the package is being used rather than the content of the package.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PrimaryPackagePurpose {

        OTHER("OTHER"),
        INSTALL("INSTALL"),
        ARCHIVE("ARCHIVE"),
        FIRMWARE("FIRMWARE"),
        APPLICATION("APPLICATION"),
        FRAMEWORK("FRAMEWORK"),
        LIBRARY("LIBRARY"),
        CONTAINER("CONTAINER"),
        SOURCE("SOURCE"),
        DEVICE("DEVICE"),
        OPERATING_SYSTEM("OPERATING_SYSTEM"),
        FILE("FILE");
        private final String value;
        private final static Map<String, Package.PrimaryPackagePurpose> CONSTANTS = new HashMap<String, Package.PrimaryPackagePurpose>();

        static {
            for (Package.PrimaryPackagePurpose c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PrimaryPackagePurpose(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Package.PrimaryPackagePurpose fromValue(String value) {
            Package.PrimaryPackagePurpose constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
