package br.edu.ifsc.fln.crudprodutoapi.repository;

import br.edu.ifsc.fln.crudprodutoapi.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
