package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Model Card
 * <p>
 * A model card describes the intended uses of a machine learning model and potential limitations, including biases and ethical considerations. Model cards typically contain the training parameters, which datasets were used to train the model, performance metrics, and other relevant data useful for ML transparency. This object SHOULD be specified for any component of type `machine-learning-model` and MUST NOT be specified for other component types.Model card support in CycloneDX is derived from TensorFlow Model Card Toolkit released under the Apache 2.0 license and available from https://github.com/tensorflow/model-card-toolkit/blob/main/model_card_toolkit/schema/v0.0.2/model_card.schema.json. In addition, CycloneDX model card support includes portions of VerifyML, also released under the Apache 2.0 license and available from https://github.com/cylynx/verifyml/blob/main/verifyml/model_card_toolkit/schema/v0.0.4/model_card.schema.json.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "modelParameters",
    "quantitativeAnalysis",
    "considerations",
    "properties"
})
public class ModelCard {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Model Parameters
     * <p>
     * Hyper-parameters for construction of the model.
     * 
     */
    @JsonProperty("modelParameters")
    @JsonPropertyDescription("Hyper-parameters for construction of the model.")
    private ModelParameters modelParameters;
    /**
     * Quantitative Analysis
     * <p>
     * A quantitative analysis of the model
     * 
     */
    @JsonProperty("quantitativeAnalysis")
    @JsonPropertyDescription("A quantitative analysis of the model")
    private QuantitativeAnalysis quantitativeAnalysis;
    /**
     * Considerations
     * <p>
     * What considerations should be taken into account regarding the model's construction, training, and application?
     * 
     */
    @JsonProperty("considerations")
    @JsonPropertyDescription("What considerations should be taken into account regarding the model's construction, training, and application?")
    private Considerations considerations;
    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.")
    private List<Property> properties = new ArrayList<Property>();

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
     * Model Parameters
     * <p>
     * Hyper-parameters for construction of the model.
     * 
     */
    @JsonProperty("modelParameters")
    public ModelParameters getModelParameters() {
        return modelParameters;
    }

    /**
     * Model Parameters
     * <p>
     * Hyper-parameters for construction of the model.
     * 
     */
    @JsonProperty("modelParameters")
    public void setModelParameters(ModelParameters modelParameters) {
        this.modelParameters = modelParameters;
    }

    /**
     * Quantitative Analysis
     * <p>
     * A quantitative analysis of the model
     * 
     */
    @JsonProperty("quantitativeAnalysis")
    public QuantitativeAnalysis getQuantitativeAnalysis() {
        return quantitativeAnalysis;
    }

    /**
     * Quantitative Analysis
     * <p>
     * A quantitative analysis of the model
     * 
     */
    @JsonProperty("quantitativeAnalysis")
    public void setQuantitativeAnalysis(QuantitativeAnalysis quantitativeAnalysis) {
        this.quantitativeAnalysis = quantitativeAnalysis;
    }

    /**
     * Considerations
     * <p>
     * What considerations should be taken into account regarding the model's construction, training, and application?
     * 
     */
    @JsonProperty("considerations")
    public Considerations getConsiderations() {
        return considerations;
    }

    /**
     * Considerations
     * <p>
     * What considerations should be taken into account regarding the model's construction, training, and application?
     * 
     */
    @JsonProperty("considerations")
    public void setConsiderations(Considerations considerations) {
        this.considerations = considerations;
    }

    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * Provides the ability to document properties in a name-value store. This provides flexibility to include data not officially supported in the standard without having to use additional namespaces or create extensions. Unlike key-value stores, properties support duplicate names, each potentially having different values. Property names of interest to the general public are encouraged to be registered in the [CycloneDX Property Taxonomy](https://github.com/CycloneDX/cyclonedx-property-taxonomy). Formal registration is OPTIONAL.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ModelCard.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("modelParameters");
        sb.append('=');
        sb.append(((this.modelParameters == null)?"<null>":this.modelParameters));
        sb.append(',');
        sb.append("quantitativeAnalysis");
        sb.append('=');
        sb.append(((this.quantitativeAnalysis == null)?"<null>":this.quantitativeAnalysis));
        sb.append(',');
        sb.append("considerations");
        sb.append('=');
        sb.append(((this.considerations == null)?"<null>":this.considerations));
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
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.modelParameters == null)? 0 :this.modelParameters.hashCode()));
        result = ((result* 31)+((this.quantitativeAnalysis == null)? 0 :this.quantitativeAnalysis.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.considerations == null)? 0 :this.considerations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModelCard) == false) {
            return false;
        }
        ModelCard rhs = ((ModelCard) other);
        return ((((((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef)))&&((this.modelParameters == rhs.modelParameters)||((this.modelParameters!= null)&&this.modelParameters.equals(rhs.modelParameters))))&&((this.quantitativeAnalysis == rhs.quantitativeAnalysis)||((this.quantitativeAnalysis!= null)&&this.quantitativeAnalysis.equals(rhs.quantitativeAnalysis))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.considerations == rhs.considerations)||((this.considerations!= null)&&this.considerations.equals(rhs.considerations))));
    }

}
