package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.repository.PizzaRepository
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza

class GetPizzaCatalogUseCase(private val repository: PizzaRepository) {
    suspend operator fun invoke(): List<Pizza> {
        return repository.getAll()
    }
}