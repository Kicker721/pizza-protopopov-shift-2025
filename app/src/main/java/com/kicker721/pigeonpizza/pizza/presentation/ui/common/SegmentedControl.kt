package com.kicker721.pigeonpizza.pizza.presentation.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kicker721.pigeonpizza.ui.theme.pizzaColorScheme

@Composable
fun <T> SegmentedControl(
    modifier: Modifier = Modifier,
    items: List<T>,
    selectedItem: T,
    onItemSelected: (T) -> Unit,
    itemContent: @Composable (item: T, isSelected: Boolean) -> Unit
) {
    Row(
        modifier = modifier
            .background(MaterialTheme.pizzaColorScheme.bgSecondary, RoundedCornerShape(12.dp))
            .padding(2.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        items.forEachIndexed { index, item ->
            val isSelected = item == selectedItem
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (isSelected) MaterialTheme.pizzaColorScheme.bgPrimary else Color.Transparent)
                    .clickable { onItemSelected(item) }
                    .padding(vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                itemContent(item, isSelected)
            }
        }
    }
}