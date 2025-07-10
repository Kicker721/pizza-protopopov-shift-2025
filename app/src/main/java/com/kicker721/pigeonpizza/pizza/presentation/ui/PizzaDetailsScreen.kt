package com.kicker721.pigeonpizza.pizza.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kicker721.pigeonpizza.R
import com.kicker721.pigeonpizza.pizza.domain.entity.Ingredient
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType
import com.kicker721.pigeonpizza.pizza.presentation.PizzaDetailsState
import com.kicker721.pigeonpizza.pizza.presentation.PizzaDetailsViewModel
import com.kicker721.pigeonpizza.pizza.presentation.mapper.toCentimeters
import com.kicker721.pigeonpizza.pizza.presentation.mapper.toStringRes
import com.kicker721.pigeonpizza.pizza.presentation.mapper.toStringResource
import com.kicker721.pigeonpizza.pizza.presentation.ui.common.AppBar
import com.kicker721.pigeonpizza.pizza.presentation.ui.common.CoilImage
import com.kicker721.pigeonpizza.pizza.presentation.ui.common.SegmentedControl
import com.kicker721.pigeonpizza.ui.theme.pizzaColorScheme

@Composable
fun PizzaDetailsScreen(
    onBackClick: () -> Unit,
    viewModel: PizzaDetailsViewModel
) {
    val state by viewModel.state.collectAsState(PizzaDetailsState.Loading)

    LaunchedEffect(Unit) {
        viewModel.loadPizzaDetails()
    }



    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AppBar(onBackClick)

        when (state) {
            is PizzaDetailsState.Loading -> {
                Text(
                    text = stringResource(id = R.string.loading),
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            is PizzaDetailsState.Content -> {
                PizzaDetailsContent(
                    state = state as PizzaDetailsState.Content,
                    onSizeSelected = {
                        viewModel.selectSize(it)
                    },
                    onDoughSelected = {
                        viewModel.selectDough(it)
                    },
                    onToppingSelected = {
                        viewModel.selectTopping(it)
                    }
                )
            }

            is PizzaDetailsState.Error -> {
                Text(
                    text = (state as PizzaDetailsState.Error).message,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(16.dp)
                )

            }
        }
    }
}

@Composable
private fun PizzaDetailsContent(
    state: PizzaDetailsState.Content,
    onSizeSelected: (SizeType) -> Unit = {},
    onDoughSelected: (DoughType) -> Unit = {},
    onToppingSelected: (IngredientType) -> Unit = {},
) {
    val toppingsRows = state.pizza.toppings.chunked(3)
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        contentPadding = PaddingValues(bottom = 80.dp)
    ) {
        item {
            Box(modifier = Modifier.fillMaxWidth()) {
                CoilImage(
                    url = state.pizza.img,
                    modifier = Modifier
                        .size(300.dp)
                        .align(Alignment.Center)
                        .padding(top = 24.dp)
                )
            }

            Text(
                text = state.pizza.name,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(top = 24.dp),
                color = MaterialTheme.pizzaColorScheme.textPrimary
            )

            Text(
                text = stringResource(
                    R.string.size_dough,
                    state.selectedSize.toCentimeters(),
                    stringResource(state.selectedDough.toStringResource())
                ),
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.pizzaColorScheme.textSecondary,
                modifier = Modifier.padding(top = 12.dp)
            )

            Text(
                text = state.pizza.description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.pizzaColorScheme.textSecondary,
                modifier = Modifier.padding(top = 12.dp)
            )

            SegmentedControl(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                items = state.pizza.sizes.map { it -> it.type },
                selectedItem = state.selectedSize,
                onItemSelected = onSizeSelected,
            ) { item, isSelected ->
                Text(
                    text = stringResource(item.toStringResource()),
                    color = if (isSelected) MaterialTheme.pizzaColorScheme.textPrimary else MaterialTheme.pizzaColorScheme.textTertiary,
                    style = MaterialTheme.typography.labelLarge
                )
            }

            SegmentedControl(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                items = state.pizza.doughs.map { it -> it.type },
                selectedItem = state.selectedDough,
                onItemSelected = onDoughSelected,
            ) { item, isSelected ->
                Text(
                    text = stringResource(item.toStringResource()).replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase() else it.toString()
                    },
                    color = if (isSelected) MaterialTheme.pizzaColorScheme.textPrimary else MaterialTheme.pizzaColorScheme.textTertiary,
                    style = MaterialTheme.typography.labelLarge
                )
            }

            Text(
                text = stringResource(R.string.add_topping),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.pizzaColorScheme.textPrimary,
                modifier = Modifier.padding(top = 20.dp)
            )

            Spacer(Modifier.height(15.dp))

        }

        items(toppingsRows) { row ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                for (topping in row) {
                    ToppingItem(
                        topping,
                        modifier = Modifier.weight(1f),
                        onClick = onToppingSelected,
                        isSelected = state.selectedToppings.contains(topping.type)
                    )
                }
                repeat(3 - row.size) {
                    Spacer(Modifier.weight(1f))
                }
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

@Composable
fun ToppingItem(
    topping: Ingredient,
    modifier: Modifier,
    onClick: (topping: IngredientType) -> Unit = {},
    isSelected: Boolean = false
) {
    Card(
        colors = CardColors(
            containerColor = if (isSelected) MaterialTheme.pizzaColorScheme.brandExtraLight else MaterialTheme.pizzaColorScheme.bgPrimary,
            contentColor = MaterialTheme.pizzaColorScheme.bgPrimary,
            disabledContainerColor = MaterialTheme.pizzaColorScheme.bgPrimary,
            disabledContentColor = MaterialTheme.pizzaColorScheme.bgPrimary
        ),
        modifier = modifier
            .shadow(
                elevation = 10.dp,
                shape = CardDefaults.shape,
                ambientColor = MaterialTheme.pizzaColorScheme.textQuaternary,
                spotColor = MaterialTheme.pizzaColorScheme.textQuaternary,
            )
            .height(190.dp)
            .clickable {
                onClick(topping.type)
            },
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {
            CoilImage(topping.img, modifier = Modifier.size(100.dp))

            Text(
                text = stringResource(topping.type.toStringRes()),
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp),
                color = MaterialTheme.pizzaColorScheme.textPrimary
            )

            Text(
                text = stringResource(R.string.price, topping.price),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 8.dp),
                color = MaterialTheme.pizzaColorScheme.textPrimary
            )
        }
    }
}


