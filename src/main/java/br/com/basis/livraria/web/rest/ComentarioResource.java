package br.com.basis.livraria.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comentario")
public class ComentarioResource {

    @GetMapping
    public String hello(){
        return "Hello word";
    }
}
