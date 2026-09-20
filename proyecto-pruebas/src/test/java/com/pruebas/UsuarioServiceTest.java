package com.pruebas;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioServiceTest {

    @Test
    public void testRegistrarUsuarioValido() {
        UsuarioService servicio = new UsuarioService();
        Usuario usuario = new Usuario(1, "Nato", "nato@ejemplo.com");

        boolean resultado = servicio.registrarUsuario(usuario);

        assertTrue(resultado);
    }

    @Test
    public void testRechazarUsuarioSinNombre() {
        UsuarioService servicio = new UsuarioService();
        Usuario usuario = new Usuario(2, "", "usuario@ejemplo.com");

        boolean resultado = servicio.registrarUsuario(usuario);

        assertFalse(resultado);
    }

    @Test
    public void testRechazarEmailInvalido() {
        UsuarioService servicio = new UsuarioService();
        Usuario usuario = new Usuario(3, "Pedro", "correo-invalido");

        boolean resultado = servicio.registrarUsuario(usuario);

        assertFalse(resultado);
    }

    @Test
    public void testRechazarIdDuplicado() {
        UsuarioService servicio = new UsuarioService();

        Usuario usuario1 = new Usuario(1, "Nato", "nato@ejemplo.com");
        Usuario usuario2 = new Usuario(1, "Pedro", "pedro@ejemplo.com");

        servicio.registrarUsuario(usuario1);

        boolean resultado = servicio.registrarUsuario(usuario2);

        assertFalse(resultado);
    }
}