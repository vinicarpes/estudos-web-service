package br.edu.ifsc.fln.produtoapi;

import br.edu.ifsc.fln.produtoapi.model.datasource.ProdutoDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoApiApplication {

    public static void main(String[] args) {
        ProdutoDataSource.criarLista();
        SpringApplication.run(ProdutoApiApplication.class, args);
    }

}
