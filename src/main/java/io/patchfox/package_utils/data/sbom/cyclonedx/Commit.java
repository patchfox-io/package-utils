package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Commit
 * <p>
 * Specifies an individual commit
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uid",
    "url",
    "author",
    "committer",
    "message"
})
public class Commit {

    /**
     * UID
     * <p>
     * A unique identifier of the commit. This may be version control specific. For example, Subversion uses revision numbers whereas git uses commit hashes.
     * 
     */
    @JsonProperty("uid")
    @JsonPropertyDescription("A unique identifier of the commit. This may be version control specific. For example, Subversion uses revision numbers whereas git uses commit hashes.")
    private String uid;
    /**
     * URL
     * <p>
     * The URL to the commit. This URL will typically point to a commit in a version control system.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL to the commit. This URL will typically point to a commit in a version control system.")
    private String url;
    /**
     * Identifiable Action
     * <p>
     * Specifies an individual commit
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("Specifies an individual commit")
    private IdentifiableAction author;
    /**
     * Identifiable Action
     * <p>
     * Specifies an individual commit
     * 
     */
    @JsonProperty("committer")
    @JsonPropertyDescription("Specifies an individual commit")
    private IdentifiableAction committer;
    /**
     * Message
     * <p>
     * The text description of the contents of the commit
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("The text description of the contents of the commit")
    private String message;

    /**
     * UID
     * <p>
     * A unique identifier of the commit. This may be version control specific. For example, Subversion uses revision numbers whereas git uses commit hashes.
     * 
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * UID
     * <p>
     * A unique identifier of the commit. This may be version control specific. For example, Subversion uses revision numbers whereas git uses commit hashes.
     * 
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * URL
     * <p>
     * The URL to the commit. This URL will typically point to a commit in a version control system.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * The URL to the commit. This URL will typically point to a commit in a version control system.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Identifiable Action
     * <p>
     * Specifies an individual commit
     * 
     */
    @JsonProperty("author")
    public IdentifiableAction getAuthor() {
        return author;
    }

    /**
     * Identifiable Action
     * <p>
     * Specifies an individual commit
     * 
     */
    @JsonProperty("author")
    public void setAuthor(IdentifiableAction author) {
        this.author = author;
    }

    /**
     * Identifiable Action
     * <p>
     * Specifies an individual commit
     * 
     */
    @JsonProperty("committer")
    public IdentifiableAction getCommitter() {
        return committer;
    }

    /**
     * Identifiable Action
     * <p>
     * Specifies an individual commit
     * 
     */
    @JsonProperty("committer")
    public void setCommitter(IdentifiableAction committer) {
        this.committer = committer;
    }

    /**
     * Message
     * <p>
     * The text description of the contents of the commit
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * The text description of the contents of the commit
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Commit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("committer");
        sb.append('=');
        sb.append(((this.committer == null)?"<null>":this.committer));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.committer == null)? 0 :this.committer.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Commit) == false) {
            return false;
        }
        Commit rhs = ((Commit) other);
        return ((((((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid)))&&((this.committer == rhs.committer)||((this.committer!= null)&&this.committer.equals(rhs.committer))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))));
    }

}
