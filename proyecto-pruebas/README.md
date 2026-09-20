# Proyecto de Automatización de Pruebas

Proyecto desarrollado en Java utilizando Maven y JUnit para aplicar los contenidos aprendidos durante el curso de Automatización de Pruebas.

Se implementó un sistema básico de gestión de usuarios que permite registrar, buscar y contabilizar usuarios.

## Herramientas utilizadas

- Java 17
- Maven
- JUnit 4
- Git y GitHub
- GitHub Actions

## Estructura del proyecto

El proyecto contiene las siguientes clases:

- App.java: ejecución principal de la aplicación.
- Usuario.java: representa los datos de un usuario.
- UsuarioService.java: permite registrar y consultar usuarios.
- UsuarioServiceTest.java: pruebas unitarias.
- UsuarioIntegracionIT.java: prueba de integración.

También se mantienen las pruebas iniciales SumaTest y RestaTest.

## Ejecución de pruebas

Para ejecutar las pruebas unitarias:

    mvn clean test

Para ejecutar todas las pruebas, incluyendo integración:

    mvn clean verify

Se implementaron 6 pruebas unitarias y 1 prueba de integración, todas ejecutadas correctamente.

## Integración continua (CI)

Se configuró un pipeline con GitHub Actions mediante el archivo:

    .github/workflows/ci.yml

Este pipeline se ejecuta automáticamente al subir cambios al repositorio y realiza tres tareas:

1. Compilar el proyecto.
2. Ejecutar las pruebas unitarias.
3. Ejecutar las pruebas de integración.

Los resultados se pueden revisar en la sección Actions de GitHub.

## Despliegue y rollback (CD)

Se implementó un segundo pipeline:

    .github/workflows/deploy.yml

Este permite compilar la aplicación, ejecutar pruebas de aceptación y desplegar el archivo JAR en un ambiente temporal de pruebas.

También se implementó una simulación de rollback utilizando la versión estable v1.0.0, que permite restaurar el archivo JAR respaldado y comprobar que la aplicación sigue funcionando.

El resultado fue exitoso, obteniendo los mensajes:

    ACEPTACION_OK
    ROLLBACK_OK

## Repositorio

https://github.com/natoalvarado/proyecto-pruebas

Rama utilizada para el examen:

    feature/examen-final

## Conclusión

Este proyecto permitió aplicar control de versiones, pruebas automatizadas, integración continua y despliegue automatizado mediante GitHub Actions.

Se comprobó el funcionamiento de las pruebas y se realizó una simulación de recuperación de una versión estable mediante rollback.