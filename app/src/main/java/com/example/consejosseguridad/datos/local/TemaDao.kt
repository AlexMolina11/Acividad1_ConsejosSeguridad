package com.example.consejosseguridad.datos.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.consejosseguridad.datos.modelo.Tema

/**
 * DAO para consultar y almacenar temas en SQLite mediante Room.
 */
@Dao
interface TemaDao {

    @Query("SELECT * FROM temas")
    suspend fun obtenerTemas(): List<Tema>

    @Query("SELECT * FROM temas WHERE id = :temaId LIMIT 1")
    suspend fun obtenerTemaPorId(temaId: Int): Tema?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarTemas(temas: List<Tema>)
}