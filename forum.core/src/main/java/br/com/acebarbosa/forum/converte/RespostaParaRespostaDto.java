package br.com.acebarbosa.forum.converte;

import br.com.acebarbosa.forum.dto.RespostaDto;
import br.com.acebarbosa.forum.model.Resposta;

public class RespostaParaRespostaDto {

    public static RespostaDto toModel(Resposta r){
        return RespostaDto.builder()
                .id(r.getId())
                    .dataCriacao(r.getDataCriacao())
                        .nomeAutor(r.getAutor().getNome())
                            .mensagem(r.getMessagem()).build();
    }
}
