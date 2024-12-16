package com.ofex.psocial.controllers;

import com.ofex.psocial.models.Rol;
import com.ofex.psocial.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class RolController {
    @Autowired
    private RolService service;

    @GetMapping("/guardar")
    public String addRol(Rol rol){
        Rol addRol = new Rol(null, "administrador", "Administrador");
        service.addRol(addRol);
        return "views";
    }
}
