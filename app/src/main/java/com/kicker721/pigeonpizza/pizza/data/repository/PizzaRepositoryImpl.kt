package com.kicker721.pigeonpizza.pizza.data.repository

import com.kicker721.pigeonpizza.pizza.data.datasource.PizzaApiDataSource
import com.kicker721.pigeonpizza.pizza.data.converter.PizzaConverter
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.domain.repository.PizzaRepository

class PizzaRepositoryImpl(
    private val pizzaApiDataSource: PizzaApiDataSource,
    private val pizzaConverter: PizzaConverter
) : PizzaRepository {

    override suspend fun getAll(): List<Pizza> {
        val pizzaModels = pizzaApiDataSource.getAll()
        return pizzaModels.map { pizzaConverter.toDomain(it) }
    }

    override suspend fun getById(id: String): Pizza {
        val pizzaModels = pizzaApiDataSource.getAll()
        val pizzas = pizzaModels.map { pizzaConverter.toDomain(it) }
        return pizzas.first { it.id == id }
    }
}