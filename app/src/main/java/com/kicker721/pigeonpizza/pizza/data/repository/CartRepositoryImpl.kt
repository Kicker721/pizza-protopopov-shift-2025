package com.kicker721.pigeonpizza.pizza.data.repository

import com.kicker721.pigeonpizza.pizza.data.datasource.CartLocalDataSource
import com.kicker721.pigeonpizza.pizza.domain.entity.CartItem
import com.kicker721.pigeonpizza.pizza.domain.repository.CartRepository

class CartRepositoryImpl(private val cartLocalDataSource: CartLocalDataSource) : CartRepository {
    override fun addPizza(item: CartItem) {
        cartLocalDataSource.addItem(item)
    }

    override fun removePizza(item: CartItem) {
        cartLocalDataSource.removeItem(item)
    }

    override fun getItems(): List<CartItem> {
        return cartLocalDataSource.getItems()
    }

    override fun getTotalPrice(): Int {
        return cartLocalDataSource.getItems().sumOf { it.totalPrice }
    }
}