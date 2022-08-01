package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Cursomateriaprofesor;

/* Interface de la clase cursomateriaprofesor  
 * lista los metodos que se pueden utilizar y acceder  
 * */
public interface CursomateriaprofesorService {

	//Agrega un materia con un profe a un curso
	public void insertCursoMateProfe(Cursomateriaprofesor cmp);
	
	// retorna registros de un curso (materias con sus profesores)
	public List<Cursomateriaprofesor> getDetalleCurso(int idcurso);  

	// elimina un registro 
	public void deleteRegistroCurso(int id); 
	
	// devuelve el id de un curso recibiendo como parametro un id (registro)  
	public int getIdCursoRegistro(int id); 
	
	
	//actualiza un curso, materia profesor
	public void updateRegistroCurso(Cursomateriaprofesor cmp);

	
}
