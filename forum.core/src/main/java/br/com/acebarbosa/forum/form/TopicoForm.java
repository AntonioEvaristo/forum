package br.com.acebarbosa.forum.form;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TopicoForm {

	private String titulo;
	private String mensagem;
	private String nomeCurso;

}
