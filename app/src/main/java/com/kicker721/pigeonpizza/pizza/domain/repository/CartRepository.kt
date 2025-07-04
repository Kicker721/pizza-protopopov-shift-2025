package com.kicker721.pigeonpizza.pizza.domain.repository

import com.kicker721.pigeonpizza.pizza.domain.entity.CartItem

interface CartRepository {
    fun addPizza(item: CartItem)

    fun removePizza(item: CartItem)

    fun getItems(): List<CartItem>

    fun getTotalPrice(): Int
}