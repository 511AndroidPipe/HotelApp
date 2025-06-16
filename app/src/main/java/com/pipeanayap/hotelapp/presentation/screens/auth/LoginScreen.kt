package com.pipeanayap.hotelapp.presentation.screens.auth

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.presentation.Components.Lock
import com.pipeanayap.hotelapp.presentation.Components.Visibility
import com.pipeanayap.hotelapp.presentation.Components.Visibility_off
import com.pipeanayap.hotelapp.presentation.navigation.Screens
import com.pipeanayap.hotelapp.presentation.viewmodels.AuthViewModel

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }

    var showErrorDialog by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }

    val viewModel: AuthViewModel = hiltViewModel()

    // ✅ Esperar el resultado del login
    LaunchedEffect(Unit) {
        viewModel.loginEvent.collect { result ->
            if (result == "Login successful") {
                showErrorDialog = false
                navController.navigate(Screens.MainScreenRoute) {
                    popUpTo(Screens.LoginScreenRoute) { inclusive = true }
                }
            } else {
                showErrorDialog = true
                errorMessage = result
            }
        }
    }

    if (showErrorDialog) {
        AlertDialog(
            onDismissRequest = { showErrorDialog = false },
            confirmButton = {
                TextButton(onClick = { showErrorDialog = false }) {
                    Text("Aceptar")
                }
            },
            title = { Text("Error") },
            text = { Text("La contraseña o tu correo están incorrectos, intenta de nuevo.") }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(bottom = 20.dp),
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            letterSpacing = 5.sp
        )

        Image(
            painter = painterResource(R.drawable.logo_worldwide),
            contentDescription = "Login",
            modifier = Modifier
                .size(185.dp)
                .padding(bottom = 20.dp),
            contentScale = ContentScale.Crop
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = "email")
            },
            placeholder = { Text("Correo electrónico") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(com.pipeanayap.hotelapp.presentation.Components.Lock, contentDescription = "password")
            },
            trailingIcon = {
                Icon(
                    imageVector = if (isPasswordVisible)
                        com.pipeanayap.hotelapp.presentation.Components.Visibility
                    else
                        com.pipeanayap.hotelapp.presentation.Components.Visibility_off,
                    contentDescription = "toggle password",
                    modifier = Modifier.clickable { isPasswordVisible = !isPasswordVisible }
                )
            },
            placeholder = { Text("Contraseña") },
            shape = RoundedCornerShape(20.dp),
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // ✅ Ahora el botón solo llama a login:
        Button(
            onClick = { viewModel.login(email, password) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        ) {
            Text("Iniciar sesión")
        }

        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(MaterialTheme.colorScheme.onBackground)) {
                    append("¿No tienes una cuenta? ")
                }
                pushStyle(SpanStyle(color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold))
                append("Crea una")
            },
            modifier = Modifier.clickable {
                navController.navigate(Screens.RegisterScreenRoute)
            }
        )
    }
}
