package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateCustomerRequest;
import org.openapitools.client.model.CreateCustomerResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GetCustomerResponse;
import org.openapitools.client.model.ListCustomersResponse;
import org.openapitools.client.model.UpdateCustomerRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-05T14:56:00.606499Z[Europe/Lisbon]")
@Component("org.openapitools.client.api.CustomerApi")
public class CustomerApi {
    private ApiClient apiClient;

    public CustomerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new Customer
     * This operation is usedto create a new Customer on System.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Parameters missing in request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - There is already a customer registered with same name or mail
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param createCustomerRequest  (required)
     * @return CreateCustomerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateCustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest) throws RestClientException {
        return createCustomerWithHttpInfo(createCustomerRequest).getBody();
    }

    /**
     * Create new Customer
     * This operation is usedto create a new Customer on System.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Parameters missing in request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - There is already a customer registered with same name or mail
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param createCustomerRequest  (required)
     * @return ResponseEntity&lt;CreateCustomerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateCustomerResponse> createCustomerWithHttpInfo(CreateCustomerRequest createCustomerRequest) throws RestClientException {
        Object localVarPostBody = createCustomerRequest;
        
        // verify the required parameter 'createCustomerRequest' is set
        if (createCustomerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createCustomerRequest' when calling createCustomer");
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

        ParameterizedTypeReference<CreateCustomerResponse> localReturnType = new ParameterizedTypeReference<CreateCustomerResponse>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Customer
     * This operation is delete a Customer.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Delete a customer that has vehicles is not allowed.
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param customerId Unique identifier of the Customer in the database (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomer(String customerId) throws RestClientException {
        deleteCustomerWithHttpInfo(customerId);
    }

    /**
     * Delete Customer
     * This operation is delete a Customer.
     * <p><b>204</b> - No Content
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Delete a customer that has vehicles is not allowed.
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param customerId Unique identifier of the Customer in the database (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerWithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling deleteCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

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
        return apiClient.invokeAPI("/customers/{customerId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a single Customer&#39;s info
     * This operation is used to retrieve the details of a specific device.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param customerId Unique identifier of the Customer in the database (required)
     * @return GetCustomerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCustomerResponse getCustomer(String customerId) throws RestClientException {
        return getCustomerWithHttpInfo(customerId).getBody();
    }

    /**
     * Get a single Customer&#39;s info
     * This operation is used to retrieve the details of a specific device.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param customerId Unique identifier of the Customer in the database (required)
     * @return ResponseEntity&lt;GetCustomerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCustomerResponse> getCustomerWithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

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

        ParameterizedTypeReference<GetCustomerResponse> localReturnType = new ParameterizedTypeReference<GetCustomerResponse>() {};
        return apiClient.invokeAPI("/customers/{customerId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customers list
     * This operation is used to retrieve a list of Customers.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @return ListCustomersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListCustomersResponse listCustomers() throws RestClientException {
        return listCustomersWithHttpInfo().getBody();
    }

    /**
     * Get Customers list
     * This operation is used to retrieve a list of Customers.
     * <p><b>200</b> - Ok
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @return ResponseEntity&lt;ListCustomersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListCustomersResponse> listCustomersWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<ListCustomersResponse> localReturnType = new ParameterizedTypeReference<ListCustomersResponse>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Customer&#39;s attributes
     * This operation is used to update some of the Customer&#39;s attributes.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed. For example, the mail is not in the correct format.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There is already a Customer registered with same name or email
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param customerId Unique identifier of the Customer in the database (required)
     * @param updateCustomerRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateCustomer(String customerId, UpdateCustomerRequest updateCustomerRequest) throws RestClientException {
        updateCustomerWithHttpInfo(customerId, updateCustomerRequest);
    }

    /**
     * Update Customer&#39;s attributes
     * This operation is used to update some of the Customer&#39;s attributes.
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Parameters missing in request or request is malformed. For example, the mail is not in the correct format.
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - There is already a Customer registered with same name or email
     * <p><b>500</b> - Unexpected errors not mapped to status codes mentioned above
     * @param customerId Unique identifier of the Customer in the database (required)
     * @param updateCustomerRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateCustomerWithHttpInfo(String customerId, UpdateCustomerRequest updateCustomerRequest) throws RestClientException {
        Object localVarPostBody = updateCustomerRequest;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling updateCustomer");
        }
        
        // verify the required parameter 'updateCustomerRequest' is set
        if (updateCustomerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateCustomerRequest' when calling updateCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

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
        return apiClient.invokeAPI("/customers/{customerId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
