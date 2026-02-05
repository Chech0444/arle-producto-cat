package com.tienda.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.crud.entity.Producto;
import com.tienda.crud.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos(){
        return productoRepository.findAll();
    }

    public Optional<Producto> buscarPorId(Long id){
        return productoRepository.findById(id);
    }

    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    public void eliminarPorId(Long id){
        productoRepository.deleteById(id);
    }

    public List<Producto> buscarProductosPorCategoria(Long id){
        return productoRepository.findByCategoryId(id);
    }
}
