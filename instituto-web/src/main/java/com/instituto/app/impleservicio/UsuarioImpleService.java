package com.instituto.app.impleservicio;

//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.instituto.app.model.Usuario;
import com.instituto.app.repository.UsuarioRepositorio;
import com.instituto.app.service.UsuarioService;

@Service
public class UsuarioImpleService implements UsuarioService{

	
	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	// baja logica
	@Override
	@Transactional()
	public void deleteUsuario(int dni) {
		// TODO Auto-generated method stub
		usuarioRepo.spDeleteUsuario(dni);
	}
	
	// devuelve todos los usuarios
	@Override
	@Transactional()
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = usuarioRepo.spGetAllUsuario();
		return usuarios;
	}

	// devuelve un usuario
	@Override
	@Transactional()
	public Usuario getUsuario(int dni) {
		// TODO Auto-generated method stub	
		Usuario usuario = usuarioRepo.spGetUsuario(dni);
		  return usuario;		
	}
	
	// agrega un usuario
	@Override
	@Transactional()
	public void agregarUsuario(Usuario u){
		
	  usuarioRepo.spInsertUsuario(u.getDni(),u.getIdrol(),u.getNickname(),u.getClave(),u.getNombre(),u.getNacimiento(),
			  					  u.getEdad(),u.getEmail(),u.getDireccion(),u.getTelefono(),
			  					  u.getCargo(),
			  					  u.getIdcurso(),
			  					  u.getTitulo(),u.getExperiencia());
	} 			
	
	// actualiza un usuario
	@Override
	@Transactional()
	public void updateUsuario(Usuario u) {
		// TODO Auto-generated method stub
		
		usuarioRepo.spUpdateUsuario(u.getDni(),u.getIdrol(),u.getNickname(),u.getClave(),u.getNombre(),u.getNacimiento(),
			  					  u.getEdad(),u.getEmail(),u.getDireccion(),u.getTelefono(),u.getActivo(),
			  					  u.getCargo(),
			  					  u.getIdcurso(),
			  					  u.getTitulo(),u.getExperiencia());
	}

	// devuelve una lista de usuarios que pertenecen a un curso
	@Override
	@Transactional()
	public List<Usuario> getAlumnosCurso(int idcurso) {
		// TODO Auto-generated method stub
		List<Usuario> alumnos = usuarioRepo.spAlumnosCurso(idcurso);
		
		return alumnos;
	}

	// actualiza alumno de un curso
	@Override
	@Transactional()
	public void actualizarCursoAlumno(int dni, int idcurso) {
		// TODO Auto-generated method stub
		usuarioRepo.spActualizarCursoAlumno(dni,idcurso);
	}
	
}
