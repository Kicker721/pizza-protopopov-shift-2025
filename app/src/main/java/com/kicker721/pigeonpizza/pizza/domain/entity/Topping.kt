package com.kicker721.pigeonpizza.pizza.domain.entity

data class Topping(
    val type: IngredientType,
    val price: Long,
    val img: String,
)