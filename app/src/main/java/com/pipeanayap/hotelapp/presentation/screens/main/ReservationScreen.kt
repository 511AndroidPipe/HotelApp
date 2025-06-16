package com.pipeanayap.hotelapp.presentation.screens.main

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.presentation.Components.Banknote
import com.pipeanayap.hotelapp.presentation.Components.BedDouble
import com.pipeanayap.hotelapp.presentation.Components.HandPlatter
import com.pipeanayap.hotelapp.presentation.Components.People
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.viewmodels.RoomViewModel

@Composable
fun ReservationScreen(innerPadding: PaddingValues, navController: NavController) {

    val viewModel: RoomViewModel = hiltViewModel()

    var rooms by remember { mutableStateOf<List<Room>>(emptyList()) }
    var selectedRoom by remember { mutableStateOf<Room?>(null) }

    LaunchedEffect(Unit) {
        viewModel.roomInfo()
        viewModel.roomEvent.collect { result ->
            Log.i("ReservationScreen", "Recibiendo datos de room: $result")
            rooms = result
            if (selectedRoom == null && result.isNotEmpty()) {
                selectedRoom = result.first() // Primer room por default
            }
        }
    }

    if (selectedRoom != null) {
        val room = selectedRoom!!

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Título
            Row {
                Text(
                    text = "CHOOSE YOUR ROOM",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.headlineMedium
                )
            }

            Spacer(Modifier.height(20.dp))

            // Tipo de habitación dinámico
            Row(Modifier.padding(bottom = 10.dp)) {
                Text(
                    text = room.type ?: "No type",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 22.sp
                )
            }

            // Imagen de habitación
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
            ) {
                AsyncImage(
                    model = room.img,
                    contentDescription = null,
                    placeholder = painterResource(R.drawable.ic_launcher_background),
                    error = painterResource(R.drawable.ic_launcher_background),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            // Botones dinámicos
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp, bottom = 25.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                rooms.forEach { eachRoom ->
                    Box(
                        Modifier
                            .clip(RoundedCornerShape(90.dp))
                            .background(
                                if (eachRoom == room)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.primaryContainer
                            )
                            .height(15.dp)
                            .width(80.dp)
                            .clickable {
                                selectedRoom = eachRoom
                            }
                    )
                }
            }

            // Descripción
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp)
            ) {
                Text(
                    text = "No description available.",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            // Características
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Row(Modifier.padding(bottom = 15.dp)) {
                    Icon(
                        imageVector = BedDouble,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = "bed",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = "Matrimonial Bed",
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }

                Row(Modifier.padding(bottom = 15.dp)) {
                    Icon(
                        imageVector = HandPlatter,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = "restaurant",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(5.dp))
                    Column {
                        room.services.forEach { service ->
                            Text(
                                text = service.name, // Muestra el nombre del servicio
                                color = MaterialTheme.colorScheme.primary,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }

                Row(Modifier.padding(bottom = 15.dp)) {
                    Icon(
                        imageVector = People,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = "people",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = "Suggested for ${2} people",
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }

                Row(Modifier.padding(bottom = 20.dp)) {
                    Icon(
                        imageVector = Banknote,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = "price",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = "\$${room.price ?: 100} USD per night",
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            // Botón SELECT
            Column(
                Modifier
                    .width(190.dp)
                    .height(50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        // Aquí puedes pasar el ID si lo necesitas
                        navController.navigate("${Screens.DetailRegisterScreenRoute}/${room.id}")
                    }
                ) {
                    Text(
                        text = "SELECT",
                        color = MaterialTheme.colorScheme.surface,
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
        }

    } else {
        // Cargando mientras no hay datos
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }
}