package com.example.consejosseguridad.ui.pantallas.inicio

import androidx.lifecycle.ViewModel
import com.example.consejosseguridad.datos.modelo.Tema
import com.example.consejosseguridad.datos.repositorio.TemaRepositorio

/* Aqui obtenemos y exponemos la lista de temas */
class InicioViewModel : ViewModel() {

    private val repositorio = TemaRepositorio()

    val temas: List<Tema> = repositorio.obtenerTemas()
}

