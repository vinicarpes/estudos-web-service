package br.edu.ifsc.fln.crudprodutoapi.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    private int quantidade;


}
