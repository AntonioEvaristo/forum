package br.com.acebarbosa.forum.port;

import br.com.acebarbosa.forum.model.Curso;

public interface CursoPort {

    Curso findByNome(String nome);
}
