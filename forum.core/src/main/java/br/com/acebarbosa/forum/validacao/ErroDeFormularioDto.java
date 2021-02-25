package br.com.acebarbosa.forum.validacao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErroDeFormularioDto {

    private String campo;
    private String erro;
}
