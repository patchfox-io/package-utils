package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "range",
    "status"
})
public class Version {

    /**
     * A single version of a component or service.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("A single version of a component or service.")
    private String version;
    /**
     * A version range specified in Package URL Version Range syntax (vers) which is defined at https://github.com/package-url/purl-spec/VERSION-RANGE-SPEC.rst
     * 
     */
    @JsonProperty("range")
    @JsonPropertyDescription("A version range specified in Package URL Version Range syntax (vers) which is defined at https://github.com/package-url/purl-spec/VERSION-RANGE-SPEC.rst")
    private String range;
    /**
     * The vulnerability status of a given version or range of versions of a product. The statuses 'affected' and 'unaffected' indicate that the version is affected or unaffected by the vulnerability. The status 'unknown' indicates that it is unknown or unspecified whether the given version is affected. There can be many reasons for an 'unknown' status, including that an investigation has not been undertaken or that a vendor has not disclosed the status.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The vulnerability status of a given version or range of versions of a product. The statuses 'affected' and 'unaffected' indicate that the version is affected or unaffected by the vulnerability. The status 'unknown' indicates that it is unknown or unspecified whether the given version is affected. There can be many reasons for an 'unknown' status, including that an investigation has not been undertaken or that a vendor has not disclosed the status.")
    private Version.AffectedStatus status;

    /**
     * A single version of a component or service.
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * A single version of a component or service.
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * A version range specified in Package URL Version Range syntax (vers) which is defined at https://github.com/package-url/purl-spec/VERSION-RANGE-SPEC.rst
     * 
     */
    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    /**
     * A version range specified in Package URL Version Range syntax (vers) which is defined at https://github.com/package-url/purl-spec/VERSION-RANGE-SPEC.rst
     * 
     */
    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * The vulnerability status of a given version or range of versions of a product. The statuses 'affected' and 'unaffected' indicate that the version is affected or unaffected by the vulnerability. The status 'unknown' indicates that it is unknown or unspecified whether the given version is affected. There can be many reasons for an 'unknown' status, including that an investigation has not been undertaken or that a vendor has not disclosed the status.
     * 
     */
    @JsonProperty("status")
    public Version.AffectedStatus getStatus() {
        return status;
    }

    /**
     * The vulnerability status of a given version or range of versions of a product. The statuses 'affected' and 'unaffected' indicate that the version is affected or unaffected by the vulnerability. The status 'unknown' indicates that it is unknown or unspecified whether the given version is affected. There can be many reasons for an 'unknown' status, including that an investigation has not been undertaken or that a vendor has not disclosed the status.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Version.AffectedStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Version.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("range");
        sb.append('=');
        sb.append(((this.range == null)?"<null>":this.range));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.range == null)? 0 :this.range.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Version) == false) {
            return false;
        }
        Version rhs = ((Version) other);
        return ((((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version)))&&((this.range == rhs.range)||((this.range!= null)&&this.range.equals(rhs.range))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The vulnerability status of a given version or range of versions of a product. The statuses 'affected' and 'unaffected' indicate that the version is affected or unaffected by the vulnerability. The status 'unknown' indicates that it is unknown or unspecified whether the given version is affected. There can be many reasons for an 'unknown' status, including that an investigation has not been undertaken or that a vendor has not disclosed the status.
     * 
     */
    public enum AffectedStatus {

        AFFECTED("affected"),
        UNAFFECTED("unaffected"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, Version.AffectedStatus> CONSTANTS = new HashMap<String, Version.AffectedStatus>();

        static {
            for (Version.AffectedStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AffectedStatus(String value) {
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
        public static Version.AffectedStatus fromValue(String value) {
            Version.AffectedStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
