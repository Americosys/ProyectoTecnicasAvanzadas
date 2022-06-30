package com.instituto.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Curso;
import com.instituto.app.model.Usuario;

public interface CursoRepositorio  extends JpaRepository<Curso, Integer> {

    @Procedure(name="spInsertCurso")
    void spInsertCurso(@Param("idcurso") int dni, @Param("nombre") String nombre, @Param("anio") int anio);    					 
		
	@Procedure("spGetAllCursos")
	List<Curso> spGetAllCursos();
		
    @Procedure(name="spGetCurso")
    Curso spGetCurso(@Param("idcurso") int idcurso);
    
    @Procedure(name="spDeleteCurso")
    void spDeleteCurso(@Param("idcurso") int idcurso);

    
    @Procedure(name="spUpdateCurso")
    void spUpdateCurso(@Param("idcurso") int dni, @Param("nombre") String nombre, @Param("anio") int anio);

    @Procedure(name="spGetAllProfe")
	List<Usuario> spGetAllProfe(int idcurso);

    @Procedure(name="spGetAlumnosCurso")
	List<Usuario> spGetAlumnosCurso(int idcurso);
    
    @Procedure(name="spGetAllMate")
	List<Usuario> spGetAllMate(int idcurso);

    
    @Procedure(name="spincrementarProfeMateria")
	void spincrementarProfeMateria(int idcurso);    
    
    @Procedure(name="spdecrementarProfeMateria")	
	void spdecrementarProfeMateria(int idcurso);

    @Procedure(name="spincrementarAlumnoCurso")
	void spincrementarAlumnoCurso(int idcurso);   					 

    @Procedure(name="spdecrementarAlumnoCurso")
	void spdecrementarAlumnoCurso(int idcurso);     
    
    
    
    
    
	
}
