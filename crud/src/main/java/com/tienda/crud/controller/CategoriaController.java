package com.tienda.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.crud.entity.Categoria;
import com.tienda.crud.service.CategoriaService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar(){
        return categoriaService.buscarTodos();
    }

    @PostMapping
    public Categoria subir(@RequestBody Categoria categoria){
        return categoriaService.guardar(categoria);
    }
}
