package com.instituto.app.impleservicio;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instituto.app.model.Usuario;
import com.instituto.app.repository.CREATE;
import com.instituto.app.repository.IN;
import com.instituto.app.repository.UsuarioRepositorio;
import com.instituto.app.service.UsuarioService;

@Service
public class UsuarioImpleService implements UsuarioService{

	
	@Autowired
	private UsuarioRepositorio usuarioRepo;
		
	@Override
	@Transactional()
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = usuarioRepo.spGetAllUsuario();
		return usuarios;
	}


	@Override
	@Transactional()
	public void agregarUsuario(Usuario u){	
		usuarioRepo.spInsertUsuario(u.getDni(),u.getIdrol(),u.getNickname(),u.getClave(),u.getNombre(),u.getNacimiento(),
				                    u.getEdad(),u.getEmail(), u.getDireccion(),u.getTelefono(),
				                    "Director",
				                    1,1,
				                    "",0);
	}	
	
	@Override
	public Usuario getUsuario(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override	
	public int getDni(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteUsuario(int dni) {
		// TODO Auto-generated method stub
		
	}

	public void updateUsuario(int dni) {
		// TODO Auto-generated method stub
		
	}
	
}
