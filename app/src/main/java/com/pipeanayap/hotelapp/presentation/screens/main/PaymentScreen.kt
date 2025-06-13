package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material3.* // Asegúrate de que estás importando Material3
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelLightGray


@OptIn(ExperimentalMaterial3Api::class) // Necesario para SegmentedButton
@Composable
fun PaymentScreen() {
    var cardNumber by remember { mutableStateOf("") }
    // Estado para controlar la selección del tipo de tarjeta
    var selectedCardType by remember { mutableStateOf("Debit Card") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(HotelLightGray)
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp),
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

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(5.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Debit/Credit Card",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .padding(bottom = 16.dp)
                    .padding(horizontal = 24.dp)
            )

            // --- Inicio del SegmentedButton ---
            SingleChoiceSegmentedButtonRow(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                // Ya no es necesario clip aquí si itemShape maneja los bordes
                // .clip(RoundedCornerShape(20.dp))
            ) {
                // Definimos la cantidad total de opciones
                val options = listOf("Debit Card", "Credit Card")

                options.forEachIndexed { index, label ->
                    SegmentedButton(
                        selected = selectedCardType == label,
                        onClick = { selectedCardType = label },
                        // Usamos itemShape para obtener la forma correcta para cada botón
                        shape = SegmentedButtonDefaults.itemShape(index = index, count = options.size),
                        colors = SegmentedButtonDefaults.colors(
                            activeContainerColor = Color.DarkGray, // Color de fondo cuando está seleccionado
                            activeContentColor = Color.LightGray, // Color del texto cuando está seleccionado
                            inactiveContainerColor = Color.LightGray, // Color de fondo cuando no está seleccionado
                            inactiveContentColor = Color.DarkGray // Color del texto cuando no está seleccionado
                        )
                    ) {
                        Text(label)
                    }
                }
            }
            // --- Fin del SegmentedButton ---

            Text(
                text = "Card Number",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(top = 50.dp)
                    .fillMaxWidth()
                    .padding(start = 24.dp)
            )

            OutlinedTextField(
                value = cardNumber,
                onValueChange = {
                    if (it.length <= 16 && it.all { char -> char.isDigit() }) {
                        cardNumber = it
                    }
                },
                placeholder = { Text("Enter Card Number") },
                trailingIcon = {
                    Icon(
                        imageVector = androidx.compose.material.icons.Icons.Default.CreditCard,
                        contentDescription = "Card Icon"
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.LightGray) // Fondo personalizado
                    .fillMaxWidth(0.9f)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(90.dp)
            ) {
                Column(
                    modifier = Modifier.weight(0.25f)
                ) {
                    Text(
                        text = "Expiration Date",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("MM/YY") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.LightGray)
                    )
                }

                Column(
                    modifier = Modifier.weight(0.2f)
                ) {
                    Text(
                        text = "CVV",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text("CVV") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.LightGray)
                    )
                }
            }
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                text = "Card Name",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp)
            )
            OutlinedTextField(
                value = cardNumber, // Aquí podrías usar una variable para el nombre de la tarjeta
                onValueChange = {},
                placeholder = { Text("Enter Card Owner") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), // Generalmente es texto, no número
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.LightGray) // Fondo personalizado
                    .fillMaxWidth(0.9f)
            )
            Spacer(modifier = Modifier.height(60.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = { /* Acción de cancelar */ },
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(20.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.DarkGray
                    )
                ) {
                    Text(
                        text = "Cancel",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }

                Button(
                    onClick = { /* Acción de pago */ },
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(20.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Pay Now",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PaymentScreenPreview() {
    PaymentScreen()
}