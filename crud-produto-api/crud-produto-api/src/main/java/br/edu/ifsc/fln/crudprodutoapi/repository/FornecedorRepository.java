package br.edu.ifsc.fln.crudprodutoapi.repository;

import br.edu.ifsc.fln.crudprodutoapi.domain.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
}
