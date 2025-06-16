package com.pipeanayap.hotelapp.presentation.screens.main

import android.app.DatePickerDialog
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.R.drawable.presidencial1
import com.pipeanayap.hotelapp.presentation.Components.Account_balance
import com.pipeanayap.hotelapp.presentation.Components.EditCalendar
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterColorBG
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterDateColor
import com.pipeanayap.hotelapp.presentation.ui.theme.Azulito
import java.util.Calendar

@Composable
fun DetailRegisterScreen(innerPadding: PaddingValues, navController: NavController, roomId: String? = null) {
    val context = LocalContext.current
    val calendar = Calendar.getInstance()

    // Estados para Check-In
    var checkInYear by remember { mutableStateOf(calendar.get(Calendar.YEAR)) }
    var checkInMonth by remember { mutableStateOf(calendar.get(Calendar.MONTH)) }
    var checkInDay by remember { mutableStateOf(calendar.get(Calendar.DAY_OF_MONTH)) }
    var showCheckInPicker by remember { mutableStateOf(false) }

    // Estados para Check-Out
    var checkOutYear by remember { mutableStateOf(calendar.get(Calendar.YEAR)) }
    var checkOutMonth by remember { mutableStateOf(calendar.get(Calendar.MONTH)) }
    var checkOutDay by remember { mutableStateOf(calendar.get(Calendar.DAY_OF_MONTH)) }
    var showCheckOutPicker by remember { mutableStateOf(false) }

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
                "PRESIDENTIAL",
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
            Image(
                painter = painterResource(R.drawable.presidencial1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(40.dp)),
                contentScale = ContentScale.Crop
            )
        }

        // Row para los dos DatePickers
        Row(
            Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            // Check-In
            Box(
                Modifier
                    .padding(top = 15.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(DetailRegisterDateColor)
                    .width(160.dp)
                    .height(30.dp)
                    .clickable { showCheckInPicker = true }
            ) {
                Row(
                    Modifier
                        .padding(6.dp)
                        .padding(start = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Llegada: %02d/%02d/%04d".format(checkInDay, checkInMonth + 1, checkInYear),
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
            Spacer(modifier = Modifier.width(16.dp))
            // Check-Out
            Box(
                Modifier
                    .padding(top = 15.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(DetailRegisterDateColor)
                    .width(160.dp)
                    .height(30.dp)
                    .clickable { showCheckOutPicker = true }
            ) {
                Row(
                    Modifier
                        .padding(6.dp)
                        .padding(start = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Salida: %02d/%02d/%04d".format(checkOutDay, checkOutMonth + 1, checkOutYear),
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

        // DatePickerDialog para Check-In
        if (showCheckInPicker) {
            DatePickerDialog(
                context,
                { _, year, month, dayOfMonth ->
                    checkInYear = year
                    checkInMonth = month
                    checkInDay = dayOfMonth
                    showCheckInPicker = false
                },
                checkInYear,
                checkInMonth,
                checkInDay
            ).apply {
                setOnCancelListener { showCheckInPicker = false }
            }.show()
        }

        // DatePickerDialog para Check-Out
        if (showCheckOutPicker) {
            DatePickerDialog(
                context,
                { _, year, month, dayOfMonth ->
                    checkOutYear = year
                    checkOutMonth = month
                    checkOutDay = dayOfMonth
                    showCheckOutPicker = false
                },
                checkOutYear,
                checkOutMonth,
                checkOutDay
            ).apply {
                setOnCancelListener { showCheckOutPicker = false }
            }.show()
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

        // Boxes de los services | Linea de arriba
        Row(
            Modifier.padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // OutdoorPool
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(75.dp)
                        .height(75.dp)
                        .clip(RoundedCornerShape(60.dp))
                        .border(2.dp, Color.DarkGray, RoundedCornerShape(60.dp))
                ) {
                    Image(
                        painter = painterResource(presidencial1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Outdoor Pool",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            // Gym
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
                    Image(
                        painter = painterResource(presidencial1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Gym",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            // Spa
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
                    Image(
                        painter = painterResource(presidencial1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Spa",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // Boxes de los services | Linea de abajo
        Row(
            Modifier.padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // OpenBar
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
                    Image(
                        painter = painterResource(presidencial1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "OpenBar",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            // KidsClub
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
                        model = "https://tuapi.com/ruta/a/la/imagen.jpg",
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "KidsClub",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(30.dp))
            // MidnightShow
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
                    Image(
                        painter = painterResource(presidencial1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(60.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "MidnightShow",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // Row para el total y el check in
        Row(Modifier.padding(top = 50.dp)) {
            Box(
                Modifier
                    .height(30.dp)
                    .width(120.dp)
                    .clip(RoundedCornerShape(60.dp))
                    .border(
                        2.dp, Color.Gray, RoundedCornerShape(60.dp)
                    ),
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

@Preview
@Composable
fun DetailRegisterScreenPreview() {
    DetailRegisterScreen(
        innerPadding = PaddingValues(20.dp),
        navController = rememberNavController(),
        roomId = "1"
    )
}
