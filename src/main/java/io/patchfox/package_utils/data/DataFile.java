package io.patchfox.package_utils.data;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.packageurl.MalformedPackageURLException;

import io.patchfox.package_utils.data.build.GitBuildFilePackageData;
import io.patchfox.package_utils.data.build.git.BuildGitBlame;
import io.patchfox.package_utils.data.metadata.EtlMetadataPackageData;
import io.patchfox.package_utils.data.metadata.MetadataPackageData;
import io.patchfox.package_utils.data.metadata.etl.EtlMetadata;
import io.patchfox.package_utils.data.oss.anchore.grype.GrypeOssReportPackageData;
import io.patchfox.package_utils.data.oss.owasp.depcheck.OwaspOssReportPackageData;
import io.patchfox.package_utils.data.oss.owasp.depcheck.Report;
import io.patchfox.package_utils.data.pkg.MavenIndexPackageData;
import io.patchfox.package_utils.data.pkg.NpmIndexPackageData;
import io.patchfox.package_utils.data.pkg.PackageData;
import io.patchfox.package_utils.data.pkg.PackageWrapper;
import io.patchfox.package_utils.data.pkg.java.Artifact;
import io.patchfox.package_utils.data.sbom.cyclonedx.Bom15Schema;
import io.patchfox.package_utils.data.sbom.cyclonedx.CycloneDxSbomPackageData;
import io.patchfox.package_utils.data.sbom.spdx.SpdxSbom;
import io.patchfox.package_utils.data.sbom.spdx.SpdxSbomPackageData;
import io.patchfox.package_utils.data.sbom.syft.SyftSbomPackageData;
import io.patchfox.package_utils.util.GradleHelpers;
import io.patchfox.package_utils.util.MavenHelpers;
import io.patchfox.package_utils.util.PackageWrapperHelpers;
import io.patchfox.package_utils.util.Pair;

/*
 * WORK LOG 12SEP24 DH
 * 
 * This class has been updated to include wrapper and data class information for every DataFileTypeEnum obj. This is 
 * used by jackson during json deserialization to figure out what PackageData wrapper and PackageData data classes it's 
 * dealing with. 
 * 
 */


/**
 * maps the files coming into wintermute to their respective type
 */
public class DataFile {
    
    private static final Logger LOG = LoggerFactory.getLogger(DataFile.class);

    private final DataFileTypeEnum dataFileType;

    private final File dataFile;

    private String projectName = new String();

