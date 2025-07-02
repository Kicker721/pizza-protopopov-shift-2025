package com.kicker721.pigeonpizza.pizza.domain.usecase

import com.kicker721.pigeonpizza.pizza.domain.repository.PizzaRepository
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza

class GetPizzaCatalogUseCase {
    suspend operator fun invoke(pizzaRepository: PizzaRepository): List<Pizza> {
        return pizzaRepository.getPizzaCatalog()
    }
}