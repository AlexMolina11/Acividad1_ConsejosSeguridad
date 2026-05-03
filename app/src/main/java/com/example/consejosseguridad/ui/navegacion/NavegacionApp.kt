package com.example.consejosseguridad.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.example.consejosseguridad.ui.pantallas.detalle.PantallaDetalle
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
                onClickTema = { temaId ->
                    navController.navigate("detalle/$temaId")
                }
            )
        }

        composable(
            route = "detalle/{temaId}",
            arguments = listOf(
                navArgument("temaId") {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->

            val temaId = backStackEntry.arguments?.getInt("temaId") ?: 0

            PantallaDetalle(
                temaId = temaId,
                onVolver = {
                    navController.popBackStack()
                }
            )
        }
    }
}