    /**
     * recognized file types 
     */
    public enum DataFileTypeEnum {
        UNKNOWN ("") { },
        MAVEN_DEPGRAPH("maven_depgraph.txt") {

            @Override
            public Optional<PackageWrapper> process(File dataFile, String projectName) {
                List<Pair<Integer, PackageWrapper>> unmarshalledMavenDepgraph = 
                    MavenHelpers.unmarshallMavenDepgraph(dataFile, projectName);

                try {
                    var dependency = PackageWrapperHelpers.buildDepgraphTree(
                                        unmarshalledMavenDepgraph, 
                                        projectName, 
                                        MavenHelpers.TREE_DEPTH
                                    );
                    return Optional.of(dependency);
                } catch (MalformedPackageURLException e) {
                    LOG.error("something went wrong during processing", e.getMessage());
                    return Optional.empty();
                } 
            }

            @Override
            public Class<PackageWrapper> returnsClass() { return PackageWrapper.class; }

            @Override
            public Class<MavenIndexPackageData> returnsWrapperClass() { return MavenIndexPackageData.class; }

            @Override
            public Class<Artifact> returnsDataClass() { return Artifact.class; }

        },
        GRADLE_DEPGRAPH("gradle_depgraph.txt") {
            @Override
            public Optional<PackageWrapper> process(File dataFile, String projectName) {
                try {
                    List<Pair<Integer, PackageWrapper>> unmarshalledGradleDepgraph = 
                            GradleHelpers.unmarshallGradleDepgraph(dataFile, projectName);
    
                    var wrappedPackage = PackageWrapperHelpers.buildDepgraphTree(
                                        unmarshalledGradleDepgraph, 
                                        projectName, 
                                        GradleHelpers.TREE_DEPTH
                                    );

                    return Optional.of(wrappedPackage);
                } catch (MalformedPackageURLException e) {
                    LOG.error("something went wrong during processing", e.getMessage());
                    return Optional.empty();
                } catch (Exception e) {
                    LOG.error("caught unexpected general exception during processing", e.getMessage());
                    return Optional.empty();
                }

            }

            @Override
            public Class<PackageWrapper> returnsClass() { return PackageWrapper.class; }

            @Override
            public Class<MavenIndexPackageData> returnsWrapperClass() { return MavenIndexPackageData.class; }

            @Override
            public Class<Artifact> returnsDataClass() { return Artifact.class; }
        },
        NPM_DEPGRAPH("npm_depgraph.txt") {
            @Override
            public Optional<PackageWrapper> process(File dataFile, String projectName) {
                Class<?> dataClazz = Package.class;
                Class<?> wrapperClazz = NpmIndexPackageData.class;

                try {
                    var dependencyDataOptional =  mapJson(dataFile, projectName, dataClazz, wrapperClazz);
                    var npmPackageDependencyData = (NpmIndexPackageData)dependencyDataOptional.get();

                    var wrappedPackage = new PackageWrapper.Builder()
                                                           .withDependencyPackageData(npmPackageDependencyData)
                                                           .build();

                    return Optional.of(wrappedPackage);
                } catch (IOException | MalformedPackageURLException e) {
                    LOG.error("something went wrong processing npm_depgraph.txt file", e);
                    return Optional.empty();
                }
                
            }

            @Override
            public Class<PackageWrapper> returnsClass() { return PackageWrapper.class; }

            @Override
            public Class<NpmIndexPackageData> returnsWrapperClass() { return NpmIndexPackageData.class; }

            @Override
            public Class<io.patchfox.package_utils.data.pkg.npm.Package> returnsDataClass() { 
                return io.patchfox.package_utils.data.pkg.npm.Package.class; 
            }
        },
        ETL_BUILD_METADATA("metadata.json") {
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = EtlMetadata.class;
                Class<?> wrapperClazz = EtlMetadataPackageData.class;
                return mapJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<EtlMetadataPackageData> returnsWrapperClass() { return EtlMetadataPackageData.class; }

            @Override
            public Class<EtlMetadata> returnsDataClass() { return EtlMetadata.class; }
        },
        BUILD_FILE_GIT_BLAME("git_blame.json")  {
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = BuildGitBlame.class;
                Class<?> wrapperClazz = GitBuildFilePackageData.class;
                return processLinesToJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<GitBuildFilePackageData> returnsWrapperClass() { return GitBuildFilePackageData.class; }

            @Override
            public Class<BuildGitBlame> returnsDataClass() { return BuildGitBlame.class; }
        },
        OWASP_DEPENDENCY_CHECK("dependency-check-report.json") {
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = Report.class;
                Class<?> wrapperClazz = OwaspOssReportPackageData.class;
                return mapJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<OwaspOssReportPackageData> returnsWrapperClass() { return OwaspOssReportPackageData.class; }

            @Override
            public Class<Report> returnsDataClass() { return Report.class; }
        },
        SYFT_SBOM("syft_sbom.json") {           
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = io.patchfox.package_utils.data.sbom.syft.Report.class;
                Class<?> wrapperClazz = SyftSbomPackageData.class;
                return mapJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<SyftSbomPackageData> returnsWrapperClass() { return SyftSbomPackageData.class; }

            @Override
            public Class<io.patchfox.package_utils.data.sbom.syft.Report> returnsDataClass() { 
                return io.patchfox.package_utils.data.sbom.syft.Report.class; 
            }
        },
        CYCLONEDX_SBOM("cyclonedx_sbom.json") {           
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = Bom15Schema.class;
                Class<?> wrapperClazz = CycloneDxSbomPackageData.class;
                return mapJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<CycloneDxSbomPackageData> returnsWrapperClass() { return CycloneDxSbomPackageData.class; }

            @Override
            public Class<Bom15Schema> returnsDataClass() { return Bom15Schema.class; }           
        },
        SPDX_SBOM("spdx_sbom.json") {           
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = SpdxSbom.class;
                Class<?> wrapperClazz = SpdxSbomPackageData.class;
                return mapJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<SpdxSbomPackageData> returnsWrapperClass() { return SpdxSbomPackageData.class; }

            @Override
            public Class<SpdxSbom> returnsDataClass() { return SpdxSbom.class; }   
        },
        GRYPE_OSS("grype_oss.json") {           
            @Override
            public Optional<PackageData> process(File dataFile, String projectName) throws IOException {
                Class<?> dataClazz = io.patchfox.package_utils.data.oss.anchore.grype.Report.class;
                Class<?> wrapperClazz = GrypeOssReportPackageData.class;
                return mapJson(dataFile, projectName, dataClazz, wrapperClazz);
            }

            @Override
            public Class<PackageData> returnsClass() { return PackageData.class; }

            @Override
            public Class<GrypeOssReportPackageData> returnsWrapperClass() { return GrypeOssReportPackageData.class; }

            @Override
            public Class<io.patchfox.package_utils.data.oss.anchore.grype.Report> returnsDataClass() { 
                return io.patchfox.package_utils.data.oss.anchore.grype.Report.class; 
            }  
        };
        
