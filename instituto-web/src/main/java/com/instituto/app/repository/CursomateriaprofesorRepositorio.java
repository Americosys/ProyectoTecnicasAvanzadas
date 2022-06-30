package com.instituto.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Cursomateriaprofesor;

public interface CursomateriaprofesorRepositorio extends JpaRepository<Cursomateriaprofesor, Integer> {


    @Procedure(name="spInsertCursoMateriaProfesor")
    void spInsertCursoMateriaProfesor(@Param("idcurso") int idcurso, @Param("idmateria") int idmateria, 
			   	                      @Param("dniprofesor") int dniprofesor);    					 
		
    @Procedure(name="spGetCursoMateriaProfesor")
    List<Cursomateriaprofesor> spGetCursoMateriaProfesor(@Param("idcurso") int idcurso);    					 
    
    @Procedure(name="spDeleteCursoMateriaProfesor")
    void spDeleteCursoMateriaProfesor(@Param("id") int id );

    
    @Procedure(name="spUpDateCursoMateriaProfesor")
    void spUpDateCursoMateriaProfesor(@Param("id") int id, @Param("idcurso") int idcurso, @Param("idmateria") int idmateria, 
			   						  @Param("dniprofesor") int dniprofesor);

    @Procedure(name="spGetIdCursoRegistro")
	int spGetIdCursoRegistro(@Param("id") int id);
	
}
