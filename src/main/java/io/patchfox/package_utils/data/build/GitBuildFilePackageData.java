package io.patchfox.package_utils.data.build;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.build.git.BuildGitBlame;

public class GitBuildFilePackageData extends BuildFilePackageData<BuildGitBlame> {

    @JsonCreator
    public GitBuildFilePackageData(BuildGitBlame data) { super(data, DataFileTypeEnum.BUILD_FILE_GIT_BLAME); }
    
}
