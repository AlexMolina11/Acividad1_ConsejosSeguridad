package com.example.consejosseguridad.ui.pantallas.cuestionario

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario
import com.example.consejosseguridad.datos.repositorio.CuestionarioRepositorio

/* Controla la pregunta actual, la respuesta seleccionada y el puntaje obtenido.*/
class CuestionarioViewModel : ViewModel() {
    private val repositorio = CuestionarioRepositorio()
    val preguntas: List<PreguntaCuestionario> = repositorio.obtenerPreguntas()
    var indicePreguntaActual by mutableIntStateOf(0)
        private set
    var puntaje by mutableIntStateOf(0)
        private set
    var cuestionarioFinalizado by mutableStateOf(false)
        private set
    val preguntaActual: PreguntaCuestionario
        get() = preguntas[indicePreguntaActual]

    fun responder(indiceRespuesta: Int) {
        if (indiceRespuesta == preguntaActual.respuestaCorrecta) {
            puntaje++
        } if
                  (indicePreguntaActual < preguntas.lastIndex) {
            indicePreguntaActual++
        } else {
            cuestionarioFinalizado = true
        }
    }

    fun reiniciar() {
        indicePreguntaActual = 0
        puntaje = 0
        cuestionarioFinalizado = false
    }
}