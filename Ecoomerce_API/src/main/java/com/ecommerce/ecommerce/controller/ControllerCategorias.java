package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Categorias;
import com.ecommerce.ecommerce.service.CategoriaService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin("*")
public class ControllerCategorias {
    private CategoriaService categoriaService;

    public ControllerCategorias(@Autowired CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public List<Categorias> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }
    
}
