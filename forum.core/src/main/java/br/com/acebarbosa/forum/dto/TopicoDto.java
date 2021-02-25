package br.com.acebarbosa.forum.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

}
