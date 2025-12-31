package io.patchfox.package_utils.data_science;

import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.github.packageurl.MalformedPackageURLException;
import com.github.packageurl.PackageURL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzerForecastPayload {

    @JsonPropertyDescription("uuid that uniquely identifies an event message through the entire pipeline.")
    UUID txid;

    @JsonPropertyDescription("UTC Date/Time the event message was received by the pipeline.")
    String eventReceivedAt;

    @JsonPropertyDescription("UTC Date/Time the event occurred. for example - the date a git commit was made.")
    String eventOccurredAt;

    @JsonPropertyDescription("PURL representing the DataSet for this bundle of data")
    String dataSet;

    @JsonPropertyDescription("a subset of the DATASET_CHANGE_LOG table that tracks all changes to a dataset")
    List<ImpactOnDataset> eventImpactOnDataset;


    /**
     * ensures the dataSet field is actually a valid purl. will throw exception if it isn't
     * 
     * @param dataSet
     * @throws MalformedPackageURLException
     */
    public void setDataSet(String dataSet) throws MalformedPackageURLException {
        PackageURL p = new PackageURL(dataSet);
        this.dataSet = p.toString();
    }


    /**
     * ensures the datetime string is valid before setting the field to supplied value 
     * 
     * @param dateEventOccured
     * @throws DateTimeParseException
     */
    public void setEventReceivedAt(String eventReceivedAt) throws DateTimeParseException{
        ZonedDateTime z = ZonedDateTime.parse(eventReceivedAt);
        this.eventReceivedAt = eventReceivedAt;
    }


    /**
     * 
     * @param eventReceivedAt
     */
    public void setEventReceivedAt(ZonedDateTime eventReceivedAt) {
        this.eventReceivedAt = eventReceivedAt.toString();
    }


    /**
     * ensures the datetime string is valid before setting the field to supplied value 
     * 
     * @param dateEventReceived
     * @throws DateTimeParseException
     */
    public void setEventOccurredAt(String eventOccurredAt) throws DateTimeParseException {
        ZonedDateTime z = ZonedDateTime.parse(eventOccurredAt);
        this.eventOccurredAt = eventOccurredAt;
    }


    /**
     * 
     * @param eventReceivedAt
     */
    public void setEventOccurredAt(ZonedDateTime eventOccurredAt) {
        this.eventOccurredAt = eventOccurredAt.toString();
    }
}
