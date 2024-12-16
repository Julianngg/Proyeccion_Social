package com.ofex.psocial.service;

import com.ofex.psocial.models.Rol;
import com.ofex.psocial.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    @Autowired
    private RolRepository repository;

    public void addRol (Rol rol){
        repository.save(rol);
    }
}
