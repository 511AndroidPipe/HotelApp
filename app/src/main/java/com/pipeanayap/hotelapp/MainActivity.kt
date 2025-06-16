  package com.pipeanayap.hotelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.pipeanayap.hotelapp.presentation.screens.auth.RegisterScreen
import com.pipeanayap.hotelapp.presentation.screens.main.DetailRegisterScreen
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.screens.auth.LoginScreen
import com.pipeanayap.hotelapp.presentation.screens.main.MainScreen
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme
import dagger.hilt.android.AndroidEntryPoint

  @AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HotelAppTheme {
                val navController = rememberNavController()

                NavHost(navController, Screens.LoginScreenRoute) {
                    composable<Screens.LoginScreenRoute> {
                        LoginScreen(navController)
                    }

                    composable<Screens.RegisterScreenRoute> {
                        RegisterScreen( navController)
                    }
                    
                    navigation<Screens.MainGraph>(startDestination = Screens.MainScreenRoute){
                        composable<Screens.MainScreenRoute> {
                            MainScreen()
                            }
                    }
                }
            }
        }
    }
}
