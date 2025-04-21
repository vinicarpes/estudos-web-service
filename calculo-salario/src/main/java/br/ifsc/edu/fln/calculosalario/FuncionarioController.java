package br.ifsc.edu.fln.calculosalario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {
    @RequestMapping("/funcionarios/calcular_salario/{matricula}")
    public double calcularSalario(@PathVariable(value = "matricula") int matricula){

        return FuncionarioDataSource.getFuncionario(matricula).calcularSalarioLiquido();
    }

    @RequestMapping("/new/{matricula}/{nome}/{salarioBase}/{dependentes}")
    public Funcionario novoFuncionario(@PathVariable(value = "nome") String nome,
                                       @PathVariable(value = "matricula") int matricula,
                                       @PathVariable(value = "salarioBase") double salarioBase,
                                       @PathVariable(value = "dependentes") int dependentes){

        Funcionario funcionario = new Funcionario(matricula, nome, salarioBase, dependentes);

        FuncionarioDataSource.addFuncionario(funcionario);

        return funcionario;
    }

    @RequestMapping("/funcionarios")
    public List<Funcionario> funcionarios(){
        return FuncionarioDataSource.getFuncionarios();
    }

    @RequestMapping("/funcionarios/{matricula}")
    public Funcionario buscarFuncionario(@PathVariable(value = "matricula") int matricula){
        return FuncionarioDataSource.getFuncionario(matricula);
    }
}
