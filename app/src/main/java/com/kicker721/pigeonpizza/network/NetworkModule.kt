package com.kicker721.pigeonpizza.network

import com.kicker721.pigeonpizza.BASE_URL
import com.kicker721.pigeonpizza.pizza.data.api.PizzaApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val CONNECT_TIMEOUT = 10L

object NetworkModule {
    private val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .connectTimeout(CONNECT_TIMEOUT, java.util.concurrent.TimeUnit.SECONDS)
        .build()

    private val retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val pizzaApi: PizzaApi = retrofit.create(PizzaApi::class.java)
}
