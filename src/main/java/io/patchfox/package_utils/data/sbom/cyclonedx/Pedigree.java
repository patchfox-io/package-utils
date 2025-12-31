package io.patchfox.package_utils.data.sbom.cyclonedx;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Component Pedigree
 * <p>
 * Component pedigree is a way to document complex supply chain scenarios where components are created, distributed, modified, redistributed, combined with other components, etc. Pedigree supports viewing this complex chain from the beginning, the end, or anywhere in the middle. It also provides a way to document variants where the exact relation may not be known.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ancestors",
    "descendants",
    "variants",
    "commits",
    "patches",
    "notes"
})
public class Pedigree {

    /**
     * Ancestors
     * <p>
     * Describes zero or more components in which a component is derived from. This is commonly used to describe forks from existing projects where the forked version contains a ancestor node containing the original component it was forked from. For example, Component A is the original component. Component B is the component being used and documented in the BOM. However, Component B contains a pedigree node with a single ancestor documenting Component A - the original component from which Component B is derived from.
     * 
     */
    @JsonProperty("ancestors")
    @JsonPropertyDescription("Describes zero or more components in which a component is derived from. This is commonly used to describe forks from existing projects where the forked version contains a ancestor node containing the original component it was forked from. For example, Component A is the original component. Component B is the component being used and documented in the BOM. However, Component B contains a pedigree node with a single ancestor documenting Component A - the original component from which Component B is derived from.")
    private List<Component> ancestors = new ArrayList<Component>();
    /**
     * Descendants
     * <p>
     * Descendants are the exact opposite of ancestors. This provides a way to document all forks (and their forks) of an original or root component.
     * 
     */
    @JsonProperty("descendants")
    @JsonPropertyDescription("Descendants are the exact opposite of ancestors. This provides a way to document all forks (and their forks) of an original or root component.")
    private List<Component> descendants = new ArrayList<Component>();
    /**
     * Variants
     * <p>
     * Variants describe relations where the relationship between the components are not known. For example, if Component A contains nearly identical code to Component B. They are both related, but it is unclear if one is derived from the other, or if they share a common ancestor.
     * 
     */
    @JsonProperty("variants")
    @JsonPropertyDescription("Variants describe relations where the relationship between the components are not known. For example, if Component A contains nearly identical code to Component B. They are both related, but it is unclear if one is derived from the other, or if they share a common ancestor.")
    private List<Component> variants = new ArrayList<Component>();
    /**
     * Commits
     * <p>
     * A list of zero or more commits which provide a trail describing how the component deviates from an ancestor, descendant, or variant.
     * 
     */
    @JsonProperty("commits")
    @JsonPropertyDescription("A list of zero or more commits which provide a trail describing how the component deviates from an ancestor, descendant, or variant.")
    private List<Commit> commits = new ArrayList<Commit>();
    /**
     * Patches
     * <p>
     * >A list of zero or more patches describing how the component deviates from an ancestor, descendant, or variant. Patches may be complimentary to commits or may be used in place of commits.
     * 
     */
    @JsonProperty("patches")
    @JsonPropertyDescription(">A list of zero or more patches describing how the component deviates from an ancestor, descendant, or variant. Patches may be complimentary to commits or may be used in place of commits.")
    private List<Patch> patches = new ArrayList<Patch>();
    /**
     * Notes
     * <p>
     * Notes, observations, and other non-structured commentary describing the components pedigree.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Notes, observations, and other non-structured commentary describing the components pedigree.")
    private String notes;

    /**
     * Ancestors
     * <p>
     * Describes zero or more components in which a component is derived from. This is commonly used to describe forks from existing projects where the forked version contains a ancestor node containing the original component it was forked from. For example, Component A is the original component. Component B is the component being used and documented in the BOM. However, Component B contains a pedigree node with a single ancestor documenting Component A - the original component from which Component B is derived from.
     * 
     */
    @JsonProperty("ancestors")
    public List<Component> getAncestors() {
        return ancestors;
    }

    /**
     * Ancestors
     * <p>
     * Describes zero or more components in which a component is derived from. This is commonly used to describe forks from existing projects where the forked version contains a ancestor node containing the original component it was forked from. For example, Component A is the original component. Component B is the component being used and documented in the BOM. However, Component B contains a pedigree node with a single ancestor documenting Component A - the original component from which Component B is derived from.
     * 
     */
    @JsonProperty("ancestors")
    public void setAncestors(List<Component> ancestors) {
        this.ancestors = ancestors;
    }

