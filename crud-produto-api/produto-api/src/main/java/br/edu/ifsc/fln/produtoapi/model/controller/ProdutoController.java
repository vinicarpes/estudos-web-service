package br.edu.ifsc.fln.produtoapi.model.controller;

import br.edu.ifsc.fln.produtoapi.model.datasource.ProdutoDataSource;
import br.edu.ifsc.fln.produtoapi.model.domain.Produto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProdutoController {
    @RequestMapping("/produtos")
    public List<Produto> listar(){
        return ProdutoDataSource.getListaProdutos();
    }
    @RequestMapping(value = "/produtos/{id}")
    public double precoVenda(@PathVariable("id") int id){
        return ProdutoDataSource.getPrecoVenda(id);
    }
    @RequestMapping(value = "/produtos/add/{id}/{nome}/{qtd}/{preco}/{margemLucro}")
    public Produto novo(@PathVariable(value = "id") int id,
                        @PathVariable(value = "nome")String nome,
                        @PathVariable(value = "qtd")int qtd,
                        @PathVariable(value = "preco")double preco,
                        @PathVariable(value = "margemLucro")int margemLucro){
        Produto produto = new Produto(id, nome, qtd, preco, margemLucro);
        return ProdutoDataSource.adc(produto);
    }
}
