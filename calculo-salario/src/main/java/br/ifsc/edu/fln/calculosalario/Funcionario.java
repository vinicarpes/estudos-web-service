package br.ifsc.edu.fln.calculosalario;

public class Funcionario {
    private int matricula;
    private double salarioBase;
    private int numeroDependentes;
    private String nome;

    public Funcionario(String nome, double salarioBase, int numeroDependentes) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.numeroDependentes = numeroDependentes;
    }

    public Funcionario(int matricula, String nome, double salarioBase, int numeroDependentes) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.numeroDependentes = numeroDependentes;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularSalarioLiquido() {
        System.out.println(salarioBase);
        return salarioBase - calcularIrpf() + calcularSalarioFamiliar();
    }

    public double calcularIrpf() {
        if (salarioBase >= 8500.0) {
            return salarioBase * 0.275;
        } else if (salarioBase >= 5000) {
            return salarioBase * 0.15;
        } else {
            return 0.0;
        }
    }

    public double calcularSalarioFamiliar() {
        return numeroDependentes *150;
    }
}
