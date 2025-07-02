package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.repository.CartRepository

class GetCartItemsUseCase(val repository: CartRepository) {
    operator fun invoke() =
        repository.getCartItems()
}