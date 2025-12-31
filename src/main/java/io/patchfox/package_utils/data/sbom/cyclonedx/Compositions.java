package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Compositions
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "aggregate",
    "assemblies",
    "dependencies",
    "vulnerabilities",
    "signature"
})
public class Compositions {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("aggregate")
    private Compositions.AggregateType aggregate = Compositions.AggregateType.fromValue("not_specified");
    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the components or services being described. Assemblies refer to nested relationships whereby a constituent part may include other constituent parts. References do not cascade to child parts. References are explicit for the specified constituent part only.
     * 
     */
    @JsonProperty("assemblies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The bom-ref identifiers of the components or services being described. Assemblies refer to nested relationships whereby a constituent part may include other constituent parts. References do not cascade to child parts. References are explicit for the specified constituent part only.")
    private Set<Object> assemblies = new LinkedHashSet<Object>();
    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the components or services being described. Dependencies refer to a relationship whereby an independent constituent part requires another independent constituent part. References do not cascade to transitive dependencies. References are explicit for the specified dependency only.
     * 
     */
    @JsonProperty("dependencies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The bom-ref identifiers of the components or services being described. Dependencies refer to a relationship whereby an independent constituent part requires another independent constituent part. References do not cascade to transitive dependencies. References are explicit for the specified dependency only.")
    private Set<String> dependencies = new LinkedHashSet<String>();
    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the vulnerabilities being described.
     * 
     */
    @JsonProperty("vulnerabilities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("The bom-ref identifiers of the vulnerabilities being described.")
    private Set<String> vulnerabilities = new LinkedHashSet<String>();
    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    private Signature signature;

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    public String getBomRef() {
        return bomRef;
    }

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    public void setBomRef(String bomRef) {
        this.bomRef = bomRef;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("aggregate")
    public Compositions.AggregateType getAggregate() {
        return aggregate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("aggregate")
    public void setAggregate(Compositions.AggregateType aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the components or services being described. Assemblies refer to nested relationships whereby a constituent part may include other constituent parts. References do not cascade to child parts. References are explicit for the specified constituent part only.
     * 
     */
    @JsonProperty("assemblies")
    public Set<Object> getAssemblies() {
        return assemblies;
    }

    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the components or services being described. Assemblies refer to nested relationships whereby a constituent part may include other constituent parts. References do not cascade to child parts. References are explicit for the specified constituent part only.
     * 
     */
    @JsonProperty("assemblies")
    public void setAssemblies(Set<Object> assemblies) {
        this.assemblies = assemblies;
    }

    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the components or services being described. Dependencies refer to a relationship whereby an independent constituent part requires another independent constituent part. References do not cascade to transitive dependencies. References are explicit for the specified dependency only.
     * 
     */
    @JsonProperty("dependencies")
    public Set<String> getDependencies() {
        return dependencies;
    }

    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the components or services being described. Dependencies refer to a relationship whereby an independent constituent part requires another independent constituent part. References do not cascade to transitive dependencies. References are explicit for the specified dependency only.
     * 
     */
    @JsonProperty("dependencies")
    public void setDependencies(Set<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the vulnerabilities being described.
     * 
     */
    @JsonProperty("vulnerabilities")
    public Set<String> getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * BOM references
     * <p>
     * The bom-ref identifiers of the vulnerabilities being described.
     * 
     */
    @JsonProperty("vulnerabilities")
    public void setVulnerabilities(Set<String> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    public Signature getSignature() {
        return signature;
    }

    /**
     * Signature
     * <p>
     * 
     * 
     */
    @JsonProperty("signature")
    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Compositions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("aggregate");
        sb.append('=');
        sb.append(((this.aggregate == null)?"<null>":this.aggregate));
        sb.append(',');
        sb.append("assemblies");
        sb.append('=');
        sb.append(((this.assemblies == null)?"<null>":this.assemblies));
        sb.append(',');
        sb.append("dependencies");
        sb.append('=');
        sb.append(((this.dependencies == null)?"<null>":this.dependencies));
        sb.append(',');
        sb.append("vulnerabilities");
        sb.append('=');
        sb.append(((this.vulnerabilities == null)?"<null>":this.vulnerabilities));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
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
        result = ((result* 31)+((this.vulnerabilities == null)? 0 :this.vulnerabilities.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.assemblies == null)? 0 :this.assemblies.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.aggregate == null)? 0 :this.aggregate.hashCode()));
        result = ((result* 31)+((this.dependencies == null)? 0 :this.dependencies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Compositions) == false) {
            return false;
        }
        Compositions rhs = ((Compositions) other);
        return (((((((this.vulnerabilities == rhs.vulnerabilities)||((this.vulnerabilities!= null)&&this.vulnerabilities.equals(rhs.vulnerabilities)))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.assemblies == rhs.assemblies)||((this.assemblies!= null)&&this.assemblies.equals(rhs.assemblies))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.aggregate == rhs.aggregate)||((this.aggregate!= null)&&this.aggregate.equals(rhs.aggregate))))&&((this.dependencies == rhs.dependencies)||((this.dependencies!= null)&&this.dependencies.equals(rhs.dependencies))));
    }

    public enum AggregateType {

        COMPLETE("complete"),
        INCOMPLETE("incomplete"),
        INCOMPLETE_FIRST_PARTY_ONLY("incomplete_first_party_only"),
        INCOMPLETE_FIRST_PARTY_PROPRIETARY_ONLY("incomplete_first_party_proprietary_only"),
        INCOMPLETE_FIRST_PARTY_OPENSOURCE_ONLY("incomplete_first_party_opensource_only"),
        INCOMPLETE_THIRD_PARTY_ONLY("incomplete_third_party_only"),
        INCOMPLETE_THIRD_PARTY_PROPRIETARY_ONLY("incomplete_third_party_proprietary_only"),
        INCOMPLETE_THIRD_PARTY_OPENSOURCE_ONLY("incomplete_third_party_opensource_only"),
        UNKNOWN("unknown"),
        NOT_SPECIFIED("not_specified");
        private final String value;
        private final static Map<String, Compositions.AggregateType> CONSTANTS = new HashMap<String, Compositions.AggregateType>();

        static {
            for (Compositions.AggregateType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AggregateType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Compositions.AggregateType fromValue(String value) {
            Compositions.AggregateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
