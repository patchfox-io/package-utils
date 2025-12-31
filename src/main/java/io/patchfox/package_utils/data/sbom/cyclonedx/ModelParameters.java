package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Model Parameters
 * <p>
 * Hyper-parameters for construction of the model.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "approach",
    "task",
    "architectureFamily",
    "modelArchitecture",
    "datasets",
    "inputs",
    "outputs"
})
public class ModelParameters {

    /**
     * Approach
     * <p>
     * The overall approach to learning used by the model for problem solving.
     * 
     */
    @JsonProperty("approach")
    @JsonPropertyDescription("The overall approach to learning used by the model for problem solving.")
    private Approach approach;
    /**
     * Task
     * <p>
     * Directly influences the input and/or output. Examples include classification, regression, clustering, etc.
     * 
     */
    @JsonProperty("task")
    @JsonPropertyDescription("Directly influences the input and/or output. Examples include classification, regression, clustering, etc.")
    private String task;
    /**
     * Architecture Family
     * <p>
     * The model architecture family such as transformer network, convolutional neural network, residual neural network, LSTM neural network, etc.
     * 
     */
    @JsonProperty("architectureFamily")
    @JsonPropertyDescription("The model architecture family such as transformer network, convolutional neural network, residual neural network, LSTM neural network, etc.")
    private String architectureFamily;
    /**
     * Model Architecture
     * <p>
     * The specific architecture of the model such as GPT-1, ResNet-50, YOLOv3, etc.
     * 
     */
    @JsonProperty("modelArchitecture")
    @JsonPropertyDescription("The specific architecture of the model such as GPT-1, ResNet-50, YOLOv3, etc.")
    private String modelArchitecture;
    /**
     * Datasets
     * <p>
     * The datasets used to train and evaluate the model.
     * 
     */
    @JsonProperty("datasets")
    @JsonPropertyDescription("The datasets used to train and evaluate the model.")
    private List<Object> datasets = new ArrayList<Object>();
    /**
     * Inputs
     * <p>
     * The input format(s) of the model
     * 
     */
    @JsonProperty("inputs")
    @JsonPropertyDescription("The input format(s) of the model")
    private List<InputOutputMLParameters> inputs = new ArrayList<InputOutputMLParameters>();
    /**
     * Outputs
     * <p>
     * The output format(s) from the model
     * 
     */
    @JsonProperty("outputs")
    @JsonPropertyDescription("The output format(s) from the model")
    private List<InputOutputMLParameters> outputs = new ArrayList<InputOutputMLParameters>();

    /**
     * Approach
     * <p>
     * The overall approach to learning used by the model for problem solving.
     * 
     */
    @JsonProperty("approach")
    public Approach getApproach() {
        return approach;
    }

    /**
     * Approach
     * <p>
     * The overall approach to learning used by the model for problem solving.
     * 
     */
    @JsonProperty("approach")
    public void setApproach(Approach approach) {
        this.approach = approach;
    }

    /**
     * Task
     * <p>
     * Directly influences the input and/or output. Examples include classification, regression, clustering, etc.
     * 
     */
    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    /**
     * Task
     * <p>
     * Directly influences the input and/or output. Examples include classification, regression, clustering, etc.
     * 
     */
    @JsonProperty("task")
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Architecture Family
     * <p>
     * The model architecture family such as transformer network, convolutional neural network, residual neural network, LSTM neural network, etc.
     * 
     */
    @JsonProperty("architectureFamily")
    public String getArchitectureFamily() {
        return architectureFamily;
    }

    /**
     * Architecture Family
     * <p>
     * The model architecture family such as transformer network, convolutional neural network, residual neural network, LSTM neural network, etc.
     * 
     */
    @JsonProperty("architectureFamily")
    public void setArchitectureFamily(String architectureFamily) {
        this.architectureFamily = architectureFamily;
    }

    /**
     * Model Architecture
     * <p>
     * The specific architecture of the model such as GPT-1, ResNet-50, YOLOv3, etc.
     * 
     */
    @JsonProperty("modelArchitecture")
    public String getModelArchitecture() {
        return modelArchitecture;
    }

