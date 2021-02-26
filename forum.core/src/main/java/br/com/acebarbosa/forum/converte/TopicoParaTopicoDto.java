package br.com.acebarbosa.forum.converte;

import br.com.acebarbosa.forum.dto.TopicoDto;
import br.com.acebarbosa.forum.model.Topico;

import java.util.stream.Collectors;

public class TopicoParaTopicoDto {

    public static TopicoDto toModel(Topico topico){
       return TopicoDto.builder()
              .id(topico.getId())
                .dataCriacao(topico.getDataCriacao())
                    .mensagem(topico.getMensagem())
                        .nomeAutor(topico.getAutor().getNome())
                            .respostas(topico.getRespostas().stream().map(RespostaParaRespostaDto::toModel).collect(Collectors.toList()))
                                .status(topico.getStatus())
                                    .titulo(topico.getTitulo()).build();
    }
}
