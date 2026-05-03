package com.example.consejosseguridad.ui.pantallas.inicio

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.consejosseguridad.datos.local.AppDatabase
import com.example.consejosseguridad.datos.modelo.Tema
import com.example.consejosseguridad.datos.repositorio.TemaRepositorio
import kotlinx.coroutines.launch
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

/**
 * ViewModel de la pantalla de inicio.
 * Obtiene los temas desde SQLite mediante Room.
 */
class InicioViewModel(application: Application) : AndroidViewModel(application) {

    private val baseDatos = AppDatabase.obtenerInstancia(application)
    private val repositorio = TemaRepositorio(baseDatos.temaDao())

    private val _temas = mutableStateOf<List<Tema>>(emptyList())
    val temas: State<List<Tema>> = _temas

    init {
        cargarTemas()
    }

    private fun cargarTemas() {
        viewModelScope.launch {
            _temas.value = repositorio.obtenerTemas()
        }
    }
}