    /**
     * Model Architecture
     * <p>
     * The specific architecture of the model such as GPT-1, ResNet-50, YOLOv3, etc.
     * 
     */
    @JsonProperty("modelArchitecture")
    public void setModelArchitecture(String modelArchitecture) {
        this.modelArchitecture = modelArchitecture;
    }

    /**
     * Datasets
     * <p>
     * The datasets used to train and evaluate the model.
     * 
     */
    @JsonProperty("datasets")
    public List<Object> getDatasets() {
        return datasets;
    }

    /**
     * Datasets
     * <p>
     * The datasets used to train and evaluate the model.
     * 
     */
    @JsonProperty("datasets")
    public void setDatasets(List<Object> datasets) {
        this.datasets = datasets;
    }

    /**
     * Inputs
     * <p>
     * The input format(s) of the model
     * 
     */
    @JsonProperty("inputs")
    public List<InputOutputMLParameters> getInputs() {
        return inputs;
    }

    /**
     * Inputs
     * <p>
     * The input format(s) of the model
     * 
     */
    @JsonProperty("inputs")
    public void setInputs(List<InputOutputMLParameters> inputs) {
        this.inputs = inputs;
    }

    /**
     * Outputs
     * <p>
     * The output format(s) from the model
     * 
     */
    @JsonProperty("outputs")
    public List<InputOutputMLParameters> getOutputs() {
        return outputs;
    }

    /**
     * Outputs
     * <p>
     * The output format(s) from the model
     * 
     */
    @JsonProperty("outputs")
    public void setOutputs(List<InputOutputMLParameters> outputs) {
        this.outputs = outputs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ModelParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("approach");
        sb.append('=');
        sb.append(((this.approach == null)?"<null>":this.approach));
        sb.append(',');
        sb.append("task");
        sb.append('=');
        sb.append(((this.task == null)?"<null>":this.task));
        sb.append(',');
        sb.append("architectureFamily");
        sb.append('=');
        sb.append(((this.architectureFamily == null)?"<null>":this.architectureFamily));
        sb.append(',');
        sb.append("modelArchitecture");
        sb.append('=');
        sb.append(((this.modelArchitecture == null)?"<null>":this.modelArchitecture));
        sb.append(',');
        sb.append("datasets");
        sb.append('=');
        sb.append(((this.datasets == null)?"<null>":this.datasets));
        sb.append(',');
        sb.append("inputs");
        sb.append('=');
        sb.append(((this.inputs == null)?"<null>":this.inputs));
        sb.append(',');
        sb.append("outputs");
        sb.append('=');
        sb.append(((this.outputs == null)?"<null>":this.outputs));
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
        result = ((result* 31)+((this.outputs == null)? 0 :this.outputs.hashCode()));
        result = ((result* 31)+((this.task == null)? 0 :this.task.hashCode()));
        result = ((result* 31)+((this.inputs == null)? 0 :this.inputs.hashCode()));
        result = ((result* 31)+((this.architectureFamily == null)? 0 :this.architectureFamily.hashCode()));
        result = ((result* 31)+((this.modelArchitecture == null)? 0 :this.modelArchitecture.hashCode()));
        result = ((result* 31)+((this.datasets == null)? 0 :this.datasets.hashCode()));
        result = ((result* 31)+((this.approach == null)? 0 :this.approach.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModelParameters) == false) {
            return false;
        }
        ModelParameters rhs = ((ModelParameters) other);
        return ((((((((this.outputs == rhs.outputs)||((this.outputs!= null)&&this.outputs.equals(rhs.outputs)))&&((this.task == rhs.task)||((this.task!= null)&&this.task.equals(rhs.task))))&&((this.inputs == rhs.inputs)||((this.inputs!= null)&&this.inputs.equals(rhs.inputs))))&&((this.architectureFamily == rhs.architectureFamily)||((this.architectureFamily!= null)&&this.architectureFamily.equals(rhs.architectureFamily))))&&((this.modelArchitecture == rhs.modelArchitecture)||((this.modelArchitecture!= null)&&this.modelArchitecture.equals(rhs.modelArchitecture))))&&((this.datasets == rhs.datasets)||((this.datasets!= null)&&this.datasets.equals(rhs.datasets))))&&((this.approach == rhs.approach)||((this.approach!= null)&&this.approach.equals(rhs.approach))));
    }

}
