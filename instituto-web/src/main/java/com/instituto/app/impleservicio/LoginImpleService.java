package com.instituto.app.impleservicio;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instituto.app.model.DatosLogin;
import com.instituto.app.repository.LoginRepositorio;
import com.instituto.app.service.LoginService;

@Service
public class LoginImpleService implements LoginService{

	
	@Autowired
	private LoginRepositorio loginRepositorio;
	
	// devuelve el resultado de la consulta, es decir, si los datos son correcto, me devuelve en el string
	// el rol, caso contrario me da info usuario no existente o datos incorrectos.
	@Override
	@Transactional()
	public Map<String, Integer> conectar(int dni, String clave) {
		Map<String, Integer> mapa = loginRepositorio.spLogin(dni, clave);
		return mapa;
	}
}
