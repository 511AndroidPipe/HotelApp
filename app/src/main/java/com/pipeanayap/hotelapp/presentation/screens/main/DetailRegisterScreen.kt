package com.pipeanayap.hotelapp.presentation.screens.main

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pipeanayap.hotelapp.domain.models.Room
import com.pipeanayap.hotelapp.presentation.Components.Account_balance
import com.pipeanayap.hotelapp.presentation.Components.EditCalendar
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterColorBG
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterDateColor
import com.pipeanayap.hotelapp.presentation.ui.theme.Azulito
import com.pipeanayap.hotelapp.presentation.viewmodels.RoomViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun DetailRegisterScreen(innerPadding: PaddingValues, navController: NavController, roomId: String) {
    val viewModel: RoomViewModel = hiltViewModel()
    Log.i("roomId", roomId)

    var room by remember { mutableStateOf<Room?>(null) }

    LaunchedEffect(Unit) {
        viewModel.roomByiD(roomId)
        viewModel.roomIdEvent.collectLatest { rooms ->
            Log.i("DetailRegisterScreen", "Recibiendo datos de room: $rooms")
            room = rooms.firstOrNull()
            Log.i("DetailRegisterScreen", "Room asignado: $room")
        }
    }

    Column(
        Modifier
            .fillMaxSize()
            .background(DetailRegisterColorBG)
            .padding(innerPadding)
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.padding(top = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = room?.type ?: "Tipo no disponible",
                Modifier
                    .weight(1f)
                    .padding(start = 5.dp)
                    .padding(end = 5.dp),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                letterSpacing = 5.sp
            )

            Icon(
                modifier = Modifier.size(40.dp),
                imageVector = Account_balance,
                contentDescription = null
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .height(130.dp)
                .clip(RoundedCornerShape(40.dp))
                .border(3.dp, Color.DarkGray, RoundedCornerShape(40.dp))
        ) {
            AsyncImage(
                model = room?.img ?: "https://static.vecteezy.com/system/resources/previews/021/282/110/non_2x/loading-bar-icon-in-flat-style-progress-indicator-illustration-on-isolated-background-download-button-sign-business-concept-vector.jpg",
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(40.dp)),
                contentScale = ContentScale.Crop
            )
        }

        Row(
            Modifier.padding(top = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                Modifier
                    .padding(top = 30.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(DetailRegisterDateColor)
                    .width(130.dp)
                    .height(30.dp)
            ) {
                Row(
                    Modifier
                        .padding(6.dp)
                        .padding(start = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "View Dates",
                        Modifier.weight(1f),
                        style = MaterialTheme.typography.titleSmall
                    )

                    Icon(
                        modifier = Modifier
                            .weight(0.5f)
                            .size(20.dp),
                        imageVector = EditCalendar,
                        contentDescription = null
                    )
                }
            }
        }

        Icon(
            modifier = Modifier
                .padding(top = 50.dp)
                .size(120.dp),
            imageVector = EditCalendar,
            contentDescription = null
        )

        Text(
            "SERVICES",
            Modifier.padding(top = 50.dp),
            style = MaterialTheme.typography.titleLarge,
            letterSpacing = 7.sp
        )

        Column(
            Modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
        ) {
            room?.services?.chunked(3)?.forEach { rowServices ->
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    rowServices.forEach { service ->
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(top = 10.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(75.dp)
                                    .height(75.dp)
                                    .clip(RoundedCornerShape(60.dp))
                                    .border(2.dp, Color.Gray, RoundedCornerShape(60.dp))
                            ) {
                                AsyncImage(
                                    model = service.img,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clip(RoundedCornerShape(60.dp)),
                                    contentScale = ContentScale.Crop
                                )
                            }

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = service.name,
                                style = MaterialTheme.typography.bodyMedium,
                                fontSize = 12.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }

        Row(Modifier.padding(top = 50.dp)) {
            Box(
                Modifier
                    .height(30.dp)
                    .width(120.dp)
                    .clip(RoundedCornerShape(60.dp))
                    .border(2.dp, Color.Gray, RoundedCornerShape(60.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("$ TOTAL")
            }

            Spacer(modifier = Modifier.width(50.dp))

            Button(
                onClick = {
                    navController.navigate(Screens.PaymentScreenRoute)
                },
                shape = RoundedCornerShape(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Azulito),
                border = BorderStroke(2.dp, Color.Gray),
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier
                    .height(35.dp)
                    .width(120.dp)
            ) {
                Text(
                    "Check in",
                    color = Color.White
                )
            }
        }
    }
}