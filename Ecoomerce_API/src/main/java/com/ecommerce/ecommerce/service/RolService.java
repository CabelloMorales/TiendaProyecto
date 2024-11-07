package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.model.Rol;
import com.ecommerce.ecommerce.repository.RolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolService {
    
    private RolRepository  rolRepository;

    public  RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public  List<Rol> getAllRoles() {
        return rolRepository.GetAllRoles();
    }

}
