package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Curso;
import com.instituto.app.model.Usuario;

/* Interface de la clase Curso  
 * lista los metodos que se pueden utilizar y acceder  
 * */

public interface CursoService {
	
	// agrega un curso	
	public void agregarCurso(Curso c);
	
	// devuelve todos los cursos
	public List<Curso> getAllCursos();
    
	// me devuelve informacion de un curso
	public Curso getCurso(int idcurso);
    
	// elimina un curso
	public void deleteCurso(int idcurso); 
	
	// actualiza un curso
	public void updateCurso(Curso u);
	
	// actualiza informacion cuando un profesor y su materia se asocia a un curso
	public void incrementarProfeMateria(int idcurso);
	
	// actualiza informacion cuando un profesor y su materia se desasocia a un curso
	public void decrementarProfeMateria(int idcurso);
	   
    // actualiza informacion cuando un alumno se asocia a un curso
    public void incrementarAlumnoCurso(int idcurso);
    
    // actualiza informacion cuando un alumno se desasocia a un curso
    public void decrementarAlumnoCurso(int idcurso);
	
    // devuelve la lista de alumnos asociados a un curso
    public List<Usuario> getAlumnosCurso(int idcurso);
    
    
}
