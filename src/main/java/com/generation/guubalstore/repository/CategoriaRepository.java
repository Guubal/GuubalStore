package com.generation.guubalstore.repository;

import com.generation.guubalstore.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
