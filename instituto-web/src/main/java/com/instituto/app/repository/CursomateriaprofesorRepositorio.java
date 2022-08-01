package com.instituto.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Cursomateriaprofesor;

public interface CursomateriaprofesorRepositorio extends JpaRepository<Cursomateriaprofesor, Integer> {

	// inserta un profesor con su materia a un curso
    @Procedure(name="spInsertCursoMateriaProfesor")
    void spInsertCursoMateriaProfesor(@Param("idcurso") int idcurso, @Param("idmateria") int idmateria, 
			   	                      @Param("dniprofesor") int dniprofesor);    					 

	// devuelve una lista de profesores con su materias de un curso
    @Procedure(name="spGetCursoMateriaProfesor")
    List<Cursomateriaprofesor> spGetCursoMateriaProfesor(@Param("idcurso") int idcurso);    					 
    
    // elimina un registro de los profesores con su materias que pertenecen a un curso
    @Procedure(name="spDeleteCursoMateriaProfesor")
    void spDeleteCursoMateriaProfesor(@Param("id") int id );

    // actualza curso materia profesor de un curso pero de un registro especifico    
    @Procedure(name="spUpDateCursoMateriaProfesor")
    void spUpDateCursoMateriaProfesor(@Param("id") int id, @Param("idcurso") int idcurso, @Param("idmateria") int idmateria, 
			   						  @Param("dniprofesor") int dniprofesor);

    // devuelve info de id de un registro de cursos
    @Procedure(name="spGetIdCursoRegistro")
	int spGetIdCursoRegistro(@Param("id") int id);
	
}
