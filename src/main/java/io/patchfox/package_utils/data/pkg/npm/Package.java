package io.patchfox.package_utils.data.pkg.npm;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "name",
        "scope",
        "resolved",
        "overridden",
        "dependencies"
})
public class Package {
    private static final Logger LOG = LoggerFactory.getLogger(Package.class);

    @JsonProperty("version")
    private String version; 

    @JsonProperty("name")
    private String name;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("resolved")
    private String resolved;

    @JsonProperty("overridden")
    private boolean overridden;

    @JsonProperty("dependencies")
    private Map<String, Package> dependencies;

    //

    public String getVersion() { return this.version; }

    public void setVersion(String version) { this.version = version; }

    //

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    //

    public String getScope() { return this.scope; }

    //

    public String getResolved() { return this.resolved; }

    public void setResolved(String resolved) { 
        try {
            this.resolved = new URI(resolved).toString();
        } catch (URISyntaxException e) {
            LOG.error("not setting resolved to: {}", resolved);
            LOG.error("caught exception: {}", e.getMessage());
        }
        
    }

    //

    public boolean getOverridden() { return this.overridden; }

    public void setOverridden(boolean overridden) { this.overridden = overridden; }

    //

    public Map<String, Package> getDependencies() { return this.dependencies; }

    public void setDependencies(Map<String, Package> dependencies) { this.dependencies = dependencies; }

    public void addDependency(String name, Package pkg) { 
        if (this.dependencies == null) {
            this.dependencies = new HashMap<String, Package>();
        }

        this.dependencies.put(name, pkg);
    }

}
