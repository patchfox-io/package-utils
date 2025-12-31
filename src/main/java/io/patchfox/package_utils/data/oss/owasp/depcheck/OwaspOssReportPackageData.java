package io.patchfox.package_utils.data.oss.owasp.depcheck;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.patchfox.package_utils.data.DataFile.DataFileTypeEnum;
import io.patchfox.package_utils.data.oss.OssPackageData;
import io.patchfox.package_utils.data.oss.OssReportPackageData;
import io.patchfox.package_utils.data.oss.OssSummary;
import io.patchfox.package_utils.util.CvssSeverity;

import java.util.ArrayList;


public class OwaspOssReportPackageData extends OssReportPackageData<Report> {

    private static final Logger LOG = LoggerFactory.getLogger(OssReportPackageData.class);

    public static final String REPORTER_NAME = "OWASP_DEPENDENCY_CHECK";

    @JsonCreator
    public OwaspOssReportPackageData(Report data) { super(data, DataFileTypeEnum.OWASP_DEPENDENCY_CHECK); }

    @Override
    public List<OssPackageData> getOssDependencyData() {

        List<OssPackageData> rv = new ArrayList<>();
        for (var dependency : super.getData().getDependencies()) {

            for (var vulnerability : dependency.getVulnerabilities()) {
                var ossSummary = new OssSummary();
                ossSummary.setVulnerabilityId(vulnerability.getName());
                ossSummary.setSeverity(CvssSeverity.valueOf(vulnerability.getSeverity().toUpperCase()));
                ossSummary.setDescription(vulnerability.getDescription());
                ossSummary.addSource(vulnerability.getSource());
                ossSummary.addReporter(REPORTER_NAME);

                if (dependency.getPackages() == null || dependency.getPackages().size() == 0) {
                    LOG.warn("no purl found - moving onto next record");
                    continue;
                }
    
                if (dependency.getPackages().size() > 1) {
                    LOG.warn("purl may not be accurate as packages list has multiple has more than one entry!");
                }
    
                var purlString = dependency.getPackages()
                                           .get(0)
                                           .getId();
    
                // var unEscapedPurl = StringEscapeUtils.unescapeJava(purlString);
                // ossSummary.setPurl(unEscapedPurl);
                ossSummary.setPurl(purlString);
                LOG.debug("ossSummary is: {}", ossSummary);
                var ossDependencyData = new OssPackageData(ossSummary);
                rv.add(ossDependencyData);
            }

        }

        return rv;
    }

    
}
