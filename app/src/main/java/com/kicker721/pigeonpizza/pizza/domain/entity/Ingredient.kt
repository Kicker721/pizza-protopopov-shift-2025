package com.kicker721.pigeonpizza.pizza.domain.entity

import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType

data class Ingredient(
    val type: IngredientType,
    val price: Int,
    val img: String,
)