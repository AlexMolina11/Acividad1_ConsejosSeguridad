package com.example.consejosseguridad.ui.pantallas.detalle

import androidx.lifecycle.ViewModel
import com.example.consejosseguridad.datos.modelo.Tema
import com.example.consejosseguridad.datos.repositorio.TemaRepositorio

/* Busca y expone la información de un tema específico.*/
class DetalleViewModel : ViewModel() {
    private val repositorio = TemaRepositorio()

    fun obtenerTemaPorId(temaId: Int): Tema? {
        return repositorio.obtenerTemas().find { tema ->
            tema.id == temaId
        }
    }
}