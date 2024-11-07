package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.model.Categorias;
import com.ecommerce.ecommerce.repository.CategoriasRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoriaService {
    
    private CategoriasRepository categoriasRepository;

    public CategoriaService(CategoriasRepository categoriasRepository){
        this.categoriasRepository = categoriasRepository;
    }

    public List<Categorias> getAllCategorias(){
        return (List<Categorias>)categoriasRepository.findAll();
    }
}
