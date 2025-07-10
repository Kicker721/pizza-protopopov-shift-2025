package com.kicker721.pigeonpizza.pizza.data.converter

import com.kicker721.pigeonpizza.pizza.data.model.DoughModel
import com.kicker721.pigeonpizza.pizza.data.model.IngredientModel
import com.kicker721.pigeonpizza.pizza.data.model.PizzaModel
import com.kicker721.pigeonpizza.pizza.data.model.SizeModel
import com.kicker721.pigeonpizza.pizza.domain.entity.Dough
import com.kicker721.pigeonpizza.pizza.domain.entity.Ingredient
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.domain.entity.Size
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType

class PizzaConverter {

    fun toDomain(pizzaModel: PizzaModel): Pizza {
        return Pizza(
            id = pizzaModel.id,
            name = pizzaModel.name,
            ingredients = pizzaModel.ingredients.map { toDomain(it) },
            toppings = pizzaModel.toppings.map { toDomain(it) },
            description = pizzaModel.description,
            sizes = pizzaModel.sizes.map { toDomain(it) },
            doughs = pizzaModel.doughs.map { toDomain(it) },
            calories = pizzaModel.calories,
            protein = pizzaModel.protein,
            totalFat = pizzaModel.totalFat,
            carbohydrates = pizzaModel.carbohydrates,
            sodium = pizzaModel.sodium,
            allergens = pizzaModel.allergens,
            isVegetarian = pizzaModel.isVegetarian,
            isGlutenFree = pizzaModel.isGlutenFree,
            isNew = pizzaModel.isNew,
            isHit = pizzaModel.isHit,
            img = pizzaModel.img
        )
    }

    private fun toDomain(ingredientModel: IngredientModel): Ingredient {
        return Ingredient(
            type = IngredientType.valueOf(ingredientModel.type),
            price = ingredientModel.price,
            img = ingredientModel.img
        )
    }

    private fun toDomain(sizeModel: SizeModel): Size {
        return Size(
            type = SizeType.valueOf(sizeModel.type),
            price = sizeModel.price
        )
    }

    private fun toDomain(doughModel: DoughModel): Dough {
        return Dough(
            type = DoughType.valueOf(doughModel.type),
            price = doughModel.price
        )
    }
}