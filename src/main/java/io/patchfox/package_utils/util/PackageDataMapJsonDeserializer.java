package io.patchfox.package_utils.util;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.patchfox.package_utils.data.build.GitBuildFilePackageData;
import io.patchfox.package_utils.data.build.git.BuildGitBlame;
import io.patchfox.package_utils.data.pkg.PackageData;
import lombok.val;
import lombok.extern.slf4j.Slf4j;


/*
 * This is gnarly and unfortunately, for now, unavoidable
 * 
 * What's going on is "PackageData" is a wrapper for [n] number of raw json entities from various places. It could be
 * an SBOM, an OSS report, something from git, etc. "PackageData" and its sub-types serve as a wrapper around this 
 * data to create homogentity across the entire pipeline. 
 * 
 * In order to support Jackson (the library we use to handle JSON) deserialization of these objects, we employ 
 * @JsonTypeInfo and @JsonSubTypes annotations to tell Jackson to serialize extra information re: the class name 
 * of the objects it's turning into a string. The idea is when we want to turn that serlialized json data back into 
 * a pojo, the metadata gives Jackson what it needs to select the correct class into which the data should go. 
 * 
 * Unfortunately, where this breaks down is in the PackageData we're actually wrapping. That OSS report, SBOM, etc, is
 * not part of the type hierarchy of PackageData. PackageData "wraps" it. As such when Jackson attempts to deserialize
 * the object using only the aforementioned annoation-generated metadata it does so by mangling the "wrapped" data 
 * into a form where every field is null except for "additionalProperties" which contains a map with the value as the
 * "wrapped" object. 
 * 
 * This breaks everything and makes Dave muy triste. 
 * 
 * The good news is the malformed-wrapped object still contains the metadata PackageData provides regarding the 
 * class of the appropriate wrapper and the class of the thing being wrapped. 
 * 
 * Therefore, what we're doing is: 
 * 
 * 1. turning the obj into a Map<String, Object> 
 * 2. mapping the object into an instance of PackageData - one that's malformed
 * 3. pulling the class data out of the malformed PackageData object
 * 4. using said class data to create a new instance of PackageData that's correct 
 * 
 * There may well be a better way to do this that does not involve major surgery on how PackageData works. We are weeks
 * away from launching beta and there isn't time for that shit rn. Whomever ends up looking at this in future I owe you 
 * a beer. 
 * 
 * DH 15AUG24
 * 
 */




@Slf4j
public class PackageDataMapJsonDeserializer extends JsonDeserializer<Map<PackageData.PackageDataType, List<PackageData>>> {

    @Override
    public Map<PackageData.PackageDataType, List<PackageData>> deserialize(
            JsonParser p, 
            DeserializationContext ctxt
    ) throws IOException {

        var mapper = new ObjectMapper().findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Map<String, Object> genericRv = p.readValueAs(Map.class);
        Map<PackageData.PackageDataType, List<PackageData>> rv = new HashMap<>();

        for (var entry : genericRv.entrySet()) {
            var k = PackageData.PackageDataType.valueOf(entry.getKey());

            var dataList = mapper.convertValue(entry.getValue(), new TypeReference<List<Object>>() { })
                                 .stream()
                                 .map(x -> mapper.convertValue(x, new TypeReference<Map<String, Object>>() { }))
                                 .toList();

            var v = new ArrayList<PackageData>();

            for (var data : dataList) {                
                var asMalformedPackageData = mapper.convertValue(data, new TypeReference<PackageData>() { });

                try {
                    Class dataClazz = Class.forName(asMalformedPackageData.getDataClassName());
                    Class wrapperClazz = Class.forName(asMalformedPackageData.getWrapperClassName());
                    var rawDataMap = (Map<String, Object>)data.get("data");
                    var dataJsonObj = mapper.readValue(mapper.writeValueAsString(rawDataMap), dataClazz);
                    var constructor = wrapperClazz.getConstructors()[0];
                    var wrapped = constructor.newInstance(dataJsonObj);
                    var properlyFormedPackageData = wrapperClazz.cast(wrapped);
                    v.add((PackageData)properlyFormedPackageData);
                } catch (
                    ClassNotFoundException | 
                    InstantiationException | 
                    IllegalAccessException | 
                    IllegalArgumentException | 
                    InvocationTargetException e
                ) {
                    log.error("caught exception: {}", e);
                }
            }

            rv.put(k, v);
        }

        return rv;
    }

}
