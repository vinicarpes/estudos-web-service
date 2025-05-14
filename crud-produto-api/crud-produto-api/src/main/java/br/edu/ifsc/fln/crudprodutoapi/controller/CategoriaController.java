package br.edu.ifsc.fln.crudprodutoapi.controller;

import br.edu.ifsc.fln.crudprodutoapi.domain.Categoria;
import br.edu.ifsc.fln.crudprodutoapi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("")
    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }

    @PostMapping("/novo")
    public void criar(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
    }

}
