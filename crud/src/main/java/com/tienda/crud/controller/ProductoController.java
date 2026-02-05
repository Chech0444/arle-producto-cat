package com.tienda.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.crud.entity.Producto;
import com.tienda.crud.service.ProductoService;

@RestController
@RequestMapping("api/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listar(){
        return productoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> listarPorId(@PathVariable Long id){
        return productoService.buscarPorId(id);
    }

    @PostMapping
    public Producto subir(@RequestBody Producto producto){
        return productoService.guardar(producto);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id){
        productoService.eliminarPorId(id);
    }

    @GetMapping("/categoria/{id}")
    public List<Producto> listaProductosPorCategoria(@PathVariable Long id){
        return productoService.buscarProductosPorCategoria(id);
    }
}
