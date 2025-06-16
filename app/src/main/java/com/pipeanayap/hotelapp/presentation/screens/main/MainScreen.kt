package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pipeanayap.hotelapp.presentation.navigation.BottomNavItem
import com.pipeanayap.hotelapp.presentation.navigation.Screens

@Composable
fun MainScreen() {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Reservation
    )

    var selectedScreen by remember {
        mutableStateOf<Screens>(Screens.MenuScreenRoute)
    }
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(

            ) {
                items.forEach { item ->
                    NavigationBarItem(
                        selected = selectedScreen == item.route,
                        onClick = {
                            selectedScreen = item.route
                            navController.navigate(item.route)
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    )
                }
            }
        }
    )  { innerPadding ->
        NavHost(navController = navController, startDestination = Screens.MenuScreenRoute) {
            composable<Screens.MenuScreenRoute>{
                MenuScreen(innerPadding = innerPadding)
            }

            composable<Screens.ReservationScreenRoute> {
                ReservationScreen(innerPadding = innerPadding, navController = navController)
            }

            composable<Screens.DetailRegisterScreenRoute> {
                DetailRegisterScreen(innerPadding, navController)
            }

            composable<Screens.PaymentScreenRoute> {
                PaymentScreen(innerPadding)
            }
        }
    }
}
