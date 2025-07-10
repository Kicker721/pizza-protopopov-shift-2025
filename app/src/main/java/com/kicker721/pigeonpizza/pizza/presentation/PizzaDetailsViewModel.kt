package com.kicker721.pigeonpizza.pizza.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType
import com.kicker721.pigeonpizza.pizza.domain.usecase.GetPizzaByIdUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class PizzaDetailsViewModel(
    private val getPizzaByIdUseCase: GetPizzaByIdUseCase,
    private val pizzaId: String
) : ViewModel() {
    private val _state = MutableStateFlow<PizzaDetailsState>(PizzaDetailsState.Loading)
    val state: StateFlow<PizzaDetailsState> = _state

    fun selectSize(size: SizeType) {
        _state.update { state ->
            if (state is PizzaDetailsState.Content) {
                state.copy(selectedSize = size)
            } else state
        }
    }

    fun selectDough(dough: DoughType) {
        _state.update { state ->
            if (state is PizzaDetailsState.Content) {
                state.copy(selectedDough = dough)
            } else state
        }
    }

    fun selectTopping(topping: IngredientType) {
        _state.update { state ->
            if (state is PizzaDetailsState.Content) {
                val newToppings = if (state.selectedToppings.contains(topping)) {
                    state.selectedToppings - topping
                } else {
                    state.selectedToppings + topping
                }
                state.copy(selectedToppings = newToppings)
            } else state
        }
    }

    fun loadPizzaDetails() {

        _state.value = PizzaDetailsState.Loading

        viewModelScope.launch {
            try {
                val pizza = getPizzaByIdUseCase(pizzaId)
                _state.value = PizzaDetailsState.Content(pizza = pizza)
            } catch (e: Exception) {
                _state.value = PizzaDetailsState.Error(message = e.message.orEmpty())
            }
        }
    }
}