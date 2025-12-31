package io.patchfox.package_utils.data.pkg;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;
import com.github.packageurl.PackageURLBuilder;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.pkg.java.Artifact;


public class MavenIndexPackageData extends IndexPackageData<Artifact> {

    private static final Logger LOG = LoggerFactory.getLogger(MavenIndexPackageData.class);


    @JsonCreator
    public MavenIndexPackageData(Artifact artifact) { super(artifact, DataFileTypeEnum.MAVEN_DEPGRAPH); }

    /**
     * 
     */
    @Override
    public PackageURL getPurl() throws MalformedPackageURLException {

        // at this point nothing should be processed that doesn't have at least groupId, artifactId, and version
        var bob =  PackageURLBuilder.aPackageURL()
                                    .withType("maven")
                                    .withNamespace(super.getData().getGroupId())
                                    .withName(super.getData().getArtifactId())
                                    .withVersion(super.getData().getVersion().getVersion());

        var type = super.getData().getArtifactType();
        if (type != null && !type.isBlank()) {
            bob.withQualifier("type", super.getData().getArtifactType());
        }
                                
        return bob.build();
    }

    /**
     * 
     */
    @Override
    public boolean getIsReal() {
        var notes = super.getData().getNotes();
        if ( notes != null && notes.contains("omitted") ) {
            return false;
        }

        return true;
    }

}
