package com.instituto.app.repository;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.DatosLogin;

public interface LoginRepositorio extends JpaRepository<DatosLogin, Integer>{
	
	// devuelve el resultado de la consulta, es decir, si los datos son correcto, me devuelve en el string
	// el rol, caso contrario me da info usuario no existente o datos incorrectos.
	@Procedure(name="usuario.login")
	Map<String, Integer> spLogin(@Param("dni") int dni, @Param("clave") String clave);          
    }
