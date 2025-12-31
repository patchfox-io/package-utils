package io.patchfox.package_utils.data.sbom.syft;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpe",
    "source",
})
public class Cpe {

    @JsonCreator
    public Cpe(String cpe) {
        this.cpe = cpe;
    }

    @JsonProperty("cpe")
    private String cpe;

    @JsonProperty("source")
    private String source;

    //

    public String getCpe() {
        return cpe;
    }

    public void setCpe(String cpe) {
        this.cpe = cpe;
    }

    //
    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    //

    

}
