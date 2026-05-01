package com.example.consejosseguridad.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.consejosseguridad.ui.pantallas.cuestionario.PantallaCuestionario
import com.example.consejosseguridad.ui.pantallas.inicio.PantallaInicio

/* Maneja la navegación principal de la aplicación.*/
@Composable
fun NavegacionApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {
        composable("inicio") {
            PantallaInicio(
                onClickTema = { temaId -> navController.navigate("detalle/$temaId") },
                onClickCuestionario = { navController.navigate("cuestionario") }
            )
        }

        composable("cuestionario") {
            PantallaCuestionario(
                onVolver = {
                    navController.popBackStack()
                }
            )
        }
    }
}