package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.CustomerMinusZone
import org.openapitools.client.models.Error
import org.openapitools.client.models.Record
import org.openapitools.client.models.Zone

interface ZonesApi {
    /**
     * 
     * Returns a customer zone.
     * Responses:
     *  - 200: Succesful response.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param suffix The FQDN used to filter all the record names that end with it. (optional)
     * @param recordName The record names that should be included (same as name field of Record) (optional)
     * @param recordType A comma-separated list of record types that should be included (optional)
     * @return [Call]<[CustomerMinusZone]>
     */
    @GET("v1/zones/{zoneId}")
    fun getZone(@Path("zoneId") zoneId: kotlin.String, @Query("suffix") suffix: kotlin.String? = null, @Query("recordName") recordName: kotlin.String? = null, @Query("recordType") recordType: kotlin.String? = null): Call<CustomerMinusZone>

    /**
     * 
     * Returns list of customer zones.
     * Responses:
     *  - 200: Succesful response.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @return [Call]<[kotlin.collections.List<Zone>]>
     */
    @GET("v1/zones")
    fun getZones(): Call<kotlin.collections.List<Zone>>

    /**
     * 
     * Replaces all records of the same name and type with the ones provided.
     * Responses:
     *  - 200: Succesful response.
     *  - 400: Bad request.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param record records 
     * @return [Call]<[Unit]>
     */
    @PATCH("v1/zones/{zoneId}")
    fun patchZone(@Path("zoneId") zoneId: kotlin.String, @Body record: kotlin.collections.List<Record>): Call<Unit>

    /**
     * 
     * Replaces all records in the zone with the ones provided
     * Responses:
     *  - 200: Succesful response.
     *  - 400: Bad request.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param record records 
     * @return [Call]<[Unit]>
     */
    @PUT("v1/zones/{zoneId}")
    fun updateZone(@Path("zoneId") zoneId: kotlin.String, @Body record: kotlin.collections.List<Record>): Call<Unit>

}