        private String fileName;

        /**
         * 
         * @param fileName
         */
        DataFileTypeEnum(String fileName) { this.fileName = fileName; }


        /**
         * 
         * @param dataFile
         * @param clazz
         * @return
         * @throws IOException
         */
        Optional<PackageData> mapJson(
                    File dataFile, 
                    String projectName, 
                    Class<?> dataClazz, 
                    Class<?> wrapperClazz
        ) throws IOException {

            var mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
                                           .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
                                           .findAndRegisterModules();

            var dataJsonObj = mapper.readValue(
                Files.readString(dataFile.toPath()),
                dataClazz
            );
            LOG.debug("mapped is: {}", mapper.writeValueAsString(dataJsonObj));

            try {
                var dataWrapperObj = (PackageData)wrapperClazz.getConstructor(dataClazz)
                                                                 .newInstance(dataJsonObj);

                return Optional.of(dataWrapperObj); 
            } catch (InstantiationException 
                        | IllegalAccessException 
                        | IllegalArgumentException
                        | InvocationTargetException 
                        | NoSuchMethodException 
                        | SecurityException e
            ) {
                LOG.error("something went wrong reflecting the constructor for class", e.getMessage());
            }

            // we should never be here    
            return Optional.empty();  
        }

        /**
         * 
         * @param dataFile
         * @param clazz
         * @return
         */
        Optional<PackageData> processLinesToJson(
                File dataFile, 
                String projectName, 
                Class<?> dataClazz,
                Class<?> wrapperClazz
        ) throws IOException {

            List<String> lines = new ArrayList<>();
            var reader = new Scanner(dataFile);

            while(reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }

            reader.close();
           
            try {
                var mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
                                               .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
                                               .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                                               .findAndRegisterModules();

                var dataJsonObj = dataClazz.getConstructor(List.class).newInstance(lines);
                LOG.debug("mapped is: {}", mapper.writeValueAsString(dataJsonObj));

                var dataWrapperObj = (PackageData)wrapperClazz.getConstructor(dataClazz)
                                                              .newInstance(dataJsonObj);

                return Optional.of(dataWrapperObj);
            } catch (InstantiationException 
                        | IllegalAccessException 
                        | IllegalArgumentException
                        | InvocationTargetException 
                        | NoSuchMethodException 
                        | SecurityException e) {
                
                LOG.error("something went wrong reflecting the constructor for class", e.getMessage());
                LOG.error("exception was: ", e);
            }

            // we should never be here    
            return Optional.empty();  
        }


