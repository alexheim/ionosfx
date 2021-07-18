# DynamicDNSApi

All URIs are relative to *https://api.hosting.ionos.com/dns*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateDynDns**](DynamicDNSApi.md#activateDynDns) | **POST** v1/dyndns | 
[**deleteDynDns**](DynamicDNSApi.md#deleteDynDns) | **DELETE** v1/dyndns/{bulkId} | 
[**disableDynDns**](DynamicDNSApi.md#disableDynDns) | **DELETE** v1/dyndns | 
[**updateDynDns**](DynamicDNSApi.md#updateDynDns) | **PUT** v1/dyndns/{bulkId} | 





Activate Dynamic Dns for a bundle of (sub)domains. The url from response will be used to update the ips of the (sub)domains.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DynamicDNSApi::class.java)
val dynMinusDnsMinusRequest : DynMinusDnsMinusRequest =  // DynMinusDnsMinusRequest | Dynamic Dns configuration.

val result : DynamicMinusDns = webService.activateDynDns(dynMinusDnsMinusRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dynMinusDnsMinusRequest** | [**DynMinusDnsMinusRequest**](DynMinusDnsMinusRequest.md)| Dynamic Dns configuration. |

### Return type

[**DynamicMinusDns**](DynamicMinusDns.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




Disable Dynamic Dns for bulk id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DynamicDNSApi::class.java)
val bulkId : kotlin.String = bulkId_example // kotlin.String | Dynamic Dns configuration identifier.

webService.deleteDynDns(bulkId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkId** | **kotlin.String**| Dynamic Dns configuration identifier. |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




Disable Dynamic Dns

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DynamicDNSApi::class.java)

webService.disableDynDns()
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




Update Dynamic Dns for bulk id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DynamicDNSApi::class.java)
val bulkId : kotlin.String = bulkId_example // kotlin.String | Dynamic Dns configuration identifier.
val dynMinusDnsMinusRequest : DynMinusDnsMinusRequest =  // DynMinusDnsMinusRequest | Dynamic Dns configuration.

webService.updateDynDns(bulkId, dynMinusDnsMinusRequest)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkId** | **kotlin.String**| Dynamic Dns configuration identifier. |
 **dynMinusDnsMinusRequest** | [**DynMinusDnsMinusRequest**](DynMinusDnsMinusRequest.md)| Dynamic Dns configuration. |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

