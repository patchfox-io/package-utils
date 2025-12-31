package io.patchfox.package_utils.json;


import java.net.URI;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.ToStringExclude;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Getter 
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@Slf4j
public class ApiRequest {

    @JsonIgnore
    public static final String TXID_KEY = "txid";

    // not using org.springframework.http.HttpMethod because spring/kafka REALLY don't want to serialize it and we can 
    // get the same effect with a local enum (ie - making sure something doesn't try to put "megadolphinyogurtpants" or 
    // some ridiculous thing if it was typed as a String)
    public enum httpVerb { GET, POST, PUT, DELETE, OPTIONS, HEAD }

    // for kafka messages this tells us which topic name to use for responses. ignored for REST requests made from 
    // this object. 
    String responseTopicName;

    // all requests are RESTful regardless of whether or not we're making a REST call. this to keep things nice and
    // homogenous regardless of whether or not we're dealing with an actual REST call or an MQ message 
    @Builder.Default
    Map<String, String> headers = new HashMap<>();

    @Builder.Default
    Map<String, String> queryStringParameters = new HashMap<>();
    
    URI uri;
    httpVerb verb;

    // unique transaction id that follows a request through the entire PF pipeline 
    UUID txid;

    // request payload 
    @Builder.Default
    @ToString.Exclude
    Map<String, Object> data = new HashMap<>();


    /**
     * helper for when we want the URI with all the paramters (ie a REST call).
     * 
     * @return
     */
    public URI getUriWithQueryStringParameters() {
        var sb = new StringBuilder(uri.toString());
        if ( !queryStringParameters.isEmpty() ) {
            sb = sb.append("?");
            var size = queryStringParameters.size();
            for (var entry : queryStringParameters.entrySet()) {
                size --;

                sb = sb.append(entry.getKey())
                       .append("=")
                       .append(entry.getValue());

                if (size > 0) {
                    sb.append("&");
                }
                
            }

        }

        return URI.create(sb.toString());
    }


    /**
     * ensures the transaction id (txid) gets set as both a field of this object and in the headers map. RESTful 
     * consumers of this class will look to the headers map for txid, not to the field. 
     * 
     * @param txid
     */
    public void setTxid(UUID txid) {
        this.txid = txid;
        this.headers.put(TXID_KEY, txid.toString());
    }

    
    /**
     * helper to help consumers ensure message is well formed before attempting to use it 
     * 
     * @return
     */
    public boolean isValidForRest() {        
        if (uri == null) { log.warn("request missing uri, rejecting"); return false; }
        if (verb == null) { log.warn("request missing http verb, rejecting"); return false; }
        if (txid == null) { log.warn("request missing responseTopicName"); return false; }
        return true;
    }

    /**
     * 
     * @return
     */
    public boolean isValidForKafka() {
        if (responseTopicName == null) { log.warn("request missing responseTopicName, rejecting..."); return false; }
        if (responseTopicName == null) { log.warn("request missing responseTopicName"); return false; }
        return isValidForRest();
    }

}
