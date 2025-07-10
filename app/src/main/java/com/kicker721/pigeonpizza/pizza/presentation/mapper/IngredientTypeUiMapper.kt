package com.kicker721.pigeonpizza.pizza.presentation.mapper

import com.kicker721.pigeonpizza.R
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType

fun IngredientType.toStringRes(): Int = when (this) {
    IngredientType.PINEAPPLE -> R.string.ingredient_pineapple
    IngredientType.MOZZARELLA -> R.string.ingredient_mozzarella
    IngredientType.PEPERONI -> R.string.ingredient_pepperoni
    IngredientType.GREEN_PEPPER -> R.string.ingredient_green_pepper
    IngredientType.MUSHROOMS -> R.string.ingredient_mushrooms
    IngredientType.BASIL -> R.string.ingredient_basil
    IngredientType.CHEDDAR -> R.string.ingredient_cheddar
    IngredientType.PARMESAN -> R.string.ingredient_parmesan
    IngredientType.FETA -> R.string.ingredient_feta
    IngredientType.HAM -> R.string.ingredient_ham
    IngredientType.PICKLE -> R.string.ingredient_pickle
    IngredientType.TOMATO -> R.string.ingredient_tomato
    IngredientType.BACON -> R.string.ingredient_bacon
    IngredientType.ONION -> R.string.ingredient_onion
    IngredientType.CHILE -> R.string.ingredient_chile
    IngredientType.SHRIMPS -> R.string.ingredient_shrimps
    IngredientType.CHICKEN_FILLET -> R.string.ingredient_chicken_fillet
    IngredientType.MEATBALLS -> R.string.ingredient_meatballs
}