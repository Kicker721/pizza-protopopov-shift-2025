package com.kicker721.pigeonpizza.pizza.domain.entity

import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType

data class Size(
    val type: SizeType,
    val price: Long,
)