package com.kicker721.pigeonpizza.pizza.presentation.mapper

import com.kicker721.pigeonpizza.R
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.SizeType

fun SizeType.toCentimeters(): Int = when (this) {
    SizeType.SMALL -> 25
    SizeType.MEDIUM -> 30
    SizeType.LARGE -> 35
}

fun SizeType.toStringResource(): Int = when (this) {
    SizeType.SMALL -> R.string.size_small
    SizeType.MEDIUM -> R.string.size_medium
    SizeType.LARGE -> R.string.size_large
}