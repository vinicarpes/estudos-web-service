package br.edu.ifsc.fln.crudprodutoapi.controller;

import br.edu.ifsc.fln.crudprodutoapi.domain.Produto;
import br.edu.ifsc.fln.crudprodutoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired //faz o controle da instância do objeto
    private ProdutoService produtoService;

    @PostMapping("/novo")
    public Produto novo(@RequestBody Produto produto){ //post deve retornar um "corpo"
        return produtoService.novo(produto);
    }
    @GetMapping("/todos")
    public List<Produto> findAll(){
        return produtoService.findAll();
    }
    @GetMapping("/get/{id}")
    public Produto get(@PathVariable(value = "id") int id){
        return produtoService.get(id);
    }
}
