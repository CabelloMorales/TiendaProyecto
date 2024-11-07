package com.ecommerce.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ecommerce.model.Rol;

public interface RolRepository extends JpaRepository<Rol,Integer>{

    @Query(value = "Select * From roles", nativeQuery = true)
    List<Rol> GetAllRoles();
}  
    

