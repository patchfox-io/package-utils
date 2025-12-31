package io.patchfox.package_utils.data.sbom.syft;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.PackageWrapper;
import io.patchfox.package_utils.data.sbom.SbomPackageData;
import io.patchfox.package_utils.util.PackageWrapperHelpers;


public class SyftSbomPackageData extends SbomPackageData<Report> {

    private static final Logger LOG = LoggerFactory.getLogger(SyftSbomPackageData.class);

    @JsonCreator
    public SyftSbomPackageData(Report data) { super(data, DataFileTypeEnum.SYFT_SBOM); }
    
    
    /**
     * 
     */
    public PackageWrapper getDependencyTree() throws MalformedPackageURLException {
        var id = this.getData()
                     .getSource()
                     .getId();

        var root = new PackageWrapper.Builder()
                                 .withType(PackageWrapper.GENERIC_PACKAGE_TYPE)
                                 .withName(id)
                                 .build();

        for (var artifact: this.getData().getArtifacts()) {
            var decodedPurlString = PackageWrapperHelpers.urlDecode(artifact.getPurl());
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

        for (var artifact: this.getData().getArtifacts()) {
            var decodedPurl = new PackageURL(artifact.getPurl());

            var child = new PackageWrapper.Builder()
                                          .withPurl(decodedPurl)
                                          .build();

            root.addChild(child);
        }

        return root; 
    }
}
