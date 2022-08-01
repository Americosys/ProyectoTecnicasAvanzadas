package com.instituto.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Curso;
import com.instituto.app.model.Usuario;

public interface CursoRepositorio  extends JpaRepository<Curso, Integer> {

	// agrega un curso	
    @Procedure(name="spInsertCurso")
    void spInsertCurso(@Param("idcurso") int dni, @Param("nombre") String nombre, @Param("anio") int anio);    					 
    
    // devuelve una lista de cursos
	@Procedure("spGetAllCursos")
	List<Curso> spGetAllCursos();
    
    // devuelve info de un curso
    @Procedure(name="spGetCurso")
    Curso spGetCurso(@Param("idcurso") int idcurso);
    
    // elimina un curso
    @Procedure(name="spDeleteCurso")
    void spDeleteCurso(@Param("idcurso") int idcurso);
    
    // actualiza un curso   
    @Procedure(name="spUpdateCurso")
    void spUpdateCurso(@Param("idcurso") int dni, @Param("nombre") String nombre, @Param("anio") int anio);
    
    // devuelve todos los profesores de un curso
    @Procedure(name="spGetAllProfe")
	List<Usuario> spGetAllProfe(int idcurso);
    
    // devuelve todos los alumnos de un curso
    @Procedure(name="spGetAlumnosCurso")
	List<Usuario> spGetAlumnosCurso(int idcurso);
    
    // devuelve todos las materias de un curso
    @Procedure(name="spGetAllMate")
	List<Usuario> spGetAllMate(int idcurso);

    // incrementa la cantidad de profesor con su materia de un curso 
    @Procedure(name="spincrementarProfeMateria")
	void spincrementarProfeMateria(int idcurso);    
    
    // decrementa la cantidad de profesor con su materia de un curso
    @Procedure(name="spdecrementarProfeMateria")	
	void spdecrementarProfeMateria(int idcurso);
    
    // incrementa la cantidad de alunos de un curso 
    @Procedure(name="spincrementarAlumnoCurso")
	void spincrementarAlumnoCurso(int idcurso);   					 
    
    // decrementa la cantidad de alunos de un curso
    @Procedure(name="spdecrementarAlumnoCurso")
	void spdecrementarAlumnoCurso(int idcurso);     
    
}
