package com.example.consejosseguridad.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.consejosseguridad.ui.pantallas.inicio.PantallaInicio

/* Maneja la navegación de la app. */
@Composable
fun NavegacionApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {

        composable("inicio") {
            PantallaInicio(
                onClickTema = {
                    // Luego navegaremos a detalle
                }
            )
        }
    }
}