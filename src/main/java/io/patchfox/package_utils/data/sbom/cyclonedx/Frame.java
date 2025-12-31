package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "package",
    "module",
    "function",
    "parameters",
    "line",
    "column",
    "fullFilename"
})
public class Frame {

    /**
     * Package
     * <p>
     * A package organizes modules into namespaces, providing a unique namespace for each type it contains.
     * 
     */
    @JsonProperty("package")
    @JsonPropertyDescription("A package organizes modules into namespaces, providing a unique namespace for each type it contains.")
    private String _package;
    /**
     * Module
     * <p>
     * A module or class that encloses functions/methods and other code.
     * (Required)
     * 
     */
    @JsonProperty("module")
    @JsonPropertyDescription("A module or class that encloses functions/methods and other code.")
    private String module;
    /**
     * Function
     * <p>
     * A block of code designed to perform a particular task.
     * 
     */
    @JsonProperty("function")
    @JsonPropertyDescription("A block of code designed to perform a particular task.")
    private String function;
    /**
     * Parameters
     * <p>
     * Optional arguments that are passed to the module or function.
     * 
     */
    @JsonProperty("parameters")
    @JsonPropertyDescription("Optional arguments that are passed to the module or function.")
    private List<String> parameters = new ArrayList<String>();
    /**
     * Line
     * <p>
     * The line number the code that is called resides on.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The line number the code that is called resides on.")
    private Integer line;
    /**
     * Column
     * <p>
     * The column the code that is called resides.
     * 
     */
    @JsonProperty("column")
    @JsonPropertyDescription("The column the code that is called resides.")
    private Integer column;
    /**
     * Full Filename
     * <p>
     * The full path and filename of the module.
     * 
     */
    @JsonProperty("fullFilename")
    @JsonPropertyDescription("The full path and filename of the module.")
    private String fullFilename;

    /**
     * Package
     * <p>
     * A package organizes modules into namespaces, providing a unique namespace for each type it contains.
     * 
     */
    @JsonProperty("package")
    public String getPackage() {
        return _package;
    }

    /**
     * Package
     * <p>
     * A package organizes modules into namespaces, providing a unique namespace for each type it contains.
     * 
     */
    @JsonProperty("package")
    public void setPackage(String _package) {
        this._package = _package;
    }

    /**
     * Module
     * <p>
     * A module or class that encloses functions/methods and other code.
     * (Required)
     * 
     */
    @JsonProperty("module")
    public String getModule() {
        return module;
    }

    /**
     * Module
     * <p>
     * A module or class that encloses functions/methods and other code.
     * (Required)
     * 
     */
    @JsonProperty("module")
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * Function
     * <p>
     * A block of code designed to perform a particular task.
     * 
     */
    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    /**
     * Function
     * <p>
     * A block of code designed to perform a particular task.
     * 
     */
    @JsonProperty("function")
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * Parameters
     * <p>
     * Optional arguments that are passed to the module or function.
     * 
     */
    @JsonProperty("parameters")
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * Parameters
     * <p>
     * Optional arguments that are passed to the module or function.
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Line
     * <p>
     * The line number the code that is called resides on.
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * Line
     * <p>
     * The line number the code that is called resides on.
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Column
     * <p>
     * The column the code that is called resides.
     * 
     */
    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    /**
     * Column
     * <p>
     * The column the code that is called resides.
     * 
     */
    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    /**
     * Full Filename
     * <p>
     * The full path and filename of the module.
     * 
     */
    @JsonProperty("fullFilename")
    public String getFullFilename() {
        return fullFilename;
    }

    /**
     * Full Filename
     * <p>
     * The full path and filename of the module.
     * 
     */
    @JsonProperty("fullFilename")
    public void setFullFilename(String fullFilename) {
        this.fullFilename = fullFilename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frame.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_package");
        sb.append('=');
        sb.append(((this._package == null)?"<null>":this._package));
        sb.append(',');
        sb.append("module");
        sb.append('=');
        sb.append(((this.module == null)?"<null>":this.module));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("column");
        sb.append('=');
        sb.append(((this.column == null)?"<null>":this.column));
        sb.append(',');
        sb.append("fullFilename");
        sb.append('=');
        sb.append(((this.fullFilename == null)?"<null>":this.fullFilename));
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
        result = ((result* 31)+((this.fullFilename == null)? 0 :this.fullFilename.hashCode()));
        result = ((result* 31)+((this._package == null)? 0 :this._package.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.module == null)? 0 :this.module.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frame) == false) {
            return false;
        }
        Frame rhs = ((Frame) other);
        return ((((((((this.fullFilename == rhs.fullFilename)||((this.fullFilename!= null)&&this.fullFilename.equals(rhs.fullFilename)))&&((this._package == rhs._package)||((this._package!= null)&&this._package.equals(rhs._package))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.module == rhs.module)||((this.module!= null)&&this.module.equals(rhs.module))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))))&&((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))));
    }

}
