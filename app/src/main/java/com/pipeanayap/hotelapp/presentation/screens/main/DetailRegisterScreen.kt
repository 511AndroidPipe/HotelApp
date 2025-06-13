package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.presentation.Components.Account_balance
import com.pipeanayap.hotelapp.presentation.Components.EditCalendar
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterColorBG
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterDateColor
import com.pipeanayap.hotelapp.presentation.ui.theme.DetailRegisterDateColor
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme

@Composable
fun DetailRegisterScreen(innerPadding: PaddingValues){
    Column(Modifier.fillMaxSize()
        .background(DetailRegisterColorBG)
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){

            Row(Modifier.padding(top=5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Text("PRESIDENCIAL",
                    Modifier.weight(1f).padding(start = 5.dp).padding(end = 5.dp),
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 7.sp)

                // El Icon Pa
                Icon(modifier = Modifier.size(40.dp),
                    imageVector = Account_balance,
                    contentDescription = null)
            }

            // Esta box es para la imagen
            Box(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
                    .height(130.dp)
                    .clip(RoundedCornerShape(40.dp))
            ) {
                Image(
                    painter = painterResource(R.drawable.presidencial1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(40.dp)), // también se recorta
                    contentScale = ContentScale.Crop
                )
            }

            // Box del boton de las dates
            Row(Modifier.padding(top=5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){
                Box(Modifier
                    .padding(top = 30.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(DetailRegisterDateColor)
                    .width(130.dp)
                    .height(30.dp)){
                    Row(Modifier.padding(6.dp).padding(start = 5.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center){
                        Text("View Dates", Modifier.weight(1f),
                            style = MaterialTheme.typography.titleSmall)

                        // Otro Icon Pa
                        Icon(modifier = Modifier.weight(0.5f).size(20.dp),
                            imageVector = EditCalendar,
                            contentDescription = null)

                    }
                }
            }


        }



}



@Preview
@Composable
fun DetailRegisterScreenPreview() {
    HotelAppTheme {
        DetailRegisterScreen(innerPadding = PaddingValues(20.dp))

    }
}
