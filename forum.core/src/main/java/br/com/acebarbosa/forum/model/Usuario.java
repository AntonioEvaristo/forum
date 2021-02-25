package br.com.acebarbosa.forum.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Usuario {

    private static final long serialVersionUID = 3846037738735768333L;

    private Long id;
    private String nome;
    private String email;
    private String senha;

    private List<Perfil> perfis = new ArrayList<>();
}
