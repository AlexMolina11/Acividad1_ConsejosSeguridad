package com.example.consejosseguridad.datos.repositorio

import com.example.consejosseguridad.datos.modelo.Tema

/* Proporciona datos de temas de seguridad.*/
class TemaRepositorio {

    fun obtenerTemas(): List<Tema> {
        return listOf(
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
    }
}