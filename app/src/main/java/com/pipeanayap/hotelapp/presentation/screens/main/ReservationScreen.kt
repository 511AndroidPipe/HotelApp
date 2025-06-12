package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme

@Composable
fun ReservationScreen(innerPadding: PaddingValues){

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .background(MaterialTheme.colorScheme.background)
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Row {
            Text(
                text = "CHOOSE YOUR ROOM",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge
            )
        }

        Spacer(Modifier.padding(20.dp))

        Row {
            Text(
                text = "Standard",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyLarge
            )
        }








    }


}

@Preview
@Composable
fun ReservationScreenPreview(){
    HotelAppTheme {
        ReservationScreen(innerPadding = PaddingValues(20.dp))
    }


}
