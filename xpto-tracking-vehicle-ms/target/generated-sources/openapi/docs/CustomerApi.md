# CustomerApi

All URIs are relative to *http://localhost:8080/tracking*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](CustomerApi.md#createCustomer) | **POST** /customers | Create new Customer |
| [**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /customers/{customerId} | Delete Customer |
| [**getCustomer**](CustomerApi.md#getCustomer) | **GET** /customers/{customerId} | Get a single Customer&#39;s info |
| [**listCustomers**](CustomerApi.md#listCustomers) | **GET** /customers | Get Customers list |
| [**updateCustomer**](CustomerApi.md#updateCustomer) | **PATCH** /customers/{customerId} | Update Customer&#39;s attributes |



## createCustomer

> CreateCustomerResponse createCustomer(createCustomerRequest)

Create new Customer

This operation is usedto create a new Customer on System.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest(); // CreateCustomerRequest | 
        try {
            CreateCustomerResponse result = apiInstance.createCustomer(createCustomerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#createCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createCustomerRequest** | [**CreateCustomerRequest**](CreateCustomerRequest.md)|  | |

### Return type

[**CreateCustomerResponse**](CreateCustomerResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Parameters missing in request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | There is already a customer registered with same name or mail |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## deleteCustomer

> deleteCustomer(customerId)

Delete Customer

This operation is delete a Customer.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String customerId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Customer in the database
        try {
            apiInstance.deleteCustomer(customerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| Unique identifier of the Customer in the database | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Delete a customer that has vehicles is not allowed. |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## getCustomer

> GetCustomerResponse getCustomer(customerId)

Get a single Customer&#39;s info

This operation is used to retrieve the details of a specific device.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String customerId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Customer in the database
        try {
            GetCustomerResponse result = apiInstance.getCustomer(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| Unique identifier of the Customer in the database | |

### Return type

[**GetCustomerResponse**](GetCustomerResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## listCustomers

> ListCustomersResponse listCustomers()

Get Customers list

This operation is used to retrieve a list of Customers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        try {
            ListCustomersResponse result = apiInstance.listCustomers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#listCustomers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListCustomersResponse**](ListCustomersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## updateCustomer

> updateCustomer(customerId, updateCustomerRequest)

Update Customer&#39;s attributes

This operation is used to update some of the Customer&#39;s attributes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String customerId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Customer in the database
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest(); // UpdateCustomerRequest | 
        try {
            apiInstance.updateCustomer(customerId, updateCustomerRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| Unique identifier of the Customer in the database | |
| **updateCustomerRequest** | [**UpdateCustomerRequest**](UpdateCustomerRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Parameters missing in request or request is malformed. For example, the mail is not in the correct format. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | There is already a Customer registered with same name or email |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |

