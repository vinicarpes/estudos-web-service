package br.edu.ifsc.fln.crudprodutoapi.controller;

import br.edu.ifsc.fln.crudprodutoapi.domain.Categoria;
import br.edu.ifsc.fln.crudprodutoapi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("")
    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> get(@PathVariable int id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        if (categoria.isPresent()){
            return ResponseEntity.ok(categoria.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/descricao/{descricao}")
    public ResponseEntity<List<Categoria>> get(@PathVariable String descricao){
        List<Categoria> categorias = categoriaRepository.findByDescricaoContaining(descricao);
        if (!categorias.isEmpty()){
            return ResponseEntity.ok(categorias);
        }

        return ResponseEntity.notFound().build();
    }

}
