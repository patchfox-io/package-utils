package io.patchfox.package_utils.data.build.git;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.patchfox.package_utils.util.BuildGitBlameJsonDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(using = BuildGitBlameJsonDeserializer.class)
public class BuildGitBlame {

    @JsonProperty("buildGitBlameRecords")
    private List<BuildGitBlameRecord> buildGitBlameRecords;

    @JsonCreator
    public BuildGitBlame(List<BuildGitBlameRecord> buildGitBlameRecords) {
        this.buildGitBlameRecords = buildGitBlameRecords;
    }

}
