package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Usuario;

public interface UsuarioService {
    public List<Usuario> getAllUsuarios();
    public void agregarUsuario(Usuario u);
  
    public Usuario getUsuario(int dni);
    public int getDni(Usuario u);
    public void deleteUsuario(int dni); 
	public void updateUsuario(int dni);   
    
}