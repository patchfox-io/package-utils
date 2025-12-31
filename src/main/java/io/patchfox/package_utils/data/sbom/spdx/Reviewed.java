
package io.patchfox.package_utils.data.sbom.spdx;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This class has been deprecated in favor of an Annotation with an Annotation type of review.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment",
    "reviewDate",
    "reviewer"
})
@Generated("jsonschema2pojo")
public class Reviewed {

    @JsonProperty("comment")
    private String comment;
    /**
     * The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.
     * (Required)
     * 
     */
    @JsonProperty("reviewDate")
    @JsonPropertyDescription("The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.")
    private String reviewDate;
    /**
     * The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review.
     * 
     */
    @JsonProperty("reviewer")
    @JsonPropertyDescription("The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review.")
    private String reviewer;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reviewed() {
    }

    /**
     * 
     * @param reviewDate
     * @param comment
     * @param reviewer
     */
    public Reviewed(String comment, String reviewDate, String reviewer) {
        super();
        this.comment = comment;
        this.reviewDate = reviewDate;
        this.reviewer = reviewer;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.
     * (Required)
     * 
     */
    @JsonProperty("reviewDate")
    public String getReviewDate() {
        return reviewDate;
    }

    /**
     * The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.
     * (Required)
     * 
     */
    @JsonProperty("reviewDate")
    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    /**
     * The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review.
     * 
     */
    @JsonProperty("reviewer")
    public String getReviewer() {
        return reviewer;
    }

    /**
     * The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.  The reviewer property is deprecated in favor of Annotation with an annotationType review.
     * 
     */
    @JsonProperty("reviewer")
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reviewed.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("reviewDate");
        sb.append('=');
        sb.append(((this.reviewDate == null)?"<null>":this.reviewDate));
        sb.append(',');
        sb.append("reviewer");
        sb.append('=');
        sb.append(((this.reviewer == null)?"<null>":this.reviewer));
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
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.reviewer == null)? 0 :this.reviewer.hashCode()));
        result = ((result* 31)+((this.reviewDate == null)? 0 :this.reviewDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reviewed) == false) {
            return false;
        }
        Reviewed rhs = ((Reviewed) other);
        return ((((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment)))&&((this.reviewer == rhs.reviewer)||((this.reviewer!= null)&&this.reviewer.equals(rhs.reviewer))))&&((this.reviewDate == rhs.reviewDate)||((this.reviewDate!= null)&&this.reviewDate.equals(rhs.reviewDate))));
    }

}
