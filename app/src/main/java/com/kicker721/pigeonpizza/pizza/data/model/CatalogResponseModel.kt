package com.kicker721.pigeonpizza.pizza.data.model

data class CatalogResponseModel(
    val success: Boolean,
    val reason: String?,
    val pizzas: List<PizzaModel>
)
