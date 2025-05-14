package br.edu.ifsc.fln.produtoapi.model.datasource;

import br.edu.ifsc.fln.produtoapi.model.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataSource {
    private static List<Produto> listaProdutos = new ArrayList<>();

    public static void criarLista(){
        listaProdutos.add(new Produto(1, "TV 85", 2, 45000, 30));
        listaProdutos.add(new Produto(2, "IPhone 16", 10, 12500, 49));
        listaProdutos.add(new Produto(3, "Galaxy Tab S6", 7, 1980, 35));
        listaProdutos.add(new Produto(4, "Microondas", 5, 855, 25));
        listaProdutos.add(new Produto(5, "Notebook ACER", 12, 3200, 22));
    }

    public static List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public static void setListaProdutos(List<Produto> listaProdutos) {
        ProdutoDataSource.listaProdutos = listaProdutos;
    }

    public static double getPrecoVenda(int id) {
        double precoVenda = 0;
        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                precoVenda = p.calcularPrecoVenda();
            }
        }
        return precoVenda;
    }

    public static Produto adc(Produto produto){
        listaProdutos.add(produto);
        return produto;
    }


}
