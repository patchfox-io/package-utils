package io.patchfox.package_utils.data.metadata.etl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtlMetadata {

    @JsonProperty("datasource")
    String datasource;

    @JsonProperty("dataType")
    String dataType;

    @JsonProperty("commitHash")
    String commitHash;

    @JsonProperty("commitDatetime")
    ZonedDateTime commitDatetime;

    @JsonProperty("commitBranch")
    String commitBranch;

    @JsonProperty("eventDatetime")
    ZonedDateTime eventDatetime;

}
