package io.patchfox.package_utils.data.oss.anchore.grype;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.oss.OssPackageData;
import io.patchfox.package_utils.data.oss.OssReportPackageData;
import io.patchfox.package_utils.data.oss.OssSummary;
import io.patchfox.package_utils.util.CvssSeverity;

import java.util.ArrayList;
import java.util.HashSet;


public class GrypeOssReportPackageData extends OssReportPackageData<Report> {

    public static final String REPORTER_NAME = "GRYPE";

    @JsonCreator
    public GrypeOssReportPackageData(Report data) { super(data, DataFileTypeEnum.GRYPE_OSS); }

    @Override
    public List<OssPackageData> getOssDependencyData() {
        
        List<OssPackageData> rv = new ArrayList<>();
        for (var match : super.getData().getMatches()) {
            var ossSummary = new OssSummary();

            if (match.getVulnerability() != null) {
                var vulnerability = match.getVulnerability();
                ossSummary.setVulnerabilityId(vulnerability.getId());
                ossSummary.setSeverity(CvssSeverity.valueOf(vulnerability.getSeverity().toUpperCase()));
                ossSummary.setDescription(vulnerability.getDescription());
                ossSummary.addSource(vulnerability.getDataSource());
                ossSummary.addReporter(REPORTER_NAME);

                if (vulnerability.getFix() != null && vulnerability.getFix().getVersions() != null) {
                    var fixVersions = (List<String>)(Object)vulnerability.getFix().getVersions();
                    ossSummary.setFixedIn(new HashSet<>(fixVersions));
                }

                // Extract publishedDate from Grype output
                if (vulnerability.getPublishedDate() != null && !vulnerability.getPublishedDate().isBlank()) {
                    try {
                        ZonedDateTime publishedAt = ZonedDateTime.parse(vulnerability.getPublishedDate(), DateTimeFormatter.ISO_DATE_TIME);
                        ossSummary.setPublishedAt(publishedAt);
                    } catch (Exception e) {
                        // If parsing fails, just skip setting publishedAt
                    }
                }

            }

            if (ossSummary.getVulnerabilityId() == null || ossSummary.getVulnerabilityId().isBlank()) {
                continue;
            }

            // should never be null... 
            var artifact = match.getArtifact();
            
            ossSummary.setPurl(artifact.getPurl());
            var licenses = (List<String>)(Object)artifact.getLicenses();
            ossSummary.setLicenses(new HashSet<>(licenses));

            ossSummary.setCpes(new HashSet(artifact.getCpes()));

            var ossDependencyData = new OssPackageData(ossSummary);
            rv.add(ossDependencyData);
        }

        return rv;
    }

    
}



