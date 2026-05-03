package com.example.consejosseguridad.ui.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Componente reutilizable que representa el botón principal de la aplicación.
 */
@Composable
fun BotonPrincipal(
    texto: String,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {
        Text(text = texto)
    }
}