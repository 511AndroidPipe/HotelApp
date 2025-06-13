package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.presentation.Components.Banknote
import com.pipeanayap.hotelapp.presentation.Components.BedDouble
import com.pipeanayap.hotelapp.presentation.Components.HandPlatter
import com.pipeanayap.hotelapp.presentation.Components.Lock
import com.pipeanayap.hotelapp.presentation.Components.People
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme
import okio.AsyncTimeout

@Composable
fun ReservationScreen(innerPadding: PaddingValues){
    var url by remember {
        mutableStateOf("")
    }
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .background(MaterialTheme.colorScheme.background)
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        LaunchedEffect(true) {

        }

        Row {
            Text(
                text = "CHOOSE YOUR ROOM",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineMedium
            )
        }

        Spacer(Modifier.padding(20.dp))

        Row (Modifier.padding(bottom = 10.dp)) {
            Text(
                text = "Standard",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 22.sp
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(20.dp))

        ) {
            AsyncImage(
                model = "https://unsplash.com/es/fotos/ropa-de-cama-blanca-en-la-cama-oxeCZrodz78",
                contentDescription = null,
                placeholder = painterResource(R.drawable.ic_launcher_background),
                error = painterResource(R.drawable.ic_launcher_background),
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 18.dp, bottom = 25.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                Modifier
                    .clip(RoundedCornerShape(90.dp))
                    .background(color = MaterialTheme.colorScheme.primary)
                    .height(15.dp)
                    .width(80.dp)
                    .clickable {

                    }


            ){

            }

            Box(
                Modifier
                    .clip(RoundedCornerShape(90.dp))
                    .background(color = MaterialTheme.colorScheme.primaryContainer)
                    .clip(RoundedCornerShape(20.dp))
                    .height(15.dp)
                    .width(80.dp)
            ){

            }

            Box(
                Modifier
                    .clip(RoundedCornerShape(90.dp))
                    .background(color = MaterialTheme.colorScheme.primaryContainer)
                    .clip(RoundedCornerShape(20.dp))
                    .height(15.dp)
                    .width(80.dp)
            )
            {

            }
        }

        Row (
            Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp)

        ){
            Text(text = "Essential comfort and everything you need for a pleasant stay.",
                color= MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyLarge)

        }

        Column(
            Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
           {

            Row (Modifier.padding(bottom = 15.dp)){

                Icon(
                    imageVector = BedDouble,
                    tint = MaterialTheme.colorScheme.primary,
                    contentDescription = "bed",
                    modifier = Modifier
                        .size(18.dp)
                )

                Spacer(Modifier.padding(5.dp))

                Text(text = "Matrimonial Bed",
                    color= MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyMedium)

            }

           Row (Modifier.padding(bottom = 15.dp)) {

               Icon(
                   imageVector = HandPlatter,
                   tint = MaterialTheme.colorScheme.primary,
                   contentDescription = "restaurant",
                   modifier = Modifier.size(18.dp)
               )

               Spacer(Modifier.padding(5.dp))

               Text(text = "Restaurant (without open bar)",
                   color= MaterialTheme.colorScheme.primary,
                   style = MaterialTheme.typography.bodyMedium)
           }

           Row (Modifier.padding(bottom = 15.dp)) {

               Icon(
                   imageVector = People,
                   tint = MaterialTheme.colorScheme.primary,
                   contentDescription = "restaurant",
                   modifier = Modifier.size(18.dp)
               )

               Spacer(Modifier.padding(5.dp))

               Text(text = "Suggested for 2 people",
                   color= MaterialTheme.colorScheme.primary,
                   style = MaterialTheme.typography.bodyMedium)
           }

           Row (Modifier.padding(bottom = 20.dp))  {

               Icon(
                   imageVector = Banknote,
                   tint = MaterialTheme.colorScheme.primary,
                   contentDescription = "restaurant",
                   modifier = Modifier.size(18.dp)
               )

               Spacer(Modifier.padding(5.dp))

               Text(text = "\$100 USD per night",
                   color= MaterialTheme.colorScheme.primary,
                   style = MaterialTheme.typography.bodyMedium)
           }



           }

        Column(
            Modifier
                .width(190.dp)
                .height(50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {}

            ) {
                Text(
                    text = "SELECT",
                    color= MaterialTheme.colorScheme.surface,
                    style = MaterialTheme.typography.titleMedium
                )
            }
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
