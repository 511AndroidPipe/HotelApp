package com.pipeanayap.hotelapp.presentation.screens.main

import android.provider.ContactsContract.Profile
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pipeanayap.hotelapp.domain.models.Reservations
import com.pipeanayap.hotelapp.domain.models.Room
import com.pipeanayap.hotelapp.presentation.components.CardReservations
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme
import com.pipeanayap.hotelapp.presentation.viewmodels.ReservationViewModel
import com.pipeanayap.hotelapp.presentation.viewmodels.RoomViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun ProfileScreen(innerPadding: PaddingValues, navController: NavController) {

    val viewModel: ReservationViewModel = hiltViewModel()

    var reservations by remember { mutableStateOf<List<Reservations>>(emptyList()) }

    LaunchedEffect(Unit) {
        viewModel.profileInfo()
        viewModel.reservationEvent.collect {
            Log.i("ProfileScreen", "Recibiendo datos de reservation: $it")
            reservations = it
        }
    }


    Column(
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(innerPadding)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen de perfil
        Box (
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(60.dp))
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.PermIdentity,
                contentDescription = "Profile Image",
                tint = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.size(80.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Falta traer nombre de la api
        Text(
            text = "John Doe",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Falta traer nombre de la correo
        Text(
            text = "johndoe@example.com",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Mis reservaciones",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )

        CardReservations(reservations = reservations)


        Spacer(modifier = Modifier.height(16.dp))

        // Botón para cerrar sesión
        Button(
            onClick = {
                //Pendiente que pongamos algo que siii te cierre sesion
                navController.navigate(Screens.LoginScreenRoute)
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.error
            )
        ) {
            Text(text = "Cerrar sesión", color = MaterialTheme.colorScheme.onError)
        }
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    HotelAppTheme {
    }
}
