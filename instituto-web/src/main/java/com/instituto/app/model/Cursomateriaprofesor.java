package com.instituto.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursomateriaprofesor")
public class Cursomateriaprofesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "idcurso")
	private int idcurso;
	@Column(name = "idmateria")
	private int idmateria;
	@Column(name = "dniprofesor")
	private int dniprofesor;
	
	public Cursomateriaprofesor() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}

	public int getDniprofesor() {
		return dniprofesor;
	}

	public void setDniprofesor(int dniprofesor) {
		this.dniprofesor = dniprofesor;
	}
		


	
}
