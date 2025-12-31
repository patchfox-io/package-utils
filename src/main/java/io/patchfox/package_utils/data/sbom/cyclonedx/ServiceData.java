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


/**
 * Hash Objects
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flow",
    "classification",
    "name",
    "description",
    "governance",
    "source",
    "destination"
})
public class ServiceData {

    /**
     * Data flow direction
     * <p>
     * Specifies the flow direction of the data. Direction is relative to the service. Inbound flow states that data enters the service. Outbound flow states that data leaves the service. Bi-directional states that data flows both ways, and unknown states that the direction is not known.
     * (Required)
     * 
     */
    @JsonProperty("flow")
    @JsonPropertyDescription("Specifies the flow direction of the data. Direction is relative to the service. Inbound flow states that data enters the service. Outbound flow states that data leaves the service. Bi-directional states that data flows both ways, and unknown states that the direction is not known.")
    private ServiceData.DataFlowDirection flow;
    /**
     * Data Classification
     * <p>
     * Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
     * (Required)
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.")
    private String classification;
    /**
     * Name
     * <p>
     * Name for the defined data
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name for the defined data")
    private String name;
    /**
     * Description
     * <p>
     * Short description of the data content and usage
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Short description of the data content and usage")
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
     * Source
     * <p>
     * The URI, URL, or BOM-Link of the components or services the data came in from
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The URI, URL, or BOM-Link of the components or services the data came in from")
    private List<Object> source = new ArrayList<Object>();
    /**
     * Destination
     * <p>
     * The URI, URL, or BOM-Link of the components or services the data is sent to
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("The URI, URL, or BOM-Link of the components or services the data is sent to")
    private List<Object> destination = new ArrayList<Object>();

    /**
     * Data flow direction
     * <p>
     * Specifies the flow direction of the data. Direction is relative to the service. Inbound flow states that data enters the service. Outbound flow states that data leaves the service. Bi-directional states that data flows both ways, and unknown states that the direction is not known.
     * (Required)
     * 
     */
    @JsonProperty("flow")
    public ServiceData.DataFlowDirection getFlow() {
        return flow;
    }

    /**
     * Data flow direction
     * <p>
     * Specifies the flow direction of the data. Direction is relative to the service. Inbound flow states that data enters the service. Outbound flow states that data leaves the service. Bi-directional states that data flows both ways, and unknown states that the direction is not known.
     * (Required)
     * 
     */
    @JsonProperty("flow")
    public void setFlow(ServiceData.DataFlowDirection flow) {
        this.flow = flow;
    }

    /**
     * Data Classification
     * <p>
     * Data classification tags data according to its type, sensitivity, and value if altered, stolen, or destroyed.
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * Name
     * <p>
     * Name for the defined data
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Name for the defined data
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description
     * <p>
     * Short description of the data content and usage
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Short description of the data content and usage
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

    /**
     * Source
     * <p>
     * The URI, URL, or BOM-Link of the components or services the data came in from
     * 
     */
    @JsonProperty("source")
    public List<Object> getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The URI, URL, or BOM-Link of the components or services the data came in from
     * 
     */
    @JsonProperty("source")
    public void setSource(List<Object> source) {
        this.source = source;
    }

    /**
     * Destination
     * <p>
     * The URI, URL, or BOM-Link of the components or services the data is sent to
     * 
     */
    @JsonProperty("destination")
    public List<Object> getDestination() {
        return destination;
    }

    /**
     * Destination
     * <p>
     * The URI, URL, or BOM-Link of the components or services the data is sent to
     * 
     */
    @JsonProperty("destination")
    public void setDestination(List<Object> destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("flow");
        sb.append('=');
        sb.append(((this.flow == null)?"<null>":this.flow));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("governance");
        sb.append('=');
        sb.append(((this.governance == null)?"<null>":this.governance));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
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
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.flow == null)? 0 :this.flow.hashCode()));
        result = ((result* 31)+((this.governance == null)? 0 :this.governance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceData) == false) {
            return false;
        }
        ServiceData rhs = ((ServiceData) other);
        return ((((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.flow == rhs.flow)||((this.flow!= null)&&this.flow.equals(rhs.flow))))&&((this.governance == rhs.governance)||((this.governance!= null)&&this.governance.equals(rhs.governance))));
    }


    /**
     * Data flow direction
     * <p>
     * Specifies the flow direction of the data. Direction is relative to the service. Inbound flow states that data enters the service. Outbound flow states that data leaves the service. Bi-directional states that data flows both ways, and unknown states that the direction is not known.
     * 
     */
    public enum DataFlowDirection {

        INBOUND("inbound"),
        OUTBOUND("outbound"),
        BI_DIRECTIONAL("bi-directional"),
        UNKNOWN("unknown");
        private final String value;
        private final static Map<String, ServiceData.DataFlowDirection> CONSTANTS = new HashMap<String, ServiceData.DataFlowDirection>();

        static {
            for (ServiceData.DataFlowDirection c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataFlowDirection(String value) {
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
        public static ServiceData.DataFlowDirection fromValue(String value) {
            ServiceData.DataFlowDirection constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
