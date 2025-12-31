package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bom-ref",
    "type",
    "name",
    "contents",
    "classification",
    "sensitiveData",
    "graphics",
    "description",
    "governance"
})
public class ComponentData {

    /**
     * Identifier for referable and therefore interlink-able elements.value SHOULD not start with the BOM-Link intro 'urn:cdx:'
     * 
     */
    @JsonProperty("bom-ref")
    @JsonPropertyDescription("Identifier for referable and therefore interlink-able elements.")
    private String bomRef;
    /**
     * Type of Data
     * <p>
     * The general theme or subject matter of the data being specified.
     * 
     * * __source-code__ = Any type of code, code snippet, or data-as-code.
     * * __configuration__ = Parameters or settings that may be used by other components.
     * * __dataset__ = A collection of data.
     * * __definition__ = Data that can be used to create new instances of what the definition defines.
     * * __other__ = Any other type of data that does not fit into existing definitions.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The general theme or subject matter of the data being specified.\n\n* __source-code__ = Any type of code, code snippet, or data-as-code.\n* __configuration__ = Parameters or settings that may be used by other components.\n* __dataset__ = A collection of data.\n* __definition__ = Data that can be used to create new instances of what the definition defines.\n* __other__ = Any other type of data that does not fit into existing definitions.")
    private ComponentData.Type type;
    /**
     * The name of the dataset.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the dataset.")
    private String name;
    /**
     * Data Contents
     * <p>
     * The contents or references to the contents of the data being described.
     * 
     */
    @JsonProperty("contents")
    @JsonPropertyDescription("The contents or references to the contents of the data being described.")
    private Contents contents;
    /**
     * Data Classification
     * <p>
     * Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.")
    private String classification;
    /**
     * A description of any sensitive data in a dataset.
     * 
     */
    @JsonProperty("sensitiveData")
    @JsonPropertyDescription("A description of any sensitive data in a dataset.")
    private List<String> sensitiveData = new ArrayList<String>();
    /**
     * Graphics Collection
     * <p>
     * A collection of graphics that represent various measurements.
     * 
     */
    @JsonProperty("graphics")
    @JsonPropertyDescription("A collection of graphics that represent various measurements.")
    private GraphicsCollection graphics;
    /**
     * A description of the dataset. Can describe size of dataset, whether it's used for source code, training, testing, or validation, etc.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the dataset. Can describe size of dataset, whether it's used for source code, training, testing, or validation, etc.")
    private String description;
    /**
     * Data Governance
     * <p>
     * 
     * 
     */
    @JsonProperty("governance")
    private DataGovernance governance;

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
     * Type of Data
     * <p>
     * The general theme or subject matter of the data being specified.
     * 
     * * __source-code__ = Any type of code, code snippet, or data-as-code.
     * * __configuration__ = Parameters or settings that may be used by other components.
     * * __dataset__ = A collection of data.
     * * __definition__ = Data that can be used to create new instances of what the definition defines.
     * * __other__ = Any other type of data that does not fit into existing definitions.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ComponentData.Type getType() {
        return type;
    }

    /**
     * Type of Data
     * <p>
     * The general theme or subject matter of the data being specified.
     * 
     * * __source-code__ = Any type of code, code snippet, or data-as-code.
     * * __configuration__ = Parameters or settings that may be used by other components.
     * * __dataset__ = A collection of data.
     * * __definition__ = Data that can be used to create new instances of what the definition defines.
     * * __other__ = Any other type of data that does not fit into existing definitions.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ComponentData.Type type) {
        this.type = type;
    }

    /**
     * The name of the dataset.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the dataset.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Data Contents
     * <p>
     * The contents or references to the contents of the data being described.
     * 
     */
    @JsonProperty("contents")
    public Contents getContents() {
        return contents;
    }

    /**
     * Data Contents
     * <p>
     * The contents or references to the contents of the data being described.
     * 
     */
    @JsonProperty("contents")
    public void setContents(Contents contents) {
        this.contents = contents;
    }

