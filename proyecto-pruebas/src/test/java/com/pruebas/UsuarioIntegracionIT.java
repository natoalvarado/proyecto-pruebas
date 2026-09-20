package com.pruebas;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioIntegracionIT {

    @Test
    public void testFlujoCompletoRegistroYConsulta() {

        // Preparar el servicio y los usuarios.
        UsuarioService servicio = new UsuarioService();

        Usuario usuario1 = new Usuario(
            1, "Nato", "nato@ejemplo.com"
        );

        Usuario usuario2 = new Usuario(
            2, "Pedro", "pedro@ejemplo.com"
        );

        // Registrar ambos usuarios.
        assertTrue(servicio.registrarUsuario(usuario1));
        assertTrue(servicio.registrarUsuario(usuario2));

        // Consultar los usuarios registrados.
        Usuario encontrado1 = servicio.buscarUsuario(1);
        Usuario encontrado2 = servicio.buscarUsuario(2);

        // Verificar que ambos existen.
        assertNotNull(encontrado1);
        assertNotNull(encontrado2);

        // Comprobar los datos recuperados.
        assertEquals("Nato", encontrado1.getNombre());
        assertEquals("nato@ejemplo.com", encontrado1.getEmail());

        assertEquals("Pedro", encontrado2.getNombre());
        assertEquals("pedro@ejemplo.com", encontrado2.getEmail());

        // Comprobar la cantidad total de registros.
        assertEquals(2, servicio.contarUsuarios());
    }
}