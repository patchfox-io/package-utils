package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Event
 * <p>
 * Represents something that happened that may trigger a response.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uid",
    "description",
    "timeReceived",
    "data",
    "source",
    "target",
    "properties"
})
public class Event {

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier of the event.
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("The unique identifier of the event.")
    private String uid;
    /**
     * Description
     * <p>
     * A description of the event.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the event.")
    private String description;
    /**
     * Time Received
     * <p>
     * The date and time (timestamp) when the event was received.
     * 
     */
    @JsonProperty("timeReceived")
    @JsonPropertyDescription("The date and time (timestamp) when the event was received.")
    private Date timeReceived;
    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Specifies the metadata and content for an attachment.")
    private Attachment data;
    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.")
    private ResourceReferenceChoice source;
    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.")
    private ResourceReferenceChoice target;
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier of the event.
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Unique Identifier (UID)
     * <p>
     * The unique identifier of the event.
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Description
     * <p>
     * A description of the event.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the event.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Time Received
     * <p>
     * The date and time (timestamp) when the event was received.
     * 
     */
    @JsonProperty("timeReceived")
    public Date getTimeReceived() {
        return timeReceived;
    }

    /**
     * Time Received
     * <p>
     * The date and time (timestamp) when the event was received.
     * 
     */
    @JsonProperty("timeReceived")
    public void setTimeReceived(Date timeReceived) {
        this.timeReceived = timeReceived;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("data")
    public Attachment getData() {
        return data;
    }

    /**
     * Attachment
     * <p>
     * Specifies the metadata and content for an attachment.
     * 
     */
    @JsonProperty("data")
    public void setData(Attachment data) {
        this.data = data;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("source")
    public ResourceReferenceChoice getSource() {
        return source;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("source")
    public void setSource(ResourceReferenceChoice source) {
        this.source = source;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("target")
    public ResourceReferenceChoice getTarget() {
        return target;
    }

    /**
     * Resource reference choice
     * <p>
     * A reference to a locally defined resource (e.g., a bom-ref) or an externally accessible resource.Enables reference to a resource that participates in a workflow; using either internal (bom-ref) or external (externalReference) types.
     * 
     */
    @JsonProperty("target")
    public void setTarget(ResourceReferenceChoice target) {
        this.target = target;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("timeReceived");
        sb.append('=');
        sb.append(((this.timeReceived == null)?"<null>":this.timeReceived));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
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
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.timeReceived == null)? 0 :this.timeReceived.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return ((((((((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.timeReceived == rhs.timeReceived)||((this.timeReceived!= null)&&this.timeReceived.equals(rhs.timeReceived))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }

}
