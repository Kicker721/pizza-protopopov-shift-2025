package com.kicker721.pigeonpizza.pizza.presentation

import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza

sealed interface PizzaCatalogState {
    object Loading : PizzaCatalogState
    data class Content(val pizzas: List<Pizza>) : PizzaCatalogState
    data class Error(val message: String?) : PizzaCatalogState
}