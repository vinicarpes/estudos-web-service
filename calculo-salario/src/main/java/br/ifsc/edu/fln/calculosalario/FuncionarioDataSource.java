package br.ifsc.edu.fln.calculosalario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static void setFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDataSource.funcionarios = funcionarios;
    }

    public static void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static Funcionario getFuncionario(int matricula) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula() == matricula) {
                return funcionario;
            }
        }
        return null;
    }
}
