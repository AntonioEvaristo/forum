package br.com.acebarbosa.forum.adapter;

import br.com.acebarbosa.forum.converte.TopicoFormParaTopico;
import br.com.acebarbosa.forum.converte.TopicoParaTopicoDto;
import br.com.acebarbosa.forum.dto.TopicoDto;
import br.com.acebarbosa.forum.form.TopicoForm;
import br.com.acebarbosa.forum.model.Curso;
import br.com.acebarbosa.forum.model.Topico;
import br.com.acebarbosa.forum.port.CursoPort;
import br.com.acebarbosa.forum.port.TopicoPort;
import br.com.acebarbosa.forum.service.TopicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.Optional;

@Service
public class TopicoServiceImpl implements TopicoService {

    @Autowired
    private TopicoPort topicoPort;

    @Autowired
    private CursoPort cursoPort;

    private ModelMapper modelMapper;

    @Override
    public Page<TopicoDto> findAll(Pageable page) {
        return  topicoPort.findAll(page).map(TopicoParaTopicoDto::toModel);
    }

    @Override
    public ResponseEntity<TopicoDto> findById(Long id) {
        Optional<Topico> optional = topicoPort.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok(TopicoParaTopicoDto.toModel(optional.get()));
        }
            return ResponseEntity.notFound().build();
    }

    @Override
    public Page<TopicoDto> findByFilter(String nomeCurso, Pageable page) {
        return modelMapper.map(TopicoDto.class, topicoPort.findByCursoNome(nomeCurso,page).getClass());
    }

    @Override
    @Transactional
    public ResponseEntity<TopicoDto> save(TopicoForm topicoForm, UriComponentsBuilder uriComponentsBuilder) {
        Optional<Curso> optional = cursoPort.retrieveCursoName(topicoForm.getNomeCurso());
        Topico topico = TopicoFormParaTopico.toModel(topicoForm,optional);
        topicoPort.save(topico);
        URI uri = uriComponentsBuilder.path("/api/v1/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(TopicoParaTopicoDto.toModel(topico));
    }

    @Override
    @Transactional
    public ResponseEntity<?> delete(Long id) {
        Optional<Topico> optional = topicoPort.findById(id);
        if(optional.isPresent()){
            topicoPort.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
