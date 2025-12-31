package io.patchfox.package_utils.json;


import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

import jakarta.ws.rs.core.Response.Status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.patchfox.package_utils.util.PackageUrlJsonDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

    String responderName;

    // the REST verb and path that was invoked as part of the request this response is in regards to 
    String responderResourceSignature;
    
    // http response code
    int code;

    // http response code family 
    String type;
    
    // http response code description
    String description;
    
    // anything app specific we want to add to the http response description
    String serverMessage;
    
    // unique transaction id that follows a request through the entire PF pipeline 
    UUID txid;
    
    // when the request first hit the pipeline. this and txid remain attached to a request through its entire journy
    // through the PF pipeline 
    String requestReceivedAt;

    // response payload
    @Builder.Default
    @ToString.Exclude
    Map<String, Object> data = new HashMap<>();


    /**
     * setting the code also ensures type and description are set 
     * 
     * @param httpCode
     */
    public void setCode(int httpCode) {
        // this to make sure someone doesn't fat finger something
        var status = Status.fromStatusCode(httpCode);

        this.code = status.getStatusCode(); 
        this.type = status.getFamily().toString();
        this.description = status.getReasonPhrase();
    }

    /**
     * ensures the datetime string is valid before setting the field to supplied value 
     * 
     * @param requestReceivedAt
     * @throws DateTimeParseException
     */
    public void setRequestReceivedAt(String requestReceivedAt) throws DateTimeParseException {
        ZonedDateTime z = ZonedDateTime.parse(requestReceivedAt);
        this.requestReceivedAt = requestReceivedAt;
    }

    /**
     * 
     * @param requestReceivedAt
     */
    public void setRequestReceivedAt(ZonedDateTime requestReceivedAt) {
        this.requestReceivedAt = requestReceivedAt.toString();
    }


    public static class ApiResponseBuilder {
        private int code;
        private String requestReceivedAt;

        public ApiResponseBuilder code(int httpCode) {
            // this to make sure someone doesn't fat finger something
            var status = Status.fromStatusCode(httpCode);

            this.code = status.getStatusCode(); 
            this.type = status.getFamily().toString();
            this.description = status.getReasonPhrase();
            return this;
        }

        public ApiResponseBuilder requestReceivedAt(String requestReceivedAt) {
            ZonedDateTime z = ZonedDateTime.parse(requestReceivedAt);
            this.requestReceivedAt = requestReceivedAt;
            return this;
        }

        public ApiResponseBuilder requestReceivedAt(ZonedDateTime requestReceivedAt) {
            this.requestReceivedAt = requestReceivedAt.toString();
            return this;
        }

    }

}

