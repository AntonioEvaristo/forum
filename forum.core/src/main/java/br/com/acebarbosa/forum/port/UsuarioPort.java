package br.com.acebarbosa.forum.port;

import br.com.acebarbosa.forum.model.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UsuarioPort {

    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    Page<Usuario> findAll(Pageable page);
    Page<Usuario> findByNome(String nome, Pageable page);
    Optional<Usuario> findByEmail(String email);
    void delete(Long id);

}
