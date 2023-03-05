package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateDriverRequest;
import org.openapitools.client.model.CreateDriverResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GetDriverResponse;
import org.openapitools.client.model.ListDriversResponse;
import org.openapitools.client.model.UpdateDriverRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-05T14:56:01.329586Z[Europe/Lisbon]")
@Component("org.openapitools.client.api.DriverApi")
public class DriverApi {
    private ApiClient apiClient;

    public DriverApi() {
        this(new ApiClient());
    }

    @Autowired
    public DriverApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new Driver
     * This operation is usedto create a new Driver on System.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Parameters missing in request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - There is already a driver registered with same name or mail
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param createDriverRequest  (required)
     * @return CreateDriverResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateDriverResponse createDriver(CreateDriverRequest createDriverRequest) throws RestClientException {
        return createDriverWithHttpInfo(createDriverRequest).getBody();
    }

    /**
     * Create new Driver
     * This operation is usedto create a new Driver on System.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Parameters missing in request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - There is already a driver registered with same name or mail
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param createDriverRequest  (required)
     * @return ResponseEntity&lt;CreateDriverResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateDriverResponse> createDriverWithHttpInfo(CreateDriverRequest createDriverRequest) throws RestClientException {
        Object localVarPostBody = createDriverRequest;
        
        // verify the required parameter 'createDriverRequest' is set
        if (createDriverRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDriverRequest' when calling createDriver");
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

        ParameterizedTypeReference<CreateDriverResponse> localReturnType = new ParameterizedTypeReference<CreateDriverResponse>() {};
        return apiClient.invokeAPI("/drivers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Driver
     * This operation is delete a Driver.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Delete a driver that has vehicles is not allowed.
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param driverId Unique identifier of the Driver in the database (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDriver(String driverId) throws RestClientException {
        deleteDriverWithHttpInfo(driverId);
    }

    /**
     * Delete Driver
     * This operation is delete a Driver.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Delete a driver that has vehicles is not allowed.
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param driverId Unique identifier of the Driver in the database (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDriverWithHttpInfo(String driverId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'driverId' when calling deleteDriver");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("driverId", driverId);

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
        return apiClient.invokeAPI("/drivers/{driverId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a single Driver&#39;s info
     * This operation is used to retrieve the details of a specific device.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param driverId Unique identifier of the Driver in the database (required)
     * @return GetDriverResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDriverResponse getDriver(String driverId) throws RestClientException {
        return getDriverWithHttpInfo(driverId).getBody();
    }

    /**
     * Get a single Driver&#39;s info
     * This operation is used to retrieve the details of a specific device.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param driverId Unique identifier of the Driver in the database (required)
     * @return ResponseEntity&lt;GetDriverResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDriverResponse> getDriverWithHttpInfo(String driverId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'driverId' when calling getDriver");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("driverId", driverId);

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

        ParameterizedTypeReference<GetDriverResponse> localReturnType = new ParameterizedTypeReference<GetDriverResponse>() {};
        return apiClient.invokeAPI("/drivers/{driverId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Drivers list
     * This operation is used to retrieve a list of Drivers.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @return ListDriversResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListDriversResponse listDrivers() throws RestClientException {
        return listDriversWithHttpInfo().getBody();
    }

    /**
     * Get Drivers list
     * This operation is used to retrieve a list of Drivers.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @return ResponseEntity&lt;ListDriversResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListDriversResponse> listDriversWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<ListDriversResponse> localReturnType = new ParameterizedTypeReference<ListDriversResponse>() {};
        return apiClient.invokeAPI("/drivers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Driver&#39;s attributes
     * This operation is used to update some of the Driver&#39;s attributes.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed. For example, the mail is not in the correct format.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There is already a Driver registered with same name or email
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param driverId Unique identifier of the Driver in the database (required)
     * @param updateDriverRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateDriver(String driverId, UpdateDriverRequest updateDriverRequest) throws RestClientException {
        updateDriverWithHttpInfo(driverId, updateDriverRequest);
    }

    /**
     * Update Driver&#39;s attributes
     * This operation is used to update some of the Driver&#39;s attributes.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed. For example, the mail is not in the correct format.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There is already a Driver registered with same name or email
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param driverId Unique identifier of the Driver in the database (required)
     * @param updateDriverRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateDriverWithHttpInfo(String driverId, UpdateDriverRequest updateDriverRequest) throws RestClientException {
        Object localVarPostBody = updateDriverRequest;
        
        // verify the required parameter 'driverId' is set
        if (driverId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'driverId' when calling updateDriver");
        }
        
        // verify the required parameter 'updateDriverRequest' is set
        if (updateDriverRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateDriverRequest' when calling updateDriver");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("driverId", driverId);

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
        return apiClient.invokeAPI("/drivers/{driverId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
