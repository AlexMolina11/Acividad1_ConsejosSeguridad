package com.example.consejosseguridad.ui.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/* Componente reutilizable para mostrar una opción del cuestionario.*/
@Composable
fun OpcionCuestionario(
    texto: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {
        Text(text = texto)
    }
}