package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.model.Usuarios;
import com.ecommerce.ecommerce.repository.UsuariosRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuariosService {
    
    UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }

     public  List<Usuarios> getAll() {
        return usuariosRepository.GetAllUsuarios();
    }
}
