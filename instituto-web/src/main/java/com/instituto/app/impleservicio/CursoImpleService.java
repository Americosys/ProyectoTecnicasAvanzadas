package com.instituto.app.impleservicio;

//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instituto.app.model.Curso;
import com.instituto.app.model.Usuario;
import com.instituto.app.repository.CursoRepositorio;
import com.instituto.app.service.CursoService;

@Service
public class CursoImpleService implements CursoService{

	@Autowired
	private CursoRepositorio cursoRepo;
	
	// agrega un curso	
	@Override
	@Transactional()
	public void agregarCurso(Curso c) {
		// TODO Auto-generated method stub
		cursoRepo.spInsertCurso(c.getIdcurso(), c.getNombre(), c.getAnio());
	}
    // devuelve una lista de cursos
	@Override
	@Transactional()
	public List<Curso> getAllCursos() {
		// TODO Auto-generated method stub
		List<Curso> cursos = cursoRepo.spGetAllCursos();
		return cursos;
	}
    // devuelve info de un curso
	@Override
	@Transactional()
	public Curso getCurso(int idcurso) {
		// TODO Auto-generated method stub
		Curso curso = cursoRepo.spGetCurso(idcurso);
		return curso;
	}

    // elimina un curso
	@Override
	@Transactional()
	public void deleteCurso(int idcurso) {
		// TODO Auto-generated method stub
		cursoRepo.spDeleteCurso(idcurso);
	}

    // actualiza un curso
	@Override
	@Transactional()
	public void updateCurso(Curso c) {
		// TODO Auto-generated method stub
		cursoRepo.spUpdateCurso(c.getIdcurso(), c.getNombre(), c.getAnio());
		
	}

    // devuelve todos los alumnos de un curso
	@Override
	@Transactional()
	public List<Usuario> getAlumnosCurso(int idcurso) {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = cursoRepo.spGetAlumnosCurso(idcurso); 
		return usuarios;

	}

    // incrementa la cantidad de profesor con su materia de un curso 
	@Override
	@Transactional()
	public void incrementarProfeMateria(int idcurso) {
		// TODO Auto-generated method stub
		cursoRepo.spincrementarProfeMateria(idcurso);
	}

    // decrementa la cantidad de profesor con su materia de un curso	
	@Override
	@Transactional()
	public void decrementarProfeMateria(int idcurso) {
		// TODO Auto-generated method stub
		cursoRepo.spdecrementarProfeMateria(idcurso);
	}
	
    // incrementa la cantidad de alunos de un curso
	@Override
	@Transactional()
	public void incrementarAlumnoCurso(int idcurso) {
		// TODO Auto-generated method stub
		cursoRepo.spincrementarAlumnoCurso(idcurso);
	}

    // decrementa la cantidad de alunos de un curso
	@Override
	@Transactional()
	public void decrementarAlumnoCurso(int idcurso) {
		// TODO Auto-generated method stub
		cursoRepo.spincrementarAlumnoCurso(idcurso);
	}
	
}
