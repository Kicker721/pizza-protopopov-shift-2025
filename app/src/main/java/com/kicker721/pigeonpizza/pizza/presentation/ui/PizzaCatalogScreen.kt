package com.kicker721.pigeonpizza.pizza.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.presentation.PizzaCatalogState

@Composable
fun PizzaCatalogScreen(state: PizzaCatalogState, modifier: Modifier) {
    when (state) {
        is PizzaCatalogState.Loading -> Text(
            text = "Загрузка...",
            modifier = modifier
        )

        is PizzaCatalogState.Error -> Text(
            text = "Ошибка: ${state.message}",
            modifier = modifier
        )

        is PizzaCatalogState.Success -> {
            LazyColumn(
                modifier = modifier
            ) {
                state.pizzas.forEach { pizza ->
                    item { PizzaCatalogItem(pizza) }
                }
            }
        }
    }
}

@Composable
fun PizzaCatalogItem(pizza: Pizza) {
    Row(Modifier.padding(vertical = 8.dp)) {
        AsyncImage(
            model = "https://shift-intensive.ru/api" + pizza.img,
            contentDescription = null,
            modifier = Modifier.size(130.dp)
        )
        Column(Modifier.padding(start = 16.dp)) {
            Text(
                text = pizza.name,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = pizza.description,
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = "от ${pizza.getBasePrice()} ₽"
            )
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun PizzaCatalogScreenPreview() {
//    PizzaCatalogScreen(MockPizzaDataSource.pizzas,)
//}