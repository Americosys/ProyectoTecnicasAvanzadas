package com.instituto.app.impleservicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.instituto.app.model.Materia;
import com.instituto.app.repository.MateriaRepositorio;
import com.instituto.app.service.MateriaService;

@Service
public class MateriaImpleServicio implements MateriaService{

	@Autowired
	private MateriaRepositorio materiaRepo;
	
	// elimina un materia
	@Override
	@Transactional()
	public void deleteMateria(int idMateria) {
		// TODO Auto-generated method stub
		materiaRepo.spDeleteMateria(idMateria);
	}
	
	// devuelve todas las materia
	@Override
	@Transactional()
	public List<Materia> getAllMateria() {
		// TODO Auto-generated method stub
		List<Materia> materias = materiaRepo.spGetAllMateria(); 
		return materias;
	}

	// devuelve una materia
	@Override
	@Transactional()
	public Materia getMateria(int idmateria) {
		// TODO Auto-generated method stub
		Materia materia = materiaRepo.spGetMateria(idmateria);
		return materia;
	}

	@Override
	@Transactional()
	public void insertMateria(Materia m) {
		// TODO Auto-generated method stub
		materiaRepo.spInsertMateria(m.getIdmateria(),
				                    m.getNombremateria(),
				                    m.getUrlprograma());
	}

	// agrega una materia
	@Override
	@Transactional()
	public void updateMateria(Materia m) {
		// TODO Auto-generated method stub
		materiaRepo.spUpdateMateria(m.getIdmateria(),
                					m.getNombremateria(),
                					m.getUrlprograma());
	
	}
	
}
