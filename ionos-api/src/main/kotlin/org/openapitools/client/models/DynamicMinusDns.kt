/**
* DNS API
* ## Working with the API Every endpoint uses the `X-API-Key` header for authorization, to obtain the key please see the [Official Documentation](/docs/getstarted).  Please note that any zone or record updates might conflict with active services. In such cases, the DNS records belonging to the conflicting services will be deactivated.  ## Support Support questions may be posted in English: <a href='/docs/getstarted#support'>API Beta Support</a>.  Please note that in the Beta phase we offer support in the business Hours Mo-Fri 9:00-17:00 EET. <h2> <details>   <summary>Release notes</summary>    Vesion 1.0.0   Exposed CRUD operations for customer zone. </details> </h2> 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 * @param bulkId DynDns configuration identifier.
 * @param updateUrl Use the url with GET to update the ips of (sub)domains. Query parameters: ipv4, ipv6.
 * @param domains 
 * @param description Dynamic Dns description.
 */

data class DynamicMinusDns (
    /* DynDns configuration identifier. */
    @Json(name = "bulkId")
    val bulkId: kotlin.String? = null,
    /* Use the url with GET to update the ips of (sub)domains. Query parameters: ipv4, ipv6. */
    @Json(name = "updateUrl")
    val updateUrl: kotlin.String? = null,
    @Json(name = "domains")
    val domains: kotlin.collections.List<kotlin.String>? = null,
    /* Dynamic Dns description. */
    @Json(name = "description")
    val description: kotlin.String? = null
)

