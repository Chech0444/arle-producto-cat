package com.tienda.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.crud.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
