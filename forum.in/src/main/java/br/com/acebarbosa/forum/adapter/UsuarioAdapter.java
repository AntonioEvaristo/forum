package br.com.acebarbosa.forum.adapter;

import br.com.acebarbosa.forum.model.Usuario;
import br.com.acebarbosa.forum.port.UsuarioPort;
import br.com.acebarbosa.forum.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioAdapter implements UsuarioPort {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Page<Usuario> findAll(Pageable page) {
        return usuarioRepository.findAll(page);
    }

    @Override
    public Page<Usuario> findByNome(String nome, Pageable page) {
        return usuarioRepository.findByNome(nome, page);
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
