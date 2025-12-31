package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Note
 * <p>
 * A note containing the locale and content.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locale",
    "text"
})
public class Note {

    /**
     * Locale
     * <p>
     * Defines a syntax for representing two character language code (ISO-639) followed by an optional two character country code. The language code MUST be lower case. If the country code is specified, the country code MUST be upper case. The language code and country code MUST be separated by a minus sign. Examples: en, en-US, fr, fr-CA
     * 
     */
    @JsonProperty("locale")
    @JsonPropertyDescription("Defines a syntax for representing two character language code (ISO-639) followed by an optional two character country code. The language code MUST be lower case. If the country code is specified, the country code MUST be upper case. The language code and country code MUST be separated by a minus sign. Examples: en, en-US, fr, fr-CA")
    private String locale;
    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Specifies the metadata and content for an attachment.")
    private Attachment text;

    /**
     * Locale
     * <p>
     * Defines a syntax for representing two character language code (ISO-639) followed by an optional two character country code. The language code MUST be lower case. If the country code is specified, the country code MUST be upper case. The language code and country code MUST be separated by a minus sign. Examples: en, en-US, fr, fr-CA
     * 
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * Locale
     * <p>
     * Defines a syntax for representing two character language code (ISO-639) followed by an optional two character country code. The language code MUST be lower case. If the country code is specified, the country code MUST be upper case. The language code and country code MUST be separated by a minus sign. Examples: en, en-US, fr, fr-CA
     * 
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public Attachment getText() {
        return text;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(Attachment text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Note.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locale");
        sb.append('=');
        sb.append(((this.locale == null)?"<null>":this.locale));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
        result = ((result* 31)+((this.locale == null)? 0 :this.locale.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Note) == false) {
            return false;
        }
        Note rhs = ((Note) other);
        return (((this.locale == rhs.locale)||((this.locale!= null)&&this.locale.equals(rhs.locale)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))));
    }

}
