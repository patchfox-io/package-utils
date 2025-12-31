package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Graphics Collection
 * <p>
 * A collection of graphics that represent various measurements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "collection"
})
public class GraphicsCollection {

    /**
     * A description of this collection of graphics.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of this collection of graphics.")
    private String description;
    /**
     * A collection of graphics.
     * 
     */
    @JsonProperty("collection")
    @JsonPropertyDescription("A collection of graphics.")
    private List<Graphic> collection = new ArrayList<Graphic>();

    /**
     * A description of this collection of graphics.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description of this collection of graphics.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A collection of graphics.
     * 
     */
    @JsonProperty("collection")
    public List<Graphic> getCollection() {
        return collection;
    }

    /**
     * A collection of graphics.
     * 
     */
    @JsonProperty("collection")
    public void setCollection(List<Graphic> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GraphicsCollection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("collection");
        sb.append('=');
        sb.append(((this.collection == null)?"<null>":this.collection));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.collection == null)? 0 :this.collection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphicsCollection) == false) {
            return false;
        }
        GraphicsCollection rhs = ((GraphicsCollection) other);
        return (((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.collection == rhs.collection)||((this.collection!= null)&&this.collection.equals(rhs.collection))));
    }

}
