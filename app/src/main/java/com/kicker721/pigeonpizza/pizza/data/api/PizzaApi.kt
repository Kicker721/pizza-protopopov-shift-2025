package com.kicker721.pigeonpizza.pizza.data.api

import com.kicker721.pigeonpizza.pizza.data.model.CatalogResponseModel
import retrofit2.http.GET

interface PizzaApi {
    @GET("pizza/catalog")
    suspend fun getCatalog(): CatalogResponseModel
}