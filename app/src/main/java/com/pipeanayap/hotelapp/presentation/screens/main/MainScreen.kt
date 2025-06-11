package com.pipeanayap.hotelapp.presentation.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme

@Composable
fun MainScreen(){

    val navController = rememberNavController()

    Scaffold (modifier = Modifier.fillMaxSize()){
            innerPadding ->
        NavHost(navController = navController, startDestination = Screens.HomeScreenRoute){
            composable<Screens.HomeScreenRoute> {
                MenuScreen(innerPadding = innerPadding)
            }
        }
    }


}

@Preview
@Composable
fun PreviewMainScreen(){
    HotelAppTheme {
        MainScreen()
    }
}