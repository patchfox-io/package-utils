package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskType {

    COPY("copy"),
    CLONE("clone"),
    LINT("lint"),
    SCAN("scan"),
    MERGE("merge"),
    BUILD("build"),
    TEST("test"),
    DELIVER("deliver"),
    DEPLOY("deploy"),
    RELEASE("release"),
    CLEAN("clean"),
    OTHER("other");
    private final String value;
    private final static Map<String, TaskType> CONSTANTS = new HashMap<String, TaskType>();

    static {
        for (TaskType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TaskType(String value) {
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
    public static TaskType fromValue(String value) {
        TaskType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
