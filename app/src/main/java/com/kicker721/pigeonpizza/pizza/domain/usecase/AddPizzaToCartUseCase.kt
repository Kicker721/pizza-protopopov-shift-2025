package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.entity.CartItem
import com.kicker721.pigeonpizza.pizza.domain.repository.CartRepository

class AddPizzaToCartUseCase(private val repository: CartRepository) {
    operator fun invoke(item: CartItem) =
        repository.addPizza(item)
}