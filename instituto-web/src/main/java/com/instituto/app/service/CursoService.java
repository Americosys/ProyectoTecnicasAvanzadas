package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Curso;
import com.instituto.app.model.Usuario;


public interface CursoService {
	
	public void agregarCurso(Curso c);
	public List<Curso> getAllCursos();
    public Curso getCurso(int idcurso);
    public void deleteCurso(int idcurso); 
	public void updateCurso(Curso u);
	
	public void incrementarProfeMateria(int idcurso);
	public void decrementarProfeMateria(int idcurso);
	   
    
    public void incrementarAlumnoCurso(int idcurso);
    public void decrementarAlumnoCurso(int idcurso);
	public List<Usuario> getAlumnosCurso(int idcurso);
    
    
}
