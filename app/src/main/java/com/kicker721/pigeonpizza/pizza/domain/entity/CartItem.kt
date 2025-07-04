package com.kicker721.pigeonpizza.pizza.domain.entity

data class CartItem(
    val quantity: Int,
    val pizza: Pizza,
    val size: Size,
    val dough: Dough,
    val topping: List<Ingredient>
) {
    val totalPrice: Int
        get() {
            val ingredientsPrice = pizza.ingredients.sumOf { it.price }
            val toppingsPrice = topping.sumOf { it.price }
            val basePrice = ingredientsPrice + toppingsPrice + size.price + dough.price
            return basePrice * quantity
        }
}
