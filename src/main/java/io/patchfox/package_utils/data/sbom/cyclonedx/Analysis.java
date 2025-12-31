package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.Date;
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
 * Impact Analysis
 * <p>
 * An assessment of the impact and exploitability of the vulnerability.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "state",
    "justification",
    "response",
    "detail",
    "firstIssued",
    "lastUpdated"
})
public class Analysis {

    /**
     * Impact Analysis State
     * <p>
     * Declares the current state of an occurrence of a vulnerability, after automated or manual analysis. 
     * 
     * * __resolved__ = the vulnerability has been remediated. 
     * * __resolved\_with\_pedigree__ = the vulnerability has been remediated and evidence of the changes are provided in the affected components pedigree containing verifiable commit history and/or diff(s). 
     * * __exploitable__ = the vulnerability may be directly or indirectly exploitable. 
     * * __in\_triage__ = the vulnerability is being investigated. 
     * * __false\_positive__ = the vulnerability is not specific to the component or service and was falsely identified or associated. 
     * * __not\_affected__ = the component or service is not affected by the vulnerability. Justification should be specified for all not_affected cases.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("Declares the current state of an occurrence of a vulnerability, after automated or manual analysis. \n\n* __resolved__ = the vulnerability has been remediated. \n* __resolved\\_with\\_pedigree__ = the vulnerability has been remediated and evidence of the changes are provided in the affected components pedigree containing verifiable commit history and/or diff(s). \n* __exploitable__ = the vulnerability may be directly or indirectly exploitable. \n* __in\\_triage__ = the vulnerability is being investigated. \n* __false\\_positive__ = the vulnerability is not specific to the component or service and was falsely identified or associated. \n* __not\\_affected__ = the component or service is not affected by the vulnerability. Justification should be specified for all not_affected cases.")
    private Analysis.ImpactAnalysisState state;
    /**
     * Impact Analysis Justification
     * <p>
     * The rationale of why the impact analysis state was asserted. 
     * 
     * * __code\_not\_present__ = the code has been removed or tree-shaked. 
     * * __code\_not\_reachable__ = the vulnerable code is not invoked at runtime. 
     * * __requires\_configuration__ = exploitability requires a configurable option to be set/unset. 
     * * __requires\_dependency__ = exploitability requires a dependency that is not present. 
     * * __requires\_environment__ = exploitability requires a certain environment which is not present. 
     * * __protected\_by\_compiler__ = exploitability requires a compiler flag to be set/unset. 
     * * __protected\_at\_runtime__ = exploits are prevented at runtime. 
     * * __protected\_at\_perimeter__ = attacks are blocked at physical, logical, or network perimeter. 
     * * __protected\_by\_mitigating\_control__ = preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.
     * 
     */
    @JsonProperty("justification")
    @JsonPropertyDescription("The rationale of why the impact analysis state was asserted. \n\n* __code\\_not\\_present__ = the code has been removed or tree-shaked. \n* __code\\_not\\_reachable__ = the vulnerable code is not invoked at runtime. \n* __requires\\_configuration__ = exploitability requires a configurable option to be set/unset. \n* __requires\\_dependency__ = exploitability requires a dependency that is not present. \n* __requires\\_environment__ = exploitability requires a certain environment which is not present. \n* __protected\\_by\\_compiler__ = exploitability requires a compiler flag to be set/unset. \n* __protected\\_at\\_runtime__ = exploits are prevented at runtime. \n* __protected\\_at\\_perimeter__ = attacks are blocked at physical, logical, or network perimeter. \n* __protected\\_by\\_mitigating\\_control__ = preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.")
    private Analysis.ImpactAnalysisJustification justification;
    /**
     * Response
     * <p>
     * A response to the vulnerability by the manufacturer, supplier, or project responsible for the affected component or service. More than one response is allowed. Responses are strongly encouraged for vulnerabilities where the analysis state is exploitable.
     * 
     */
    @JsonProperty("response")
    @JsonPropertyDescription("A response to the vulnerability by the manufacturer, supplier, or project responsible for the affected component or service. More than one response is allowed. Responses are strongly encouraged for vulnerabilities where the analysis state is exploitable.")
    private List<Response> response = new ArrayList<Response>();
    /**
     * Detail
     * <p>
     * Detailed description of the impact including methods used during assessment. If a vulnerability is not exploitable, this field should include specific details on why the component or service is not impacted by this vulnerability.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Detailed description of the impact including methods used during assessment. If a vulnerability is not exploitable, this field should include specific details on why the component or service is not impacted by this vulnerability.")
    private String detail;
    /**
     * First Issued
     * <p>
     * The date and time (timestamp) when the analysis was first issued.
     * 
     */
    @JsonProperty("firstIssued")
    @JsonPropertyDescription("The date and time (timestamp) when the analysis was first issued.")
    private Date firstIssued;
    /**
     * Last Updated
     * <p>
     * The date and time (timestamp) when the analysis was last updated.
     * 
     */
    @JsonProperty("lastUpdated")
    @JsonPropertyDescription("The date and time (timestamp) when the analysis was last updated.")
    private Date lastUpdated;

