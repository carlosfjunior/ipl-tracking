package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateTelemetryProfileRequest;
import org.openapitools.client.model.CreateTelemetryProfileResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GetTelemetryProfileResponse;
import org.openapitools.client.model.ListTelemetryProfilesResponse;
import org.openapitools.client.model.UpdateTelemetryProfileRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-05T14:56:00.970714Z[Europe/Lisbon]")
@Component("org.openapitools.client.api.TelemetryProfileApi")
public class TelemetryProfileApi {
    private ApiClient apiClient;

    public TelemetryProfileApi() {
        this(new ApiClient());
    }

    @Autowired
    public TelemetryProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new sensor to informed TelemetryProfile
     * This operation is used to update some of the TelemetryProfile, including a new sensor.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There sensor already exists on informed TelemetryProfile
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @param sensorId Unique identifier of the Sensor in the database (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addSensorToTelemetryProfile(String telemetryprofileId, String sensorId) throws RestClientException {
        addSensorToTelemetryProfileWithHttpInfo(telemetryprofileId, sensorId);
    }

    /**
     * Add a new sensor to informed TelemetryProfile
     * This operation is used to update some of the TelemetryProfile, including a new sensor.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There sensor already exists on informed TelemetryProfile
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @param sensorId Unique identifier of the Sensor in the database (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addSensorToTelemetryProfileWithHttpInfo(String telemetryprofileId, String sensorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'telemetryprofileId' is set
        if (telemetryprofileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'telemetryprofileId' when calling addSensorToTelemetryProfile");
        }
        
        // verify the required parameter 'sensorId' is set
        if (sensorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sensorId' when calling addSensorToTelemetryProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("telemetryprofileId", telemetryprofileId);
        uriVariables.put("sensorId", sensorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/telemetryprofiles/{telemetryprofileId}/sensor/{sensorId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create new TelemetryProfile
     * This operation is usedto create a new TelemetryProfile on System.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Parameters missing in request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - There is already a telemetryProfile registered with same name or mail
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param createTelemetryProfileRequest  (required)
     * @return CreateTelemetryProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateTelemetryProfileResponse createTelemetryProfile(CreateTelemetryProfileRequest createTelemetryProfileRequest) throws RestClientException {
        return createTelemetryProfileWithHttpInfo(createTelemetryProfileRequest).getBody();
    }

    /**
     * Create new TelemetryProfile
     * This operation is usedto create a new TelemetryProfile on System.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Parameters missing in request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - There is already a telemetryProfile registered with same name or mail
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param createTelemetryProfileRequest  (required)
     * @return ResponseEntity&lt;CreateTelemetryProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateTelemetryProfileResponse> createTelemetryProfileWithHttpInfo(CreateTelemetryProfileRequest createTelemetryProfileRequest) throws RestClientException {
        Object localVarPostBody = createTelemetryProfileRequest;
        
        // verify the required parameter 'createTelemetryProfileRequest' is set
        if (createTelemetryProfileRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createTelemetryProfileRequest' when calling createTelemetryProfile");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CreateTelemetryProfileResponse> localReturnType = new ParameterizedTypeReference<CreateTelemetryProfileResponse>() {};
        return apiClient.invokeAPI("/telemetryprofiles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete TelemetryProfile
     * This operation is delete a TelemetryProfile.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Delete a telemetryprofile that has vehicles is not allowed.
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteTelemetryProfile(String telemetryprofileId) throws RestClientException {
        deleteTelemetryProfileWithHttpInfo(telemetryprofileId);
    }

    /**
     * Delete TelemetryProfile
     * This operation is delete a TelemetryProfile.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Delete a telemetryprofile that has vehicles is not allowed.
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteTelemetryProfileWithHttpInfo(String telemetryprofileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'telemetryprofileId' is set
        if (telemetryprofileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'telemetryprofileId' when calling deleteTelemetryProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("telemetryprofileId", telemetryprofileId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/telemetryprofiles/{telemetryprofileId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a single TelemetryProfile&#39;s info
     * This operation is used to retrieve the details of a specific device.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @return GetTelemetryProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTelemetryProfileResponse getTelemetryProfile(String telemetryprofileId) throws RestClientException {
        return getTelemetryProfileWithHttpInfo(telemetryprofileId).getBody();
    }

    /**
     * Get a single TelemetryProfile&#39;s info
     * This operation is used to retrieve the details of a specific device.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @return ResponseEntity&lt;GetTelemetryProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTelemetryProfileResponse> getTelemetryProfileWithHttpInfo(String telemetryprofileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'telemetryprofileId' is set
        if (telemetryprofileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'telemetryprofileId' when calling getTelemetryProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("telemetryprofileId", telemetryprofileId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetTelemetryProfileResponse> localReturnType = new ParameterizedTypeReference<GetTelemetryProfileResponse>() {};
        return apiClient.invokeAPI("/telemetryprofiles/{telemetryprofileId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get TelemetryProfiles list
     * This operation is used to retrieve a list of TelemetryProfiles.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @return ListTelemetryProfilesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListTelemetryProfilesResponse listTelemetryProfiles() throws RestClientException {
        return listTelemetryProfilesWithHttpInfo().getBody();
    }

    /**
     * Get TelemetryProfiles list
     * This operation is used to retrieve a list of TelemetryProfiles.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @return ResponseEntity&lt;ListTelemetryProfilesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListTelemetryProfilesResponse> listTelemetryProfilesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListTelemetryProfilesResponse> localReturnType = new ParameterizedTypeReference<ListTelemetryProfilesResponse>() {};
        return apiClient.invokeAPI("/telemetryprofiles", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * remove a sensor from informed TelemetryProfile
     * This operation is used to update a TelemetryProfile, removing a sensor.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There sensor not exists on informed TelemetryProfile
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @param sensorId Unique identifier of the Sensor in the database (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void removeSensorFromTelemetryProfile(String telemetryprofileId, String sensorId) throws RestClientException {
        removeSensorFromTelemetryProfileWithHttpInfo(telemetryprofileId, sensorId);
    }

    /**
     * remove a sensor from informed TelemetryProfile
     * This operation is used to update a TelemetryProfile, removing a sensor.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There sensor not exists on informed TelemetryProfile
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @param sensorId Unique identifier of the Sensor in the database (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeSensorFromTelemetryProfileWithHttpInfo(String telemetryprofileId, String sensorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'telemetryprofileId' is set
        if (telemetryprofileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'telemetryprofileId' when calling removeSensorFromTelemetryProfile");
        }
        
        // verify the required parameter 'sensorId' is set
        if (sensorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sensorId' when calling removeSensorFromTelemetryProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("telemetryprofileId", telemetryprofileId);
        uriVariables.put("sensorId", sensorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/telemetryprofiles/{telemetryprofileId}/sensor/{sensorId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update TelemetryProfile&#39;s attributes
     * This operation is used to update some of the TelemetryProfile&#39;s attributes.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed. For example, the mail is not in the correct format.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There is already a TelemetryProfile registered with same name or email
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @param updateTelemetryProfileRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateTelemetryProfile(String telemetryprofileId, UpdateTelemetryProfileRequest updateTelemetryProfileRequest) throws RestClientException {
        updateTelemetryProfileWithHttpInfo(telemetryprofileId, updateTelemetryProfileRequest);
    }

    /**
     * Update TelemetryProfile&#39;s attributes
     * This operation is used to update some of the TelemetryProfile&#39;s attributes.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed. For example, the mail is not in the correct format.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There is already a TelemetryProfile registered with same name or email
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param telemetryprofileId Unique identifier of the TelemetryProfile in the database (required)
     * @param updateTelemetryProfileRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateTelemetryProfileWithHttpInfo(String telemetryprofileId, UpdateTelemetryProfileRequest updateTelemetryProfileRequest) throws RestClientException {
        Object localVarPostBody = updateTelemetryProfileRequest;
        
        // verify the required parameter 'telemetryprofileId' is set
        if (telemetryprofileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'telemetryprofileId' when calling updateTelemetryProfile");
        }
        
        // verify the required parameter 'updateTelemetryProfileRequest' is set
        if (updateTelemetryProfileRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTelemetryProfileRequest' when calling updateTelemetryProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("telemetryprofileId", telemetryprofileId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/telemetryprofiles/{telemetryprofileId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
