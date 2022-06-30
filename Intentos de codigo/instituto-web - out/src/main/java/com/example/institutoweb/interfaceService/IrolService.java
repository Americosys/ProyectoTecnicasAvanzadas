package com.example.institutoweb.interfaceService;
import java.util.Optional;
import java.util.List;
import com.example.institutoweb.model.Rol;

public interface IrolService {
    public List<Rol> listar();
    public Optional<Rol> listarId(int id);
    public int getRol(Rol r);
    public void borrarRol(int id); 
}
