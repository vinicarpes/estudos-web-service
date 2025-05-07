package br.edu.ifsc.fln.crudprodutoapi.repository;

import br.edu.ifsc.fln.crudprodutoapi.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository
        extends JpaRepository<Categoria, Integer> {

    public List<Categoria> findByDescricao(String descricao);
    public List<Categoria> findByDescricaoContaining(String descricao);

}
