package br.edu.ifsc.fln.produtoapi.model.domain;

public class Produto {
    private int id;
    private String nome;
    private int qtd;
    private double preco;
    private int margemLucro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(int margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Produto(int id, String nome, int qtd, double preco, int margemLucro) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
        this.margemLucro = margemLucro;
    }

    public double calcularPrecoVenda(){
        return preco + (preco*margemLucro/100);
    }
}
