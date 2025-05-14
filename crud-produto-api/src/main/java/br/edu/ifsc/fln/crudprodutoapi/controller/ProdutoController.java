package br.edu.ifsc.fln.crudprodutoapi.controller;

import br.edu.ifsc.fln.crudprodutoapi.domain.Categoria;
import br.edu.ifsc.fln.crudprodutoapi.domain.Produto;
import br.edu.ifsc.fln.crudprodutoapi.repository.CategoriaRepository;
import br.edu.ifsc.fln.crudprodutoapi.repository.ProdutoRepository;
import br.edu.ifsc.fln.crudprodutoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private CategoriaRepository categoriaRepository;
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository){
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping()
    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> get(@PathVariable Integer id){
        return produtoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Produto novo(@RequestBody Produto produto){
        produto = produtoRepository.save(produto);
        Optional<Categoria> categoria = categoriaRepository.findById(produto.getCategoria().getId());
        produto.setCategoria(categoria.get());
        return produto;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Integer id, @RequestBody Produto produto){
        if(!produtoRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        produto.setId(id);
        produtoRepository.save(produto);
        Optional<Categoria> categoria = categoriaRepository.findById(produto.getCategoria().getId());
        produto.setCategoria(categoria.get());
        return ResponseEntity.ok(produto);
    }

}