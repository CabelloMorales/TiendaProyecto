package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ecommerce.model.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer>{
    @Query(value = "Select * from  usuarios", nativeQuery = true)
    List<Usuarios> GetAllUsuarios();

    
}
