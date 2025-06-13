package com.pipeanayap.hotelapp.presentation.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Dark Theme
private val DarkColorScheme = darkColorScheme(
    primary = HotelGold,                   // Acento elegante
    onPrimary = HotelBlueDark,            // Texto sobre el acento
    primaryContainer = HotelBlueLight,    // Fondo de botones o contenedores primarios
    onPrimaryContainer = TextOnDark,      // Texto sobre contenedores primarios
    secondary = HotelSkyBlue,             // Acento secundario suave
    onSecondary = TextOnDark,             // Texto sobre acento secundario
    background = HotelBlue,               // Fondo principal
    surface = HotelBlueDark,              // Superficies (como cards, etc.)
    onBackground = TextOnDark,            // Texto principal sobre fondo oscuro
    onSurface = TextOnDark                // Texto sobre superficie
)

// Light Theme
private val LightColorScheme = lightColorScheme(
    primary = HotelGold,                  // Acento elegante
    onPrimary = TextPrimary,             // Texto sobre acento
    primaryContainer = HotelBeige,       // Contenedor primario claro
    onPrimaryContainer = TextPrimary,    // Texto sobre contenedor primario
    secondary = HotelSkyBlue,            // Acento secundario
    onSecondary = TextPrimary,           // Texto sobre acento secundario
    background = HotelWhite,             // Fondo claro principal
    surface = HotelLightGray,            // Superficies secundarias
    onBackground = TextPrimary,          // Texto principal
    onSurface = TextPrimary,             // Texto sobre superficie
)


@Composable
fun HotelAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = poppinsTypo,
        content = content
    )
}