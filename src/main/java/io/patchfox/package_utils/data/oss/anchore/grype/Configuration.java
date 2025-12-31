
package io.patchfox.package_utils.data.oss.anchore.grype;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configPath",
    "verbosity",
    "output",
    "file",
    "distro",
    "add-cpes-if-none",
    "output-template-file",
    "quiet",
    "check-for-app-update",
    "only-fixed",
    "only-notfixed",
    "platform",
    "search",
    "ignore",
    "exclude",
    "db",
    "externalSources",
    "match",
    "dev",
    "fail-on-severity",
    "registry",
    "log",
    "show-suppressed",
    "by-cve",
    "name",
    "default-image-pull-source"
})
@Generated("jsonschema2pojo")
public class Configuration {

    @JsonProperty("configPath")
    private String configPath;
    @JsonProperty("verbosity")
    private Integer verbosity;
    @JsonProperty("output")
    private List<String> output;
    @JsonProperty("file")
    private String file;
    @JsonProperty("distro")
    private String distro;
    @JsonProperty("add-cpes-if-none")
    private Boolean addCpesIfNone;
    @JsonProperty("output-template-file")
    private String outputTemplateFile;
    @JsonProperty("quiet")
    private Boolean quiet;
    @JsonProperty("check-for-app-update")
    private Boolean checkForAppUpdate;
    @JsonProperty("only-fixed")
    private Boolean onlyFixed;
    @JsonProperty("only-notfixed")
    private Boolean onlyNotfixed;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("search")
    private Search search;
    @JsonProperty("ignore")
    private Object ignore;
    @JsonProperty("exclude")
    private List<Object> exclude;
    @JsonProperty("db")
    private Db db;
    @JsonProperty("externalSources")
    private ExternalSources externalSources;
    @JsonProperty("match")
    private Match__1 match;
    @JsonProperty("dev")
    private Dev dev;
    @JsonProperty("fail-on-severity")
    private String failOnSeverity;
    @JsonProperty("registry")
    private Registry registry;
    @JsonProperty("log")
    private Log log;
    @JsonProperty("show-suppressed")
    private Boolean showSuppressed;
    @JsonProperty("by-cve")
    private Boolean byCve;
    @JsonProperty("name")
    private String name;
    @JsonProperty("default-image-pull-source")
    private String defaultImagePullSource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Configuration() {
    }

    /**
     * 
     * @param distro
     * @param log
     * @param configPath
     * @param defaultImagePullSource
     * @param platform
     * @param output
     * @param addCpesIfNone
     * @param search
     * @param file
     * @param dev
     * @param ignore
     * @param exclude
     * @param quiet
     * @param onlyNotfixed
     * @param failOnSeverity
     * @param registry
     * @param showSuppressed
     * @param byCve
     * @param externalSources
     * @param match
     * @param checkForAppUpdate
     * @param outputTemplateFile
     * @param name
     * @param onlyFixed
     * @param verbosity
     * @param db
     */
    public Configuration(String configPath, Integer verbosity, List<String> output, String file, String distro, Boolean addCpesIfNone, String outputTemplateFile, Boolean quiet, Boolean checkForAppUpdate, Boolean onlyFixed, Boolean onlyNotfixed, String platform, Search search, Object ignore, List<Object> exclude, Db db, ExternalSources externalSources, Match__1 match, Dev dev, String failOnSeverity, Registry registry, Log log, Boolean showSuppressed, Boolean byCve, String name, String defaultImagePullSource) {
        super();
        this.configPath = configPath;
        this.verbosity = verbosity;
        this.output = output;
        this.file = file;
        this.distro = distro;
        this.addCpesIfNone = addCpesIfNone;
        this.outputTemplateFile = outputTemplateFile;
        this.quiet = quiet;
        this.checkForAppUpdate = checkForAppUpdate;
        this.onlyFixed = onlyFixed;
        this.onlyNotfixed = onlyNotfixed;
        this.platform = platform;
        this.search = search;
        this.ignore = ignore;
        this.exclude = exclude;
        this.db = db;
        this.externalSources = externalSources;
        this.match = match;
        this.dev = dev;
        this.failOnSeverity = failOnSeverity;
        this.registry = registry;
        this.log = log;
        this.showSuppressed = showSuppressed;
        this.byCve = byCve;
        this.name = name;
        this.defaultImagePullSource = defaultImagePullSource;
    }

