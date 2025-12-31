package io.patchfox.package_utils.data.pkg;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;
import com.github.packageurl.PackageURLBuilder;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.npm.Package;
import io.patchfox.package_utils.util.PackageWrapperHelpers;


public class NpmIndexPackageData extends IndexPackageData<Package> {

    @JsonCreator
    public NpmIndexPackageData(Package pkg) { super(pkg, DataFileTypeEnum.NPM_DEPGRAPH); }

    /**
     * 
     */
    @Override
    public PackageURL getPurl() throws MalformedPackageURLException {

        try {
            // because sometimes this happens
            // pkg:npm/%40ag-grid-community/angular@31.0.1
            var name = PackageWrapperHelpers.urlDecode(super.getData().getName());

            var bob =  PackageURLBuilder.aPackageURL()
                                        .withType("npm")
                                        .withName(name)
                                        .withVersion(super.getData().getVersion());

            return bob.build();
        } catch (MalformedPackageURLException | NullPointerException e) {
            throw new MalformedPackageURLException(e.getMessage());
        }

    }

    /**
     * 
     */
    @Override
    public boolean getIsReal() {
        return super.getData().getOverridden();
    }
    
}
