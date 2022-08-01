package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Materia;

/* Interface de la clase Materia  
 * lista los metodos que se pueden utilizar y acceder  
 * */
public interface MateriaService {
	// eliminar una materia, al recibir como parametro, un id de materia
	public void deleteMateria(int idmateria);

	// devuelve todas las materias en una lista
	public List<Materia> getAllMateria();
	
	// devuelve los datos de un materia, al recibir como pametro, un id de materia
	public Materia getMateria(int idmateria);
	
	// agrega un materia, 
	public void insertMateria(Materia m);
	
	// actualiza una materia
	public void updateMateria(Materia m);
}
