package br.edu.ifsc.fln.crudprodutoapi.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
//@Getter
//@Setter
@Data
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private int quantidade;


}
