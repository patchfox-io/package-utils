package io.patchfox.package_utils.data.build;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageData;


/**
 * superclass for anything representing a source controlled build file 
 * 
 */
public class BuildFilePackageData<T> extends PackageData<T> {

    public BuildFilePackageData(T data, DataFileTypeEnum dataFileType) {
        super(data, PackageData.PackageDataType.GIT_ANNOTATED_BUILD_FILE, dataFileType);
    }
    
}
