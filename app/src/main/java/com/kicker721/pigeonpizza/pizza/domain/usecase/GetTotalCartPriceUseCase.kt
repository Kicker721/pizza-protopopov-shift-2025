package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.repository.CartRepository

class GetTotalCartPriceUseCase(val repository: CartRepository) {
    operator fun invoke() =
        repository.getTotalCartPrice()
}