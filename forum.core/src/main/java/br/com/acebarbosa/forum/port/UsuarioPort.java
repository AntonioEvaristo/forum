package br.com.acebarbosa.forum.port;

import br.com.acebarbosa.forum.model.Usuario;

import java.util.Optional;

public interface UsuarioPort {

    Optional<Usuario> findByEmail(String email);
}
