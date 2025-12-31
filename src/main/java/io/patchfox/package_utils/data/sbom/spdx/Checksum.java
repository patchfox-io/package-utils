
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "algorithm",
    "checksumValue"
})
@Generated("jsonschema2pojo")
public class Checksum {

    /**
     * Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    @JsonPropertyDescription("Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.")
    private Checksum.Algorithm algorithm;
    /**
     * The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.
     * (Required)
     * 
     */
    @JsonProperty("checksumValue")
    @JsonPropertyDescription("The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.")
    private String checksumValue;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Checksum() {
    }

    /**
     * 
     * @param checksumValue
     * @param algorithm
     */
    public Checksum(Checksum.Algorithm algorithm, String checksumValue) {
        super();
        this.algorithm = algorithm;
        this.checksumValue = checksumValue;
    }

    /**
     * Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public Checksum.Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(Checksum.Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.
     * (Required)
     * 
     */
    @JsonProperty("checksumValue")
    public String getChecksumValue() {
        return checksumValue;
    }

    /**
     * The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.
     * (Required)
     * 
     */
    @JsonProperty("checksumValue")
    public void setChecksumValue(String checksumValue) {
        this.checksumValue = checksumValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Checksum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null)?"<null>":this.algorithm));
        sb.append(',');
        sb.append("checksumValue");
        sb.append('=');
        sb.append(((this.checksumValue == null)?"<null>":this.checksumValue));
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
        result = ((result* 31)+((this.checksumValue == null)? 0 :this.checksumValue.hashCode()));
        result = ((result* 31)+((this.algorithm == null)? 0 :this.algorithm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checksum) == false) {
            return false;
        }
        Checksum rhs = ((Checksum) other);
        return (((this.checksumValue == rhs.checksumValue)||((this.checksumValue!= null)&&this.checksumValue.equals(rhs.checksumValue)))&&((this.algorithm == rhs.algorithm)||((this.algorithm!= null)&&this.algorithm.equals(rhs.algorithm))));
    }


    /**
     * Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Algorithm {

        SHA_1("SHA1"),
        BLAKE_3("BLAKE3"),
        SHA_3_384("SHA3-384"),
        SHA_256("SHA256"),
        SHA_384("SHA384"),
        BLAKE_2_B_512("BLAKE2b-512"),
        BLAKE_2_B_256("BLAKE2b-256"),
        SHA_3_512("SHA3-512"),
        MD_2("MD2"),
        ADLER_32("ADLER32"),
        MD_4("MD4"),
        SHA_3_256("SHA3-256"),
        BLAKE_2_B_384("BLAKE2b-384"),
        SHA_512("SHA512"),
        MD_6("MD6"),
        MD_5("MD5"),
        SHA_224("SHA224");
        private final String value;
        private final static Map<String, Checksum.Algorithm> CONSTANTS = new HashMap<String, Checksum.Algorithm>();

        static {
            for (Checksum.Algorithm c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Algorithm(String value) {
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
        public static Checksum.Algorithm fromValue(String value) {
            Checksum.Algorithm constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
