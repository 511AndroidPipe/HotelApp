import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pipeanayap.hotelapp.domain.models.Room
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelBlue
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelDarkGray
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelLightGray
import com.pipeanayap.hotelapp.presentation.navigation.Screens

@Composable
fun PayScreen(
    innerPadding : PaddingValues,
    navController: NavController,
    type: String,
    checkInDate: String,
    checkOutDate: String,
    services: String,
    price: Float,
    idRoom: String
) {
    // Formateador para las fechas
    val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    // Convertir las fechas a LocalDate
    val checkIn = LocalDate.parse(checkInDate, dateFormatter)
    val checkOut = LocalDate.parse(checkOutDate, dateFormatter)

    // Calcular la diferencia en días
    val daysBetween = ChronoUnit.DAYS.between(checkIn, checkOut).toInt()

    // Calcular el precio total
    val totalPrice = daysBetween * price

    Log.d("PayScreen", "Days Between: $daysBetween")
    Log.d("PayScreen", "Total Price: $totalPrice")

    // Dividir los servicios y registrar cada uno
    val serviceList = services.split(",")
    serviceList.forEach { service ->
        Log.d("PayScreen", "Service: $service")
    }

    fun formatPrice(price: Double): String {
        return "$${"%.2f".format(price)} USD"
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(HotelLightGray)
            .padding(innerPadding)
            .padding(24.dp)
            .verticalScroll(rememberScrollState())

    ) {
        // Encabezado
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back Icon",
                modifier = Modifier.clickable { navController.popBackStack() }
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Payment",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.weight(1.2f))
        }

        // Información de la habitación
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "HABITATION",
                style = MaterialTheme.typography.labelSmall
            )
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = type,
                style = MaterialTheme.typography.bodyLarge,
                color = HotelDarkGray,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = formatPrice(price.toDouble()),
                style = MaterialTheme.typography.labelLarge
            )
        }

        DashedDivider()

        // Fechas
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "DATES",
                style = MaterialTheme.typography.labelSmall,
            )
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "Calendar Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(top = 30.dp)
        ) {
            Text(
                text = "$checkInDate - $checkOutDate",
                style = MaterialTheme.typography.bodyLarge,
                color = HotelDarkGray,
                modifier = Modifier.weight(1f)
            )
        }

        DashedDivider()

        // Servicios
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Text(
                text = "SERVICES",
                style = MaterialTheme.typography.labelSmall
            )
            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = "Services Icon",
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        serviceList.forEach {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(top = 30.dp)
            ) {
                Text(
                    text = it,
                    style = MaterialTheme.typography.bodyLarge,
                    color = HotelDarkGray,
                    modifier = Modifier.weight(1f)
                )
            }
            DashedDivider()
        }

        Spacer(modifier = Modifier.weight(1f))

        // Total
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "TOTAL",
                style = MaterialTheme.typography.labelLarge,
            )
            Text(
                text = "$${"%.2f".format(totalPrice)} USD",
                style = MaterialTheme.typography.labelLarge
            )
        }

        // Botón de pago
        Button(
            onClick = {
                navController.navigate(
                    "${Screens.PaymentScreenRoute}/$type/$checkInDate/$checkOutDate/$services/$price/$idRoom"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = HotelBlue)
        ) {
            Text(
                text = "Credit/Debit Card",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(65.dp))
    }
}

@Composable
fun DashedDivider() {
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .padding(vertical = 6.dp)
    ) {
        drawLine(
            color = Color.Black,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            strokeWidth = 2f,
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
        )
    }
}