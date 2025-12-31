package io.patchfox.package_utils.data.build.git;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Getter
@Setter
@NoArgsConstructor
// @AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuildGitBlameRecord {
    
    private static final Logger LOG = LoggerFactory.getLogger(BuildGitBlameRecord.class);

    @Setter(AccessLevel.NONE)
    @JsonProperty("index")
    private int index;

    @JsonProperty("commit")
    private String commit;

    @JsonProperty("author")
    private String author;

    @JsonProperty("commitDatetime")
    private ZonedDateTime commitDatetime;

    @JsonProperty("buildFileLine")
    private String buildFileLine;

    //

    @JsonCreator
    @ConstructorProperties({"index", "commit", "author", "commitDatetime", "buildFileLine"})
    public BuildGitBlameRecord(
        int index, 
        String commit, 
        String author,
        ZonedDateTime commitDatetime,
        String buildFileLine
    ) {
        setIndex(index);
        setCommit(commit);
        setAuthor(author);
        setCommitDatetime(commitDatetime);
        setBuildFileLine(buildFileLine);
    }

    //

    public void setIndex(int index) { 
        if (index < 0 || index > 1000000) { 
            LOG.error("index: {} is out of bounds", index);
            throw new IllegalArgumentException();
        }

        this.index = index;
    }

}
