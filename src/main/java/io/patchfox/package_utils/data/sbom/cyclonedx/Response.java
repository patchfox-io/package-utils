package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Response {

    CAN_NOT_FIX("can_not_fix"),
    WILL_NOT_FIX("will_not_fix"),
    UPDATE("update"),
    ROLLBACK("rollback"),
    WORKAROUND_AVAILABLE("workaround_available");
    private final String value;
    private final static Map<String, Response> CONSTANTS = new HashMap<String, Response>();

    static {
        for (Response c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Response(String value) {
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
    public static Response fromValue(String value) {
        Response constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
