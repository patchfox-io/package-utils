package io.patchfox.package_utils.util;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;
import com.github.packageurl.PackageURLBuilder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PackageUrlJsonDeserializer extends JsonDeserializer<PackageURL> {
    //{"scheme":"pkg","type":"generic","namespace":"dogfood","name":"ALL","version":"grype-service","qualifiers":{"commitbranch":"develop",
    //"commitdatetime":"2024-08-05T18:17:10+00:00","commithash":"34716a55e97e5c143d02482494982e3239c7a07d"},"subpath":null,
    //"coordinates":"pkg:generic/dogfood/ALL@grype-service"}

    @Override
    public PackageURL deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {

        try {
            log.debug("starting the deserialiation run for purl");
            var asTree = p.readValueAsTree();

            log.debug("purl is: {}", asTree);
            var type = asTree.get("type").toString().replace("\"", "");
            var nameSpace = asTree.get("namespace").toString().replace("\"", "");
            var name = asTree.get("name").toString().replace("\"", "");
            var version = asTree.get("version").toString().replace("\"", "");
            var subpath = asTree.get("subpath").toString().replace("\"", "");

            var purlB = PackageURLBuilder.aPackageURL()
                                         .withType(type)
                                         .withNamespace(nameSpace)
                                         .withName(name)
                                         .withVersion(version);
                                         //.withSubpath(subpath);

            if ( !subpath.equals("null") ) { purlB.withSubpath(subpath); }

            log.debug("after builder before qualifiers ");
            var fieldNamesIterator = asTree.get("qualifiers").fieldNames();
            while (fieldNamesIterator.hasNext()) {
                var fieldName = fieldNamesIterator.next();
                log.debug("fieldName is: {}", fieldName);
                var value = asTree.get("qualifiers").get(fieldName).toString().replace("\"", "");
                purlB.withQualifier(fieldName, value);
            }
            log.debug("returning: {}", purlB.build());
            return purlB.build();
        } catch (MalformedPackageURLException e) {
            throw new IOException(e);
        }
    }
    
}
