# Consejos de Seguridad

Aplicación móvil Android desarrollada en Kotlin que proporciona información básica sobre seguridad web mediante una interfaz intuitiva y un pequeño cuestionario interactivo.

## Objetivo

El objetivo de esta aplicación es enseñar conceptos fundamentales de seguridad informática de forma sencilla, incluyendo:

- Autenticación
- ookies y sesiones
- HTTPS y cifrado
- Vulnerabilidades

Además, se incluye un cuestionario para reforzar el aprendizaje.

## Tecnologías utilizadas
- Kotlin
- Jetpack Compose
- Arquitectura MVVM
- Room (SQLite)
- Navigation Compose

## Arquitectura

El proyecto sigue el patrón MVVM (Model-View-ViewModel), separando:

datos/ -> Modelos, DAO, base de datos (Room)
ui/ -> Pantallas, componentes y navegación
repositorio/ -> Acceso a datos

## Equipo de desarrollo

- Kevin Hernández 
- Alex Molina
- Jorge Melnik

## Estrategia de ramas

Se utilizó una estrategia basada en Git:

main        → versión final
develop     → integración
feature/*   → desarrollo individual

Cada integrante trabajó en su propia rama y se integraron los cambios mediante Pull Requests.

## Ejecución del proyecto

1. Clonar repositorio:
- git clone https://github.com/AlexMolina11/Acividad1_ConsejosSeguridad.git
2. Abrir en Android Studio
3. Ejecutar en emulador o dispositivo físico