    @JsonProperty("configPath")
    public String getConfigPath() {
        return configPath;
    }

    @JsonProperty("configPath")
    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }

    @JsonProperty("verbosity")
    public Integer getVerbosity() {
        return verbosity;
    }

    @JsonProperty("verbosity")
    public void setVerbosity(Integer verbosity) {
        this.verbosity = verbosity;
    }

    @JsonProperty("output")
    public List<String> getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(List<String> output) {
        this.output = output;
    }

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    @JsonProperty("distro")
    public String getDistro() {
        return distro;
    }

    @JsonProperty("distro")
    public void setDistro(String distro) {
        this.distro = distro;
    }

    @JsonProperty("add-cpes-if-none")
    public Boolean getAddCpesIfNone() {
        return addCpesIfNone;
    }

    @JsonProperty("add-cpes-if-none")
    public void setAddCpesIfNone(Boolean addCpesIfNone) {
        this.addCpesIfNone = addCpesIfNone;
    }

    @JsonProperty("output-template-file")
    public String getOutputTemplateFile() {
        return outputTemplateFile;
    }

    @JsonProperty("output-template-file")
    public void setOutputTemplateFile(String outputTemplateFile) {
        this.outputTemplateFile = outputTemplateFile;
    }

    @JsonProperty("quiet")
    public Boolean getQuiet() {
        return quiet;
    }

    @JsonProperty("quiet")
    public void setQuiet(Boolean quiet) {
        this.quiet = quiet;
    }

    @JsonProperty("check-for-app-update")
    public Boolean getCheckForAppUpdate() {
        return checkForAppUpdate;
    }

    @JsonProperty("check-for-app-update")
    public void setCheckForAppUpdate(Boolean checkForAppUpdate) {
        this.checkForAppUpdate = checkForAppUpdate;
    }

    @JsonProperty("only-fixed")
    public Boolean getOnlyFixed() {
        return onlyFixed;
    }

    @JsonProperty("only-fixed")
    public void setOnlyFixed(Boolean onlyFixed) {
        this.onlyFixed = onlyFixed;
    }

    @JsonProperty("only-notfixed")
    public Boolean getOnlyNotfixed() {
        return onlyNotfixed;
    }

    @JsonProperty("only-notfixed")
    public void setOnlyNotfixed(Boolean onlyNotfixed) {
        this.onlyNotfixed = onlyNotfixed;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("search")
    public Search getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(Search search) {
        this.search = search;
    }

    @JsonProperty("ignore")
    public Object getIgnore() {
        return ignore;
    }

    @JsonProperty("ignore")
    public void setIgnore(Object ignore) {
        this.ignore = ignore;
    }

    @JsonProperty("exclude")
    public List<Object> getExclude() {
        return exclude;
    }

    @JsonProperty("exclude")
    public void setExclude(List<Object> exclude) {
        this.exclude = exclude;
    }

    @JsonProperty("db")
    public Db getDb() {
        return db;
    }

    @JsonProperty("db")
    public void setDb(Db db) {
        this.db = db;
    }

    @JsonProperty("externalSources")
    public ExternalSources getExternalSources() {
        return externalSources;
    }

    @JsonProperty("externalSources")
    public void setExternalSources(ExternalSources externalSources) {
        this.externalSources = externalSources;
    }

    @JsonProperty("match")
    public Match__1 getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(Match__1 match) {
        this.match = match;
    }

    @JsonProperty("dev")
    public Dev getDev() {
        return dev;
    }

    @JsonProperty("dev")
    public void setDev(Dev dev) {
        this.dev = dev;
    }

    @JsonProperty("fail-on-severity")
    public String getFailOnSeverity() {
        return failOnSeverity;
    }

    @JsonProperty("fail-on-severity")
    public void setFailOnSeverity(String failOnSeverity) {
        this.failOnSeverity = failOnSeverity;
    }

    @JsonProperty("registry")
    public Registry getRegistry() {
        return registry;
    }

    @JsonProperty("registry")
    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    @JsonProperty("log")
    public Log getLog() {
        return log;
    }

    @JsonProperty("log")
    public void setLog(Log log) {
        this.log = log;
    }

    @JsonProperty("show-suppressed")
    public Boolean getShowSuppressed() {
        return showSuppressed;
    }

    @JsonProperty("show-suppressed")
    public void setShowSuppressed(Boolean showSuppressed) {
        this.showSuppressed = showSuppressed;
    }

    @JsonProperty("by-cve")
    public Boolean getByCve() {
        return byCve;
    }

    @JsonProperty("by-cve")
    public void setByCve(Boolean byCve) {
        this.byCve = byCve;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("default-image-pull-source")
    public String getDefaultImagePullSource() {
        return defaultImagePullSource;
    }

    @JsonProperty("default-image-pull-source")
    public void setDefaultImagePullSource(String defaultImagePullSource) {
        this.defaultImagePullSource = defaultImagePullSource;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Configuration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configPath");
        sb.append('=');
        sb.append(((this.configPath == null)?"<null>":this.configPath));
        sb.append(',');
        sb.append("verbosity");
        sb.append('=');
        sb.append(((this.verbosity == null)?"<null>":this.verbosity));
        sb.append(',');
        sb.append("output");
        sb.append('=');
        sb.append(((this.output == null)?"<null>":this.output));
        sb.append(',');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("distro");
        sb.append('=');
        sb.append(((this.distro == null)?"<null>":this.distro));
        sb.append(',');
        sb.append("addCpesIfNone");
        sb.append('=');
        sb.append(((this.addCpesIfNone == null)?"<null>":this.addCpesIfNone));
        sb.append(',');
        sb.append("outputTemplateFile");
        sb.append('=');
        sb.append(((this.outputTemplateFile == null)?"<null>":this.outputTemplateFile));
        sb.append(',');
        sb.append("quiet");
        sb.append('=');
        sb.append(((this.quiet == null)?"<null>":this.quiet));
        sb.append(',');
        sb.append("checkForAppUpdate");
        sb.append('=');
        sb.append(((this.checkForAppUpdate == null)?"<null>":this.checkForAppUpdate));
        sb.append(',');
        sb.append("onlyFixed");
        sb.append('=');
        sb.append(((this.onlyFixed == null)?"<null>":this.onlyFixed));
        sb.append(',');
        sb.append("onlyNotfixed");
        sb.append('=');
        sb.append(((this.onlyNotfixed == null)?"<null>":this.onlyNotfixed));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("search");
        sb.append('=');
        sb.append(((this.search == null)?"<null>":this.search));
        sb.append(',');
        sb.append("ignore");
        sb.append('=');
        sb.append(((this.ignore == null)?"<null>":this.ignore));
        sb.append(',');
        sb.append("exclude");
        sb.append('=');
        sb.append(((this.exclude == null)?"<null>":this.exclude));
        sb.append(',');
        sb.append("db");
        sb.append('=');
        sb.append(((this.db == null)?"<null>":this.db));
        sb.append(',');
        sb.append("externalSources");
        sb.append('=');
        sb.append(((this.externalSources == null)?"<null>":this.externalSources));
        sb.append(',');
        sb.append("match");
        sb.append('=');
        sb.append(((this.match == null)?"<null>":this.match));
        sb.append(',');
        sb.append("dev");
        sb.append('=');
        sb.append(((this.dev == null)?"<null>":this.dev));
        sb.append(',');
        sb.append("failOnSeverity");
        sb.append('=');
        sb.append(((this.failOnSeverity == null)?"<null>":this.failOnSeverity));
        sb.append(',');
        sb.append("registry");
        sb.append('=');
        sb.append(((this.registry == null)?"<null>":this.registry));
        sb.append(',');
        sb.append("log");
        sb.append('=');
        sb.append(((this.log == null)?"<null>":this.log));
        sb.append(',');
        sb.append("showSuppressed");
        sb.append('=');
        sb.append(((this.showSuppressed == null)?"<null>":this.showSuppressed));
        sb.append(',');
        sb.append("byCve");
        sb.append('=');
        sb.append(((this.byCve == null)?"<null>":this.byCve));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("defaultImagePullSource");
        sb.append('=');
        sb.append(((this.defaultImagePullSource == null)?"<null>":this.defaultImagePullSource));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
