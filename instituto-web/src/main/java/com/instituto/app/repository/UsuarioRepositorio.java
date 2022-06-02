package com.instituto.app.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	@Procedure("spGetAllUsuario")
	List<Usuario> spGetAllUsuario();   
	
	
	//@Query(value = "CALL spInsertUsuario(:year_in);", nativeQuery = true)
	//void findCarsAfterYear(@Param("year_in") Integer year_in);
		
	//@Query
    @Procedure(name="spInsertUsuario")
    void spInsertUsuario(@Param("dni") int dni, @Param("idrol") int idrol, @Param("nickname") String nickname,
    		             @Param("clave") String clave, @Param("nombre") String nombre, @Param("nacimiento") Date nacimiento,
    		             @Param("edad") int edad, @Param("email") String email, @Param("direccion") String direccion,
    		             @Param("telefono") String telefono, 
    		             @Param("cargo") String cargo, 
    		             @Param("anioencurso") int anioencurso, @Param("idcurso") int idcurso, 
    		             @Param("titulo") String titulo, @Param("experiencia") int experiencia    		             
    		            );              
    
}
