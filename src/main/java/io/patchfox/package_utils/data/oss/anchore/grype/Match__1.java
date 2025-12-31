
package io.patchfox.package_utils.data.oss.anchore.grype;

import java.util.LinkedHashMap;
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
    "java",
    "dotnet",
    "golang",
    "javascript",
    "python",
    "ruby",
    "stock"
})
@Generated("jsonschema2pojo")
public class Match__1 {

    @JsonProperty("java")
    private Java java;
    @JsonProperty("dotnet")
    private Dotnet dotnet;
    @JsonProperty("golang")
    private Golang golang;
    @JsonProperty("javascript")
    private Javascript javascript;
    @JsonProperty("python")
    private Python python;
    @JsonProperty("ruby")
    private Ruby ruby;
    @JsonProperty("stock")
    private Stock stock;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Match__1() {
    }

    /**
     * 
     * @param python
     * @param java
     * @param dotnet
     * @param golang
     * @param stock
     * @param javascript
     * @param ruby
     */
    public Match__1(Java java, Dotnet dotnet, Golang golang, Javascript javascript, Python python, Ruby ruby, Stock stock) {
        super();
        this.java = java;
        this.dotnet = dotnet;
        this.golang = golang;
        this.javascript = javascript;
        this.python = python;
        this.ruby = ruby;
        this.stock = stock;
    }

    @JsonProperty("java")
    public Java getJava() {
        return java;
    }

    @JsonProperty("java")
    public void setJava(Java java) {
        this.java = java;
    }

    @JsonProperty("dotnet")
    public Dotnet getDotnet() {
        return dotnet;
    }

    @JsonProperty("dotnet")
    public void setDotnet(Dotnet dotnet) {
        this.dotnet = dotnet;
    }

    @JsonProperty("golang")
    public Golang getGolang() {
        return golang;
    }

    @JsonProperty("golang")
    public void setGolang(Golang golang) {
        this.golang = golang;
    }

    @JsonProperty("javascript")
    public Javascript getJavascript() {
        return javascript;
    }

    @JsonProperty("javascript")
    public void setJavascript(Javascript javascript) {
        this.javascript = javascript;
    }

    @JsonProperty("python")
    public Python getPython() {
        return python;
    }

    @JsonProperty("python")
    public void setPython(Python python) {
        this.python = python;
    }

    @JsonProperty("ruby")
    public Ruby getRuby() {
        return ruby;
    }

    @JsonProperty("ruby")
    public void setRuby(Ruby ruby) {
        this.ruby = ruby;
    }

    @JsonProperty("stock")
    public Stock getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock stock) {
        this.stock = stock;
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
        sb.append(Match__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("java");
        sb.append('=');
        sb.append(((this.java == null)?"<null>":this.java));
        sb.append(',');
        sb.append("dotnet");
        sb.append('=');
        sb.append(((this.dotnet == null)?"<null>":this.dotnet));
        sb.append(',');
        sb.append("golang");
        sb.append('=');
        sb.append(((this.golang == null)?"<null>":this.golang));
        sb.append(',');
        sb.append("javascript");
        sb.append('=');
        sb.append(((this.javascript == null)?"<null>":this.javascript));
        sb.append(',');
        sb.append("python");
        sb.append('=');
        sb.append(((this.python == null)?"<null>":this.python));
        sb.append(',');
        sb.append("ruby");
        sb.append('=');
        sb.append(((this.ruby == null)?"<null>":this.ruby));
        sb.append(',');
        sb.append("stock");
        sb.append('=');
        sb.append(((this.stock == null)?"<null>":this.stock));
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
