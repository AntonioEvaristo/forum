package br.com.acebarbosa.forum.service;

import br.com.acebarbosa.forum.dto.TopicoDto;
import br.com.acebarbosa.forum.form.TopicoForm;
import org.springframework.data.domain.Page;
import org.springframework.web.util.UriComponentsBuilder;

public interface TopicoService {

    Page<TopicoDto> findAll();
    TopicoDto findById(Long id);
    TopicoDto findByFilter(String titulo);
    TopicoDto save(TopicoForm topicoForm, UriComponentsBuilder uriComponentsBuilder);
    void delete (Long id);



}
