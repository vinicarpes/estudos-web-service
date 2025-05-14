package br.edu.ifsc.fln.crudprodutoapi.repository;

import br.edu.ifsc.fln.crudprodutoapi.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository
        extends JpaRepository<Categoria, Integer> {

}
