package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Rol;
import com.ecommerce.ecommerce.service.RolService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin("*")
public class ControllerRol {
    
    private RolService rolService;

    public ControllerRol(@Autowired RolService rolService){
        this.rolService = rolService;
    }
    @GetMapping("/roles")  
    public List<Rol> GetAllRoles(){
        return rolService.getAllRoles();
    }

}
