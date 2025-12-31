package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Evidence
 * <p>
 * Provides the ability to document evidence collected through various forms of extraction or analysis.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identity",
    "occurrences",
    "callstack",
    "licenses",
    "copyright"
})
public class ComponentEvidence {

    /**
     * Evidence that substantiates the identity of a component.
     * 
     */
    @JsonProperty("identity")
    @JsonPropertyDescription("Evidence that substantiates the identity of a component.")
    private Identity identity;
    /**
     * Occurrences
     * <p>
     * Evidence of individual instances of a component spread across multiple locations.
     * 
     */
    @JsonProperty("occurrences")
    @JsonPropertyDescription("Evidence of individual instances of a component spread across multiple locations.")
    private List<Occurrence> occurrences = new ArrayList<Occurrence>();
    /**
     * Evidence of the components use through the callstack.
     * 
     */
    @JsonProperty("callstack")
    @JsonPropertyDescription("Evidence of the components use through the callstack.")
    private Callstack callstack;
    /**
     * License Choice
     * <p>
     * EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)
     * 
     */
    @JsonProperty("licenses")
    @JsonPropertyDescription("EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)")
    private List<Object> licenses = new ArrayList<Object>();
    /**
     * Copyright
     * <p>
     * 
     * 
     */
    @JsonProperty("copyright")
    private List<Copyright> copyright = new ArrayList<Copyright>();

    /**
     * Evidence that substantiates the identity of a component.
     * 
     */
    @JsonProperty("identity")
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Evidence that substantiates the identity of a component.
     * 
     */
    @JsonProperty("identity")
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    /**
     * Occurrences
     * <p>
     * Evidence of individual instances of a component spread across multiple locations.
     * 
     */
    @JsonProperty("occurrences")
    public List<Occurrence> getOccurrences() {
        return occurrences;
    }

    /**
     * Occurrences
     * <p>
     * Evidence of individual instances of a component spread across multiple locations.
     * 
     */
    @JsonProperty("occurrences")
    public void setOccurrences(List<Occurrence> occurrences) {
        this.occurrences = occurrences;
    }

    /**
     * Evidence of the components use through the callstack.
     * 
     */
    @JsonProperty("callstack")
    public Callstack getCallstack() {
        return callstack;
    }

    /**
     * Evidence of the components use through the callstack.
     * 
     */
    @JsonProperty("callstack")
    public void setCallstack(Callstack callstack) {
        this.callstack = callstack;
    }

    /**
     * License Choice
     * <p>
     * EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)
     * 
     */
    @JsonProperty("licenses")
    public List<Object> getLicenses() {
        return licenses;
    }

    /**
     * License Choice
     * <p>
     * EITHER (list of SPDX licenses and/or named licenses) OR (tuple of one SPDX License Expression)
     * 
     */
    @JsonProperty("licenses")
    public void setLicenses(List<Object> licenses) {
        this.licenses = licenses;
    }

    /**
     * Copyright
     * <p>
     * 
     * 
     */
    @JsonProperty("copyright")
    public List<Copyright> getCopyright() {
        return copyright;
    }

    /**
     * Copyright
     * <p>
     * 
     * 
     */
    @JsonProperty("copyright")
    public void setCopyright(List<Copyright> copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComponentEvidence.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("identity");
        sb.append('=');
        sb.append(((this.identity == null)?"<null>":this.identity));
        sb.append(',');
        sb.append("occurrences");
        sb.append('=');
        sb.append(((this.occurrences == null)?"<null>":this.occurrences));
        sb.append(',');
        sb.append("callstack");
        sb.append('=');
        sb.append(((this.callstack == null)?"<null>":this.callstack));
        sb.append(',');
        sb.append("licenses");
        sb.append('=');
        sb.append(((this.licenses == null)?"<null>":this.licenses));
        sb.append(',');
        sb.append("copyright");
        sb.append('=');
        sb.append(((this.copyright == null)?"<null>":this.copyright));
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
        result = ((result* 31)+((this.occurrences == null)? 0 :this.occurrences.hashCode()));
        result = ((result* 31)+((this.callstack == null)? 0 :this.callstack.hashCode()));
        result = ((result* 31)+((this.licenses == null)? 0 :this.licenses.hashCode()));
        result = ((result* 31)+((this.copyright == null)? 0 :this.copyright.hashCode()));
        result = ((result* 31)+((this.identity == null)? 0 :this.identity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComponentEvidence) == false) {
            return false;
        }
        ComponentEvidence rhs = ((ComponentEvidence) other);
        return ((((((this.occurrences == rhs.occurrences)||((this.occurrences!= null)&&this.occurrences.equals(rhs.occurrences)))&&((this.callstack == rhs.callstack)||((this.callstack!= null)&&this.callstack.equals(rhs.callstack))))&&((this.licenses == rhs.licenses)||((this.licenses!= null)&&this.licenses.equals(rhs.licenses))))&&((this.copyright == rhs.copyright)||((this.copyright!= null)&&this.copyright.equals(rhs.copyright))))&&((this.identity == rhs.identity)||((this.identity!= null)&&this.identity.equals(rhs.identity))));
    }

}
