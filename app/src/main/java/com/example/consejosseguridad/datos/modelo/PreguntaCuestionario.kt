package com.example.consejosseguridad.datos.modelo

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidad que representa una pregunta del cuestionario almacenada en SQLite mediante Room.
 */
@Entity(tableName = "preguntas_cuestionario")
data class PreguntaCuestionario(
    @PrimaryKey
    val id: Int,
    val pregunta: String,
    val opciones: List<String>,
    val respuestaCorrecta: Int
)