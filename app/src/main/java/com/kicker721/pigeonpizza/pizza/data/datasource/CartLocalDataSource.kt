package com.kicker721.pigeonpizza.pizza.data.datasource

import com.kicker721.pigeonpizza.pizza.domain.entity.CartItem

object CartLocalDataSource {
    private val cartItems = mutableListOf<CartItem>()

    fun getItems(): List<CartItem> {
        return cartItems.toList()
    }

    fun addItem(item: CartItem) {
        val index = cartItems.indexOf(item)
        if (index == -1) {
            cartItems.add(item)
        } else {
            val existing = cartItems[index]
            cartItems[index] = existing.copy(quantity = existing.quantity + item.quantity)
        }
    }

    fun removeItem(item: CartItem) {
        val index = cartItems.indexOf(item)
        if (index != -1) {
            val existing = cartItems[index]
            if (existing.quantity > 1) {
                cartItems[index] = existing.copy(quantity = existing.quantity - 1)
            } else {
                cartItems.removeAt(index)
            }
        }
    }
}
