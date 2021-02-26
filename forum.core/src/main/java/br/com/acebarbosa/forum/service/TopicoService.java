package br.com.acebarbosa.forum.service;

import br.com.acebarbosa.forum.dto.TopicoDto;
import br.com.acebarbosa.forum.form.TopicoForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

public interface TopicoService {

    Page<TopicoDto> findAll(Pageable page);
    ResponseEntity<TopicoDto> findById(Long id);
    Page<TopicoDto> findByFilter(String nomeCurso, Pageable page);
    ResponseEntity<TopicoDto> save(TopicoForm topicoForm, UriComponentsBuilder uriComponentsBuilder);
    ResponseEntity<?> delete (Long id);



}
