package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PayScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.ArrowBack,
                contentDescription = "Back Icon"
            )
            Text(
                text = "Payment",
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(0.8f)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(text = "Habitation")
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "Plus+",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$300 USD per night",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        DashedDivider()

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(text = "Dates")
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.DateRange,
                contentDescription = "calendar Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "Fry 6 jun - Sat 21 jun",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$4500 USD per night",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        DashedDivider()

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(text = "Services")
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Face,
                contentDescription = "services Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "Gym",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$25 USD",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        DashedDivider()

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "Spa",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$100 USD",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        DashedDivider()

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "KidsClub",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$200 USD",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        DashedDivider()

        // Espaciador para empujar el Total hacia el fondo
        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Total",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$100 USD",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Composable
fun DashedDivider() {
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .padding(vertical = 6.dp)
    ) {
        drawLine(
            color = Color.Gray,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            strokeWidth = 2f,
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PayScreenPreview() {
    PayScreen()
}
