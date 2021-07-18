# org.openapitools.client - Kotlin client library for DNS API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.hosting.ionos.com/dns*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DynamicDNSApi* | [**activateDynDns**](docs/DynamicDNSApi.md#activatedyndns) | **POST** v1/dyndns | 
*DynamicDNSApi* | [**deleteDynDns**](docs/DynamicDNSApi.md#deletedyndns) | **DELETE** v1/dyndns/{bulkId} | 
*DynamicDNSApi* | [**disableDynDns**](docs/DynamicDNSApi.md#disabledyndns) | **DELETE** v1/dyndns | 
*DynamicDNSApi* | [**updateDynDns**](docs/DynamicDNSApi.md#updatedyndns) | **PUT** v1/dyndns/{bulkId} | 
*RecordsApi* | [**createRecords**](docs/RecordsApi.md#createrecords) | **POST** v1/zones/{zoneId}/records | 
*RecordsApi* | [**deleteRecord**](docs/RecordsApi.md#deleterecord) | **DELETE** v1/zones/{zoneId}/records/{recordId} | 
*RecordsApi* | [**getRecord**](docs/RecordsApi.md#getrecord) | **GET** v1/zones/{zoneId}/records/{recordId} | 
*RecordsApi* | [**updateRecord**](docs/RecordsApi.md#updaterecord) | **PUT** v1/zones/{zoneId}/records/{recordId} | 
*ZonesApi* | [**getZone**](docs/ZonesApi.md#getzone) | **GET** v1/zones/{zoneId} | 
*ZonesApi* | [**getZones**](docs/ZonesApi.md#getzones) | **GET** v1/zones | 
*ZonesApi* | [**patchZone**](docs/ZonesApi.md#patchzone) | **PATCH** v1/zones/{zoneId} | 
*ZonesApi* | [**updateZone**](docs/ZonesApi.md#updatezone) | **PUT** v1/zones/{zoneId} | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.CustomerMinusZone](docs/CustomerMinusZone.md)
 - [org.openapitools.client.models.DynMinusDnsMinusRequest](docs/DynMinusDnsMinusRequest.md)
 - [org.openapitools.client.models.DynamicMinusDns](docs/DynamicMinusDns.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.Record](docs/Record.md)
 - [org.openapitools.client.models.RecordMinusUpdate](docs/RecordMinusUpdate.md)
 - [org.openapitools.client.models.RecordTypes](docs/RecordTypes.md)
 - [org.openapitools.client.models.Zone](docs/Zone.md)
 - [org.openapitools.client.models.ZoneTypes](docs/ZoneTypes.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

