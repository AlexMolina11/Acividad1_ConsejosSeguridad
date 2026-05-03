package com.example.consejosseguridad.datos.local

import com.example.consejosseguridad.datos.modelo.PreguntaCuestionario
import com.example.consejosseguridad.datos.modelo.Tema

/**
 * Define los datos iniciales que se insertan en la base de datos local.
 */
object DatosIniciales {

    val temas = listOf(
        Tema(
            1,
            "Autenticación",
            "Verifica la identidad del usuario.",
            "La autenticación permite validar que un usuario es quien dice ser antes de acceder a un sistema.",
            "Usa contraseñas seguras y autenticación en dos factores."
        ),
        Tema(
            2,
            "Cookies y sesiones",
            "Mantienen información del usuario.",
            "Las cookies permiten almacenar información en el cliente mientras que las sesiones lo hacen en el servidor.",
            "Usa cookies seguras con HttpOnly y Secure."
        ),
        Tema(
            3,
            "HTTPS y TLS",
            "Protegen la comunicación.",
            "HTTPS utiliza TLS para cifrar la información entre cliente y servidor.",
            "Nunca ingreses datos en sitios sin HTTPS."
        ),
        Tema(
            4,
            "Vulnerabilidades",
            "Debilidades en sistemas.",
            "Las vulnerabilidades permiten a atacantes explotar sistemas.",
            "Mantén el software actualizado y valida entradas."
        )
    )

    val preguntas = listOf(
        PreguntaCuestionario(
            1,
            "¿Qué permite la autenticación?",
            listOf(
                "Verificar la identidad del usuario",
                "Eliminar una base de datos",
                "Cambiar el diseño de una app"
            ),
            0
        ),
        PreguntaCuestionario(
            2,
            "¿Qué protocolo ayuda a cifrar la comunicación?",
            listOf(
                "HTTP",
                "HTTPS",
                "FTP sin cifrado"
            ),
            1
        ),
        PreguntaCuestionario(
            3,
            "¿Dónde se almacenan principalmente las sesiones?",
            listOf(
                "En el servidor",
                "En el teclado",
                "En la pantalla"
            ),
            0
        )
    )
}