package br.com.basis.livraria.web.dto;

import br.com.basis.livraria.domain.Comentario;
import br.com.basis.livraria.domain.Livro;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class LivroDto {

    private Integer id;
    private String titulo;
    private String autor;
    private List<Comentario> comentarios;

    public LivroDto(Livro livro){
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
    }
}
