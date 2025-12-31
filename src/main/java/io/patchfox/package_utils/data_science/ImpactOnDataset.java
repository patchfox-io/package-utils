package io.patchfox.package_utils.data_science;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImpactOnDataset {

    Set<Edit> edits;

    public ZonedDateTime eventDateTime;

    public ZonedDateTime forecastMaturityDate;

    public Double deltaRpsScore;

    //
    //

    public Double numberFindings;

    public Double numberCriticalFindings;

    public Double numberHighFindings;

    public Double numberMediumFindings;

    public Double numberLowFindings;

    //
    //

    public Double numberFindingsAvoidedByPatchingPastYear;

    public Double numberCriticalFindingsAvoidedByPatchingPastYear;

    public Double numberHighFindingsAvoidedByPatchingPastYear;

    public Double numberMediumFindingsAvoidedByPatchingPastYear;

    public Double numberLowFindingsAvoidedByPatchingPastYear;

    //
    //

    public Double averageDaysFindingsRemainUnpatchedPastYear;

    public Double averageDaysCriticalFindingsRemainUnpatchedPastYear;

    public Double averageDaysHighFindingsRemainUnpatchedPastYear;

    public Double averageDaysMediumFindingsRemainUnpatchedPastYear;

    public Double averageDaysLowFindingsRemainUnpatchedPastYear;

    //
    //

    public Double numberPackages;

    public Double numberPackagesWithFindings;

    public Double numberPackagesWithCriticalFindings;

    public Double numberPackagesWithHighFindings;

    public Double numberPackagesWithMediumFindings;

    public Double numberPackagesWithLowFindings;

    //
    //

    public Double numberOfDownlevelPackages;

    public Double numberOfDownlevelPackagesMajor;

    public Double numberOfDownlevelPackagesMinor;

    public Double numberOfDownlevelPackagesPatch;

    //
    //

    public Double numberOfStalePackages;

    public Double numberOfStalePackagesSixMonths;

    public Double numberOfStalePackagesOneYear;

    public Double numberOfStalePackagesPatchOneYearSixMonths;

    public Double numberOfStalePackagesPatchTwoYears;

    //
    //

    public Double numberPatches;

    public Double numberSamePatches;

    public Double numberDifferetPatches;

    public Double numberPatchFoxPatches;

    //

    public Double averagePatchEfficacyPastYear;

    //

}
