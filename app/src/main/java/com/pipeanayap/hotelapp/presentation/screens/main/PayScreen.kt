package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelBlue
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelDarkGray
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelLightGray
import com.pipeanayap.hotelapp.presentation.navigation.Screens

@Composable
fun PaymentScreen(
    navController: NavController,
    type: String,
    checkInDate: String,
    checkOutDate: String,
    services: String,
    price: Float
) {
    fun formatPrice(price: Double): String {
        return "$${"%.2f".format(price)} USD"
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(HotelLightGray)
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back Icon"
            )
            Spacer(modifier = Modifier.weight(1f)) // Empuja el texto al centro
            Text(
                text = "Payment",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.weight(1.2f)) // Compensa visualmente al ícono
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "HABITATION",
                style = MaterialTheme.typography.labelSmall
            )
            Icon(
                imageVector = Icons.Default.Home,
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
                color = HotelDarkGray,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$300 USD per night",
                style = MaterialTheme.typography.labelLarge
            )
        }

        DashedDivider()

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "DATES",
                style = MaterialTheme.typography.labelSmall,
            )
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "calendar Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "Fri 6 jun - Sat 21 jun",
                style = MaterialTheme.typography.bodyLarge,
                color = HotelDarkGray,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$4500 USD per night",
                style = MaterialTheme.typography.labelLarge
            )
        }

        DashedDivider()

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "SERVICES",
                style = MaterialTheme.typography.labelSmall
            )
            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = "services Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        services.forEach { (services) ->
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(top = 30.dp)
            ) {
                Text(
                    text = services,
                    style = MaterialTheme.typography.bodyLarge,
                    color = HotelDarkGray,
                    modifier = Modifier.weight(1f)
                )
            DashedDivider()
        }


        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "TOTAL",
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$100 USD",
                style = MaterialTheme.typography.labelLarge
            )

        }


        Button(
            onClick = {navController.navigate(Screens.PaymentScreenRoute)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = HotelBlue)
        ) {
            Text(
                text = "Credit/Debit Card",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
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
            color = Color.Black,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            strokeWidth = 2f,
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
        )
    }
}


