package br.edu.ifsc.fln.crudprodutoapi.controller;

import br.edu.ifsc.fln.crudprodutoapi.domain.Fornecedor;
import br.edu.ifsc.fln.crudprodutoapi.repository.FornecedorRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    private FornecedorRepository fornecedorRepository;

    public FornecedorController(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }
    @GetMapping()
    public List<Fornecedor> get(){
        return fornecedorRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> get(@PathVariable int id){
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        return fornecedor.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Fornecedor> post(@RequestBody @Valid Fornecedor fornecedor){
        return fornecedor.map(value-> ResponseEntity.ok().body(fornecedorRepository.save(value))).orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
