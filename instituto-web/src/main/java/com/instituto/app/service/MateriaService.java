package com.instituto.app.service;

import java.util.List;

import com.instituto.app.model.Materia;

public interface MateriaService {

	public void deleteMateria(int idmateria);
	public List<Materia> getAllMateria();
	public Materia getMateria(int idmateria);
	public void insertMateria(Materia m);
	public void updateMateria(Materia m);
}
