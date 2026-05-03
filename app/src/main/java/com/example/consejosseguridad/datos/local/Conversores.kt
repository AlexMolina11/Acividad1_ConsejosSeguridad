package com.example.consejosseguridad.datos.local

import androidx.room.TypeConverter

/**
 * Conversores utilizados por Room para almacenar tipos de datos no primitivos.
 */
class Conversores {

    @TypeConverter
    fun desdeListaString(lista: List<String>): String {
        return lista.joinToString(separator = "|")
    }

    @TypeConverter
    fun haciaListaString(texto: String): List<String> {
        return texto.split("|")
    }
}