package com.instituto.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Materia;


public interface MateriaRepositorio extends JpaRepository<Materia, Integer>{

	// elimina un materia
	@Procedure("spDeleteMateria")
	void spDeleteMateria(@Param("idmateria") int idmateria);
	
	// devuelve todas las materia
	@Procedure("spGetAllMateria")
	List<Materia> spGetAllMateria();
	
	// devuelve una materia
	@Procedure("spGetMateria")
	Materia spGetMateria(@Param("idmateria") int idmateria);
	
	// agrega una materia
	@Procedure("spInsertMateria")
	void spInsertMateria(@Param("idmateria") int idmateria, 
						 @Param("nombremateria") String nombremateria, 
						 @Param("urlprograma") String urlprograma);
	
	// actualiza una materia
	@Procedure("spUpdateMateria")
	void spUpdateMateria(@Param("idmateria") int idmateria, 
			 			 @Param("nombremateria") String nombremateria, 
			             @Param("urlprograma") String urlprograma);
	
}
