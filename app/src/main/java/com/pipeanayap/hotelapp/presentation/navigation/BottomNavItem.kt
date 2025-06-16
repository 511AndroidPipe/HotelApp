package com.pipeanayap.hotelapp.presentation.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val title : String, val icon: ImageVector,  val route : Screens){
    object Home : BottomNavItem("Home",Icons.Default.Home, Screens.MenuScreenRoute)
    object Reservation : BottomNavItem("Reservation",Icons.Default.Hotel, Screens.ReservationScreenRoute)
}
