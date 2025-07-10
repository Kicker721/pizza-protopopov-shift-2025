package com.kicker721.pigeonpizza.pizza.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kicker721.pigeonpizza.R
import com.kicker721.pigeonpizza.pizza.data.datasource.MockPizzaDataSource
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.presentation.PizzaCatalogState
import com.kicker721.pigeonpizza.pizza.presentation.PizzaCatalogViewModel
import com.kicker721.pigeonpizza.pizza.presentation.ui.common.AppBar
import com.kicker721.pigeonpizza.pizza.presentation.ui.common.CoilImage
import com.kicker721.pigeonpizza.ui.theme.pizzaColorScheme

@Composable
fun PizzaCatalogScreen(
    viewModel: PizzaCatalogViewModel, modifier: Modifier,
    onItemClick: (Pizza) -> Unit
) {
    LaunchedEffect(Unit) {
        viewModel.loadPizzas()
    }

    val state by viewModel.state.collectAsState(PizzaCatalogState.Loading)
    Column {
        AppBar()

        when (val currentState = state) {
            is PizzaCatalogState.Loading -> LoadingScreen(modifier)

            is PizzaCatalogState.Error -> ErrorScreen(currentState, modifier)

            is PizzaCatalogState.Content -> {
                Content(modifier, currentState.pizzas, onItemClick)
            }
        }
    }

}

@Composable
private fun Content(
    modifier: Modifier,
    pizzas: List<Pizza>,
    onItemClick: (Pizza) -> Unit
) {
    LazyColumn(
        modifier = modifier
            .padding(start = 24.dp, end = 24.dp, top = 24.dp),
        contentPadding = PaddingValues(bottom = 80.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(pizzas, key = { it.id }) { pizza ->
            PizzaCatalogItem(pizza, onItemClick)
        }
    }
}

@Composable
private fun ErrorScreen(
    state: PizzaCatalogState.Error,
    modifier: Modifier
) {
    Box(contentAlignment = Alignment.Center) {
        Text(
            text = stringResource(
                R.string.pizza_loading_error,
                state.message ?: stringResource(R.string.unknown_error)
            ),
            modifier = modifier
        )
    }
}

@Composable
private fun LoadingScreen(modifier: Modifier) {
    Box(contentAlignment = Alignment.Center) {

        Text(
            text = stringResource(R.string.loading),
            modifier = modifier
        )
    }
}

@Composable
fun PizzaCatalogItem(pizza: Pizza, onClick: (Pizza) -> Unit) {
    Row(
        Modifier
            .clickable(onClick = { onClick(pizza) })
    ) {
        CoilImage(
            url = pizza.img,
            modifier = Modifier.size(130.dp),
        )
        Column(Modifier.padding(start = 16.dp, top = 8.dp)) {
            Text(
                text = pizza.name,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = pizza.description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.pizzaColorScheme.textSecondary
            )

            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = stringResource(R.string.price_from, pizza.getBasePrice()),
                style = MaterialTheme.typography.bodyLarge

            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PizzaCatalogScreenPreview() {
    Content(
        Modifier.padding(8.dp),
        pizzas = MockPizzaDataSource.pizzas
    ) {}
}