    /**
     * Impact Analysis State
     * <p>
     * Declares the current state of an occurrence of a vulnerability, after automated or manual analysis. 
     * 
     * * __resolved__ = the vulnerability has been remediated. 
     * * __resolved\_with\_pedigree__ = the vulnerability has been remediated and evidence of the changes are provided in the affected components pedigree containing verifiable commit history and/or diff(s). 
     * * __exploitable__ = the vulnerability may be directly or indirectly exploitable. 
     * * __in\_triage__ = the vulnerability is being investigated. 
     * * __false\_positive__ = the vulnerability is not specific to the component or service and was falsely identified or associated. 
     * * __not\_affected__ = the component or service is not affected by the vulnerability. Justification should be specified for all not_affected cases.
     * 
     */
    @JsonProperty("state")
    public Analysis.ImpactAnalysisState getState() {
        return state;
    }

    /**
     * Impact Analysis State
     * <p>
     * Declares the current state of an occurrence of a vulnerability, after automated or manual analysis. 
     * 
     * * __resolved__ = the vulnerability has been remediated. 
     * * __resolved\_with\_pedigree__ = the vulnerability has been remediated and evidence of the changes are provided in the affected components pedigree containing verifiable commit history and/or diff(s). 
     * * __exploitable__ = the vulnerability may be directly or indirectly exploitable. 
     * * __in\_triage__ = the vulnerability is being investigated. 
     * * __false\_positive__ = the vulnerability is not specific to the component or service and was falsely identified or associated. 
     * * __not\_affected__ = the component or service is not affected by the vulnerability. Justification should be specified for all not_affected cases.
     * 
     */
    @JsonProperty("state")
    public void setState(Analysis.ImpactAnalysisState state) {
        this.state = state;
    }

    /**
     * Impact Analysis Justification
     * <p>
     * The rationale of why the impact analysis state was asserted. 
     * 
     * * __code\_not\_present__ = the code has been removed or tree-shaked. 
     * * __code\_not\_reachable__ = the vulnerable code is not invoked at runtime. 
     * * __requires\_configuration__ = exploitability requires a configurable option to be set/unset. 
     * * __requires\_dependency__ = exploitability requires a dependency that is not present. 
     * * __requires\_environment__ = exploitability requires a certain environment which is not present. 
     * * __protected\_by\_compiler__ = exploitability requires a compiler flag to be set/unset. 
     * * __protected\_at\_runtime__ = exploits are prevented at runtime. 
     * * __protected\_at\_perimeter__ = attacks are blocked at physical, logical, or network perimeter. 
     * * __protected\_by\_mitigating\_control__ = preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.
     * 
     */
    @JsonProperty("justification")
    public Analysis.ImpactAnalysisJustification getJustification() {
        return justification;
    }

    /**
     * Impact Analysis Justification
     * <p>
     * The rationale of why the impact analysis state was asserted. 
     * 
     * * __code\_not\_present__ = the code has been removed or tree-shaked. 
     * * __code\_not\_reachable__ = the vulnerable code is not invoked at runtime. 
     * * __requires\_configuration__ = exploitability requires a configurable option to be set/unset. 
     * * __requires\_dependency__ = exploitability requires a dependency that is not present. 
     * * __requires\_environment__ = exploitability requires a certain environment which is not present. 
     * * __protected\_by\_compiler__ = exploitability requires a compiler flag to be set/unset. 
     * * __protected\_at\_runtime__ = exploits are prevented at runtime. 
     * * __protected\_at\_perimeter__ = attacks are blocked at physical, logical, or network perimeter. 
     * * __protected\_by\_mitigating\_control__ = preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.
     * 
     */
    @JsonProperty("justification")
    public void setJustification(Analysis.ImpactAnalysisJustification justification) {
        this.justification = justification;
    }

    /**
     * Response
     * <p>
     * A response to the vulnerability by the manufacturer, supplier, or project responsible for the affected component or service. More than one response is allowed. Responses are strongly encouraged for vulnerabilities where the analysis state is exploitable.
     * 
     */
    @JsonProperty("response")
    public List<Response> getResponse() {
        return response;
    }

    /**
     * Response
     * <p>
     * A response to the vulnerability by the manufacturer, supplier, or project responsible for the affected component or service. More than one response is allowed. Responses are strongly encouraged for vulnerabilities where the analysis state is exploitable.
     * 
     */
    @JsonProperty("response")
    public void setResponse(List<Response> response) {
        this.response = response;
    }

    /**
     * Detail
     * <p>
     * Detailed description of the impact including methods used during assessment. If a vulnerability is not exploitable, this field should include specific details on why the component or service is not impacted by this vulnerability.
     * 
     */
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * Detailed description of the impact including methods used during assessment. If a vulnerability is not exploitable, this field should include specific details on why the component or service is not impacted by this vulnerability.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * First Issued
     * <p>
     * The date and time (timestamp) when the analysis was first issued.
     * 
     */
    @JsonProperty("firstIssued")
    public Date getFirstIssued() {
        return firstIssued;
    }

