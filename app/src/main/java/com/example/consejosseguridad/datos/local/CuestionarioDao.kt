package com.example.consejosseguridad.datos.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario

/**
 * DAO para consultar y almacenar preguntas del cuestionario en SQLite mediante Room.
 */
@Dao
interface CuestionarioDao {

    @Query("SELECT * FROM preguntas_cuestionario")
    suspend fun obtenerPreguntas(): List<PreguntaCuestionario>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarPreguntas(preguntas: List<PreguntaCuestionario>)
}