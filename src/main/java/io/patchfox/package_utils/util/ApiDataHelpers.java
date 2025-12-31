package io.patchfox.package_utils.util;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApiDataHelpers {

    private static final ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

    /**
     * converts a data POJO into a generic Map<String, String> that can be included in an ApiRequest or ApiResponse obj.
     * 
     * @param data
     * @param clazz
     * @return
     * @throws JsonMappingException
     * @throws JsonProcessingException
     */
    public static Map<String, Object> getDataMapFor(Object data) throws JsonMappingException, JsonProcessingException {
        return mapper.convertValue(
            data, 
            new TypeReference<Map<String, Object>>(){}
        );

    }


    /**
     * converts generic Map<String, String> into a data POJO
     * 
     * @param <T>
     * @param dataMap
     * @param t
     * @return
     * @throws JsonProcessingException 
     * @throws JsonMappingException 
     */
    @SuppressWarnings("unchecked")
    public static <T> T getPojoFromDataMap(
            Map<String, Object> dataMap, 
            Class<?> clazz
    ) throws IllegalArgumentException, JsonMappingException, JsonProcessingException{
        return (T)mapper.readValue(mapper.writeValueAsString(dataMap), clazz);
    }

}
