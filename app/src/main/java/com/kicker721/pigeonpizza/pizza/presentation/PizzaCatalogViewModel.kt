package com.kicker721.pigeonpizza.pizza.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kicker721.pigeonpizza.pizza.domain.usecase.GetPizzaCatalogUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PizzaCatalogViewModel(
    private val getPizzaCatalogUseCase: GetPizzaCatalogUseCase,
) : ViewModel() {
    private val _state = MutableStateFlow<PizzaCatalogState>(PizzaCatalogState.Loading)
    val state: StateFlow<PizzaCatalogState> = _state

    fun loadPizzas() {
        viewModelScope.launch {
            try {
                val pizzas = getPizzaCatalogUseCase()
                _state.value = PizzaCatalogState.Content(pizzas)
            } catch (e: Exception) {
                _state.value = PizzaCatalogState.Error(e.message)
            }
        }
    }
}