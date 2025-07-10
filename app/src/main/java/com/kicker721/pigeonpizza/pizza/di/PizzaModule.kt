package com.kicker721.pigeonpizza.pizza.di

import com.kicker721.pigeonpizza.pizza.data.converter.PizzaConverter
import com.kicker721.pigeonpizza.pizza.data.datasource.PizzaApiDataSource
import com.kicker721.pigeonpizza.pizza.data.repository.PizzaRepositoryImpl
import com.kicker721.pigeonpizza.pizza.domain.repository.PizzaRepository
import com.kicker721.pigeonpizza.pizza.domain.usecase.GetPizzaByIdUseCase
import com.kicker721.pigeonpizza.pizza.domain.usecase.GetPizzaCatalogUseCase
import com.kicker721.pigeonpizza.pizza.presentation.PizzaCatalogViewModel
import com.kicker721.pigeonpizza.pizza.presentation.PizzaDetailsViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val pizzaModule = module {
    single<PizzaApiDataSource> { PizzaApiDataSource() }
    single<PizzaConverter> { PizzaConverter() }
    single<PizzaRepository> { PizzaRepositoryImpl(get(), get()) }
    factory { GetPizzaByIdUseCase(get()) }
    factory { GetPizzaCatalogUseCase(get()) }
    viewModel { PizzaCatalogViewModel(get()) }
    viewModel { (pizzaId: String) ->
        PizzaDetailsViewModel(
            get(), pizzaId
        )
    }
}