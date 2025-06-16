package com.pipeanayap.hotelapp.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pipeanayap.hotelapp.domain.models.Auth
import com.pipeanayap.hotelapp.domain.models.Register
import com.pipeanayap.hotelapp.services.AuthService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authService: AuthService
) : ViewModel(){

    //success
    private val _loginEvent = MutableSharedFlow<String>()
    val loginEvent =_loginEvent.asSharedFlow()

    private val _registerEvent = MutableSharedFlow<String>()
    val registerEvent = _registerEvent.asSharedFlow()


    fun login(email: String, password: String) {
        val auth = Auth(email = email, password = password)
        viewModelScope.launch {
            try {
                val response = authService.login(auth)
                Log.i("AuthViewModel", "Response: $response")
                if (response.message == "Login successful") {
                    _loginEvent.emit("Login successful")
                } else {
                    _loginEvent.emit(response.message)
                }
            } catch (e: Exception) {
                Log.e("AuthViewModel", "Error: ${e.message}", e)
                _loginEvent.emit("Error de conexión: ${e.message}")
            }
        }
    }

    fun register(email: String, password: String, name : String, phone : String){
        val register = Register(email = email, password = password, name = name, phone = phone)
        viewModelScope.launch {
            try {
                val response = authService.register(register)
                Log.i("AuthViewModel", "Response: $response")
                if (response.message == "User successfully registered") {
                    _registerEvent.emit("User successfully registered")
                } else {
                    _registerEvent.emit(response.message)
                }
            }catch (e: Exception) {
                Log.e("AuthViewModel", "Error: ${e.message}", e)
                _registerEvent.emit("Error de conexión: ${e.message}")
            }
        }
    }

}
