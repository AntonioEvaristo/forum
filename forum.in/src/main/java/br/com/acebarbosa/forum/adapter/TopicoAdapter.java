package br.com.acebarbosa.forum.adapter;

import br.com.acebarbosa.forum.model.Topico;
import br.com.acebarbosa.forum.port.TopicoPort;
import br.com.acebarbosa.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TopicoAdapter implements TopicoPort {

    @Autowired
    private TopicoRepository topicoRepository;

    @Override
    public Topico save(Topico topico) {
        return topicoRepository.save(topico);
    }

    @Override
    public Optional<Topico> findById(Long id) {
        return topicoRepository.findById(id);
    }

    @Override
    public Page<Topico> findAll(Pageable page) {
        return topicoRepository.findAll(page);
    }

    @Override
    public Page<Topico> findByCursoNome(String nomeCurso, Pageable page) {
        return topicoRepository.findByCursoNome(nomeCurso, page);
    }

    @Override
    public void delete(Long id) {
        topicoRepository.deleteById(id);
    }
}
