# ZonesApi

All URIs are relative to *https://api.hosting.ionos.com/dns*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZone**](ZonesApi.md#getZone) | **GET** v1/zones/{zoneId} | 
[**getZones**](ZonesApi.md#getZones) | **GET** v1/zones | 
[**patchZone**](ZonesApi.md#patchZone) | **PATCH** v1/zones/{zoneId} | 
[**updateZone**](ZonesApi.md#updateZone) | **PUT** v1/zones/{zoneId} | 





Returns a customer zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ZonesApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val suffix : kotlin.String = subhost.example.com // kotlin.String | The FQDN used to filter all the record names that end with it.
val recordName : kotlin.String = www.subdomain.example.com // kotlin.String | The record names that should be included (same as name field of Record)
val recordType : kotlin.String = A,AAAA // kotlin.String | A comma-separated list of record types that should be included

val result : CustomerMinusZone = webService.getZone(zoneId, suffix, recordName, recordType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **suffix** | **kotlin.String**| The FQDN used to filter all the record names that end with it. | [optional]
 **recordName** | **kotlin.String**| The record names that should be included (same as name field of Record) | [optional]
 **recordType** | **kotlin.String**| A comma-separated list of record types that should be included | [optional]

### Return type

[**CustomerMinusZone**](CustomerMinusZone.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




Returns list of customer zones.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ZonesApi::class.java)

val result : kotlin.collections.List<Zone> = webService.getZones()
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Zone&gt;**](Zone.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




Replaces all records of the same name and type with the ones provided.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ZonesApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val record : kotlin.collections.List<Record> =  // kotlin.collections.List<Record> | records

webService.patchZone(zoneId, record)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **record** | [**kotlin.collections.List&lt;Record&gt;**](Record.md)| records |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




Replaces all records in the zone with the ones provided

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ZonesApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val record : kotlin.collections.List<Record> =  // kotlin.collections.List<Record> | records

webService.updateZone(zoneId, record)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **record** | [**kotlin.collections.List&lt;Record&gt;**](Record.md)| records |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

