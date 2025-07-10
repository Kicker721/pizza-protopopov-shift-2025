package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.domain.repository.PizzaRepository

class GetPizzaByIdUseCase(private val repository: PizzaRepository) {
    suspend operator fun invoke(id: String) : Pizza = repository.getById(id)
}