package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Usuarios;
import com.ecommerce.ecommerce.service.UsuariosService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("*")
public class ControllerUsuario {
    
    private  UsuariosService usuariosService;

    public  ControllerUsuario(@Autowired  UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping("/usuarios")
    public List<Usuarios> GetAllUsuarios() {
        return usuariosService.getAll();
    }
    

}
