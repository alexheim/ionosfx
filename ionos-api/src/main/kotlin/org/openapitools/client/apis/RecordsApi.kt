package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.Error
import org.openapitools.client.models.Record
import org.openapitools.client.models.RecordMinusUpdate

interface RecordsApi {
    /**
     * 
     * Creates records for a customer zone.
     * Responses:
     *  - 201: Records created.
     *  - 400: Bad request.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param record  
     * @return [Call]<[Unit]>
     */
    @POST("v1/zones/{zoneId}/records")
    fun createRecords(@Path("zoneId") zoneId: kotlin.String, @Body record: kotlin.collections.List<Record>): Call<Unit>

    /**
     * 
     * Delete a record from the customer zone.
     * Responses:
     *  - 200: Succesful response.
     *  - 404: Record not found.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param recordId The id of the record. 
     * @return [Call]<[Unit]>
     */
    @DELETE("v1/zones/{zoneId}/records/{recordId}")
    fun deleteRecord(@Path("zoneId") zoneId: kotlin.String, @Path("recordId") recordId: kotlin.String): Call<Unit>

    /**
     * 
     * Returns the record from the customer zone with the mentioned id.
     * Responses:
     *  - 200: Succesful response.
     *  - 404: Record not found.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param recordId The id of the record. 
     * @return [Call]<[Record]>
     */
    @GET("v1/zones/{zoneId}/records/{recordId}")
    fun getRecord(@Path("zoneId") zoneId: kotlin.String, @Path("recordId") recordId: kotlin.String): Call<Record>

    /**
     * 
     * Update a record from the customer zone.
     * Responses:
     *  - 200: Succesful response.
     *  - 400: Bad request.
     *  - 401: Unauthorized request.
     *  - 404: Record not found.
     *  - 500: Internal server error.
     * 
     * @param zoneId The id of the customer zone. 
     * @param recordId The id of the record. 
     * @param recordMinusUpdate  
     * @return [Call]<[Unit]>
     */
    @PUT("v1/zones/{zoneId}/records/{recordId}")
    fun updateRecord(@Path("zoneId") zoneId: kotlin.String, @Path("recordId") recordId: kotlin.String, @Body recordMinusUpdate: RecordMinusUpdate): Call<Unit>

}
