package br.com.acebarbosa.forum.controller;

import br.com.acebarbosa.forum.dto.TopicoDto;
import br.com.acebarbosa.forum.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/topicos")
public class TopicosController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public Page<TopicoDto> lista(@RequestParam(required = false)String nomeCurso, @RequestParam(value = "page", required = false) Integer page,
                                 @RequestParam(value ="per_page", required = false) Integer perPage){
        int lPage = 0;
        int lPerPage = 20;
        if (page != null && page > 0) {
            lPage = page - 1;
        }
        if (perPage != null && perPage <= 20 && perPage > 0) {
            lPerPage = perPage;
        }
        return topicoService.findAll(PageRequest.of(lPage,lPerPage));
    }

}
