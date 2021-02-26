package br.com.acebarbosa.forum.adapter;

import br.com.acebarbosa.forum.model.Curso;
import br.com.acebarbosa.forum.port.CursoPort;
import br.com.acebarbosa.forum.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CursoAdapter implements CursoPort {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Optional<Curso> retrieveCursoName(String nome) {
        return cursoRepository.findByNome(nome);
    }

    @Override
    public Page<Curso> findAll(Pageable page) {
        return cursoRepository.findAll(page);
    }

    @Override
    public Page<Curso> findByFilter(String categoria, Pageable page) {
        return cursoRepository.findByCategoria(categoria,page);
    }
}
