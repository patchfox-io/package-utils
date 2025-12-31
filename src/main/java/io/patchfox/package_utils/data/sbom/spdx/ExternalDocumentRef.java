
package io.patchfox.package_utils.data.sbom.spdx;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about an external SPDX document reference including the checksum. This allows for verification of the external references.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "checksum",
    "externalDocumentId",
    "spdxDocument"
})
@Generated("jsonschema2pojo")
public class ExternalDocumentRef {

    /**
     * A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    @JsonPropertyDescription("A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.")
    private Checksum checksum;
    /**
     * externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.
     * (Required)
     * 
     */
    @JsonProperty("externalDocumentId")
    @JsonPropertyDescription("externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.")
    private String externalDocumentId;
    /**
     * SPDX ID for SpdxDocument.  A property containing an SPDX document.
     * (Required)
     * 
     */
    @JsonProperty("spdxDocument")
    @JsonPropertyDescription("SPDX ID for SpdxDocument.  A property containing an SPDX document.")
    private String spdxDocument;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalDocumentRef() {
    }

    /**
     * 
     * @param externalDocumentId
     * @param checksum
     * @param spdxDocument
     */
    public ExternalDocumentRef(Checksum checksum, String externalDocumentId, String spdxDocument) {
        super();
        this.checksum = checksum;
        this.externalDocumentId = externalDocumentId;
        this.spdxDocument = spdxDocument;
    }

    /**
     * A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    public Checksum getChecksum() {
        return checksum;
    }

    /**
     * A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    public void setChecksum(Checksum checksum) {
        this.checksum = checksum;
    }

    /**
     * externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.
     * (Required)
     * 
     */
    @JsonProperty("externalDocumentId")
    public String getExternalDocumentId() {
        return externalDocumentId;
    }

    /**
     * externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.
     * (Required)
     * 
     */
    @JsonProperty("externalDocumentId")
    public void setExternalDocumentId(String externalDocumentId) {
        this.externalDocumentId = externalDocumentId;
    }

    /**
     * SPDX ID for SpdxDocument.  A property containing an SPDX document.
     * (Required)
     * 
     */
    @JsonProperty("spdxDocument")
    public String getSpdxDocument() {
        return spdxDocument;
    }

    /**
     * SPDX ID for SpdxDocument.  A property containing an SPDX document.
     * (Required)
     * 
     */
    @JsonProperty("spdxDocument")
    public void setSpdxDocument(String spdxDocument) {
        this.spdxDocument = spdxDocument;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalDocumentRef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
        sb.append(',');
        sb.append("externalDocumentId");
        sb.append('=');
        sb.append(((this.externalDocumentId == null)?"<null>":this.externalDocumentId));
        sb.append(',');
        sb.append("spdxDocument");
        sb.append('=');
        sb.append(((this.spdxDocument == null)?"<null>":this.spdxDocument));
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
        result = ((result* 31)+((this.checksum == null)? 0 :this.checksum.hashCode()));
        result = ((result* 31)+((this.spdxDocument == null)? 0 :this.spdxDocument.hashCode()));
        result = ((result* 31)+((this.externalDocumentId == null)? 0 :this.externalDocumentId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalDocumentRef) == false) {
            return false;
        }
        ExternalDocumentRef rhs = ((ExternalDocumentRef) other);
        return ((((this.checksum == rhs.checksum)||((this.checksum!= null)&&this.checksum.equals(rhs.checksum)))&&((this.spdxDocument == rhs.spdxDocument)||((this.spdxDocument!= null)&&this.spdxDocument.equals(rhs.spdxDocument))))&&((this.externalDocumentId == rhs.externalDocumentId)||((this.externalDocumentId!= null)&&this.externalDocumentId.equals(rhs.externalDocumentId))));
    }

}
