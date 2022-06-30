package com.example.institutoweb.service;

import java.util.List;
import java.util.Optional;

import com.example.institutoweb.interfaceService.IrolService;
import com.example.institutoweb.interfaces.Irol;
import com.example.institutoweb.model.Rol;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IrolService {

    //@Autowired
    private Irol data;

    @Override
    public List<Rol> listar() {
        

           return (List<Rol>)data.findAll();           
        // return null;
    }

    @Override
    public Optional<Rol> listarId(int id) {
       
        return null;
    }

    @Override
    public int getRol(Rol r) {
      
        return 0;
    }

    @Override
    public void borrarRol(int id) {
              
    }

}
