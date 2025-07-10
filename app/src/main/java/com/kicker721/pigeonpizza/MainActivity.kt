package com.kicker721.pigeonpizza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import com.kicker721.pigeonpizza.pizza.presentation.ui.BaseScreen
import com.kicker721.pigeonpizza.ui.theme.PigeonPizzaTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PigeonPizzaTheme {

                BaseScreen()
            }
        }

    }
}
