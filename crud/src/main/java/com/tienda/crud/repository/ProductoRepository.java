package com.tienda.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.crud.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    List<Producto> findByCategoryId(Long categoryId);
}
