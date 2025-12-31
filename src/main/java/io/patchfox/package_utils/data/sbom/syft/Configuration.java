
package io.patchfox.package_utils.data.sbom.syft;

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
    "quiet",
    "output",
    "output-template-path",
    "file",
    "check-for-app-update",
    "dev",
    "log",
    "catalogers",
    "package",
    "file-metadata",
    "file-classification",
    "file-contents",
    "secrets",
    "registry",
    "exclude",
    "attest",
    "platform",
    "name"
})
@Generated("jsonschema2pojo")
public class Configuration {

    @JsonProperty("configPath")
    private String configPath;
    @JsonProperty("verbosity")
    private Integer verbosity;
    @JsonProperty("quiet")
    private Boolean quiet;
    @JsonProperty("output")
    private List<String> output;
    @JsonProperty("output-template-path")
    private String outputTemplatePath;
    @JsonProperty("file")
    private String file;
    @JsonProperty("check-for-app-update")
    private Boolean checkForAppUpdate;
    @JsonProperty("dev")
    private Dev dev;
    @JsonProperty("log")
    private Log log;
    @JsonProperty("catalogers")
    private Object catalogers;
    @JsonProperty("package")
    private Package _package;
    @JsonProperty("file-metadata")
    private FileMetadata fileMetadata;
    @JsonProperty("file-classification")
    private FileClassification fileClassification;
    @JsonProperty("file-contents")
    private FileContents fileContents;
    @JsonProperty("secrets")
    private Secrets secrets;
    @JsonProperty("registry")
    private Registry registry;
    @JsonProperty("exclude")
    private List<Object> exclude;
    @JsonProperty("attest")
    private Attest attest;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("name")
    private String name;
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
     * @param registry
     * @param log
     * @param checkForAppUpdate
     * @param configPath
     * @param fileContents
     * @param secrets
     * @param platform
     * @param output
     * @param outputTemplatePath
     * @param file
     * @param _package
     * @param fileMetadata
     * @param dev
     * @param fileClassification
     * @param name
     * @param exclude
     * @param quiet
     * @param attest
     * @param catalogers
     * @param verbosity
     */
    public Configuration(String configPath, Integer verbosity, Boolean quiet, List<String> output, String outputTemplatePath, String file, Boolean checkForAppUpdate, Dev dev, Log log, Object catalogers, Package _package, FileMetadata fileMetadata, FileClassification fileClassification, FileContents fileContents, Secrets secrets, Registry registry, List<Object> exclude, Attest attest, String platform, String name) {
        super();
        this.configPath = configPath;
        this.verbosity = verbosity;
        this.quiet = quiet;
        this.output = output;
        this.outputTemplatePath = outputTemplatePath;
        this.file = file;
        this.checkForAppUpdate = checkForAppUpdate;
        this.dev = dev;
        this.log = log;
        this.catalogers = catalogers;
        this._package = _package;
        this.fileMetadata = fileMetadata;
        this.fileClassification = fileClassification;
        this.fileContents = fileContents;
        this.secrets = secrets;
        this.registry = registry;
        this.exclude = exclude;
        this.attest = attest;
        this.platform = platform;
        this.name = name;
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

    @JsonProperty("quiet")
    public Boolean getQuiet() {
        return quiet;
    }

    @JsonProperty("quiet")
    public void setQuiet(Boolean quiet) {
        this.quiet = quiet;
    }

    @JsonProperty("output")
    public List<String> getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(List<String> output) {
        this.output = output;
    }

    @JsonProperty("output-template-path")
    public String getOutputTemplatePath() {
        return outputTemplatePath;
    }

    @JsonProperty("output-template-path")
    public void setOutputTemplatePath(String outputTemplatePath) {
        this.outputTemplatePath = outputTemplatePath;
    }

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    @JsonProperty("check-for-app-update")
    public Boolean getCheckForAppUpdate() {
        return checkForAppUpdate;
    }

    @JsonProperty("check-for-app-update")
    public void setCheckForAppUpdate(Boolean checkForAppUpdate) {
        this.checkForAppUpdate = checkForAppUpdate;
    }

    @JsonProperty("dev")
    public Dev getDev() {
        return dev;
    }

    @JsonProperty("dev")
    public void setDev(Dev dev) {
        this.dev = dev;
    }

    @JsonProperty("log")
    public Log getLog() {
        return log;
    }

    @JsonProperty("log")
    public void setLog(Log log) {
        this.log = log;
    }

    @JsonProperty("catalogers")
    public Object getCatalogers() {
        return catalogers;
    }

    @JsonProperty("catalogers")
    public void setCatalogers(Object catalogers) {
        this.catalogers = catalogers;
    }

    @JsonProperty("package")
    public Package getPackage() {
        return _package;
    }

    @JsonProperty("package")
    public void setPackage(Package _package) {
        this._package = _package;
    }

    @JsonProperty("file-metadata")
    public FileMetadata getFileMetadata() {
        return fileMetadata;
    }

    @JsonProperty("file-metadata")
    public void setFileMetadata(FileMetadata fileMetadata) {
        this.fileMetadata = fileMetadata;
    }

    @JsonProperty("file-classification")
    public FileClassification getFileClassification() {
        return fileClassification;
    }

    @JsonProperty("file-classification")
    public void setFileClassification(FileClassification fileClassification) {
        this.fileClassification = fileClassification;
    }

    @JsonProperty("file-contents")
    public FileContents getFileContents() {
        return fileContents;
    }

    @JsonProperty("file-contents")
    public void setFileContents(FileContents fileContents) {
        this.fileContents = fileContents;
    }

    @JsonProperty("secrets")
    public Secrets getSecrets() {
        return secrets;
    }

    @JsonProperty("secrets")
    public void setSecrets(Secrets secrets) {
        this.secrets = secrets;
    }

    @JsonProperty("registry")
    public Registry getRegistry() {
        return registry;
    }

    @JsonProperty("registry")
    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    @JsonProperty("exclude")
    public List<Object> getExclude() {
        return exclude;
    }

    @JsonProperty("exclude")
    public void setExclude(List<Object> exclude) {
        this.exclude = exclude;
    }

    @JsonProperty("attest")
    public Attest getAttest() {
        return attest;
    }

    @JsonProperty("attest")
    public void setAttest(Attest attest) {
        this.attest = attest;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
        sb.append("quiet");
        sb.append('=');
        sb.append(((this.quiet == null)?"<null>":this.quiet));
        sb.append(',');
        sb.append("output");
        sb.append('=');
        sb.append(((this.output == null)?"<null>":this.output));
        sb.append(',');
        sb.append("outputTemplatePath");
        sb.append('=');
        sb.append(((this.outputTemplatePath == null)?"<null>":this.outputTemplatePath));
        sb.append(',');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("checkForAppUpdate");
        sb.append('=');
        sb.append(((this.checkForAppUpdate == null)?"<null>":this.checkForAppUpdate));
        sb.append(',');
        sb.append("dev");
        sb.append('=');
        sb.append(((this.dev == null)?"<null>":this.dev));
        sb.append(',');
        sb.append("log");
        sb.append('=');
        sb.append(((this.log == null)?"<null>":this.log));
        sb.append(',');
        sb.append("catalogers");
        sb.append('=');
        sb.append(((this.catalogers == null)?"<null>":this.catalogers));
        sb.append(',');
        sb.append("_package");
        sb.append('=');
        sb.append(((this._package == null)?"<null>":this._package));
        sb.append(',');
        sb.append("fileMetadata");
        sb.append('=');
        sb.append(((this.fileMetadata == null)?"<null>":this.fileMetadata));
        sb.append(',');
        sb.append("fileClassification");
        sb.append('=');
        sb.append(((this.fileClassification == null)?"<null>":this.fileClassification));
        sb.append(',');
        sb.append("fileContents");
        sb.append('=');
        sb.append(((this.fileContents == null)?"<null>":this.fileContents));
        sb.append(',');
        sb.append("secrets");
        sb.append('=');
        sb.append(((this.secrets == null)?"<null>":this.secrets));
        sb.append(',');
        sb.append("registry");
        sb.append('=');
        sb.append(((this.registry == null)?"<null>":this.registry));
        sb.append(',');
        sb.append("exclude");
        sb.append('=');
        sb.append(((this.exclude == null)?"<null>":this.exclude));
        sb.append(',');
        sb.append("attest");
        sb.append('=');
        sb.append(((this.attest == null)?"<null>":this.attest));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
