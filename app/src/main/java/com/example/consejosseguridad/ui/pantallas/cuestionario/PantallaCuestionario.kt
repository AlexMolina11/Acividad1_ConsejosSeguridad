package com.example.consejosseguridad.ui.pantallas.cuestionario

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consejosseguridad.ui.componentes.BotonPrincipal
import com.example.consejosseguridad.ui.componentes.OpcionCuestionario

/* Pantalla que muestra un cuestionario básico de seguridad web.*/
@Composable
fun PantallaCuestionario(
    onVolver: () -> Unit,
    viewModel: CuestionarioViewModel = viewModel()
) {
    Scaffold { padding ->
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp),
        ) {
            if (viewModel.cuestionarioFinalizado) {
                Text(
                    text = "Cuestionario finalizado",
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "Puntaje: ${viewModel.puntaje} de ${viewModel.preguntas.size}",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(24.dp))
                BotonPrincipal(
                    texto = "Reiniciar",
                    onClick = { viewModel.reiniciar() }
                )
                Spacer(modifier = Modifier.height(12.dp))
                BotonPrincipal(
                    texto = "Volver al inicio",
                    onClick = onVolver
                )
            } else {
                val pregunta = viewModel.preguntaActual
                Text(
                    text = "Pregunta ${viewModel.indicePreguntaActual + 1} de ${viewModel.preguntas.size}",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = pregunta.pregunta,
                    style = MaterialTheme.typography.headlineSmall
                )
                Spacer(modifier = Modifier.height(24.dp))
                pregunta.opciones.forEachIndexed { indice, opcion ->
                    OpcionCuestionario(
                        texto = opcion,
                        onClick = { viewModel.responder(indice) }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }
}