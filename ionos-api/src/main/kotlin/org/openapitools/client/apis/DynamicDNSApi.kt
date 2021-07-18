package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody

import org.openapitools.client.models.DynMinusDnsMinusRequest
import org.openapitools.client.models.DynamicMinusDns
import org.openapitools.client.models.Error

interface DynamicDNSApi {
    /**
     * 
     * Activate Dynamic Dns for a bundle of (sub)domains. The url from response will be used to update the ips of the (sub)domains.
     * Responses:
     *  - 200: Succesful response.
     *  - 400: Bad request.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param dynMinusDnsMinusRequest Dynamic Dns configuration. 
     * @return [Call]<[DynamicMinusDns]>
     */
    @POST("v1/dyndns")
    fun activateDynDns(@Body dynMinusDnsMinusRequest: DynMinusDnsMinusRequest): Call<DynamicMinusDns>

    /**
     * 
     * Disable Dynamic Dns for bulk id
     * Responses:
     *  - 200: Succesful response.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @param bulkId Dynamic Dns configuration identifier. 
     * @return [Call]<[Unit]>
     */
    @DELETE("v1/dyndns/{bulkId}")
    fun deleteDynDns(@Path("bulkId") bulkId: kotlin.String): Call<Unit>

    /**
     * 
     * Disable Dynamic Dns
     * Responses:
     *  - 200: Succesful response.
     *  - 401: Unauthorized request.
     *  - 500: Internal server error.
     * 
     * @return [Call]<[Unit]>
     */
    @DELETE("v1/dyndns")
    fun disableDynDns(): Call<Unit>

    /**
     * 
     * Update Dynamic Dns for bulk id
     * Responses:
     *  - 200: Succesful response.
     *  - 400: Bad request.
     *  - 401: Unauthorized request.
     *  - 403: Forbidden request.
     *  - 404: DynDns not found error.
     *  - 500: Internal server error.
     * 
     * @param bulkId Dynamic Dns configuration identifier. 
     * @param dynMinusDnsMinusRequest Dynamic Dns configuration. 
     * @return [Call]<[Unit]>
     */
    @PUT("v1/dyndns/{bulkId}")
    fun updateDynDns(@Path("bulkId") bulkId: kotlin.String, @Body dynMinusDnsMinusRequest: DynMinusDnsMinusRequest): Call<Unit>

}
