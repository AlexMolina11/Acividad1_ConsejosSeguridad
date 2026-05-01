package com.example.consejosseguridad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.consejosseguridad.ui.navegacion.NavegacionApp
import com.example.consejosseguridad.ui.theme.ConsejosSeguridadTheme

/* Punto de entrada de la aplicación.*/
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ConsejosSeguridadTheme {
                NavegacionApp()
            }
        }
    }
}