package com.kicker721.pigeonpizza.pizza.presentation.ui.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import com.kicker721.pigeonpizza.BASE_URL

@Composable
fun CoilImage(url: String, modifier: Modifier) {
    AsyncImage(
        model = BASE_URL + url,
        contentDescription = null,
        modifier = modifier
    )
}