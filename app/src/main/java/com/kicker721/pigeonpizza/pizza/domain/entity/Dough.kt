package com.kicker721.pigeonpizza.pizza.domain.entity

import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType

data class Dough(
    val type: DoughType,
    val price: Int,
)