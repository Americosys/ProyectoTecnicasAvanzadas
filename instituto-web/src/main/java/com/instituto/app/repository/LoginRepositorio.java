package com.instituto.app.repository;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.instituto.app.model.DatosLogin;

public interface LoginRepositorio extends JpaRepository<DatosLogin, Integer>{
	
	@Procedure(name="usuario.login")
	Map<String, Integer> spLogin(@Param("dni") int dni, @Param("clave") String clave);          
    }
