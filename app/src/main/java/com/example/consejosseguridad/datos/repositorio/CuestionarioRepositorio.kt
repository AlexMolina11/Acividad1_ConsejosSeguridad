package com.example.consejosseguridad.datos.repositorio

import com.example.consejosseguridad.datos.local.CuestionarioDao
import com.example.consejosseguridad.datos.local.DatosIniciales
import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario

/**
 * Repositorio encargado de consultar las preguntas desde SQLite mediante Room.
 */
class CuestionarioRepositorio(
    private val cuestionarioDao: CuestionarioDao
) {

    suspend fun obtenerPreguntas(): List<PreguntaCuestionario> {
        insertarDatosInicialesSiEsNecesario()
        return cuestionarioDao.obtenerPreguntas()
    }

    private suspend fun insertarDatosInicialesSiEsNecesario() {
        val preguntasActuales = cuestionarioDao.obtenerPreguntas()

        if (preguntasActuales.isEmpty()) {
            cuestionarioDao.insertarPreguntas(DatosIniciales.preguntas)
        }
    }
}