    /**
     * Descendants
     * <p>
     * Descendants are the exact opposite of ancestors. This provides a way to document all forks (and their forks) of an original or root component.
     * 
     */
    @JsonProperty("descendants")
    public List<Component> getDescendants() {
        return descendants;
    }

    /**
     * Descendants
     * <p>
     * Descendants are the exact opposite of ancestors. This provides a way to document all forks (and their forks) of an original or root component.
     * 
     */
    @JsonProperty("descendants")
    public void setDescendants(List<Component> descendants) {
        this.descendants = descendants;
    }

    /**
     * Variants
     * <p>
     * Variants describe relations where the relationship between the components are not known. For example, if Component A contains nearly identical code to Component B. They are both related, but it is unclear if one is derived from the other, or if they share a common ancestor.
     * 
     */
    @JsonProperty("variants")
    public List<Component> getVariants() {
        return variants;
    }

    /**
     * Variants
     * <p>
     * Variants describe relations where the relationship between the components are not known. For example, if Component A contains nearly identical code to Component B. They are both related, but it is unclear if one is derived from the other, or if they share a common ancestor.
     * 
     */
    @JsonProperty("variants")
    public void setVariants(List<Component> variants) {
        this.variants = variants;
    }

    /**
     * Commits
     * <p>
     * A list of zero or more commits which provide a trail describing how the component deviates from an ancestor, descendant, or variant.
     * 
     */
    @JsonProperty("commits")
    public List<Commit> getCommits() {
        return commits;
    }

    /**
     * Commits
     * <p>
     * A list of zero or more commits which provide a trail describing how the component deviates from an ancestor, descendant, or variant.
     * 
     */
    @JsonProperty("commits")
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    /**
     * Patches
     * <p>
     * >A list of zero or more patches describing how the component deviates from an ancestor, descendant, or variant. Patches may be complimentary to commits or may be used in place of commits.
     * 
     */
    @JsonProperty("patches")
    public List<Patch> getPatches() {
        return patches;
    }

    /**
     * Patches
     * <p>
     * >A list of zero or more patches describing how the component deviates from an ancestor, descendant, or variant. Patches may be complimentary to commits or may be used in place of commits.
     * 
     */
    @JsonProperty("patches")
    public void setPatches(List<Patch> patches) {
        this.patches = patches;
    }

    /**
     * Notes
     * <p>
     * Notes, observations, and other non-structured commentary describing the components pedigree.
     * 
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Notes, observations, and other non-structured commentary describing the components pedigree.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pedigree.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ancestors");
        sb.append('=');
        sb.append(((this.ancestors == null)?"<null>":this.ancestors));
        sb.append(',');
        sb.append("descendants");
        sb.append('=');
        sb.append(((this.descendants == null)?"<null>":this.descendants));
        sb.append(',');
        sb.append("variants");
        sb.append('=');
        sb.append(((this.variants == null)?"<null>":this.variants));
        sb.append(',');
        sb.append("commits");
        sb.append('=');
        sb.append(((this.commits == null)?"<null>":this.commits));
        sb.append(',');
        sb.append("patches");
        sb.append('=');
        sb.append(((this.patches == null)?"<null>":this.patches));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
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
        result = ((result* 31)+((this.commits == null)? 0 :this.commits.hashCode()));
        result = ((result* 31)+((this.variants == null)? 0 :this.variants.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.ancestors == null)? 0 :this.ancestors.hashCode()));
        result = ((result* 31)+((this.descendants == null)? 0 :this.descendants.hashCode()));
        result = ((result* 31)+((this.patches == null)? 0 :this.patches.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pedigree) == false) {
            return false;
        }
        Pedigree rhs = ((Pedigree) other);
        return (((((((this.commits == rhs.commits)||((this.commits!= null)&&this.commits.equals(rhs.commits)))&&((this.variants == rhs.variants)||((this.variants!= null)&&this.variants.equals(rhs.variants))))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.ancestors == rhs.ancestors)||((this.ancestors!= null)&&this.ancestors.equals(rhs.ancestors))))&&((this.descendants == rhs.descendants)||((this.descendants!= null)&&this.descendants.equals(rhs.descendants))))&&((this.patches == rhs.patches)||((this.patches!= null)&&this.patches.equals(rhs.patches))));
    }

}
