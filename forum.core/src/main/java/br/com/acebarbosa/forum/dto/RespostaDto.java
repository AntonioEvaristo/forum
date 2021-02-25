package br.com.acebarbosa.forum.dto;

import br.com.acebarbosa.forum.model.StatusTopico;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RespostaDto {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;
}
