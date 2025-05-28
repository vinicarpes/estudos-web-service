package br.edu.ifsc.fln.crudprodutoapi.service;

import br.edu.ifsc.fln.crudprodutoapi.domain.Produto;
import br.edu.ifsc.fln.crudprodutoapi.repository.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto novo(Produto p){
        produtoRepository.save(p);
        return p;
    }
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
    public ResponseEntity<Produto> get(int id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }
//    public void remover(int id){
////        for (Produto p: produtos){
////            if(p.getId()==id){
////                produtos.remove(p);
////              return;
////            }
////        }
//        produtos.removeIf(p -> p.getId() == id); //sugestao da ide
//    }
//    public Produto atualizar(Produto p){
//        for (int i=0; i< produtos.size();i++){
//            if (produtos.get(i).getId()== p.getId()){
//                produtos.set(i, p); //seta o Produto p na posição i, sobrepondo o obj
//            return produtos.get(i);
//            }
//        }
//        return null;
//    }
}
