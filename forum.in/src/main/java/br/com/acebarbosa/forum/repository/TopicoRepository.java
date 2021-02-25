package br.com.acebarbosa.forum.repository;

import br.com.acebarbosa.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
