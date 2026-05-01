package com.example.consejosseguridad.ui.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

/* Botón reutilizable principal. */
@Composable
fun BotonPrincipal(
    texto: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(text = texto)
    }
}