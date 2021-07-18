# RecordsApi

All URIs are relative to *https://api.hosting.ionos.com/dns*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRecords**](RecordsApi.md#createRecords) | **POST** v1/zones/{zoneId}/records | 
[**deleteRecord**](RecordsApi.md#deleteRecord) | **DELETE** v1/zones/{zoneId}/records/{recordId} | 
[**getRecord**](RecordsApi.md#getRecord) | **GET** v1/zones/{zoneId}/records/{recordId} | 
[**updateRecord**](RecordsApi.md#updateRecord) | **PUT** v1/zones/{zoneId}/records/{recordId} | 





Creates records for a customer zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RecordsApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val record : kotlin.collections.List<Record> =  // kotlin.collections.List<Record> | 

webService.createRecords(zoneId, record)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **record** | [**kotlin.collections.List&lt;Record&gt;**](Record.md)|  |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




Delete a record from the customer zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RecordsApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val recordId : kotlin.String = recordId_example // kotlin.String | The id of the record.

webService.deleteRecord(zoneId, recordId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **recordId** | **kotlin.String**| The id of the record. |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




Returns the record from the customer zone with the mentioned id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RecordsApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val recordId : kotlin.String = recordId_example // kotlin.String | The id of the record.

val result : Record = webService.getRecord(zoneId, recordId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **recordId** | **kotlin.String**| The id of the record. |

### Return type

[**Record**](Record.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




Update a record from the customer zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RecordsApi::class.java)
val zoneId : kotlin.String = zoneId_example // kotlin.String | The id of the customer zone.
val recordId : kotlin.String = recordId_example // kotlin.String | The id of the record.
val recordMinusUpdate : RecordMinusUpdate =  // RecordMinusUpdate | 

webService.updateRecord(zoneId, recordId, recordMinusUpdate)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **kotlin.String**| The id of the customer zone. |
 **recordId** | **kotlin.String**| The id of the record. |
 **recordMinusUpdate** | [**RecordMinusUpdate**](RecordMinusUpdate.md)|  |

### Return type

null (empty response body)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

