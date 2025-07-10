package com.kicker721.pigeonpizza.pizza.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kicker721.pigeonpizza.R
import com.kicker721.pigeonpizza.pizza.presentation.CatalogRoute
import com.kicker721.pigeonpizza.pizza.presentation.DetailsRoute
import com.kicker721.pigeonpizza.pizza.presentation.PizzaCatalogViewModel
import com.kicker721.pigeonpizza.pizza.presentation.PizzaDetailsViewModel
import com.kicker721.pigeonpizza.ui.theme.pizzaColorScheme
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaseScreen(
) {

    val navController = rememberNavController()
    Scaffold(
        containerColor = MaterialTheme.pizzaColorScheme.bgPrimary,
        bottomBar = {
            BottomNavigationBar()
        },
        modifier = Modifier.fillMaxSize(),

        ) { paddingValues: PaddingValues ->
        val noBottomPadding = PaddingValues(
            start = paddingValues.calculateStartPadding(LayoutDirection.Ltr),
            top = paddingValues.calculateTopPadding(),
            end = paddingValues.calculateEndPadding(LayoutDirection.Ltr),
            bottom = 0.dp
        )
        NavHost(
            modifier = Modifier.padding(noBottomPadding),
            navController = navController,
            startDestination = CatalogRoute,
        ) {
            composable<CatalogRoute> {
                val viewModel: PizzaCatalogViewModel = koinViewModel()
                PizzaCatalogScreen(
                    viewModel = viewModel,
                    modifier = Modifier.fillMaxSize(),
                    onItemClick = { pizza ->
                        navController.navigate(
                            DetailsRoute(pizza.id)
                        )
                    }
                )
            }
            composable<DetailsRoute> {
                val destination = it.toRoute<DetailsRoute>()
                val viewModel: PizzaDetailsViewModel = koinViewModel(parameters = {parametersOf(destination.pizzaId)})
                PizzaDetailsScreen(
                    onBackClick = { navController.navigateUp() },
                    viewModel = viewModel,
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    Column(
        modifier = Modifier.offset(y = 20.dp),
    ) {
        HorizontalDivider(
            color = MaterialTheme.pizzaColorScheme.bgSecondary,
            thickness = 1.dp
        )

        NavigationBar(
            containerColor = MaterialTheme.pizzaColorScheme.bgPrimary,
        ) {
            BottomNavbarItem(
                iconResource = R.drawable.pizza,
                selected = true,
                labelResource = R.string.pizza,
                onClick = {}
            )

            BottomNavbarItem(
                iconResource = R.drawable.orders,
                selected = false,
                labelResource = R.string.orders,
                onClick = {}
            )

            BottomNavbarItem(
                iconResource = R.drawable.cart,
                selected = false,
                labelResource = R.string.cart,
                onClick = {}
            )

            BottomNavbarItem(
                iconResource = R.drawable.profile,
                selected = false,
                labelResource = R.string.profile,
                onClick = {}
            )

        }
    }
}

@Composable
private fun RowScope.BottomNavbarItem(
    iconResource: Int = R.drawable.orders,
    labelResource: Int,
    selected: Boolean = false,
    onClick: () -> Unit = {}
) {
    NavigationBarItem(
        colors = NavigationBarItemColors(
            selectedIconColor = MaterialTheme.pizzaColorScheme.brand,
            selectedTextColor = MaterialTheme.pizzaColorScheme.brand,
            selectedIndicatorColor = MaterialTheme.pizzaColorScheme.bgPrimary,
            unselectedIconColor = MaterialTheme.pizzaColorScheme.textQuaternary,
            unselectedTextColor = MaterialTheme.pizzaColorScheme.textQuaternary,
            disabledIconColor = NavigationBarItemDefaults.colors().disabledIconColor,
            disabledTextColor = NavigationBarItemDefaults.colors().disabledTextColor,
        ),

        icon = {
            Icon(
                painter = painterResource(id = iconResource),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        },
        selected = selected,
        onClick = onClick,
        label = {
            Text(
                text = stringResource(labelResource),
                style = MaterialTheme.typography.labelSmall
            )
        }
    )
}