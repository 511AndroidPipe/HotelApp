package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.presentation.Components.BedDouble
import com.pipeanayap.hotelapp.presentation.Components.HotelSection
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme

@Composable
fun MenuScreen(innerPadding: PaddingValues) {

    val navController = rememberNavController()



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .verticalScroll(rememberScrollState()) // ✅ Hacemos scrollable
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,

        ){
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
                letterSpacing = 5.sp,
                modifier = Modifier
                    .weight(1f)
            )

            Box(
                Modifier.clickable {

                    navController.navigate(Screens.ProfileScreenRoute)

                }
            ){
                Icon(
                    imageVector = Icons.Default.PermIdentity,
                    tint = MaterialTheme.colorScheme.primary,
                    contentDescription = "bed",
                    modifier = Modifier.size(32.dp)
                )

            }

        }
        // Título del hotel


        // Sección 1: Playa
        HotelSection(
            imageUrl = "https://digital.ihg.com/is/image/ihg/independent-riviera-nayarit-8183845171-2x1",
            title = "Our Private Beach",
            description = "Relax on the beautiful sandy beach with crystal clear waters and personalized service."
        )

        // Sección 2: Piscina
        HotelSection(
            imageUrl = "https://media-cdn.tripadvisor.com/media/photo-s/10/3f/60/d9/pool-bar-marea-iberostar.jpg",
            title = "Infinity Pool",
            description = "Take a dip in our stunning infinity pool with ocean views and poolside cocktails."
        )

        // Sección 3: Gastronomía
        HotelSection(
            imageUrl = "https://digital.ihg.com/is/image/ihg/independent-riviera-nayarit-8537181761-2x1",
            title = "Gourmet Dining",
            description = "Indulge in world-class cuisine at our exclusive restaurants and bars."
        )

        // Sección 4: Spa
        HotelSection(
            imageUrl = "https://www.aladinia.com/blog/wp-content/uploads/2018/04/7-circuito-spa.jpg",
            title = "Luxury Spa",
            description = "Pamper yourself with rejuvenating treatments and massages in our luxury spa."
        )

        // Puedes agregar más secciones similares aquí
    }
}

@Preview
@Composable
fun MenuScreenPreview(){
    HotelAppTheme {
        MenuScreen(innerPadding = PaddingValues(20.dp))
    }
}
