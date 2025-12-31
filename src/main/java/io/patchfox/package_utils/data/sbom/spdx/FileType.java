
package io.patchfox.package_utils.data.sbom.spdx;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * The type of the file.
 * 
 */
@Generated("jsonschema2pojo")
public enum FileType {

    OTHER("OTHER"),
    DOCUMENTATION("DOCUMENTATION"),
    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    ARCHIVE("ARCHIVE"),
    SPDX("SPDX"),
    APPLICATION("APPLICATION"),
    SOURCE("SOURCE"),
    BINARY("BINARY"),
    TEXT("TEXT"),
    AUDIO("AUDIO");
    private final String value;
    private final static Map<String, FileType> CONSTANTS = new HashMap<String, FileType>();

    static {
        for (FileType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    FileType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FileType fromValue(String value) {
        FileType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
