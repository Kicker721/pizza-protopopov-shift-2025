package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.repository.CartRepository

class GetTotalCartPriceUseCase(private val repository: CartRepository) {
    operator fun invoke() =
        repository.getTotalPrice()
}