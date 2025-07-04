package org.nekomanga.core.network

import java.util.concurrent.TimeUnit.MINUTES
import okhttp3.CacheControl
import okhttp3.FormBody
import okhttp3.Headers
import okhttp3.Request
import okhttp3.RequestBody

private val DEFAULT_CACHE_CONTROL = CacheControl.Builder().maxAge(10, MINUTES).build()
private val DEFAULT_HEADERS = Headers.Builder().build()
private val DEFAULT_BODY: RequestBody = FormBody.Builder().build()
val CACHE_CONTROL_NO_STORE = CacheControl.Builder().noStore().build()

fun GET(
    url: String,
    headers: Headers = DEFAULT_HEADERS,
    cache: CacheControl = DEFAULT_CACHE_CONTROL,
): Request {
    return Request.Builder().url(url).headers(headers).cacheControl(cache).build()
}

fun POST(
    url: String,
    headers: Headers = DEFAULT_HEADERS,
    body: RequestBody = DEFAULT_BODY,
    cache: CacheControl = DEFAULT_CACHE_CONTROL,
): Request {
    return Request.Builder().url(url).post(body).headers(headers).cacheControl(cache).build()
}

fun PATCH(
    url: String,
    headers: Headers = DEFAULT_HEADERS,
    body: RequestBody = DEFAULT_BODY,
    cache: CacheControl = DEFAULT_CACHE_CONTROL,
): Request {
    return Request.Builder().url(url).patch(body).headers(headers).cacheControl(cache).build()
}

fun PUT(
    url: String,
    headers: Headers = DEFAULT_HEADERS,
    body: RequestBody = DEFAULT_BODY,
    cache: CacheControl = DEFAULT_CACHE_CONTROL,
): Request {
    return Request.Builder().url(url).put(body).headers(headers).cacheControl(cache).build()
}

fun DELETE(
    url: String,
    headers: Headers = DEFAULT_HEADERS,
    body: RequestBody = DEFAULT_BODY,
    cache: CacheControl = DEFAULT_CACHE_CONTROL,
): Request {
    return Request.Builder().url(url).delete(body).headers(headers).cacheControl(cache).build()
}
