package com.kicker721.pigeonpizza.pizza.domain.entity

data class CartItem(
    val pizza: Pizza,
    val size: Size,
    val dough: Dough,
    val topping: List<Ingredient>
)
