package com.pruebas;

public class App {

    public static void main(String[] args) {

        UsuarioService servicio = new UsuarioService();

        // Crear un usuario de prueba.
        Usuario usuario = new Usuario(
            1,
            "Nato",
            "nato@ejemplo.com"
        );

        // Registrar el usuario.
        boolean registrado = servicio.registrarUsuario(usuario);

        // Recuperar el usuario registrado.
        Usuario encontrado = servicio.buscarUsuario(1);

        // Validar el comportamiento esperado.
        if (!registrado ||
            encontrado == null ||
            !encontrado.getEmail().equals("nato@ejemplo.com") ||
            servicio.contarUsuarios() != 1) {

            throw new IllegalStateException(
                "ERROR: La aplicacion no cumple los criterios de aceptacion"
            );
        }

        System.out.println("ACEPTACION_OK");
        System.out.println("Usuario registrado: " + encontrado.getNombre());
        System.out.println("Email: " + encontrado.getEmail());
        System.out.println("Total usuarios: " + servicio.contarUsuarios());
    }
}