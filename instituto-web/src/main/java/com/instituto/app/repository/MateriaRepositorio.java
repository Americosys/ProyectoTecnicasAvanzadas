package com.instituto.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Materia;


public interface MateriaRepositorio extends JpaRepository<Materia, Integer>{

	@Procedure("spDeleteMateria")
	void spDeleteMateria(@Param("idmateria") int idmateria);
	
	@Procedure("spGetAllMateria")
	List<Materia> spGetAllMateria();
	
	@Procedure("spGetMateria")
	Materia spGetMateria(@Param("idmateria") int idmateria);
	
	@Procedure("spInsertMateria")
	void spInsertMateria(@Param("idmateria") int idmateria, 
						 @Param("nombremateria") String nombremateria, 
						 @Param("urlprograma") String urlprograma);
	
	@Procedure("spUpdateMateria")
	void spUpdateMateria(@Param("idmateria") int idmateria, 
			 			 @Param("nombremateria") String nombremateria, 
			             @Param("urlprograma") String urlprograma);
	
}
