package io.patchfox.package_utils.data.sbom.spdx;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageWrapper;
import io.patchfox.package_utils.data.sbom.SbomPackageData;
import io.patchfox.package_utils.util.PackageWrapperHelpers;


public class SpdxSbomPackageData extends SbomPackageData<SpdxSbom> {

    @JsonCreator
    public SpdxSbomPackageData(SpdxSbom data) { super(data, DataFileTypeEnum.SPDX_SBOM); }
    
    
    /**
     * 
     */
    public PackageWrapper getDependencyTree() throws MalformedPackageURLException {
        var name = this.getData().getName();

        var root = new PackageWrapper.Builder()
                                 .withType(PackageWrapper.GENERIC_PACKAGE_TYPE)
                                 .withName(name)
                                 .build();

        for (var pkg : this.getData().getPackages()) {
            for (var externalRef : pkg.getExternalRefs()) {
                var referenceCategory = externalRef.getReferenceCategory();
                var referenceType = externalRef.getReferenceType();
                if (referenceCategory.equals("PACKAGE-MANAGER") && referenceType.equals("purl")) {
                    var purlString = externalRef.getReferenceLocator();
                    // because sometimes this happens
                    //     {
                    //          "referenceCategory": "PACKAGE-MANAGER",
                    //          "referenceType": "purl",
                    //          "referenceLocator": "pkg:npm/%40ag-grid-community/angular@31.0.1",
                    //          "comment": ""
                    //      }
                    var decodedPurlString = PackageWrapperHelpers.urlDecode(purlString);
                    var decodedPurl = new PackageURL(decodedPurlString);

                    var child = new PackageWrapper.Builder()
                                              .withPurl(decodedPurl)
                                              .build();

                    root.addChild(child);
                }
            }

        }

        return root;  
    }


    @Override
    public PackageWrapper getDependencyTree(PackageURL eventDataSource) throws MalformedPackageURLException {
        var root = new PackageWrapper.Builder()
                                     .withType(eventDataSource.getType())
                                     .withNamespace(eventDataSource.getNamespace())
                                     .withName(eventDataSource.getName())
                                     .withVersion(eventDataSource.getVersion())
                                     .withQualifiers(eventDataSource.getQualifiers())
                                     //.withSubPath(eventDataSource.getSubpath())
                                     .build();

        for (var pkg : this.getData().getPackages()) {
            for (var externalRef : pkg.getExternalRefs()) {
                var referenceCategory = externalRef.getReferenceCategory();
                var referenceType = externalRef.getReferenceType();
                if (referenceCategory.equals("PACKAGE-MANAGER") && referenceType.equals("purl")) {
                    var purlString = externalRef.getReferenceLocator();
                    // because sometimes this happens
                    //     {
                    //          "referenceCategory": "PACKAGE-MANAGER",
                    //          "referenceType": "purl",
                    //          "referenceLocator": "pkg:npm/%40ag-grid-community/angular@31.0.1",
                    //          "comment": ""
                    //      }
                    var decodedPurlString = PackageWrapperHelpers.urlDecode(purlString);
                    var decodedPurl = new PackageURL(decodedPurlString);

                    var child = new PackageWrapper.Builder()
                                              .withPurl(decodedPurl)
                                              .build();

                    root.addChild(child);
                }
            }

        }

        return root;  
    }
}
