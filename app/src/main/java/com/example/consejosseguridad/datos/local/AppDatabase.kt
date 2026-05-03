package com.example.consejosseguridad.datos.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario
import com.example.consejosseguridad.datos.modelo.Tema

/**
 * Base de datos local de la aplicación.
 * Utiliza Room como capa de acceso a SQLite.
 */
@Database(
    entities = [
        Tema::class,
        PreguntaCuestionario::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Conversores::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun temaDao(): TemaDao

    abstract fun cuestionarioDao(): CuestionarioDao

    companion object {

        @Volatile
        private var INSTANCIA: AppDatabase? = null

        fun obtenerInstancia(context: Context): AppDatabase {
            return INSTANCIA ?: synchronized(this) {
                val instancia = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "consejos_seguridad_db"
                )
                    .fallbackToDestructiveMigration()
                    .build()

                INSTANCIA = instancia
                instancia
            }
        }
    }
}