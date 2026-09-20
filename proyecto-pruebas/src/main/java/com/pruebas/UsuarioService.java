package com.pruebas;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private final List<Usuario> usuarios = new ArrayList<>();

    // Registra un usuario validando sus datos.
    public boolean registrarUsuario(Usuario usuario) {

        if (usuario == null ||
            usuario.getNombre() == null ||
            usuario.getNombre().isBlank() ||
            usuario.getEmail() == null ||
            !usuario.getEmail().contains("@")) {

            return false;
        }

        // Evita registrar usuarios con ID duplicado.
        if (buscarUsuario(usuario.getId()) != null) {
            return false;
        }

        usuarios.add(usuario);
        return true;
    }

    // Busca un usuario mediante su identificador.
    public Usuario buscarUsuario(int id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    // Devuelve la cantidad de usuarios registrados.
    public int contarUsuarios() {
        return usuarios.size();
    }
}