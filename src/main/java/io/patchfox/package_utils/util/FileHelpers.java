package io.patchfox.package_utils.util;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Collection of functions which help with processing of files and handling the file system
 */
public class FileHelpers {

    private static final Logger LOG = LoggerFactory.getLogger(FileHelpers.class);

    // this was originally using org.apache.commons.io.FileUtils.getTempDirectoryPath() 
    // but due to underlying bug in Java the format of what the aforementioned returns is inconsistent 
    // across platforms. 
    // At issue is the fact that the underlying call to System.getProperty("java.io.tmpdir") does not return results 
    // in a consistent format. Depending on the host OS, the system file separator may or may not be included at the 
    // tail of the result. If the developer is unaware of this behavior their code may break in unexpected ways when 
    // ported to an OS that behaves differently than the one they wrote the code on. See these bug reports for details 
    // and background:
    // https://bugs.java.com/bugdatabase/view_bug?bug_id=4391434
    // https://bugs.java.com/bugdatabase/view_bug?bug_id=JDK-8318067
    //
    // PR to update the commons library function has been put in and can be found here:
    // https://github.com/apache/commons-io/pull/500
    //
    // if/when the pache folks accept the PR we'll revert this change and go back to using the commons library 
    // for resolving system temp path. 
    public static final String TEMP_DIR_PATH = getTempDirectoryPathConsistent(false); 

    public static final String SYSTEM_FILE_SEPARATOR = File.separator;

    // @TODO update this to include time zone information 
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";


    /**
     * timestamp helper for making filenames and such.
     * 
     * @return
     */
    public static String nowForHumans() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }


    /**
     * 
     * @return
     */
    public static String nowForMachines() {
        return nowForHumans().replace(" ", "_")
                             .replace(":", "-");
    }


    /**
     * 
     * @param nowForHumans
     * @return
     */
    public static String nowForMachines(String nowForHumans) {
        return nowForHumans.replace(" ", "_")
                           .replace(":", "-");    
    }


    /**
     * Returns the path to the system temporary directory with the option to include or disinclude the trailing 
     * file separator. 
     *
     * @return the path to the system temporary directory with or without the trailing file separator as per 
     * caller supplied argument.
     */
    public static String getTempDirectoryPathConsistent(boolean includeTrailingSeparator) {
        String tempDir = System.getProperty("java.io.tmpdir");
        String tempDirLastChar = tempDir.substring(tempDir.length() - 1);
        String systemFileSeparator = System.getProperty("file.separator");
        if (includeTrailingSeparator) {
            tempDir = tempDirLastChar.equals(systemFileSeparator) 
                            ? tempDir 
                            : tempDir + systemFileSeparator;
        } else {
            tempDir = tempDirLastChar.equals(systemFileSeparator) 
                            ? tempDir.substring(0, tempDir.length() - 1) 
                            : tempDir;
        }

        return tempDir;
    }


    /**
     * Converts an uploaded file to a temp file stored on disk and returns the path
     * 
     * @param uploadedFile
     * @return
     */
    public static Pair<Path, Path> safeSerializeFile(String filename, InputStream is) {
        UUID uuid = UUID.randomUUID();
        Path serializeToPath = Paths.get(TEMP_DIR_PATH, uuid.toString());
        Path serializeToFilePath = Paths.get(serializeToPath.toString(), filename)
                                        .toAbsolutePath();

        checkFilePathStartsWithSystemTemp(serializeToPath);
        try {
            FileUtils.copyInputStreamToFile(is, serializeToFilePath.toFile());
            LOG.debug("file saved to: {}", serializeToFilePath);
        } catch (IOException e) {
            LOG.error("caught exception while attempting serialization of {}", serializeToFilePath, e);
            throw new IllegalArgumentException();
        }

        LOG.debug("returning Pair<> --> serializeToPath: {}  serializeToFilePath: {}", serializeToPath, serializeToFilePath);
        return new Pair<>(serializeToPath, serializeToFilePath);
    }    


    /**
     * Converts an uploaded file to a temp file stored on disk and returns the path
     * 
     * @param uploadedFile
     * @return
     * @throws FileNotFoundException 
     */
    public static Pair<Path, Path> safeSerializeFile(File uploadedFile) throws FileNotFoundException {
        return safeSerializeFile(uploadedFile.getName(), new FileInputStream(uploadedFile));
    }


    /**
     * Verifies a path exists and, if so, deletes it. This is applicable for both files and directories.
     * 
     * Note: only paths which are within the temp directory; see the links on how to get the path to
     * the temp directory
     * 
     * @see FileHelpers.getTempDirectoryPathConsistent
     * @see FileHelpers.TEMP_DIR_PATH
     * 
     * @param pathToDelete
     */
    public static void safeDeletePath(Path pathToDelete) {
        checkFilePathStartsWithSystemTemp(pathToDelete);
        try {
            FileUtils.forceDelete(pathToDelete.toFile());
            LOG.debug("file removed from: {}", pathToDelete);
        } catch (IOException e) {
            LOG.error("caught exception while attempting delete of {}", pathToDelete, e);
            throw new IllegalArgumentException();
        }
    }


    /**
     * Verifies the provided path starts with the temp dir
     * 
     * Note: see the links on how to get the path to
     * the temp directory
     * 
     * @see FileHelpers.getTempDirectoryPathConsistent
     * @see FileHelpers.TEMP_DIR_PATH
     * 
     * @param pathObjToCheck
     */
    public static void checkFilePathStartsWithSystemTemp(Path pathObjToCheck) {
        if (pathObjToCheck.startsWith(TEMP_DIR_PATH) == false) {
            LOG.error("resolved path {} outside system tmp directory {}", pathObjToCheck, TEMP_DIR_PATH);
            throw new IllegalArgumentException();
        }
    }


    public static byte[] getZipBytesForJson(String fileName, List<Object> dataList) {
                
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zipOut = new ZipOutputStream(baos);

        // ty internets https://stackoverflow.com/questions/1091788/how-to-create-a-zip-file-in-java
        // also move this into its own method
        try {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);

            for (var data : dataList) {
                ByteArrayInputStream bais = new ByteArrayInputStream(mapper.writeValueAsBytes(data));
                byte[] bytes = new byte[1024];
                int length;
                while((length = bais.read(bytes)) >= 0 ) {
                    zipOut.write(bytes, 0, length);
                }     
                bais.close();  
            }

        } catch(IOException e) {
            LOG.error("something went wrong closing one of the streams", e.getMessage());
        } 


        try { 
            zipOut.closeEntry();
            zipOut.close();
            baos.close(); 
        } 
        catch (IOException e) { 
            LOG.error("something went wrong closing the output stream", e.getMessage()); 
        }

        byte[] rv = baos.toByteArray();
        return rv;
    }


}
