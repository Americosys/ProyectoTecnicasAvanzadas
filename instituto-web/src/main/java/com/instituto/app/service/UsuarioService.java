package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Usuario;

public interface UsuarioService {
    public List<Usuario> getAllUsuarios();
    public void agregarUsuario(Usuario u);
    public Usuario getUsuario(int dni);    
    public void deleteUsuario(int dni); 
	public void updateUsuario(Usuario u);   
	public List<Usuario> getAlumnosCurso(int idcurso);
	public void actualizarCursoAlumno(int dni, int idcurso);	
}