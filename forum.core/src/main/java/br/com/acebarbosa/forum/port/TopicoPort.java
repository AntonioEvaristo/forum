package br.com.acebarbosa.forum.port;

import br.com.acebarbosa.forum.model.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TopicoPort {
    Page<Topico> findByCursoNome(String nomeCurso, Pageable pageable);
}
