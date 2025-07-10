package com.kicker721.pigeonpizza.pizza.presentation.mapper

import com.kicker721.pigeonpizza.R
import com.kicker721.pigeonpizza.pizza.domain.entity.enums.DoughType

fun DoughType.toStringResource() : Int = when (this) {
        DoughType.THIN -> R.string.dough_thin
        DoughType.THICK -> R.string.dough_thick
}