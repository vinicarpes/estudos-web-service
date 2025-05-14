package br.edu.ifsc.fln.crudprodutoapi.service;

import br.edu.ifsc.fln.crudprodutoapi.domain.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public Produto novo(Produto p){
        produtos.add(p);
        return produtos.get(produtos.size() -1);
    }
    public List<Produto> findAll(){
        return produtos;
    }
    public Produto get(int id){
        for (Produto p: produtos){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public void remover(int id){
//        for (Produto p: produtos){
//            if(p.getId()==id){
//                produtos.remove(p);
//              return;
//            }
//        }
        produtos.removeIf(p -> p.getId() == id); //sugestao da ide
    }
    public Produto atualizar(Produto p){
        for (int i=0; i< produtos.size();i++){
            if (produtos.get(i).getId()== p.getId()){
                produtos.set(i, p); //seta o Produto p na posição i, sobrepondo o obj
            return produtos.get(i);
            }
        }
        return null;
    }
}
