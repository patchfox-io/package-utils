package io.patchfox.package_utils.data.oss;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import io.patchfox.package_utils.util.CvssSeverity;

import org.apache.commons.text.StringEscapeUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


/*
 * why in the name of fuck does JsonInclude.Include.NON_NULL not work for collections for this and only 
 * this class?!??
 * 
 * DH 29JAN24  
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "purl",
        "vulnerabilityId",
        "severity",
        "description",
        "sources",
        "reporters",
        "licenses"
})
public class OssSummary {

    @JsonProperty("purl")
    com.github.packageurl.PackageURL purl;

    @JsonProperty("sources")
    List<String> sources = new ArrayList<>();

    @JsonProperty("vulnerabilityId")
    String vulnerabilityId;

    @JsonProperty("severity")
    CvssSeverity severity;

    @JsonProperty("description")
    String description;

    @JsonProperty("reporters")
    Set<String> reporters = new HashSet<>();

    @JsonProperty("licenses")
    Set<String> licenses = new HashSet<>();

    @JsonProperty("cpes")
    Set<String> cpes = new HashSet<>();

    @JsonProperty("fixedIn")
    Set<String> fixedIn = new HashSet<>();


    //
    public com.github.packageurl.PackageURL getPurl() { return purl; }

    public void setPurl(String purl) { 
        try {
            var unEscapedPurl = StringEscapeUtils.unescapeJava(purl);
            this.purl = new PackageURL(unEscapedPurl); 
        } catch (MalformedPackageURLException e) {
            throw new IllegalArgumentException("purl " + purl + " fails validation check!");
        }
    }


    //
    public List<String> getSources() { return new ArrayList<>(sources); }

    public void setSource(@NotNull List<String> sources) { this.sources = sources; }

    public void addSource(String source) { 
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(source); 
    }


    //
    public String getVulnerabilityId() { return vulnerabilityId; }

    public void setVulnerabilityId(@NotNull String name) { this.vulnerabilityId = name; }


    //
    public CvssSeverity getSeverity() { return severity; }

    public void setSeverity(@NotNull CvssSeverity severity) { this.severity = severity; }


    //
    public String getDescription() { return description; }

    public void setDescription(@NotNull String description) { this.description = description; }


    //
    public Set<String> getReporters() { return new HashSet<String>(reporters); }

    public void setReporters(Set<String> reporters) { this.reporters = reporters; }

    public void addReporter(String reporter) { 
        if (this.reporters == null) {
            this.reporters = new HashSet<>();
        }
        this.reporters.add(reporter); 
    }

    public void addReporters(Set<String> reporters) {
        this.reporters.addAll(reporters);
    }


    //
    public Set<String> getLicenses() { return new HashSet<>(licenses); }

    public void setLicenses(Set<String> lisences) { this.licenses = lisences; }

    public void addLicense(String license) { 
        if (this.licenses == null) {
            this.licenses = new HashSet<>();
        }
        this.licenses.add(license); 
    }

    //
    public void setCpes(Set<String> cpes) {
        this.cpes = cpes;
    }

    public Set<String> getCpes() {
        return this.cpes;
    }

    //
    public void setFixedIn(Set<String> fixedIn) {
        this.fixedIn = fixedIn;
    }

    public Set<String> getFixedIn() {
        return this.fixedIn;
    }

    //
    @Override
    public String toString() { 
        return MessageFormat.format(
            "purl: {0}  vulnerabilityId: {1}  severity: {2}  reporters: {3}  sources: {4}",
            this.purl, 
            this.vulnerabilityId, 
            this.severity, 
            this.reporters,
            this.sources
        );
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vulnerabilityId == null) ? 0 : vulnerabilityId.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OssSummary other = (OssSummary) obj;
        if (vulnerabilityId == null) {
            if (other.vulnerabilityId != null)
                return false;
        } else if (!vulnerabilityId.equals(other.vulnerabilityId))
            return false;
        if (severity == null) {
            if (other.severity != null)
                return false;
        } else if (!severity.equals(other.severity))
            return false;
        return true;
    }


}
