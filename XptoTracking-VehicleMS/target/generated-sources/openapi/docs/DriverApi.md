# DriverApi

All URIs are relative to *http://localhost:8080/tracking*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDriver**](DriverApi.md#createDriver) | **POST** /drivers | Create new Driver |
| [**deleteDriver**](DriverApi.md#deleteDriver) | **DELETE** /drivers/{driverId} | Delete Driver |
| [**getDriver**](DriverApi.md#getDriver) | **GET** /drivers/{driverId} | Get a single Driver&#39;s info |
| [**listDrivers**](DriverApi.md#listDrivers) | **GET** /drivers | Get Drivers list |
| [**updateDriver**](DriverApi.md#updateDriver) | **PATCH** /drivers/{driverId} | Update Driver&#39;s attributes |



## createDriver

> CreateDriverResponse createDriver(createDriverRequest)

Create new Driver

This operation is usedto create a new Driver on System.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DriverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        DriverApi apiInstance = new DriverApi(defaultClient);
        CreateDriverRequest createDriverRequest = new CreateDriverRequest(); // CreateDriverRequest | 
        try {
            CreateDriverResponse result = apiInstance.createDriver(createDriverRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DriverApi#createDriver");
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
| **createDriverRequest** | [**CreateDriverRequest**](CreateDriverRequest.md)|  | |

### Return type

[**CreateDriverResponse**](CreateDriverResponse.md)

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
| **409** | There is already a driver registered with same name or mail |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## deleteDriver

> deleteDriver(driverId)

Delete Driver

This operation is delete a Driver.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DriverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        DriverApi apiInstance = new DriverApi(defaultClient);
        String driverId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Driver in the database
        try {
            apiInstance.deleteDriver(driverId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DriverApi#deleteDriver");
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
| **driverId** | **String**| Unique identifier of the Driver in the database | |

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
| **409** | Delete a driver that has vehicles is not allowed. |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## getDriver

> GetDriverResponse getDriver(driverId)

Get a single Driver&#39;s info

This operation is used to retrieve the details of a specific device.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DriverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        DriverApi apiInstance = new DriverApi(defaultClient);
        String driverId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Driver in the database
        try {
            GetDriverResponse result = apiInstance.getDriver(driverId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DriverApi#getDriver");
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
| **driverId** | **String**| Unique identifier of the Driver in the database | |

### Return type

[**GetDriverResponse**](GetDriverResponse.md)

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


## listDrivers

> ListDriversResponse listDrivers()

Get Drivers list

This operation is used to retrieve a list of Drivers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DriverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        DriverApi apiInstance = new DriverApi(defaultClient);
        try {
            ListDriversResponse result = apiInstance.listDrivers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DriverApi#listDrivers");
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

[**ListDriversResponse**](ListDriversResponse.md)

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


## updateDriver

> updateDriver(driverId, updateDriverRequest)

Update Driver&#39;s attributes

This operation is used to update some of the Driver&#39;s attributes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DriverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        DriverApi apiInstance = new DriverApi(defaultClient);
        String driverId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Driver in the database
        UpdateDriverRequest updateDriverRequest = new UpdateDriverRequest(); // UpdateDriverRequest | 
        try {
            apiInstance.updateDriver(driverId, updateDriverRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DriverApi#updateDriver");
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
| **driverId** | **String**| Unique identifier of the Driver in the database | |
| **updateDriverRequest** | [**UpdateDriverRequest**](UpdateDriverRequest.md)|  | |

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
| **409** | There is already a Driver registered with same name or email |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |

