package com.pipeanayap.cryptoapp.presentation.screens.auth

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.pipeanayap.hotelapp.R
import com.pipeanayap.hotelapp.presentation.Components.Lock
import com.pipeanayap.hotelapp.presentation.Components.Visibility
import com.pipeanayap.hotelapp.presentation.Components.Visibility_off
import com.pipeanayap.hotelapp.presentation.ui.theme.HotelAppTheme


@Composable
fun RegisterScreen(innerPadding: PaddingValues) {
    var email by remember {
        mutableStateOf("")
    }
    var name by remember {
        mutableStateOf("")
    }
    var phoneNumber by remember {
        mutableStateOf("")
    }

    var confirmPassword by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    var isConfirmedPasswordVisible by remember {
        mutableStateOf(false)
    }

    var showErrorDialog by remember {
        mutableStateOf(false)
    }

    var errorMessage by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Imagen x
        Image(
            painter = painterResource(R.drawable.logo_worldwide),
            contentDescription = "Login",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )

        //Text para la frase
        Text(
            text = buildAnnotatedString {
                append("Peace in your process, pride in\n")
                append("your place")
            },
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp))


        //Text field para el nombre
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "name"
                )
            },
            placeholder = {
                Text(
                    text = "Name"
                )
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        //Textfield para el correo
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "email"
                )
            },
            placeholder = {
                Text(
                    text = "Email"
                )
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        //Textfield para el numero
        OutlinedTextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "email"
                )
            },
            placeholder = {
                Text(
                    text = "Phone number"
                )
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        //Text field de la contraseña
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(
                    imageVector = Lock,
                    contentDescription = "password"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = if (isPasswordVisible) Visibility_off else Visibility,
                    contentDescription = "password",
                    modifier = Modifier.clickable {
                        isPasswordVisible = !isPasswordVisible

                    }
                )
            },
            placeholder = {
                Text(
                    text = "Password"
                )
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()
        )
        //Text field confirmacion de la contraseña
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            leadingIcon = {
                Icon(
                    imageVector = Lock,
                    contentDescription = "password"
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = if (isConfirmedPasswordVisible) Visibility_off else Visibility,
                    contentDescription = "password",
                    modifier = Modifier.clickable {
                        isConfirmedPasswordVisible = !isConfirmedPasswordVisible

                    }
                )
            },
            placeholder = {
                Text(
                    text = "Confirm password"
                )
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            visualTransformation = if (isConfirmedPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()
        )

        //Validacion contraseñas iguales
        if (confirmPassword.isNotEmpty() && password != confirmPassword) {
            Text(
                text = "Las contraseñas no coinciden",
                color = Color.Red,
                style = MaterialTheme.typography.bodyLarge
            )
        }

        //Button para Registrar
        Button(
            onClick = {
                //viewModel.register(email, password)
            },
            enabled = (password == confirmPassword) && email.isNotBlank()
                    && password.isNotBlank() && confirmPassword.isNotBlank()
                    && name.isNotBlank() && phoneNumber.isNotBlank(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) {

            Text(
                text = "Registrarse"
            )
        }
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    HotelAppTheme {
        RegisterScreen(PaddingValues(20.dp))
    }
}

