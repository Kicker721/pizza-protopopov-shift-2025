package com.kicker721.pigeonpizza.pizza.data.datasource

import com.kicker721.pigeonpizza.pizza.domain.entity.Dough
import com.kicker721.pigeonpizza.pizza.domain.entity.Ingredient
import com.kicker721.pigeonpizza.pizza.domain.entity.Pizza
import com.kicker721.pigeonpizza.pizza.domain.entity.Size
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.IngredientType
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType

object MockPizzaDataSource {
    val pizzas = listOf(
        Pizza(
            id = "1",
            name = "ШИФТ Суприм",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.PEPERONI,
                    price = 120,
                    img = "/static/images/ingredient/peperoni.png"
                ),
                Ingredient(
                    type = IngredientType.GREEN_PEPPER,
                    price = 60,
                    img = "/static/images/ingredient/green_pepper.png"
                ),
                Ingredient(
                    type = IngredientType.MUSHROOMS,
                    price = 80,
                    img = "/static/images/ingredient/mushrooms.png"
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Шифт пицца с пепперони, колбасой, зеленым перцем, луком, оливками и шампиньонами.",
            sizes = listOf(
                Size(SizeType.SMALL, 499),
                Size(SizeType.MEDIUM, 799),
                Size(SizeType.LARGE, 1149)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 320,
            protein = "18г",
            totalFat = "15г",
            carbohydrates = "28г",
            sodium = "860мг",
            allergens = listOf("молоко", "пшеница", "соевые бобы"),
            isVegetarian = false,
            isGlutenFree = false,
            isNew = false,
            isHit = true,
            img = "/static/images/pizza/1.webp"
        ),
        Pizza(
            id = "2",
            name = "Маргарита",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.BASIL,
                    price = 40,
                    img = "/static/images/ingredient/basil.png"
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Классическая пицца с томатным соусом, моцареллой и листьями базилика.",
            sizes = listOf(
                Size(SizeType.SMALL, 449),
                Size(SizeType.MEDIUM, 749),
                Size(SizeType.LARGE, 1099)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 250,
            protein = "12г",
            totalFat = "10г",
            carbohydrates = "20г",
            sodium = "650мг",
            allergens = listOf("молоко", "пшеница"),
            isVegetarian = true,
            isGlutenFree = false,
            isNew = false,
            isHit = false,
            img = "/static/images/pizza/2.webp"
        ),
        Pizza(
            id = "3",
            name = "Четыре Сыра",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.CHEDDAR,
                    price = 90,
                    img = "/static/images/ingredient/cheddar.png"
                ),
                Ingredient(
                    type = IngredientType.PARMESAN,
                    price = 90,
                    img = "/static/images/ingredient/green_pepper.png" // вероятно, нужно заменить на правильную картинку для пармезана
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Пицца с миксом моцареллы, чеддера, пармезана и феты.",
            sizes = listOf(
                Size(SizeType.SMALL, 549),
                Size(SizeType.MEDIUM, 849),
                Size(SizeType.LARGE, 1249)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 380,
            protein = "20г",
            totalFat = "18г",
            carbohydrates = "30г",
            sodium = "780мг",
            allergens = listOf("молоко", "пшеница"),
            isVegetarian = true,
            isGlutenFree = false,
            isNew = true,
            isHit = false,
            img = "/static/images/pizza/3.webp"
        ),
        Pizza(
            id = "4",
            name = "ШИФТ Суприм",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.PEPERONI,
                    price = 120,
                    img = "/static/images/ingredient/peperoni.png"
                ),
                Ingredient(
                    type = IngredientType.GREEN_PEPPER,
                    price = 60,
                    img = "/static/images/ingredient/green_pepper.png"
                ),
                Ingredient(
                    type = IngredientType.MUSHROOMS,
                    price = 80,
                    img = "/static/images/ingredient/mushrooms.png"
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Шифт пицца с пепперони, колбасой, зеленым перцем, луком, оливками и шампиньонами.",
            sizes = listOf(
                Size(SizeType.SMALL, 499),
                Size(SizeType.MEDIUM, 799),
                Size(SizeType.LARGE, 1149)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 320,
            protein = "18г",
            totalFat = "15г",
            carbohydrates = "28г",
            sodium = "860мг",
            allergens = listOf("молоко", "пшеница", "соевые бобы"),
            isVegetarian = false,
            isGlutenFree = false,
            isNew = false,
            isHit = true,
            img = "/static/images/pizza/1.webp"
        ),
        Pizza(
            id = "5",
            name = "Маргарита",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.BASIL,
                    price = 40,
                    img = "/static/images/ingredient/basil.png"
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Классическая пицца с томатным соусом, моцареллой и листьями базилика.",
            sizes = listOf(
                Size(SizeType.SMALL, 449),
                Size(SizeType.MEDIUM, 749),
                Size(SizeType.LARGE, 1099)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 250,
            protein = "12г",
            totalFat = "10г",
            carbohydrates = "20г",
            sodium = "650мг",
            allergens = listOf("молоко", "пшеница"),
            isVegetarian = true,
            isGlutenFree = false,
            isNew = false,
            isHit = false,
            img = "/static/images/pizza/2.webp"
        ),
        Pizza(
            id = "6",
            name = "Четыре Сыра",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.CHEDDAR,
                    price = 90,
                    img = "/static/images/ingredient/cheddar.png"
                ),
                Ingredient(
                    type = IngredientType.PARMESAN,
                    price = 90,
                    img = "/static/images/ingredient/green_pepper.png" // вероятно, нужно заменить на правильную картинку для пармезана
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Пицца с миксом моцареллы, чеддера, пармезана и феты.",
            sizes = listOf(
                Size(SizeType.SMALL, 549),
                Size(SizeType.MEDIUM, 849),
                Size(SizeType.LARGE, 1249)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 380,
            protein = "20г",
            totalFat = "18г",
            carbohydrates = "30г",
            sodium = "780мг",
            allergens = listOf("молоко", "пшеница"),
            isVegetarian = true,
            isGlutenFree = false,
            isNew = true,
            isHit = false,
            img = "/static/images/pizza/3.webp"
        ),
        Pizza(
            id = "7",
            name = "ШИФТ Суприм",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.PEPERONI,
                    price = 120,
                    img = "/static/images/ingredient/peperoni.png"
                ),
                Ingredient(
                    type = IngredientType.GREEN_PEPPER,
                    price = 60,
                    img = "/static/images/ingredient/green_pepper.png"
                ),
                Ingredient(
                    type = IngredientType.MUSHROOMS,
                    price = 80,
                    img = "/static/images/ingredient/mushrooms.png"
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Шифт пицца с пепперони, колбасой, зеленым перцем, луком, оливками и шампиньонами.",
            sizes = listOf(
                Size(SizeType.SMALL, 499),
                Size(SizeType.MEDIUM, 799),
                Size(SizeType.LARGE, 1149)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 320,
            protein = "18г",
            totalFat = "15г",
            carbohydrates = "28г",
            sodium = "860мг",
            allergens = listOf("молоко", "пшеница", "соевые бобы"),
            isVegetarian = false,
            isGlutenFree = false,
            isNew = false,
            isHit = true,
            img = "/static/images/pizza/1.webp"
        ),
        Pizza(
            id = "8",
            name = "Маргарита",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.BASIL,
                    price = 40,
                    img = "/static/images/ingredient/basil.png"
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Классическая пицца с томатным соусом, моцареллой и листьями базилика.",
            sizes = listOf(
                Size(SizeType.SMALL, 449),
                Size(SizeType.MEDIUM, 749),
                Size(SizeType.LARGE, 1099)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 250,
            protein = "12г",
            totalFat = "10г",
            carbohydrates = "20г",
            sodium = "650мг",
            allergens = listOf("молоко", "пшеница"),
            isVegetarian = true,
            isGlutenFree = false,
            isNew = false,
            isHit = false,
            img = "/static/images/pizza/2.webp"
        ),
        Pizza(
            id = "9",
            name = "Четыре Сыра",
            ingredients = listOf(
                Ingredient(
                    type = IngredientType.MOZZARELLA,
                    price = 70,
                    img = "/static/images/ingredient/mozzarella.png"
                ),
                Ingredient(
                    type = IngredientType.CHEDDAR,
                    price = 90,
                    img = "/static/images/ingredient/cheddar.png"
                ),
                Ingredient(
                    type = IngredientType.PARMESAN,
                    price = 90,
                    img = "/static/images/ingredient/green_pepper.png" // вероятно, нужно заменить на правильную картинку для пармезана
                )
            ),
            toppings = listOf(
                Ingredient(IngredientType.PINEAPPLE, 80, "/static/images/ingredient/pineapple.png"),
                Ingredient(IngredientType.GREEN_PEPPER, 60, "/static/images/ingredient/green_pepper.png"),
                Ingredient(IngredientType.MUSHROOMS, 80, "/static/images/ingredient/mushrooms.png"),
                Ingredient(IngredientType.BACON, 80, "/static/images/ingredient/bacon.png"),
                Ingredient(IngredientType.SHRIMPS, 80, "/static/images/ingredient/shrimps.png"),
                Ingredient(IngredientType.HAM, 80, "/static/images/ingredient/ham.png"),
                Ingredient(IngredientType.MOZZARELLA, 70, "/static/images/ingredient/mozzarella.png"),
                Ingredient(IngredientType.PEPERONI, 120, "/static/images/ingredient/peperoni.png"),
                Ingredient(IngredientType.CHICKEN_FILLET, 80, "/static/images/ingredient/chicken_fillet.png"),
                Ingredient(IngredientType.ONION, 80, "/static/images/ingredient/onion.png"),
                Ingredient(IngredientType.BASIL, 80, "/static/images/ingredient/basil.png"),
                Ingredient(IngredientType.CHILE, 80, "/static/images/ingredient/chile.png"),
                Ingredient(IngredientType.CHEDDAR, 80, "/static/images/ingredient/cheddar.png"),
                Ingredient(IngredientType.MEATBALLS, 80, "/static/images/ingredient/meatballs.png"),
                Ingredient(IngredientType.PICKLE, 80, "/static/images/ingredient/pickle.png"),
                Ingredient(IngredientType.TOMATO, 80, "/static/images/ingredient/tomato.png"),
                Ingredient(IngredientType.FETA, 80, "/static/images/ingredient/feta.png")
            ),
            description = "Пицца с миксом моцареллы, чеддера, пармезана и феты.",
            sizes = listOf(
                Size(SizeType.SMALL, 549),
                Size(SizeType.MEDIUM, 849),
                Size(SizeType.LARGE, 1249)
            ),
            doughs = listOf(
                Dough(DoughType.THIN, 0),
                Dough(DoughType.THICK, 50)
            ),
            calories = 380,
            protein = "20г",
            totalFat = "18г",
            carbohydrates = "30г",
            sodium = "780мг",
            allergens = listOf("молоко", "пшеница"),
            isVegetarian = true,
            isGlutenFree = false,
            isNew = true,
            isHit = false,
            img = "/static/images/pizza/3.webp"
        )

    )
}