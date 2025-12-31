package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Identifiable Action
 * <p>
 * Specifies an individual commit
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "name",
    "email"
})
public class IdentifiableAction {

    /**
     * Timestamp
     * <p>
     * The timestamp in which the action occurred
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("The timestamp in which the action occurred")
    private Date timestamp;
    /**
     * Name
     * <p>
     * The name of the individual who performed the action
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the individual who performed the action")
    private String name;
    /**
     * E-mail
     * <p>
     * The email address of the individual who performed the action
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address of the individual who performed the action")
    private String email;

    /**
     * Timestamp
     * <p>
     * The timestamp in which the action occurred
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp
     * <p>
     * The timestamp in which the action occurred
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Name
     * <p>
     * The name of the individual who performed the action
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the individual who performed the action
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * E-mail
     * <p>
     * The email address of the individual who performed the action
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * E-mail
     * <p>
     * The email address of the individual who performed the action
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdentifiableAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentifiableAction) == false) {
            return false;
        }
        IdentifiableAction rhs = ((IdentifiableAction) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
