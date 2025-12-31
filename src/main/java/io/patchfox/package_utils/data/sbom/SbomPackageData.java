package io.patchfox.package_utils.data.sbom;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageData;
import io.patchfox.package_utils.data.pkg.PackageWrapper;

public abstract class SbomPackageData <T> extends PackageData<T> {

    public SbomPackageData(T data, DataFileTypeEnum dataFileType) {
        super(data, PackageData.PackageDataType.SBOM, dataFileType);
    }

    @JsonIgnore
    public abstract PackageWrapper getDependencyTree() throws MalformedPackageURLException;

    @JsonIgnore
    public abstract PackageWrapper getDependencyTree(PackageURL eventDataSource) throws MalformedPackageURLException;

}
