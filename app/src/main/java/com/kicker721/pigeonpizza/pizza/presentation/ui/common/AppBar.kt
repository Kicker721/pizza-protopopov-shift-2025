package com.kicker721.pigeonpizza.pizza.presentation.ui.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kicker721.pigeonpizza.R

@Composable
fun AppBar(onBackClick: (() -> Unit)? = null) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (onBackClick != null) {
            IconButton(onClick = onBackClick) {
                Icon(
                    modifier = Modifier.padding(start = 8.dp),
                    imageVector = Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = "",
                )
            }
        }
        else{
            Spacer(Modifier.width(20.dp))
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 8.dp),
            text = stringResource(id = R.string.pizza),
            style = MaterialTheme.typography.titleLarge,
        )
    }
}