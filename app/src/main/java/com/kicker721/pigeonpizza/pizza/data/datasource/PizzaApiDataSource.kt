package com.kicker721.pigeonpizza.pizza.data.datasource

import com.kicker721.pigeonpizza.network.NetworkModule
import com.kicker721.pigeonpizza.pizza.data.model.PizzaModel

class PizzaApiDataSource {
    suspend fun getAll() : List<PizzaModel> {
        val pizzas = NetworkModule.pizzaApi.getCatalog().catalog
        return pizzas
    }
}