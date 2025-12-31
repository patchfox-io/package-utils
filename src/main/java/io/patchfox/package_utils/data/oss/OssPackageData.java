package io.patchfox.package_utils.data.oss;

import io.patchfox.package_utils.data.pkg.PackageData;

public class OssPackageData extends PackageData<OssSummary> {

    public OssPackageData(OssSummary data) { 
        super(data, PackageData.PackageDataType.OSS_SUMMARY); 
    }
    
}
