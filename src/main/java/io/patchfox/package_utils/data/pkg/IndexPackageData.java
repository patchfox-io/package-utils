package io.patchfox.package_utils.data.pkg;


import com.fasterxml.jackson.annotation.JsonIgnore;

import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;


/**
 * PackageDependencyData --> Additional "what is this thing" information about a given "Dependency" 
 * 
 */  
public abstract class IndexPackageData<T> extends PackageData<T> {

    /**
     * 
     * @param data
     */
    public IndexPackageData(T data, DataFileTypeEnum dataFileType) { 
        super(data, PackageData.PackageDataType.PACKAGE, dataFileType); 
    }

    /**
     * 
     * @return
     */
    @JsonIgnore
    public abstract PackageURL getPurl() throws MalformedPackageURLException;

    /**
     * 
     * @return
     */
    public abstract boolean getIsReal();

}
