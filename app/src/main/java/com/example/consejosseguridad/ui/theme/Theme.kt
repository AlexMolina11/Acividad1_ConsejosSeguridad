package com.example.consejosseguridad.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val EsquemaClaro = lightColorScheme(
    primary = AzulPrincipal,
    secondary = AzulSecundario,
    tertiary = VerdeSeguro,
    background = GrisFondo,
    surface = Blanco,
    onPrimary = Blanco,
    onSecondary = Blanco,
    onBackground = GrisTexto,
    onSurface = GrisTexto
)

private val EsquemaOscuro = darkColorScheme(
    primary = AzulSecundario,
    secondary = AzulClaro,
    tertiary = VerdeSeguro
)

@Composable
fun ConsejosSeguridadTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val esquemaColores = if (darkTheme) EsquemaOscuro else EsquemaClaro
    val view = LocalView.current

    if (!view.isInEditMode) {
        val window = (view.context as Activity).window
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
    }

    MaterialTheme(
        colorScheme = esquemaColores,
        typography = Typography,
        content = content
    )
}