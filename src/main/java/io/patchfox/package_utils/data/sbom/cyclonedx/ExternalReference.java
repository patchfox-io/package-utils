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
 * External Reference
 * <p>
 * External references provide a way to document systems, sites, and information that may be relevant, but are not included with the BOM. They may also establish specific relationships within or external to the BOM.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "comment",
    "type",
    "hashes"
})
public class ExternalReference {

    /**
     * URL
     * <p>
     * The URI (URL or URN) to the external reference. External references are URIs and therefore can accept any URL scheme including https ([RFC-7230](https://www.ietf.org/rfc/rfc7230.txt)), mailto ([RFC-2368](https://www.ietf.org/rfc/rfc2368.txt)), tel ([RFC-3966](https://www.ietf.org/rfc/rfc3966.txt)), and dns ([RFC-4501](https://www.ietf.org/rfc/rfc4501.txt)). External references may also include formally registered URNs such as [CycloneDX BOM-Link](https://cyclonedx.org/capabilities/bomlink/) to reference CycloneDX BOMs or any object within a BOM. BOM-Link transforms applicable external references into relationships that can be expressed in a BOM or across BOMs.
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URI (URL or URN) to the external reference. External references are URIs and therefore can accept any URL scheme including https ([RFC-7230](https://www.ietf.org/rfc/rfc7230.txt)), mailto ([RFC-2368](https://www.ietf.org/rfc/rfc2368.txt)), tel ([RFC-3966](https://www.ietf.org/rfc/rfc3966.txt)), and dns ([RFC-4501](https://www.ietf.org/rfc/rfc4501.txt)). External references may also include formally registered URNs such as [CycloneDX BOM-Link](https://cyclonedx.org/capabilities/bomlink/) to reference CycloneDX BOMs or any object within a BOM. BOM-Link transforms applicable external references into relationships that can be expressed in a BOM or across BOMs.")
    private Object url;
    /**
     * Comment
     * <p>
     * An optional comment describing the external reference
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("An optional comment describing the external reference")
    private String comment;
    /**
     * Type
     * <p>
     * Specifies the type of external reference.
     * 
     * * __vcs__ = Version Control System
     * * __issue-tracker__ = Issue or defect tracking system, or an Application Lifecycle Management (ALM) system
     * * __website__ = Website
     * * __advisories__ = Security advisories
     * * __bom__ = Bill of Materials (SBOM, OBOM, HBOM, SaaSBOM, etc)
     * * __mailing-list__ = Mailing list or discussion group
     * * __social__ = Social media account
     * * __chat__ = Real-time chat platform
     * * __documentation__ = Documentation, guides, or how-to instructions
     * * __support__ = Community or commercial support
     * * __distribution__ = Direct or repository download location
     * * __distribution-intake__ = The location where a component was published to. This is often the same as "distribution" but may also include specialized publishing processes that act as an intermediary
     * * __license__ = The URL to the license file. If a license URL has been defined in the license node, it should also be defined as an external reference for completeness
     * * __build-meta__ = Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)
     * * __build-system__ = URL to an automated build system
     * * __release-notes__ = URL to release notes
     * * __security-contact__ = Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT
     * * __model-card__ = A model card describes the intended uses of a machine learning model, potential limitations, biases, ethical considerations, training parameters, datasets used to train the model, performance metrics, and other relevant data useful for ML transparency
     * * __log__ = A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations
     * * __configuration__ = Parameters or settings that may be used by other components or services
     * * __evidence__ = Information used to substantiate a claim
     * * __formulation__ = Describes how a component or service was manufactured or deployed
     * * __attestation__ = Human or machine-readable statements containing facts, evidence, or testimony
     * * __threat-model__ = An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format
     * * __adversary-model__ = The defined assumptions, goals, and capabilities of an adversary.
     * * __risk-assessment__ = Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.
     * * __vulnerability-assertion__ = A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.
     * * __exploitability-statement__ = A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.
     * * __pentest-report__ = Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test
     * * __static-analysis-report__ = SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code
     * * __dynamic-analysis-report__ = Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations
     * * __runtime-analysis-report__ = Report generated by analyzing the call stack of a running application
     * * __component-analysis-report__ = Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis
     * * __maturity-report__ = Report containing a formal assessment of an organization, business unit, or team against a maturity model
     * * __certification-report__ = Industry, regulatory, or other certification from an accredited (if applicable) certification body
     * * __quality-metrics__ = Report or system in which quality metrics can be obtained
     * * __codified-infrastructure__ = Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)
     * * __poam__ = Plans of Action and Milestones (POAM) compliment an "attestation" external reference. POAM is defined by NIST as a "document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones".
     * * __other__ = Use this if no other types accurately describe the purpose of the external reference
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Specifies the type of external reference.\n\n* __vcs__ = Version Control System\n* __issue-tracker__ = Issue or defect tracking system, or an Application Lifecycle Management (ALM) system\n* __website__ = Website\n* __advisories__ = Security advisories\n* __bom__ = Bill of Materials (SBOM, OBOM, HBOM, SaaSBOM, etc)\n* __mailing-list__ = Mailing list or discussion group\n* __social__ = Social media account\n* __chat__ = Real-time chat platform\n* __documentation__ = Documentation, guides, or how-to instructions\n* __support__ = Community or commercial support\n* __distribution__ = Direct or repository download location\n* __distribution-intake__ = The location where a component was published to. This is often the same as \"distribution\" but may also include specialized publishing processes that act as an intermediary\n* __license__ = The URL to the license file. If a license URL has been defined in the license node, it should also be defined as an external reference for completeness\n* __build-meta__ = Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)\n* __build-system__ = URL to an automated build system\n* __release-notes__ = URL to release notes\n* __security-contact__ = Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT\n* __model-card__ = A model card describes the intended uses of a machine learning model, potential limitations, biases, ethical considerations, training parameters, datasets used to train the model, performance metrics, and other relevant data useful for ML transparency\n* __log__ = A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations\n* __configuration__ = Parameters or settings that may be used by other components or services\n* __evidence__ = Information used to substantiate a claim\n* __formulation__ = Describes how a component or service was manufactured or deployed\n* __attestation__ = Human or machine-readable statements containing facts, evidence, or testimony\n* __threat-model__ = An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format\n* __adversary-model__ = The defined assumptions, goals, and capabilities of an adversary.\n* __risk-assessment__ = Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.\n* __vulnerability-assertion__ = A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.\n* __exploitability-statement__ = A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.\n* __pentest-report__ = Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test\n* __static-analysis-report__ = SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code\n* __dynamic-analysis-report__ = Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations\n* __runtime-analysis-report__ = Report generated by analyzing the call stack of a running application\n* __component-analysis-report__ = Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis\n* __maturity-report__ = Report containing a formal assessment of an organization, business unit, or team against a maturity model\n* __certification-report__ = Industry, regulatory, or other certification from an accredited (if applicable) certification body\n* __quality-metrics__ = Report or system in which quality metrics can be obtained\n* __codified-infrastructure__ = Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)\n* __poam__ = Plans of Action and Milestones (POAM) compliment an \"attestation\" external reference. POAM is defined by NIST as a \"document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones\".\n* __other__ = Use this if no other types accurately describe the purpose of the external reference")
    private ExternalReference.Type type;
    /**
     * Hashes
     * <p>
     * The hashes of the external reference (if applicable).
     * 
     */
    @JsonProperty("hashes")
    @JsonPropertyDescription("The hashes of the external reference (if applicable).")
    private List<Hash> hashes = new ArrayList<Hash>();

