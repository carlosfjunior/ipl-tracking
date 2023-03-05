# TelemetryProfileApi

All URIs are relative to *http://localhost:8080/tracking*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSensorToTelemetryProfile**](TelemetryProfileApi.md#addSensorToTelemetryProfile) | **PUT** /telemetryprofiles/{telemetryprofileId}/sensor/{sensorId} | Add a new sensor to informed TelemetryProfile |
| [**createTelemetryProfile**](TelemetryProfileApi.md#createTelemetryProfile) | **POST** /telemetryprofiles | Create new TelemetryProfile |
| [**deleteTelemetryProfile**](TelemetryProfileApi.md#deleteTelemetryProfile) | **DELETE** /telemetryprofiles/{telemetryprofileId} | Delete TelemetryProfile |
| [**getTelemetryProfile**](TelemetryProfileApi.md#getTelemetryProfile) | **GET** /telemetryprofiles/{telemetryprofileId} | Get a single TelemetryProfile&#39;s info |
| [**listTelemetryProfiles**](TelemetryProfileApi.md#listTelemetryProfiles) | **GET** /telemetryprofiles | Get TelemetryProfiles list |
| [**removeSensorFromTelemetryProfile**](TelemetryProfileApi.md#removeSensorFromTelemetryProfile) | **DELETE** /telemetryprofiles/{telemetryprofileId}/sensor/{sensorId} | remove a sensor from informed TelemetryProfile |
| [**updateTelemetryProfile**](TelemetryProfileApi.md#updateTelemetryProfile) | **PUT** /telemetryprofiles/{telemetryprofileId} | Update TelemetryProfile&#39;s attributes |



## addSensorToTelemetryProfile

> addSensorToTelemetryProfile(telemetryprofileId, sensorId)

Add a new sensor to informed TelemetryProfile

This operation is used to update some of the TelemetryProfile, including a new sensor.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        String telemetryprofileId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the TelemetryProfile in the database
        String sensorId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Sensor in the database
        try {
            apiInstance.addSensorToTelemetryProfile(telemetryprofileId, sensorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#addSensorToTelemetryProfile");
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
| **telemetryprofileId** | **String**| Unique identifier of the TelemetryProfile in the database | |
| **sensorId** | **String**| Unique identifier of the Sensor in the database | |

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
| **400** | Parameters missing in request or request is malformed. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | There sensor already exists on informed TelemetryProfile |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## createTelemetryProfile

> CreateTelemetryProfileResponse createTelemetryProfile(createTelemetryProfileRequest)

Create new TelemetryProfile

This operation is usedto create a new TelemetryProfile on System.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        CreateTelemetryProfileRequest createTelemetryProfileRequest = new CreateTelemetryProfileRequest(); // CreateTelemetryProfileRequest | 
        try {
            CreateTelemetryProfileResponse result = apiInstance.createTelemetryProfile(createTelemetryProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#createTelemetryProfile");
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
| **createTelemetryProfileRequest** | [**CreateTelemetryProfileRequest**](CreateTelemetryProfileRequest.md)|  | |

### Return type

[**CreateTelemetryProfileResponse**](CreateTelemetryProfileResponse.md)

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
| **409** | There is already a telemetryProfile registered with same name or mail |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## deleteTelemetryProfile

> deleteTelemetryProfile(telemetryprofileId)

Delete TelemetryProfile

This operation is delete a TelemetryProfile.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        String telemetryprofileId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the TelemetryProfile in the database
        try {
            apiInstance.deleteTelemetryProfile(telemetryprofileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#deleteTelemetryProfile");
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
| **telemetryprofileId** | **String**| Unique identifier of the TelemetryProfile in the database | |

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
| **409** | Delete a telemetryprofile that has vehicles is not allowed. |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## getTelemetryProfile

> GetTelemetryProfileResponse getTelemetryProfile(telemetryprofileId)

Get a single TelemetryProfile&#39;s info

This operation is used to retrieve the details of a specific device.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        String telemetryprofileId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the TelemetryProfile in the database
        try {
            GetTelemetryProfileResponse result = apiInstance.getTelemetryProfile(telemetryprofileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#getTelemetryProfile");
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
| **telemetryprofileId** | **String**| Unique identifier of the TelemetryProfile in the database | |

### Return type

[**GetTelemetryProfileResponse**](GetTelemetryProfileResponse.md)

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


## listTelemetryProfiles

> ListTelemetryProfilesResponse listTelemetryProfiles()

Get TelemetryProfiles list

This operation is used to retrieve a list of TelemetryProfiles.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        try {
            ListTelemetryProfilesResponse result = apiInstance.listTelemetryProfiles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#listTelemetryProfiles");
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

[**ListTelemetryProfilesResponse**](ListTelemetryProfilesResponse.md)

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


## removeSensorFromTelemetryProfile

> removeSensorFromTelemetryProfile(telemetryprofileId, sensorId)

remove a sensor from informed TelemetryProfile

This operation is used to update a TelemetryProfile, removing a sensor.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        String telemetryprofileId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the TelemetryProfile in the database
        String sensorId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the Sensor in the database
        try {
            apiInstance.removeSensorFromTelemetryProfile(telemetryprofileId, sensorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#removeSensorFromTelemetryProfile");
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
| **telemetryprofileId** | **String**| Unique identifier of the TelemetryProfile in the database | |
| **sensorId** | **String**| Unique identifier of the Sensor in the database | |

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
| **400** | Parameters missing in request or request is malformed. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | There sensor not exists on informed TelemetryProfile |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |


## updateTelemetryProfile

> updateTelemetryProfile(telemetryprofileId, updateTelemetryProfileRequest)

Update TelemetryProfile&#39;s attributes

This operation is used to update some of the TelemetryProfile&#39;s attributes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TelemetryProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/tracking");

        TelemetryProfileApi apiInstance = new TelemetryProfileApi(defaultClient);
        String telemetryprofileId = "0af401df-7d7a-1f36-817d-7b0a058d0003"; // String | Unique identifier of the TelemetryProfile in the database
        UpdateTelemetryProfileRequest updateTelemetryProfileRequest = new UpdateTelemetryProfileRequest(); // UpdateTelemetryProfileRequest | 
        try {
            apiInstance.updateTelemetryProfile(telemetryprofileId, updateTelemetryProfileRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TelemetryProfileApi#updateTelemetryProfile");
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
| **telemetryprofileId** | **String**| Unique identifier of the TelemetryProfile in the database | |
| **updateTelemetryProfileRequest** | [**UpdateTelemetryProfileRequest**](UpdateTelemetryProfileRequest.md)|  | |

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
| **409** | There is already a TelemetryProfile registered with same name or email |  -  |
| **500** | Unexpected errors not mapped to status codes mentioned above |  -  |