    /**
     * Data Classification
     * <p>
     * Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
     * 
     */
    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }

    /**
     * Data Classification
     * <p>
     * Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * A description of any sensitive data in a dataset.
     * 
     */
    @JsonProperty("sensitiveData")
    public List<String> getSensitiveData() {
        return sensitiveData;
    }

    /**
     * A description of any sensitive data in a dataset.
     * 
     */
    @JsonProperty("sensitiveData")
    public void setSensitiveData(List<String> sensitiveData) {
        this.sensitiveData = sensitiveData;
    }

    /**
     * Graphics Collection
     * <p>
     * A collection of graphics that represent various measurements.
     * 
     */
    @JsonProperty("graphics")
    public GraphicsCollection getGraphics() {
        return graphics;
    }

    /**
     * Graphics Collection
     * <p>
     * A collection of graphics that represent various measurements.
     * 
     */
    @JsonProperty("graphics")
    public void setGraphics(GraphicsCollection graphics) {
        this.graphics = graphics;
    }

    /**
     * A description of the dataset. Can describe size of dataset, whether it's used for source code, training, testing, or validation, etc.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * A description of the dataset. Can describe size of dataset, whether it's used for source code, training, testing, or validation, etc.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Data Governance
     * <p>
     * 
     * 
     */
    @JsonProperty("governance")
    public DataGovernance getGovernance() {
        return governance;
    }

    /**
     * Data Governance
     * <p>
     * 
     * 
     */
    @JsonProperty("governance")
    public void setGovernance(DataGovernance governance) {
        this.governance = governance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComponentData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bomRef");
        sb.append('=');
        sb.append(((this.bomRef == null)?"<null>":this.bomRef));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("contents");
        sb.append('=');
        sb.append(((this.contents == null)?"<null>":this.contents));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("sensitiveData");
        sb.append('=');
        sb.append(((this.sensitiveData == null)?"<null>":this.sensitiveData));
        sb.append(',');
        sb.append("graphics");
        sb.append('=');
        sb.append(((this.graphics == null)?"<null>":this.graphics));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("governance");
        sb.append('=');
        sb.append(((this.governance == null)?"<null>":this.governance));
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
        result = ((result* 31)+((this.contents == null)? 0 :this.contents.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.sensitiveData == null)? 0 :this.sensitiveData.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.bomRef == null)? 0 :this.bomRef.hashCode()));
        result = ((result* 31)+((this.graphics == null)? 0 :this.graphics.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.governance == null)? 0 :this.governance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComponentData) == false) {
            return false;
        }
        ComponentData rhs = ((ComponentData) other);
        return ((((((((((this.contents == rhs.contents)||((this.contents!= null)&&this.contents.equals(rhs.contents)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.sensitiveData == rhs.sensitiveData)||((this.sensitiveData!= null)&&this.sensitiveData.equals(rhs.sensitiveData))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.bomRef == rhs.bomRef)||((this.bomRef!= null)&&this.bomRef.equals(rhs.bomRef))))&&((this.graphics == rhs.graphics)||((this.graphics!= null)&&this.graphics.equals(rhs.graphics))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.governance == rhs.governance)||((this.governance!= null)&&this.governance.equals(rhs.governance))));
    }


    /**
     * Type of Data
     * <p>
     * The general theme or subject matter of the data being specified.
     * 
     * * __source-code__ = Any type of code, code snippet, or data-as-code.
     * * __configuration__ = Parameters or settings that may be used by other components.
     * * __dataset__ = A collection of data.
     * * __definition__ = Data that can be used to create new instances of what the definition defines.
     * * __other__ = Any other type of data that does not fit into existing definitions.
     * 
     */
    public enum Type {

        SOURCE_CODE("source-code"),
        CONFIGURATION("configuration"),
        DATASET("dataset"),
        DEFINITION("definition"),
        OTHER("other");
        private final String value;
        private final static Map<String, ComponentData.Type> CONSTANTS = new HashMap<String, ComponentData.Type>();

        static {
            for (ComponentData.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static ComponentData.Type fromValue(String value) {
            ComponentData.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
