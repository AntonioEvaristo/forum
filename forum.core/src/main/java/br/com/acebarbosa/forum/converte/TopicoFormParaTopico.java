package br.com.acebarbosa.forum.converte;

import br.com.acebarbosa.forum.dto.TopicoDto;
import br.com.acebarbosa.forum.form.TopicoForm;
import br.com.acebarbosa.forum.model.Curso;
import br.com.acebarbosa.forum.model.Topico;

import java.util.Optional;

public class TopicoFormParaTopico {

    public static Topico toModel(TopicoForm t, Optional<Curso> c){
        return Topico.builder()
                .titulo(t.getTitulo())
                    .mensagem(t.getMensagem())
                        .curso(c.get()).build();
    }
}
