package com.example.consejosseguridad.datos.repositorio

import com.example.consejosseguridad.datos.local.DatosIniciales
import com.example.consejosseguridad.datos.local.TemaDao
import com.example.consejosseguridad.datos.modelo.Tema

/**
 * Repositorio encargado de consultar los temas desde SQLite mediante Room.
 */
class TemaRepositorio(
    private val temaDao: TemaDao
) {

    suspend fun obtenerTemas(): List<Tema> {
        insertarDatosInicialesSiEsNecesario()
        return temaDao.obtenerTemas()
    }

    suspend fun obtenerTemaPorId(temaId: Int): Tema? {
        insertarDatosInicialesSiEsNecesario()
        return temaDao.obtenerTemaPorId(temaId)
    }

    private suspend fun insertarDatosInicialesSiEsNecesario() {
        val temasActuales = temaDao.obtenerTemas()

        if (temasActuales.isEmpty()) {
            temaDao.insertarTemas(DatosIniciales.temas)
        }
    }
}