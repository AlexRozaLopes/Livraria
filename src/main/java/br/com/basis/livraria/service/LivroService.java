package br.com.basis.livraria.service;

import br.com.basis.livraria.domain.Livro;
//import br.com.basis.livraria.repository.LIvroRepository;
import br.com.basis.livraria.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service @AllArgsConstructor
public class LivroService {

//    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarToso(){

        return livroRepository.findAll();
    }
}
