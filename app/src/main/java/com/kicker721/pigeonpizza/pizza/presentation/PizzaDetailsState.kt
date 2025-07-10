package com.kicker721.pigeonpizza.pizza.presentation

import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType

sealed interface PizzaDetailsState {
    data object Loading : PizzaDetailsState
    data class Content(
        val pizza: Pizza,
        val selectedSize: SizeType = pizza.sizes.first().type,
        val selectedToppings: Set<IngredientType> = emptySet(),
        val selectedDough: DoughType = pizza.doughs.last().type
    ) : PizzaDetailsState
    data class Error(val message: String) : PizzaDetailsState
}