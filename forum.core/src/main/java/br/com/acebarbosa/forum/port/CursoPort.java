package br.com.acebarbosa.forum.port;

import br.com.acebarbosa.forum.model.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CursoPort {
    Optional<Curso> retrieveCursoName(String nome);
    Page<Curso> findAll(Pageable page);
    Page<Curso>findByFilter(String categoria, Pageable page);
}
