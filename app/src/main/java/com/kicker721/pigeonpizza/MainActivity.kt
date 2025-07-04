package com.kicker721.pigeonpizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.kicker721.pigeonpizza.pizza.data.converter.PizzaConverter
import com.kicker721.pigeonpizza.pizza.data.datasource.PizzaApiDataSource
import com.kicker721.pigeonpizza.pizza.data.repository.PizzaRepositoryImpl
import com.kicker721.pigeonpizza.pizza.domain.usecase.GetPizzaCatalogUseCase
import com.kicker721.pigeonpizza.pizza.presentation.PizzaCatalogViewModel
import com.kicker721.pigeonpizza.pizza.presentation.ui.PizzaCatalogScreen
import com.kicker721.pigeonpizza.ui.theme.PigeonPizzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val viewModel = PizzaCatalogViewModel(
            GetPizzaCatalogUseCase(
                PizzaRepositoryImpl(
                    PizzaApiDataSource(),
                    PizzaConverter()
                )
            )
        )

        setContent {
            PigeonPizzaTheme {
                val state by viewModel.state.collectAsState()

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    PizzaCatalogScreen(
                        state = state,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

    }
}
