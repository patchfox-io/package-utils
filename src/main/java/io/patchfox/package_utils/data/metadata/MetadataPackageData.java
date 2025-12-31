package io.patchfox.package_utils.data.metadata;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageData;


/**
 * superclass for anything representing a PF build metadata file
 * 
 */
public class MetadataPackageData<T> extends PackageData<T> {

    public MetadataPackageData(T data, DataFileTypeEnum dataFileType) {
        super(data, PackageData.PackageDataType.ETL_BUILD_METADATA, dataFileType);
    }
    
}