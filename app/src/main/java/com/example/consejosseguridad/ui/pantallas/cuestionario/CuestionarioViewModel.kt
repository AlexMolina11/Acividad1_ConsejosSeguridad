package com.example.consejosseguridad.ui.pantallas.cuestionario

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.consejosseguridad.datos.local.AppDatabase
import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario
import com.example.consejosseguridad.datos.repositorio.CuestionarioRepositorio
import kotlinx.coroutines.launch

/**
 * ViewModel del cuestionario.
 * Consulta las preguntas desde SQLite mediante Room y controla el progreso del cuestionario.
 */
class CuestionarioViewModel(application: Application) : AndroidViewModel(application) {

    private val baseDatos = AppDatabase.obtenerInstancia(application)
    private val repositorio = CuestionarioRepositorio(baseDatos.cuestionarioDao())

    var preguntas by mutableStateOf<List<PreguntaCuestionario>>(emptyList())
        private set

    var indicePreguntaActual by mutableIntStateOf(0)
        private set

    var puntaje by mutableIntStateOf(0)
        private set

    var cuestionarioFinalizado by mutableStateOf(false)
        private set

    val preguntaActual: PreguntaCuestionario?
        get() = preguntas.getOrNull(indicePreguntaActual)

    init {
        cargarPreguntas()
    }

    private fun cargarPreguntas() {
        viewModelScope.launch {
            preguntas = repositorio.obtenerPreguntas()
        }
    }

    fun responder(indiceRespuesta: Int) {
        val pregunta = preguntaActual ?: return

        if (indiceRespuesta == pregunta.respuestaCorrecta) {
            puntaje++
        }

        if (indicePreguntaActual < preguntas.lastIndex) {
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