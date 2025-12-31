package io.patchfox.package_utils.util;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.patchfox.package_utils.data.DataFile;
import io.patchfox.package_utils.data.pkg.PackageData;

import lombok.extern.slf4j.Slf4j;



/*
 * see PackageDataMapJsonDeserializer for explanation of what's going on here
 * 
 *  
 */


@Slf4j
public class PackageDataJsonDeserializer extends JsonDeserializer<PackageData<?>> {
    
    @Override
    public PackageData<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        var mapper = new ObjectMapper().findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Map<String, Object> genericRv = p.readValueAs(Map.class);
        log.debug("genericRV is: {}", genericRv);
        var dataFileTypeAsString = (String)genericRv.get("dataFileType");
        var dataFileType = DataFile.DataFileTypeEnum.valueOf(dataFileTypeAsString);
        var wrapperClazz = dataFileType.returnsWrapperClass();
        var dataClazz = dataFileType.returnsDataClass();
        var rawDataMap = (Map<String, Object>)genericRv.get("data");
        var dataJsonObj = mapper.readValue(mapper.writeValueAsString(rawDataMap), dataClazz);
        var constructor = wrapperClazz.getConstructors()[0];
        try {
            var wrapped = constructor.newInstance(dataJsonObj);
            var properlyFormedPackageData = wrapperClazz.cast(wrapped);
            return (PackageData<?>)properlyFormedPackageData;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            log.error("caught unexpected exception: ", e);
            log.error("throwing new generalized exception...");
            throw new IllegalArgumentException();
        }




/*
 * 
 * here's where you are -- you need to get DataFile.type to report the data and wrapper classes associated
 * with that type. then something like what's commented out below will work.
 * 
 * also - I don't know why things coming in here don't have the @class field added to them the way they do for the 
 * other deserializer
 * 
 * regardless do this and remember to put the @JsonDeserializer annotation back on abstract class PackageData and
 * remove it from the sub classes. 
 * 
 * once you have DataFile telling you what the wrapper and data classes are, you don't need jackson - you can 
 * just cast the thing 
 * 
 * 
 * 
 * 
 * 
 */


        // log.info("genericRv is: {}", genericRv);
        // var asMalformedPackageData = mapper.convertValue(genericRv, new TypeReference<PackageData<?>>() { });

        // try {
        //     Class dataClazz = Class.forName(asMalformedPackageData.getDataClassName());
        //     Class wrapperClazz = Class.forName(asMalformedPackageData.getWrapperClassName());
        //     var rawDataMap = (Map<String, Object>)genericRv.get("data");
        //     var dataJsonObj = mapper.readValue(mapper.writeValueAsString(rawDataMap), dataClazz);
        //     var constructor = wrapperClazz.getConstructors()[0];
        //     var wrapped = constructor.newInstance(dataJsonObj);
        //     var properlyFormedPackageData = wrapperClazz.cast(wrapped);
        //     return (PackageData<?>)properlyFormedPackageData;
        // } catch (
        //     ClassNotFoundException | 
        //     InstantiationException | 
        //     IllegalAccessException | 
        //     IllegalArgumentException | 
        //     InvocationTargetException e
        // ) {
        //     log.error("caught unexpected exception: {}", e);
        //     throw new IOException();
        // }
    }


}


