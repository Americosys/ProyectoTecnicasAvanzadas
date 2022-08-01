package com.instituto.app.impleservicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instituto.app.model.Cursomateriaprofesor;
import com.instituto.app.repository.CursomateriaprofesorRepositorio;
import com.instituto.app.service.CursomateriaprofesorService;

@Service
public class CursomateriaprofesorImpleService implements CursomateriaprofesorService {

	@Autowired
	private CursomateriaprofesorRepositorio cursoMateProfeRepo;
	// inserta un profesor con su materia a un curso
	@Override
	@Transactional()
	public void insertCursoMateProfe(Cursomateriaprofesor cmp) {
		// TODO Auto-generated method stub
		cursoMateProfeRepo.spInsertCursoMateriaProfesor(cmp.getIdcurso(),cmp.getIdmateria(), cmp.getDniprofesor() );
	
	}
	// devuelve una lista de profesores con su materias de un curso
	@Override
	@Transactional()
	public List<Cursomateriaprofesor> getDetalleCurso(int idcurso) {
		// TODO Auto-generated method stub
		List<Cursomateriaprofesor> infCMD = cursoMateProfeRepo.spGetCursoMateriaProfesor(idcurso);  
			
		return infCMD;
	}
    // elimina un registro de los profesores con su materias que pertenecen a un curso
	@Override
	@Transactional()
	public void deleteRegistroCurso(int id) {
		// TODO Auto-generated method stub
		cursoMateProfeRepo.spDeleteCursoMateriaProfesor(id);
	}
	
    // actualza curso materia profesor de un curso pero de un registro especifico  
	@Override
	@Transactional()
	public void updateRegistroCurso(Cursomateriaprofesor cmp) {
		// TODO Auto-generated method stub
		cursoMateProfeRepo.spUpDateCursoMateriaProfesor(cmp.getId(), cmp.getIdcurso(),cmp.getIdmateria(), cmp.getDniprofesor());
	}

    // devuelve info de id de un registro de cursos
	@Override
	@Transactional()
	public int getIdCursoRegistro(int id) {
		int curso = cursoMateProfeRepo.spGetIdCursoRegistro(id);
		return curso;
	}

	
}
