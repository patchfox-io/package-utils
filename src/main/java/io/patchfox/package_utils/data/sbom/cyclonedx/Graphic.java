package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "image"
})
public class Graphic {

    /**
     * The name of the graphic.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the graphic.")
    private String name;
    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Specifies the metadata and content for an attachment.")
    private Attachment image;

    /**
     * The name of the graphic.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the graphic.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("image")
    public Attachment getImage() {
        return image;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("image")
    public void setImage(Attachment image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Graphic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Graphic) == false) {
            return false;
        }
        Graphic rhs = ((Graphic) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))));
    }

}
