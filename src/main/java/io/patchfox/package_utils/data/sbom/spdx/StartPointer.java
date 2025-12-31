
package io.patchfox.package_utils.data.sbom.spdx;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reference",
    "offset",
    "lineNumber"
})
@Generated("jsonschema2pojo")
public class StartPointer {

    /**
     * SPDX ID for File
     * (Required)
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("SPDX ID for File")
    private String reference;
    /**
     * Byte offset in the file
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Byte offset in the file")
    private Integer offset;
    /**
     * line number offset in the file
     * 
     */
    @JsonProperty("lineNumber")
    @JsonPropertyDescription("line number offset in the file")
    private Integer lineNumber;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StartPointer() {
    }

    /**
     * 
     * @param reference
     * @param offset
     * @param lineNumber
     */
    public StartPointer(String reference, Integer offset, Integer lineNumber) {
        super();
        this.reference = reference;
        this.offset = offset;
        this.lineNumber = lineNumber;
    }

    /**
     * SPDX ID for File
     * (Required)
     * 
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * SPDX ID for File
     * (Required)
     * 
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Byte offset in the file
     * 
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Byte offset in the file
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * line number offset in the file
     * 
     */
    @JsonProperty("lineNumber")
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * line number offset in the file
     * 
     */
    @JsonProperty("lineNumber")
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StartPointer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("lineNumber");
        sb.append('=');
        sb.append(((this.lineNumber == null)?"<null>":this.lineNumber));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.lineNumber == null)? 0 :this.lineNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartPointer) == false) {
            return false;
        }
        StartPointer rhs = ((StartPointer) other);
        return ((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.lineNumber == rhs.lineNumber)||((this.lineNumber!= null)&&this.lineNumber.equals(rhs.lineNumber))));
    }

}
