package com.example.consejosseguridad.datos.modelo

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entidad que representa un tema de seguridad almacenado en SQLite mediante Room.
 */
@Entity(tableName = "temas")
data class Tema(
    @PrimaryKey
    val id: Int,
    val titulo: String,
    val descripcionCorta: String,
    val descripcionCompleta: String,
    val recomendacion: String
)