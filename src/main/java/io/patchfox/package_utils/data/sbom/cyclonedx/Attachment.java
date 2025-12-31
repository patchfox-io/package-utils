package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Attachment
 * <p>
 * Specifies the metadata and content for an attachment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contentType",
    "encoding",
    "content"
})
public class Attachment {

    /**
     * Content-Type
     * <p>
     * Specifies the content type of the text. Defaults to text/plain if not specified.
     * 
     */
    @JsonProperty("contentType")
    @JsonPropertyDescription("Specifies the content type of the text. Defaults to text/plain if not specified.")
    private String contentType = "text/plain";
    /**
     * Encoding
     * <p>
     * Specifies the optional encoding the text is represented in.
     * 
     */
    @JsonProperty("encoding")
    @JsonPropertyDescription("Specifies the optional encoding the text is represented in.")
    private Attachment.Encoding encoding;
    /**
     * Attachment Text
     * <p>
     * The attachment data. Proactive controls such as input validation and sanitization should be employed to prevent misuse of attachment text.
     * (Required)
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("The attachment data. Proactive controls such as input validation and sanitization should be employed to prevent misuse of attachment text.")
    private String content;

    /**
     * Content-Type
     * <p>
     * Specifies the content type of the text. Defaults to text/plain if not specified.
     * 
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * Content-Type
     * <p>
     * Specifies the content type of the text. Defaults to text/plain if not specified.
     * 
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Encoding
     * <p>
     * Specifies the optional encoding the text is represented in.
     * 
     */
    @JsonProperty("encoding")
    public Attachment.Encoding getEncoding() {
        return encoding;
    }

    /**
     * Encoding
     * <p>
     * Specifies the optional encoding the text is represented in.
     * 
     */
    @JsonProperty("encoding")
    public void setEncoding(Attachment.Encoding encoding) {
        this.encoding = encoding;
    }

    /**
     * Attachment Text
     * <p>
     * The attachment data. Proactive controls such as input validation and sanitization should be employed to prevent misuse of attachment text.
     * (Required)
     * 
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Attachment Text
     * <p>
     * The attachment data. Proactive controls such as input validation and sanitization should be employed to prevent misuse of attachment text.
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
        sb.append(Attachment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("encoding");
        sb.append('=');
        sb.append(((this.encoding == null)?"<null>":this.encoding));
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
        result = ((result* 31)+((this.encoding == null)? 0 :this.encoding.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attachment) == false) {
            return false;
        }
        Attachment rhs = ((Attachment) other);
        return ((((this.encoding == rhs.encoding)||((this.encoding!= null)&&this.encoding.equals(rhs.encoding)))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }


    /**
     * Encoding
     * <p>
     * Specifies the optional encoding the text is represented in.
     * 
     */
    public enum Encoding {

        BASE_64("base64");
        private final String value;
        private final static Map<String, Attachment.Encoding> CONSTANTS = new HashMap<String, Attachment.Encoding>();

        static {
            for (Attachment.Encoding c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Encoding(String value) {
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
        public static Attachment.Encoding fromValue(String value) {
            Attachment.Encoding constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
