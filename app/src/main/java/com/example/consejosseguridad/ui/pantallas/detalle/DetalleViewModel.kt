package com.example.consejosseguridad.ui.pantallas.detalle

import android.app.Application
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.consejosseguridad.datos.local.AppDatabase
import com.example.consejosseguridad.datos.modelo.Tema
import com.example.consejosseguridad.datos.repositorio.TemaRepositorio
import kotlinx.coroutines.launch

/**
 * ViewModel de la pantalla de detalle.
 * Busca un tema específico desde SQLite mediante Room.
 */
class DetalleViewModel(application: Application) : AndroidViewModel(application) {

    private val baseDatos = AppDatabase.obtenerInstancia(application)
    private val repositorio = TemaRepositorio(baseDatos.temaDao())

    private val _tema = mutableStateOf<Tema?>(null)
    val tema: State<Tema?> = _tema

    fun cargarTema(temaId: Int) {
        viewModelScope.launch {
            _tema.value = repositorio.obtenerTemaPorId(temaId)
        }
    }
}