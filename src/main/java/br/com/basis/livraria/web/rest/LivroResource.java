package br.com.basis.livraria.web.rest;

import br.com.basis.livraria.domain.Livro;
import br.com.basis.livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/livro")
public class LivroResource {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarTodos(){
        return livroService.listarToso();
    }
}
