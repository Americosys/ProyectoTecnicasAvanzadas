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
	
	@Override
	@Transactional()
	public void insertCursoMateProfe(Cursomateriaprofesor cmp) {
		// TODO Auto-generated method stub
		cursoMateProfeRepo.spInsertCursoMateriaProfesor(cmp.getIdcurso(),cmp.getIdmateria(), cmp.getDniprofesor() );
	
	}

	@Override
	@Transactional()
	public List<Cursomateriaprofesor> getDetalleCurso(int idcurso) {
		// TODO Auto-generated method stub
		List<Cursomateriaprofesor> infCMD = cursoMateProfeRepo.spGetCursoMateriaProfesor(idcurso);  
			
		return infCMD;
	}

	@Override
	@Transactional()
	public void deleteRegistroCurso(int id) {
		// TODO Auto-generated method stub
		cursoMateProfeRepo.spDeleteCursoMateriaProfesor(id);
	}

	@Override
	@Transactional()
	public void updateRegistroCurso(Cursomateriaprofesor cmp) {
		// TODO Auto-generated method stub
		cursoMateProfeRepo.spUpDateCursoMateriaProfesor(cmp.getId(), cmp.getIdcurso(),cmp.getIdmateria(), cmp.getDniprofesor());
	}

	@Override
	@Transactional()
	public int getIdCursoRegistro(int id) {
		int curso = cursoMateProfeRepo.spGetIdCursoRegistro(id);
		return curso;
	}

	
}
