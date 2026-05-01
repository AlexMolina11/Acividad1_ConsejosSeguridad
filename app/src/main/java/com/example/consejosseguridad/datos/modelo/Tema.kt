package com.example.consejosseguridad.datos.modelo

data class Tema(
    val id: Int,
    val titulo: String,
    val descripcionCorta: String,
    val descripcionCompleta: String,
    val recomendacion: String
)