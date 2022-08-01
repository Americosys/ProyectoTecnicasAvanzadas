package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Usuario;

/* Interface de la clase usuario  
 * lista los metodos que se pueden utilizar y acceder  
 * */

public interface UsuarioService {
	
	// devuelve todos los usuarios en una lista
    public List<Usuario> getAllUsuarios();
    
    // agrega un usuario
    public void agregarUsuario(Usuario u);
    
    // devuelve un usuario, al recibir como parametro, un dni
    public Usuario getUsuario(int dni);    
    
    // baja logica de un usuario, al recibir como parametro, un dni
    public void deleteUsuario(int dni); 
	
    // actualiza un usuario
    public void updateUsuario(Usuario u);   
	
    // devuelve los alumonos, en una lista, que pertenecen a un curso. Parametro de entrada id del curso
    public List<Usuario> getAlumnosCurso(int idcurso);
	
    // actualiza el dni de un alumno asociado a un curso
    public void actualizarCursoAlumno(int dni, int idcurso);	
}