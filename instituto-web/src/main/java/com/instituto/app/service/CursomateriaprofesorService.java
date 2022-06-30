package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Cursomateriaprofesor;

public interface CursomateriaprofesorService {

	//Agrega un materia con un profe a un curso
	public void insertCursoMateProfe(Cursomateriaprofesor cmp);
	
	// retorna registros de un curso (materias con sus profesores)
	public List<Cursomateriaprofesor> getDetalleCurso(int idcurso);  

	//elimina un registro 
	public void deleteRegistroCurso(int id); 
	
	//elimina un registro 
	public int getIdCursoRegistro(int id); 
	
	
	//actualiza un registro
	public void updateRegistroCurso(Cursomateriaprofesor cmp);

	
}
