package io.patchfox.package_utils.data.metadata;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.metadata.etl.EtlMetadata;


public class EtlMetadataPackageData extends MetadataPackageData<EtlMetadata> {

    @JsonCreator
    public EtlMetadataPackageData(EtlMetadata data) { super(data, DataFileTypeEnum.ETL_BUILD_METADATA); }

}
