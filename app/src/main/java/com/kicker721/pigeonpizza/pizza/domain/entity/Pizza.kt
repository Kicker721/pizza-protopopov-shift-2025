package com.kicker721.pigeonpizza.pizza.domain.entity

data class Pizza(
    val id: String,
    val name: String,
    val ingredients: List<Ingredient>,
    val toppings: List<Topping>,
    val description: String,
    val sizes: List<Size>,
    val doughs: List<Dough>,
    val calories: Long,
    val protein: String,
    val totalFat: String,
    val carbohydrates: String,
    val sodium: String,
    val allergens: List<String>,
    val isVegetarian: Boolean,
    val isGlutenFree: Boolean,
    val isNew: Boolean,
    val isHit: Boolean,
    val img: String,
)

data class Ingredient(
    val type: IngredientType,
    val price: Long,
    val img: String,
)


