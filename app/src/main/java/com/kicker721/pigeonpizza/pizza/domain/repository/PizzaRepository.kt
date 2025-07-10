package com.kicker721.pigeonpizza.pizza.domain.repository

import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza

interface PizzaRepository {
    suspend fun getAll(): List<Pizza>

    suspend fun getById(id: String): Pizza
}