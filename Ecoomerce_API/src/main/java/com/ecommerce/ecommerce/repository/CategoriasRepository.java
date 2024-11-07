package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ecommerce.model.Categorias;

public interface CategoriasRepository  extends JpaRepository<Categorias, Integer>{
    @Query(value = "SELECT * FROM categorias", nativeQuery  = true)
    List<Categorias> findAllCategorias();
    
}
