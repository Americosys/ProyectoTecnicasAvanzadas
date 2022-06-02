package com.umet.institutoweb.controladores;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.umet.institutoweb.beans.Rol;
import com.umet.institutoweb.interfaces.UsuarioInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// todos los web's services de usuario para hacer uso de las inmplementacion de las interfaces

@Controller
//@RequestMapping("/rest/usuarios")
@RequestMapping
public class UsuarioControlador {
    
    @Autowired
    private UsuarioInterface usuarioInterface;

    @RequestMapping(value = "/getListaRoles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public List<Rol> getListaRoles()
    {
        return usuarioInterface.getListaRoles();
    }
}
