package br.com.acebarbosa.forum.repository;

import br.com.acebarbosa.forum.model.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    Optional<Curso> findByNome(String nome);
    Page<Curso> findByCategoria(String categoria, Pageable pageable);
}
