package io.patchfox.package_utils.data.oss;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageData;


/**
 * superclass for anything representing an OSS report 
 */
public abstract class OssReportPackageData<T> extends PackageData<T> {

    private static final Logger LOG = LoggerFactory.getLogger(OssReportPackageData.class);

    public OssReportPackageData(T data, DataFileTypeEnum dataFileType) {
        super(data, PackageData.PackageDataType.OSS_REPORT, dataFileType);
    }

    @JsonIgnore
    public abstract List<OssPackageData> getOssDependencyData();
    
}
