package org.openapitools.client.infrastructure

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ApiKeyAuth(val type: String, val value: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()

        val newRequest: Request = request.newBuilder()
            .addHeader("X-API-Key", value)
            .build()
        return chain.proceed(newRequest)
    }
}