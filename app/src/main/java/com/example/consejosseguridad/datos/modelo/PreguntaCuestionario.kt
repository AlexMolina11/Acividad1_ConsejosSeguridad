package com.example.consejosseguridad.datos.modelo

data class PreguntaCuestionario(
    val id: Int,
    val pregunta: String,
    val opciones: List<String>,
    val respuestaCorrecta: Int
)