        /**
         * 
         * @return
         */
        public String getFileName() { return fileName; }
        

        /**
         * 
         * @param fileName
         * @return
         */
        public static Optional<DataFileTypeEnum> getTypeForFileName(String fileName) {
            for (var dataFileType : values()) {
                if (dataFileType.getFileName().equalsIgnoreCase(fileName)) {
                    return Optional.of(dataFileType);
                }
            }
            return Optional.empty();
        }


        /**
         * 
         * @param <T>
         * @param dataFile
         * @param projectName
         * @return
         * @throws IOException
         */
        public <T> Optional<T> process(File dataFile, String projectName) throws IOException {
            return Optional.empty();
        }

        
        /**
         * 
         * @return
         */
        public Class<?> returnsClass() { return Object.class; }


        /**
         * 
         * @return
         */
        public Class<?> returnsWrapperClass() { return Object.class; }


        /**
         * 
         * @return
         */
        public Class<?> returnsDataClass() { return Object.class; }

    }


    public String returns() { return dataFileType.returnsClass().getName(); }


    /**
     * 
     * @param <T>
     * @param df
     * @return
     * @throws JsonProcessingException
     * @throws IOException
     */
    public static <T> Optional<T> process(DataFile df) throws IOException {
        return df.dataFileType.process(df.getFile(), df.getProjectName());
    }


    /**
     * method for callers who would rather check to see if a given file name is recognized before trying to create 
     * an instance of DataFile (and having to catch a potential IllegalArgument Exception thrown by the constuctor)
     * 
     * @param f
     * @return
     */
    public static boolean isRecognizedFileType(File f) {
        String fileName = f.getName();
        return isRecognizedFileType(fileName);
    }
    

    /**
     * method for callers who would rather check to see if a given file name is recognized before trying to create 
     * an instance of DataFile (and having to catch a potential IllegalArgument Exception thrown by the constuctor)
     * 
     * @param fileName
     * @return
     */
    public static boolean isRecognizedFileType(String fileName) {
        var enumOptional = DataFileTypeEnum.getTypeForFileName(fileName);
        return enumOptional.isPresent();
    }


    /**
     * Constructor. 
     * 
     * @param f
     * @throws IllegalArgumentException if fileName is unrecognized. Use static isRecognizedFileName(String fileName) 
     * to check if fileName is recognized to avoid risk of exception. 
     */
    public DataFile(File f) {
        String fileName = f.getName();
        if ( isRecognizedFileType(f) == false ) {
            throw new IllegalArgumentException(String.format("filename: {} is unrecognized", fileName));
        }

        this.dataFileType = DataFileTypeEnum.getTypeForFileName(fileName).get();
        this.dataFile = f;
    }


    /**
     * Constructor. 
     * 
     * @param f
     * @param projectName
     * @throws IllegalArgumentException if fileName is unrecognized. Use static isRecognizedFileName(String fileName) 
     * to check if fileName is recognized to avoid risk of exception. 
     */
    public DataFile(File f, String projectName) {
        String fileName = f.getName();
        if ( isRecognizedFileType(f) == false ) {
            throw new IllegalArgumentException(String.format("filename: {} is unrecognized", fileName));
        }

        this.dataFileType = DataFileTypeEnum.getTypeForFileName(fileName).get();
        this.dataFile = f;
        this.projectName = projectName;
    }


    /**
     * 
     * @param <T>
     * @return
     * @throws IOException
     */
    public <T> Optional<T> process() throws IOException { 
        return this.dataFileType.process(this.getFile(), this.getProjectName());
    }


    /**
     * 
     */
    public String getProjectName() { return this.projectName; }


    /**
     * 
     * @param projectName
     */
    public void setProjectName(String projectName) { this.projectName = projectName; }


    /**
     * 
     * @return
     */
    public DataFileTypeEnum getFileType() { return dataFileType; }


    /**
     * 
     * @return
     */
    public String getFileName() { return dataFileType.getFileName(); }


    /**
     * 
     * @return
     */
    public File getFile() { return dataFile; }
}

