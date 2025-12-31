package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Patch
 * <p>
 * Specifies an individual patch
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "diff",
    "resolves"
})
public class Patch {

    /**
     * Type
     * <p>
     * Specifies the purpose for the patch including the resolution of defects, security issues, or new behavior or functionality.
     * 
     * * __unofficial__ = A patch which is not developed by the creators or maintainers of the software being patched. Refer to [https://en.wikipedia.org/wiki/Unofficial_patch](https://en.wikipedia.org/wiki/Unofficial_patch)
     * * __monkey__ = A patch which dynamically modifies runtime behavior. Refer to [https://en.wikipedia.org/wiki/Monkey_patch](https://en.wikipedia.org/wiki/Monkey_patch)
     * * __backport__ = A patch which takes code from a newer version of software and applies it to older versions of the same software. Refer to [https://en.wikipedia.org/wiki/Backporting](https://en.wikipedia.org/wiki/Backporting)
     * * __cherry-pick__ = A patch created by selectively applying commits from other versions or branches of the same software.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Specifies the purpose for the patch including the resolution of defects, security issues, or new behavior or functionality.\n\n* __unofficial__ = A patch which is not developed by the creators or maintainers of the software being patched. Refer to [https://en.wikipedia.org/wiki/Unofficial_patch](https://en.wikipedia.org/wiki/Unofficial_patch)\n* __monkey__ = A patch which dynamically modifies runtime behavior. Refer to [https://en.wikipedia.org/wiki/Monkey_patch](https://en.wikipedia.org/wiki/Monkey_patch)\n* __backport__ = A patch which takes code from a newer version of software and applies it to older versions of the same software. Refer to [https://en.wikipedia.org/wiki/Backporting](https://en.wikipedia.org/wiki/Backporting)\n* __cherry-pick__ = A patch created by selectively applying commits from other versions or branches of the same software.")
    private Patch.Type type;
    /**
     * Diff
     * <p>
     * The patch file (or diff) that show changes. Refer to https://en.wikipedia.org/wiki/Diff
     * 
     */
    @JsonProperty("diff")
    @JsonPropertyDescription("The patch file (or diff) that show changes. Refer to https://en.wikipedia.org/wiki/Diff")
    private Diff diff;
    /**
     * Resolves
     * <p>
     * A collection of issues the patch resolves
     * 
     */
    @JsonProperty("resolves")
    @JsonPropertyDescription("A collection of issues the patch resolves")
    private List<Issue> resolves = new ArrayList<Issue>();

    /**
     * Type
     * <p>
     * Specifies the purpose for the patch including the resolution of defects, security issues, or new behavior or functionality.
     * 
     * * __unofficial__ = A patch which is not developed by the creators or maintainers of the software being patched. Refer to [https://en.wikipedia.org/wiki/Unofficial_patch](https://en.wikipedia.org/wiki/Unofficial_patch)
     * * __monkey__ = A patch which dynamically modifies runtime behavior. Refer to [https://en.wikipedia.org/wiki/Monkey_patch](https://en.wikipedia.org/wiki/Monkey_patch)
     * * __backport__ = A patch which takes code from a newer version of software and applies it to older versions of the same software. Refer to [https://en.wikipedia.org/wiki/Backporting](https://en.wikipedia.org/wiki/Backporting)
     * * __cherry-pick__ = A patch created by selectively applying commits from other versions or branches of the same software.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Patch.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Specifies the purpose for the patch including the resolution of defects, security issues, or new behavior or functionality.
     * 
     * * __unofficial__ = A patch which is not developed by the creators or maintainers of the software being patched. Refer to [https://en.wikipedia.org/wiki/Unofficial_patch](https://en.wikipedia.org/wiki/Unofficial_patch)
     * * __monkey__ = A patch which dynamically modifies runtime behavior. Refer to [https://en.wikipedia.org/wiki/Monkey_patch](https://en.wikipedia.org/wiki/Monkey_patch)
     * * __backport__ = A patch which takes code from a newer version of software and applies it to older versions of the same software. Refer to [https://en.wikipedia.org/wiki/Backporting](https://en.wikipedia.org/wiki/Backporting)
     * * __cherry-pick__ = A patch created by selectively applying commits from other versions or branches of the same software.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Patch.Type type) {
        this.type = type;
    }

    /**
     * Diff
     * <p>
     * The patch file (or diff) that show changes. Refer to https://en.wikipedia.org/wiki/Diff
     * 
     */
    @JsonProperty("diff")
    public Diff getDiff() {
        return diff;
    }

    /**
     * Diff
     * <p>
     * The patch file (or diff) that show changes. Refer to https://en.wikipedia.org/wiki/Diff
     * 
     */
    @JsonProperty("diff")
    public void setDiff(Diff diff) {
        this.diff = diff;
    }

    /**
     * Resolves
     * <p>
     * A collection of issues the patch resolves
     * 
     */
    @JsonProperty("resolves")
    public List<Issue> getResolves() {
        return resolves;
    }

    /**
     * Resolves
     * <p>
     * A collection of issues the patch resolves
     * 
     */
    @JsonProperty("resolves")
    public void setResolves(List<Issue> resolves) {
        this.resolves = resolves;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Patch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("diff");
        sb.append('=');
        sb.append(((this.diff == null)?"<null>":this.diff));
        sb.append(',');
        sb.append("resolves");
        sb.append('=');
        sb.append(((this.resolves == null)?"<null>":this.resolves));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.resolves == null)? 0 :this.resolves.hashCode()));
        result = ((result* 31)+((this.diff == null)? 0 :this.diff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Patch) == false) {
            return false;
        }
        Patch rhs = ((Patch) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.resolves == rhs.resolves)||((this.resolves!= null)&&this.resolves.equals(rhs.resolves))))&&((this.diff == rhs.diff)||((this.diff!= null)&&this.diff.equals(rhs.diff))));
    }


    /**
     * Type
     * <p>
     * Specifies the purpose for the patch including the resolution of defects, security issues, or new behavior or functionality.
     * 
     * * __unofficial__ = A patch which is not developed by the creators or maintainers of the software being patched. Refer to [https://en.wikipedia.org/wiki/Unofficial_patch](https://en.wikipedia.org/wiki/Unofficial_patch)
     * * __monkey__ = A patch which dynamically modifies runtime behavior. Refer to [https://en.wikipedia.org/wiki/Monkey_patch](https://en.wikipedia.org/wiki/Monkey_patch)
     * * __backport__ = A patch which takes code from a newer version of software and applies it to older versions of the same software. Refer to [https://en.wikipedia.org/wiki/Backporting](https://en.wikipedia.org/wiki/Backporting)
     * * __cherry-pick__ = A patch created by selectively applying commits from other versions or branches of the same software.
     * 
     */
    public enum Type {

        UNOFFICIAL("unofficial"),
        MONKEY("monkey"),
        BACKPORT("backport"),
        CHERRY_PICK("cherry-pick");
        private final String value;
        private final static Map<String, Patch.Type> CONSTANTS = new HashMap<String, Patch.Type>();

        static {
            for (Patch.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static Patch.Type fromValue(String value) {
            Patch.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
