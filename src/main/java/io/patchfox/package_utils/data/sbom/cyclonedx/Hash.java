package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Hash Objects
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alg",
    "content"
})
public class Hash {

    /**
     * Hash Algorithm
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    private Hash.HashAlg alg;
    /**
     * Hash Content (value)
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("content")
    private String content;

    /**
     * Hash Algorithm
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    public Hash.HashAlg getAlg() {
        return alg;
    }

    /**
     * Hash Algorithm
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("alg")
    public void setAlg(Hash.HashAlg alg) {
        this.alg = alg;
    }

    /**
     * Hash Content (value)
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Hash Content (value)
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hash.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alg");
        sb.append('=');
        sb.append(((this.alg == null)?"<null>":this.alg));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
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
        result = ((result* 31)+((this.alg == null)? 0 :this.alg.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hash) == false) {
            return false;
        }
        Hash rhs = ((Hash) other);
        return (((this.alg == rhs.alg)||((this.alg!= null)&&this.alg.equals(rhs.alg)))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }


    /**
     * Hash Algorithm
     * <p>
     * 
     * 
     */
    public enum HashAlg {

        MD_5("MD5"),
        SHA_1("SHA-1"),
        SHA_256("SHA-256"),
        SHA_384("SHA-384"),
        SHA_512("SHA-512"),
        SHA_3_256("SHA3-256"),
        SHA_3_384("SHA3-384"),
        SHA_3_512("SHA3-512"),
        BLAKE_2_B_256("BLAKE2b-256"),
        BLAKE_2_B_384("BLAKE2b-384"),
        BLAKE_2_B_512("BLAKE2b-512"),
        BLAKE_3("BLAKE3");
        private final String value;
        private final static Map<String, Hash.HashAlg> CONSTANTS = new HashMap<String, Hash.HashAlg>();

        static {
            for (Hash.HashAlg c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        HashAlg(String value) {
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
        public static Hash.HashAlg fromValue(String value) {
            Hash.HashAlg constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