    /**
     * URL
     * <p>
     * The URI (URL or URN) to the external reference. External references are URIs and therefore can accept any URL scheme including https ([RFC-7230](https://www.ietf.org/rfc/rfc7230.txt)), mailto ([RFC-2368](https://www.ietf.org/rfc/rfc2368.txt)), tel ([RFC-3966](https://www.ietf.org/rfc/rfc3966.txt)), and dns ([RFC-4501](https://www.ietf.org/rfc/rfc4501.txt)). External references may also include formally registered URNs such as [CycloneDX BOM-Link](https://cyclonedx.org/capabilities/bomlink/) to reference CycloneDX BOMs or any object within a BOM. BOM-Link transforms applicable external references into relationships that can be expressed in a BOM or across BOMs.
     * (Required)
     * 
     */
    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * The URI (URL or URN) to the external reference. External references are URIs and therefore can accept any URL scheme including https ([RFC-7230](https://www.ietf.org/rfc/rfc7230.txt)), mailto ([RFC-2368](https://www.ietf.org/rfc/rfc2368.txt)), tel ([RFC-3966](https://www.ietf.org/rfc/rfc3966.txt)), and dns ([RFC-4501](https://www.ietf.org/rfc/rfc4501.txt)). External references may also include formally registered URNs such as [CycloneDX BOM-Link](https://cyclonedx.org/capabilities/bomlink/) to reference CycloneDX BOMs or any object within a BOM. BOM-Link transforms applicable external references into relationships that can be expressed in a BOM or across BOMs.
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     * Comment
     * <p>
     * An optional comment describing the external reference
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * An optional comment describing the external reference
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Type
     * <p>
     * Specifies the type of external reference.
     * 
     * * __vcs__ = Version Control System
     * * __issue-tracker__ = Issue or defect tracking system, or an Application Lifecycle Management (ALM) system
     * * __website__ = Website
     * * __advisories__ = Security advisories
     * * __bom__ = Bill of Materials (SBOM, OBOM, HBOM, SaaSBOM, etc)
     * * __mailing-list__ = Mailing list or discussion group
     * * __social__ = Social media account
     * * __chat__ = Real-time chat platform
     * * __documentation__ = Documentation, guides, or how-to instructions
     * * __support__ = Community or commercial support
     * * __distribution__ = Direct or repository download location
     * * __distribution-intake__ = The location where a component was published to. This is often the same as "distribution" but may also include specialized publishing processes that act as an intermediary
     * * __license__ = The URL to the license file. If a license URL has been defined in the license node, it should also be defined as an external reference for completeness
     * * __build-meta__ = Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)
     * * __build-system__ = URL to an automated build system
     * * __release-notes__ = URL to release notes
     * * __security-contact__ = Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT
     * * __model-card__ = A model card describes the intended uses of a machine learning model, potential limitations, biases, ethical considerations, training parameters, datasets used to train the model, performance metrics, and other relevant data useful for ML transparency
     * * __log__ = A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations
     * * __configuration__ = Parameters or settings that may be used by other components or services
     * * __evidence__ = Information used to substantiate a claim
     * * __formulation__ = Describes how a component or service was manufactured or deployed
     * * __attestation__ = Human or machine-readable statements containing facts, evidence, or testimony
     * * __threat-model__ = An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format
     * * __adversary-model__ = The defined assumptions, goals, and capabilities of an adversary.
     * * __risk-assessment__ = Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.
     * * __vulnerability-assertion__ = A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.
     * * __exploitability-statement__ = A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.
     * * __pentest-report__ = Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test
     * * __static-analysis-report__ = SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code
     * * __dynamic-analysis-report__ = Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations
     * * __runtime-analysis-report__ = Report generated by analyzing the call stack of a running application
     * * __component-analysis-report__ = Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis
     * * __maturity-report__ = Report containing a formal assessment of an organization, business unit, or team against a maturity model
     * * __certification-report__ = Industry, regulatory, or other certification from an accredited (if applicable) certification body
     * * __quality-metrics__ = Report or system in which quality metrics can be obtained
     * * __codified-infrastructure__ = Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)
     * * __poam__ = Plans of Action and Milestones (POAM) compliment an "attestation" external reference. POAM is defined by NIST as a "document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones".
     * * __other__ = Use this if no other types accurately describe the purpose of the external reference
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ExternalReference.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Specifies the type of external reference.
     * 
     * * __vcs__ = Version Control System
     * * __issue-tracker__ = Issue or defect tracking system, or an Application Lifecycle Management (ALM) system
     * * __website__ = Website
     * * __advisories__ = Security advisories
     * * __bom__ = Bill of Materials (SBOM, OBOM, HBOM, SaaSBOM, etc)
     * * __mailing-list__ = Mailing list or discussion group
     * * __social__ = Social media account
     * * __chat__ = Real-time chat platform
     * * __documentation__ = Documentation, guides, or how-to instructions
     * * __support__ = Community or commercial support
     * * __distribution__ = Direct or repository download location
     * * __distribution-intake__ = The location where a component was published to. This is often the same as "distribution" but may also include specialized publishing processes that act as an intermediary
     * * __license__ = The URL to the license file. If a license URL has been defined in the license node, it should also be defined as an external reference for completeness
     * * __build-meta__ = Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)
     * * __build-system__ = URL to an automated build system
     * * __release-notes__ = URL to release notes
     * * __security-contact__ = Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT
     * * __model-card__ = A model card describes the intended uses of a machine learning model, potential limitations, biases, ethical considerations, training parameters, datasets used to train the model, performance metrics, and other relevant data useful for ML transparency
     * * __log__ = A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations
     * * __configuration__ = Parameters or settings that may be used by other components or services
     * * __evidence__ = Information used to substantiate a claim
     * * __formulation__ = Describes how a component or service was manufactured or deployed
     * * __attestation__ = Human or machine-readable statements containing facts, evidence, or testimony
     * * __threat-model__ = An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format
     * * __adversary-model__ = The defined assumptions, goals, and capabilities of an adversary.
     * * __risk-assessment__ = Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.
     * * __vulnerability-assertion__ = A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.
     * * __exploitability-statement__ = A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.
     * * __pentest-report__ = Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test
     * * __static-analysis-report__ = SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code
     * * __dynamic-analysis-report__ = Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations
     * * __runtime-analysis-report__ = Report generated by analyzing the call stack of a running application
     * * __component-analysis-report__ = Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis
     * * __maturity-report__ = Report containing a formal assessment of an organization, business unit, or team against a maturity model
     * * __certification-report__ = Industry, regulatory, or other certification from an accredited (if applicable) certification body
     * * __quality-metrics__ = Report or system in which quality metrics can be obtained
     * * __codified-infrastructure__ = Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)
     * * __poam__ = Plans of Action and Milestones (POAM) compliment an "attestation" external reference. POAM is defined by NIST as a "document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones".
     * * __other__ = Use this if no other types accurately describe the purpose of the external reference
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ExternalReference.Type type) {
        this.type = type;
    }

    /**
     * Hashes
     * <p>
     * The hashes of the external reference (if applicable).
     * 
     */
    @JsonProperty("hashes")
    public List<Hash> getHashes() {
        return hashes;
    }

    /**
     * Hashes
     * <p>
     * The hashes of the external reference (if applicable).
     * 
     */
    @JsonProperty("hashes")
    public void setHashes(List<Hash> hashes) {
        this.hashes = hashes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hashes");
        sb.append('=');
        sb.append(((this.hashes == null)?"<null>":this.hashes));
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
        result = ((result* 31)+((this.hashes == null)? 0 :this.hashes.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalReference) == false) {
            return false;
        }
        ExternalReference rhs = ((ExternalReference) other);
        return (((((this.hashes == rhs.hashes)||((this.hashes!= null)&&this.hashes.equals(rhs.hashes)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }


    /**
     * Type
     * <p>
     * Specifies the type of external reference.
     * 
     * * __vcs__ = Version Control System
     * * __issue-tracker__ = Issue or defect tracking system, or an Application Lifecycle Management (ALM) system
     * * __website__ = Website
     * * __advisories__ = Security advisories
     * * __bom__ = Bill of Materials (SBOM, OBOM, HBOM, SaaSBOM, etc)
     * * __mailing-list__ = Mailing list or discussion group
     * * __social__ = Social media account
     * * __chat__ = Real-time chat platform
     * * __documentation__ = Documentation, guides, or how-to instructions
     * * __support__ = Community or commercial support
     * * __distribution__ = Direct or repository download location
     * * __distribution-intake__ = The location where a component was published to. This is often the same as "distribution" but may also include specialized publishing processes that act as an intermediary
     * * __license__ = The URL to the license file. If a license URL has been defined in the license node, it should also be defined as an external reference for completeness
     * * __build-meta__ = Build-system specific meta file (i.e. pom.xml, package.json, .nuspec, etc)
     * * __build-system__ = URL to an automated build system
     * * __release-notes__ = URL to release notes
     * * __security-contact__ = Specifies a way to contact the maintainer, supplier, or provider in the event of a security incident. Common URIs include links to a disclosure procedure, a mailto (RFC-2368) that specifies an email address, a tel (RFC-3966) that specifies a phone number, or dns (RFC-4501) that specifies the records containing DNS Security TXT
     * * __model-card__ = A model card describes the intended uses of a machine learning model, potential limitations, biases, ethical considerations, training parameters, datasets used to train the model, performance metrics, and other relevant data useful for ML transparency
     * * __log__ = A record of events that occurred in a computer system or application, such as problems, errors, or information on current operations
     * * __configuration__ = Parameters or settings that may be used by other components or services
     * * __evidence__ = Information used to substantiate a claim
     * * __formulation__ = Describes how a component or service was manufactured or deployed
     * * __attestation__ = Human or machine-readable statements containing facts, evidence, or testimony
     * * __threat-model__ = An enumeration of identified weaknesses, threats, and countermeasures, dataflow diagram (DFD), attack tree, and other supporting documentation in human-readable or machine-readable format
     * * __adversary-model__ = The defined assumptions, goals, and capabilities of an adversary.
     * * __risk-assessment__ = Identifies and analyzes the potential of future events that may negatively impact individuals, assets, and/or the environment. Risk assessments may also include judgments on the tolerability of each risk.
     * * __vulnerability-assertion__ = A Vulnerability Disclosure Report (VDR) which asserts the known and previously unknown vulnerabilities that affect a component, service, or product including the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on a component, service, or product.
     * * __exploitability-statement__ = A Vulnerability Exploitability eXchange (VEX) which asserts the known vulnerabilities that do not affect a product, product family, or organization, and optionally the ones that do. The VEX should include the analysis and findings describing the impact (or lack of impact) that the reported vulnerability has on the product, product family, or organization.
     * * __pentest-report__ = Results from an authorized simulated cyberattack on a component or service, otherwise known as a penetration test
     * * __static-analysis-report__ = SARIF or proprietary machine or human-readable report for which static analysis has identified code quality, security, and other potential issues with the source code
     * * __dynamic-analysis-report__ = Dynamic analysis report that has identified issues such as vulnerabilities and misconfigurations
     * * __runtime-analysis-report__ = Report generated by analyzing the call stack of a running application
     * * __component-analysis-report__ = Report generated by Software Composition Analysis (SCA), container analysis, or other forms of component analysis
     * * __maturity-report__ = Report containing a formal assessment of an organization, business unit, or team against a maturity model
     * * __certification-report__ = Industry, regulatory, or other certification from an accredited (if applicable) certification body
     * * __quality-metrics__ = Report or system in which quality metrics can be obtained
     * * __codified-infrastructure__ = Code or configuration that defines and provisions virtualized infrastructure, commonly referred to as Infrastructure as Code (IaC)
     * * __poam__ = Plans of Action and Milestones (POAM) compliment an "attestation" external reference. POAM is defined by NIST as a "document that identifies tasks needing to be accomplished. It details resources required to accomplish the elements of the plan, any milestones in meeting the tasks and scheduled completion dates for the milestones".
     * * __other__ = Use this if no other types accurately describe the purpose of the external reference
     * 
     */
    public enum Type {

        VCS("vcs"),
        ISSUE_TRACKER("issue-tracker"),
        WEBSITE("website"),
        ADVISORIES("advisories"),
        BOM("bom"),
        MAILING_LIST("mailing-list"),
        SOCIAL("social"),
        CHAT("chat"),
        DOCUMENTATION("documentation"),
        SUPPORT("support"),
        DISTRIBUTION("distribution"),
        DISTRIBUTION_INTAKE("distribution-intake"),
        LICENSE("license"),
        BUILD_META("build-meta"),
        BUILD_SYSTEM("build-system"),
        RELEASE_NOTES("release-notes"),
        SECURITY_CONTACT("security-contact"),
        MODEL_CARD("model-card"),
        LOG("log"),
        CONFIGURATION("configuration"),
        EVIDENCE("evidence"),
        FORMULATION("formulation"),
        ATTESTATION("attestation"),
        THREAT_MODEL("threat-model"),
        ADVERSARY_MODEL("adversary-model"),
        RISK_ASSESSMENT("risk-assessment"),
        VULNERABILITY_ASSERTION("vulnerability-assertion"),
        EXPLOITABILITY_STATEMENT("exploitability-statement"),
        PENTEST_REPORT("pentest-report"),
        STATIC_ANALYSIS_REPORT("static-analysis-report"),
        DYNAMIC_ANALYSIS_REPORT("dynamic-analysis-report"),
        RUNTIME_ANALYSIS_REPORT("runtime-analysis-report"),
        COMPONENT_ANALYSIS_REPORT("component-analysis-report"),
        MATURITY_REPORT("maturity-report"),
        CERTIFICATION_REPORT("certification-report"),
        CODIFIED_INFRASTRUCTURE("codified-infrastructure"),
        QUALITY_METRICS("quality-metrics"),
        POAM("poam"),
        OTHER("other");
        private final String value;
        private final static Map<String, ExternalReference.Type> CONSTANTS = new HashMap<String, ExternalReference.Type>();

        static {
            for (ExternalReference.Type c: values()) {
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
        public static ExternalReference.Type fromValue(String value) {
            ExternalReference.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
