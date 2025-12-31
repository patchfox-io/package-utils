package io.patchfox.package_utils.util;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.patchfox.package_utils.data.build.git.BuildGitBlame;
import io.patchfox.package_utils.data.build.git.BuildGitBlameRecord;
import lombok.extern.slf4j.Slf4j;


/*
 * 
 * This took two days to sort out. 
 * 
 * Some of it is because I'm a dumbass.
 * 
 * Some of it is because fuck Java.
 * 
 * Regardless - the reason for this custom deserializer is because BuildGitBlame contains a collection of type
 * List<BuildGitBlameRecord>. The custom deserializer for all PackageData objs is invoked in two cases. The first is
 * when a PackageWrapper obj is being deserialized - which contains an field of type 
 * Map<String, List<PackageData>>. What that means for BuildGitBlameJson objects is that you end up with a single 
 * element list where the element is List<BuildGitBlameRecord>. However when PackageDataJsonDeserializer is called 
 * on an instance of BuildGitBlame directly, you end up with List<BuildGitBlameRecord>. 
 * 
 * xo 
 * DH 12SEP24
 * 
 * 
 */

@Slf4j
public class BuildGitBlameJsonDeserializer extends JsonDeserializer<BuildGitBlame> {

    @Override
    public BuildGitBlame deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        var mapper = new ObjectMapper().findAndRegisterModules();
        
        var recordsAsString = p.readValueAsTree().get("buildGitBlameRecords").toString();
        log.debug("p is: {}", recordsAsString);
        
        try {
            recordsAsString = mapper.readValue(recordsAsString, new TypeReference<List<String>>() {}).get(0);
            log.debug("recordsAsString: {}", recordsAsString);
        } catch (Exception e) {
            // noop
        }

        
        var records = mapper.readValue(recordsAsString, new TypeReference<List<BuildGitBlameRecord>>() { });
        return new BuildGitBlame(records);


        
    }

}
