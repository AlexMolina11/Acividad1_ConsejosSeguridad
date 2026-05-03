package com.example.consejosseguridad.datos.repositorio

import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario

class CuestionarioRepositorio {
    fun obtenerPreguntas(): List<PreguntaCuestionario> {
        return listOf(
            PreguntaCuestionario(
                id = 1,
                pregunta = "¿Qué permite la autenticación?",
                opciones = listOf(
                    "Verificar la identidad del usuario",
                    "Eliminar una base de datos",
                    "Cambiar el diseño de una app"
                ),
                respuestaCorrecta = 0
            ),
            PreguntaCuestionario(
                id = 2,
                pregunta = "¿Qué protocolo ayuda a cifrar la comunicación?",
                opciones = listOf(
                    "HTTP",
                    "HTTPS",
                    "FTP sin cifrado"
                ),
                respuestaCorrecta = 1
            ),
            PreguntaCuestionario(
                id = 3,
                pregunta = "¿Dónde se almacenan principalmente las sesiones?",
                opciones = listOf(
                    "En el servidor",
                    "En el teclado",
                    "En la pantalla"
                ),
                respuestaCorrecta = 0
            )
        )
    }
}