    /**
     * First Issued
     * <p>
     * The date and time (timestamp) when the analysis was first issued.
     * 
     */
    @JsonProperty("firstIssued")
    public void setFirstIssued(Date firstIssued) {
        this.firstIssued = firstIssued;
    }

    /**
     * Last Updated
     * <p>
     * The date and time (timestamp) when the analysis was last updated.
     * 
     */
    @JsonProperty("lastUpdated")
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Last Updated
     * <p>
     * The date and time (timestamp) when the analysis was last updated.
     * 
     */
    @JsonProperty("lastUpdated")
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Analysis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("justification");
        sb.append('=');
        sb.append(((this.justification == null)?"<null>":this.justification));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("firstIssued");
        sb.append('=');
        sb.append(((this.firstIssued == null)?"<null>":this.firstIssued));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
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
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.justification == null)? 0 :this.justification.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.firstIssued == null)? 0 :this.firstIssued.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Analysis) == false) {
            return false;
        }
        Analysis rhs = ((Analysis) other);
        return (((((((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated)))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.justification == rhs.justification)||((this.justification!= null)&&this.justification.equals(rhs.justification))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.firstIssued == rhs.firstIssued)||((this.firstIssued!= null)&&this.firstIssued.equals(rhs.firstIssued))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))));
    }


    /**
     * Impact Analysis Justification
     * <p>
     * The rationale of why the impact analysis state was asserted. 
     * 
     * * __code\_not\_present__ = the code has been removed or tree-shaked. 
     * * __code\_not\_reachable__ = the vulnerable code is not invoked at runtime. 
     * * __requires\_configuration__ = exploitability requires a configurable option to be set/unset. 
     * * __requires\_dependency__ = exploitability requires a dependency that is not present. 
     * * __requires\_environment__ = exploitability requires a certain environment which is not present. 
     * * __protected\_by\_compiler__ = exploitability requires a compiler flag to be set/unset. 
     * * __protected\_at\_runtime__ = exploits are prevented at runtime. 
     * * __protected\_at\_perimeter__ = attacks are blocked at physical, logical, or network perimeter. 
     * * __protected\_by\_mitigating\_control__ = preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.
     * 
     */
    public enum ImpactAnalysisJustification {

        CODE_NOT_PRESENT("code_not_present"),
        CODE_NOT_REACHABLE("code_not_reachable"),
        REQUIRES_CONFIGURATION("requires_configuration"),
        REQUIRES_DEPENDENCY("requires_dependency"),
        REQUIRES_ENVIRONMENT("requires_environment"),
        PROTECTED_BY_COMPILER("protected_by_compiler"),
        PROTECTED_AT_RUNTIME("protected_at_runtime"),
        PROTECTED_AT_PERIMETER("protected_at_perimeter"),
        PROTECTED_BY_MITIGATING_CONTROL("protected_by_mitigating_control");
        private final String value;
        private final static Map<String, Analysis.ImpactAnalysisJustification> CONSTANTS = new HashMap<String, Analysis.ImpactAnalysisJustification>();

        static {
            for (Analysis.ImpactAnalysisJustification c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ImpactAnalysisJustification(String value) {
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
        public static Analysis.ImpactAnalysisJustification fromValue(String value) {
            Analysis.ImpactAnalysisJustification constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Impact Analysis State
     * <p>
     * Declares the current state of an occurrence of a vulnerability, after automated or manual analysis. 
     * 
     * * __resolved__ = the vulnerability has been remediated. 
     * * __resolved\_with\_pedigree__ = the vulnerability has been remediated and evidence of the changes are provided in the affected components pedigree containing verifiable commit history and/or diff(s). 
     * * __exploitable__ = the vulnerability may be directly or indirectly exploitable. 
     * * __in\_triage__ = the vulnerability is being investigated. 
     * * __false\_positive__ = the vulnerability is not specific to the component or service and was falsely identified or associated. 
     * * __not\_affected__ = the component or service is not affected by the vulnerability. Justification should be specified for all not_affected cases.
     * 
     */
    public enum ImpactAnalysisState {

        RESOLVED("resolved"),
        RESOLVED_WITH_PEDIGREE("resolved_with_pedigree"),
        EXPLOITABLE("exploitable"),
        IN_TRIAGE("in_triage"),
        FALSE_POSITIVE("false_positive"),
        NOT_AFFECTED("not_affected");
        private final String value;
        private final static Map<String, Analysis.ImpactAnalysisState> CONSTANTS = new HashMap<String, Analysis.ImpactAnalysisState>();

        static {
            for (Analysis.ImpactAnalysisState c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ImpactAnalysisState(String value) {
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
        public static Analysis.ImpactAnalysisState fromValue(String value) {
            Analysis.ImpactAnalysisState constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
