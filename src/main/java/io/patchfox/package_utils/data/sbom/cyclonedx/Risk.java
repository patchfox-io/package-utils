package io.patchfox.package_utils.data.sbom.cyclonedx;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "mitigationStrategy"
})
public class Risk {

    /**
     * The name of the risk.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the risk.")
    private String name;
    /**
     * Strategy used to address this risk.
     * 
     */
    @JsonProperty("mitigationStrategy")
    @JsonPropertyDescription("Strategy used to address this risk.")
    private String mitigationStrategy;

    /**
     * The name of the risk.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the risk.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Strategy used to address this risk.
     * 
     */
    @JsonProperty("mitigationStrategy")
    public String getMitigationStrategy() {
        return mitigationStrategy;
    }

    /**
     * Strategy used to address this risk.
     * 
     */
    @JsonProperty("mitigationStrategy")
    public void setMitigationStrategy(String mitigationStrategy) {
        this.mitigationStrategy = mitigationStrategy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Risk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("mitigationStrategy");
        sb.append('=');
        sb.append(((this.mitigationStrategy == null)?"<null>":this.mitigationStrategy));
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
        result = ((result* 31)+((this.mitigationStrategy == null)? 0 :this.mitigationStrategy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Risk) == false) {
            return false;
        }
        Risk rhs = ((Risk) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.mitigationStrategy == rhs.mitigationStrategy)||((this.mitigationStrategy!= null)&&this.mitigationStrategy.equals(rhs.mitigationStrategy))));
    }

}
