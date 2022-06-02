package com.umet.institutoweb.impleInterfaces;
import java.util.ArrayList;
import java.util.List;
import com.umet.institutoweb.beans.Rol;
import com.umet.institutoweb.interfaces.UsuarioInterface;

import org.springframework.stereotype.Service;

// aca implementamos todas las fuciones de la interface del usuario

@Service
public class UsuarioInterfaceImple implements UsuarioInterface{
 
    public List<Rol> getListaRoles()
    {
        List<Rol> listaRoles = new ArrayList<Rol>();
        Rol rol = new Rol();
        rol.setIdRol(1);
        rol.setRol("prueba");
        listaRoles.add(rol);
        return listaRoles;
    }
}
