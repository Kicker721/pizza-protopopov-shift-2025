package com.kicker721.pigeonpizza.pizza.domain.entity

data class CartItem(
    val pizza: Pizza,
    val size: SizeType,
    val dough: DoughType,
    val topping: List<IngredientType>
)
