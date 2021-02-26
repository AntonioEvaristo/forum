package br.com.acebarbosa.forum.port;

import br.com.acebarbosa.forum.model.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TopicoPort {
    Topico save(Topico topico);
    Optional<Topico> findById(Long id);
    Page<Topico> findAll(Pageable page);
    Page<Topico> findByCursoNome(String nomeCurso, Pageable page);
    void delete(Long id);
}
