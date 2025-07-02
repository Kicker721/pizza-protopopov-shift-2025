package com.kicker721.pigeonpizza.pizza.domain.repository

import com.kicker721.pigeonpizza.pizza.domain.entity.CartItem

interface CartRepository {
    fun addPizzaToCart(item: CartItem)

    fun removePizzaFromCart(item: CartItem)

    fun getCartItems(): List<CartItem>

    fun getTotalCartPrice(): Long
}