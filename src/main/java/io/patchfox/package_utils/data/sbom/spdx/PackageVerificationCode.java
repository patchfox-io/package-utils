
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "packageVerificationCodeExcludedFiles",
    "packageVerificationCodeValue"
})
@Generated("jsonschema2pojo")
public class PackageVerificationCode {

    /**
     * A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.
     * 
     */
    @JsonProperty("packageVerificationCodeExcludedFiles")
    @JsonPropertyDescription("A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.")
    private List<String> packageVerificationCodeExcludedFiles;
    /**
     * The actual package verification code as a hex encoded value.
     * (Required)
     * 
     */
    @JsonProperty("packageVerificationCodeValue")
    @JsonPropertyDescription("The actual package verification code as a hex encoded value.")
    private String packageVerificationCodeValue;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PackageVerificationCode() {
    }

    /**
     * 
     * @param packageVerificationCodeExcludedFiles
     * @param packageVerificationCodeValue
     */
    public PackageVerificationCode(List<String> packageVerificationCodeExcludedFiles, String packageVerificationCodeValue) {
        super();
        this.packageVerificationCodeExcludedFiles = packageVerificationCodeExcludedFiles;
        this.packageVerificationCodeValue = packageVerificationCodeValue;
    }

    /**
     * A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.
     * 
     */
    @JsonProperty("packageVerificationCodeExcludedFiles")
    public List<String> getPackageVerificationCodeExcludedFiles() {
        return packageVerificationCodeExcludedFiles;
    }

    /**
     * A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.
     * 
     */
    @JsonProperty("packageVerificationCodeExcludedFiles")
    public void setPackageVerificationCodeExcludedFiles(List<String> packageVerificationCodeExcludedFiles) {
        this.packageVerificationCodeExcludedFiles = packageVerificationCodeExcludedFiles;
    }

    /**
     * The actual package verification code as a hex encoded value.
     * (Required)
     * 
     */
    @JsonProperty("packageVerificationCodeValue")
    public String getPackageVerificationCodeValue() {
        return packageVerificationCodeValue;
    }

    /**
     * The actual package verification code as a hex encoded value.
     * (Required)
     * 
     */
    @JsonProperty("packageVerificationCodeValue")
    public void setPackageVerificationCodeValue(String packageVerificationCodeValue) {
        this.packageVerificationCodeValue = packageVerificationCodeValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PackageVerificationCode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("packageVerificationCodeExcludedFiles");
        sb.append('=');
        sb.append(((this.packageVerificationCodeExcludedFiles == null)?"<null>":this.packageVerificationCodeExcludedFiles));
        sb.append(',');
        sb.append("packageVerificationCodeValue");
        sb.append('=');
        sb.append(((this.packageVerificationCodeValue == null)?"<null>":this.packageVerificationCodeValue));
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
        result = ((result* 31)+((this.packageVerificationCodeValue == null)? 0 :this.packageVerificationCodeValue.hashCode()));
        result = ((result* 31)+((this.packageVerificationCodeExcludedFiles == null)? 0 :this.packageVerificationCodeExcludedFiles.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PackageVerificationCode) == false) {
            return false;
        }
        PackageVerificationCode rhs = ((PackageVerificationCode) other);
        return (((this.packageVerificationCodeValue == rhs.packageVerificationCodeValue)||((this.packageVerificationCodeValue!= null)&&this.packageVerificationCodeValue.equals(rhs.packageVerificationCodeValue)))&&((this.packageVerificationCodeExcludedFiles == rhs.packageVerificationCodeExcludedFiles)||((this.packageVerificationCodeExcludedFiles!= null)&&this.packageVerificationCodeExcludedFiles.equals(rhs.packageVerificationCodeExcludedFiles))));
    }

}
