package br.edu.ifsc.fln.crudprodutoapi.repository;

import br.edu.ifsc.fln.crudprodutoapi.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
