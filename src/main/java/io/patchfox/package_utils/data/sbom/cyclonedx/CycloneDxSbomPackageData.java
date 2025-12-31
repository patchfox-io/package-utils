package io.patchfox.package_utils.data.sbom.cyclonedx;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageWrapper;
import io.patchfox.package_utils.data.sbom.SbomPackageData;
import io.patchfox.package_utils.util.PackageWrapperHelpers;


public class CycloneDxSbomPackageData extends SbomPackageData<Bom15Schema> {

    @JsonCreator
    public CycloneDxSbomPackageData(Bom15Schema data) { super(data, DataFileTypeEnum.CYCLONEDX_SBOM); }

    @Override
    public PackageWrapper getDependencyTree() throws MalformedPackageURLException {
        
        var name = this.getData()
                       .getMetadata()
                       .getComponent()
                       .getName();

        var root = new PackageWrapper.Builder()
                                 .withType(PackageWrapper.GENERIC_PACKAGE_TYPE)
                                 .withName(name)
                                 .build();

        for (var component : this.getData().getComponents()) {
            var decodedPurlString = PackageWrapperHelpers.urlDecode(component.getPurl());
            var decodedPurl = new PackageURL(decodedPurlString);

            var child = new PackageWrapper.Builder()
                                      .withPurl(decodedPurl)
                                      .build();

            root.addChild(child);
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

        for (var component : this.getData().getComponents()) {
            var decodedPurlString = PackageWrapperHelpers.urlDecode(component.getPurl());
            var decodedPurl = new PackageURL(decodedPurlString);

            var child = new PackageWrapper.Builder()
                                      .withPurl(decodedPurl)
                                      .build();

            root.addChild(child);
        }

        return root;   
    }
    
}
