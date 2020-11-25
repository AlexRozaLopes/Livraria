package br.com.basis.livraria.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Byte avaliacao;
    private String descricao;
    private LocalDateTime criacao;
    @ManyToOne
    private Livro livros;
    @ManyToOne
    private Usuario usuario;

}
