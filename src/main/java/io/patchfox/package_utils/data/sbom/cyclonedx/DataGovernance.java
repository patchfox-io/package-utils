package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Data Governance
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "custodians",
    "stewards",
    "owners"
})
public class DataGovernance {

    /**
     * Data Custodians
     * <p>
     * Data custodians are responsible for the safe custody, transport, and storage of data.
     * 
     */
    @JsonProperty("custodians")
    @JsonPropertyDescription("Data custodians are responsible for the safe custody, transport, and storage of data.")
    private List<DataGovernanceResponsibleParty> custodians = new ArrayList<DataGovernanceResponsibleParty>();
    /**
     * Data Stewards
     * <p>
     * Data stewards are responsible for data content, context, and associated business rules.
     * 
     */
    @JsonProperty("stewards")
    @JsonPropertyDescription("Data stewards are responsible for data content, context, and associated business rules.")
    private List<DataGovernanceResponsibleParty> stewards = new ArrayList<DataGovernanceResponsibleParty>();
    /**
     * Data Owners
     * <p>
     * Data owners are concerned with risk and appropriate access to data.
     * 
     */
    @JsonProperty("owners")
    @JsonPropertyDescription("Data owners are concerned with risk and appropriate access to data.")
    private List<DataGovernanceResponsibleParty> owners = new ArrayList<DataGovernanceResponsibleParty>();

    /**
     * Data Custodians
     * <p>
     * Data custodians are responsible for the safe custody, transport, and storage of data.
     * 
     */
    @JsonProperty("custodians")
    public List<DataGovernanceResponsibleParty> getCustodians() {
        return custodians;
    }

    /**
     * Data Custodians
     * <p>
     * Data custodians are responsible for the safe custody, transport, and storage of data.
     * 
     */
    @JsonProperty("custodians")
    public void setCustodians(List<DataGovernanceResponsibleParty> custodians) {
        this.custodians = custodians;
    }

    /**
     * Data Stewards
     * <p>
     * Data stewards are responsible for data content, context, and associated business rules.
     * 
     */
    @JsonProperty("stewards")
    public List<DataGovernanceResponsibleParty> getStewards() {
        return stewards;
    }

    /**
     * Data Stewards
     * <p>
     * Data stewards are responsible for data content, context, and associated business rules.
     * 
     */
    @JsonProperty("stewards")
    public void setStewards(List<DataGovernanceResponsibleParty> stewards) {
        this.stewards = stewards;
    }

    /**
     * Data Owners
     * <p>
     * Data owners are concerned with risk and appropriate access to data.
     * 
     */
    @JsonProperty("owners")
    public List<DataGovernanceResponsibleParty> getOwners() {
        return owners;
    }

    /**
     * Data Owners
     * <p>
     * Data owners are concerned with risk and appropriate access to data.
     * 
     */
    @JsonProperty("owners")
    public void setOwners(List<DataGovernanceResponsibleParty> owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataGovernance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("custodians");
        sb.append('=');
        sb.append(((this.custodians == null)?"<null>":this.custodians));
        sb.append(',');
        sb.append("stewards");
        sb.append('=');
        sb.append(((this.stewards == null)?"<null>":this.stewards));
        sb.append(',');
        sb.append("owners");
        sb.append('=');
        sb.append(((this.owners == null)?"<null>":this.owners));
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
        result = ((result* 31)+((this.stewards == null)? 0 :this.stewards.hashCode()));
        result = ((result* 31)+((this.custodians == null)? 0 :this.custodians.hashCode()));
        result = ((result* 31)+((this.owners == null)? 0 :this.owners.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataGovernance) == false) {
            return false;
        }
        DataGovernance rhs = ((DataGovernance) other);
        return ((((this.stewards == rhs.stewards)||((this.stewards!= null)&&this.stewards.equals(rhs.stewards)))&&((this.custodians == rhs.custodians)||((this.custodians!= null)&&this.custodians.equals(rhs.custodians))))&&((this.owners == rhs.owners)||((this.owners!= null)&&this.owners.equals(rhs.owners))));
    }

}
