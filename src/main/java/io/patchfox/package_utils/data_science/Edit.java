package io.patchfox.package_utils.data_science;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Edit {
    
    public enum EditType { CREATE, UPDATE, DELETE }
    
    EditType editType; 

    // this needs to be the FULL package URL of the event 
    PackageURL dataSource;

    // TODO change to PackageURL type
    String before;

    // TODO change to PackageURL type
    String after;

    boolean isSameEdit = false;

    boolean isPfRecommendedEdit = false;

    /**
     * ensures the before field is actually a valid purl. will throw exception if it isn't
     * 
     * @param before
     * @throws MalformedPackageURLException
     */
    public void setBefore(String before) throws MalformedPackageURLException {
        PackageURL p = new PackageURL(before);
        this.before = p.toString();
    }

    /**
     * ensures the after field is actually a valid purl. will throw exception if it isn't
     * 
     * @param after
     * @throws MalformedPackageURLException
     */
    public void setAfter(String after) throws MalformedPackageURLException {
        PackageURL p = new PackageURL(after);
        this.after = p.toString();
    }

}
