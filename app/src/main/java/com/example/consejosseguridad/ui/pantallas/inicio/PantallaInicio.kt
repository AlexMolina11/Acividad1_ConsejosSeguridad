package com.example.consejosseguridad.ui.pantallas.inicio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consejosseguridad.R
import com.example.consejosseguridad.ui.componentes.BotonPrincipal
import com.example.consejosseguridad.ui.componentes.TarjetaTema

/**
 * Pantalla principal de la aplicación.
 * Muestra los temas de seguridad y permite acceder al cuestionario.
 */
@Composable
fun PantallaInicio(
    onClickTema: (Int) -> Unit,
    onClickCuestionario: () -> Unit,
    viewModel: InicioViewModel = viewModel()
) {
    val temas = viewModel.temas.value

    Scaffold { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_escudo_seguridad),
                contentDescription = stringResource(id = R.string.descripcion_icono_seguridad),
                modifier = Modifier.size(88.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = stringResource(id = R.string.titulo_inicio),
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Text(
                text = stringResource(id = R.string.descripcion_inicio),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(top = 6.dp, bottom = 16.dp)
            )

            BotonPrincipal(
                texto = stringResource(id = R.string.boton_cuestionario),
                onClick = onClickCuestionario
            )

            Spacer(modifier = Modifier.height(20.dp))

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