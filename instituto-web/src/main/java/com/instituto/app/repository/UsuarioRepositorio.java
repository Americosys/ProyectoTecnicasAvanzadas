package com.instituto.app.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	@Procedure("spGetAllUsuario")
	List<Usuario> spGetAllUsuario();   
	
	
	//@Query
    @Procedure(name="spInsertUsuario")
    void spInsertUsuario(@Param("dni") int dni, @Param("idrol") int idrol, @Param("nickname") String nickname,
    		             @Param("clave") String clave, @Param("nombre") String nombre, @Param("nacimiento") Date nacimiento,
    		             @Param("edad") int edad, @Param("email") String email, @Param("direccion") String direccion,
    		             @Param("telefono") String telefono, 
    		             @Param("cargo") String cargo, 
    		             @Param("idcurso") int idcurso, 
    		             @Param("titulo") String titulo, @Param("experiencia") int experiencia    		             
    		            );    
    
  //@Query
    @Procedure(name="spGetUsuario")
    Usuario spGetUsuario(@Param("dni") int dni);
        
  //@Query
    @Procedure(name="spDeleteUsuario")
    void spDeleteUsuario(@Param("dni") int dni);
    
  //@Query
    @Procedure(name="spUpdateUsuario")
    void spUpdateUsuario(@Param("dni") int dni, @Param("idrol") int idrol, @Param("nickname") String nickname,
            			 @Param("clave") String clave, @Param("nombre") String nombre, @Param("nacimiento") Date nacimiento,
            			 @Param("edad") int edad, @Param("email") String email, @Param("direccion") String direccion,
            			 @Param("telefono") String telefono, @Param("activo") boolean activo, 
            			 @Param("cargo") String cargo, 
            			 @Param("idcurso") int idcurso, 
            			 @Param("titulo") String titulo, @Param("experiencia") int experiencia    		             
    					);

    
  //@Query
    @Procedure("spAlumnosCurso")
	List<Usuario> spAlumnosCurso(@Param("idcurso") int idcurso);

    //@Query
    @Procedure(name="spActualizarCursoAlumno")
	void spActualizarCursoAlumno(@Param("dni") int dni, @Param("idcurso") int idcurso);    
    
    
}
