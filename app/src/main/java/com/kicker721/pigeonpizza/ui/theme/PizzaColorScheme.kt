package com.kicker721.pigeonpizza.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class PizzaColorScheme(
    val brand: Color = Brand,
    val pressedPrimary: Color = PressedPrimary,
    val hoverPrimary: Color = HoverPrimary,
    val brandExtraLight: Color = BrandExtraLight,

    val textPrimary: Color = TextPrimary,
    val textSecondary: Color = TextSecondary,
    val textTertiary: Color = TextTertiary,
    val textQuaternary: Color = TextQuaternery,
    val textError: Color = TextError,

    val bgPrimary: Color = BgPrimary,
    val bgSecondary: Color = BgSecondary,
    val bgTertiary: Color = BgTertiary,
    val bgDisable: Color = BgDisable
)

val CustomColorScheme = PizzaColorScheme()

val LocalPizzaColorsScheme = staticCompositionLocalOf { PizzaColorScheme() }

val MaterialTheme.pizzaColorScheme: PizzaColorScheme
    @Composable
    @ReadOnlyComposable
    get() = LocalPizzaColorsScheme.current
