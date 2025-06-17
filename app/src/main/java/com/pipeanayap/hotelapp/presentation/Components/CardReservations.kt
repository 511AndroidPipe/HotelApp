package com.pipeanayap.hotelapp.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pipeanayap.hotelapp.domain.models.Reservations

@Composable
fun CardReservations(reservations: List<Reservations>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        reservations.forEach { reservation ->
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Habitación: ${reservation.idRoom}",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Check-In: ${reservation.datetime}",
                        style = MaterialTheme.typography.bodyMedium
                    )

                }
            }
        }
    }
}
