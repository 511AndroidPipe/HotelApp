package com.pipeanayap.hotelapp.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val title : String,  val route : Screens){
    object Home : BottomNavItem("Inicio", Screens.MenuScreenRoute)
    object Stats : BottomNavItem("Stats",  Screens.StatsScreenRoute)
}
