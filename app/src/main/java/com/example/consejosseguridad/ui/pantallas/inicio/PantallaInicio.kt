package com.example.consejosseguridad.ui.pantallas.inicio

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consejosseguridad.ui.componentes.TarjetaTema

/* Pantalla principal que muestra los temas. */
@Composable
fun PantallaInicio(
    onClickTema: (Int) -> Unit,
    viewModel: InicioViewModel = viewModel()
) {
    val temas = viewModel.temas

    Scaffold { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp)
        ) {

            Text(
                text = "Consejos de Seguridad",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "Aprende seguridad web fácilmente",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(temas) { tema ->
                    TarjetaTema(
                        titulo = tema.titulo,
                        descripcion = tema.descripcionCorta,
                        onClick = { onClickTema(tema.id) }
                    )
                }
            }
        }
    }
}