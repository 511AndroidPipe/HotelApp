package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.tooling.preview.Preview

@Composable

fun PayScreen() {
    Column {
        Text(text = "Habitación")
        Icon(
            imageVector = androidx.compose.material.icons.Icons.Default.Home,
            contentDescription = "Home Icon"
        )

        Text(
            text = ""
        )


    }
}

@Composable
@Preview
fun PayScreenPreview() {
    // This is a preview of the PayScreen composable function.
    // It allows you to see how the screen looks in the design view.
    PayScreen()
}