package com.instituto.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="Curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcurso;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cantmate")
	private int cantmate;
	@Column(name = "cantalum")
	private int cantalum;
	@Column(name = "cantprofe")
	private int cantprofe;
	@Column(name = "anio")
	private int anio;
	@Column(name = "alta")
	private Date alta;	

	public Curso() {
		this.idcurso = 0;
		this.cantprofe = 0;
		this.cantalum = 0;
		this.cantmate = 0;		
		this.anio = 0;
		this.nombre = "Nombre del Curso Nuevo...";
	}
	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantmate() {
		return cantmate;
	}

	public void setCantmate(int cantmate) {
		this.cantmate = cantmate;
	}

	public int getCantalum() {
		return cantalum;
	}

	public void setCantalum(int cantalum) {
		this.cantalum = cantalum;
	}

	public int getCantprofe() {
		return cantprofe;
	}

	public void setCantprofe(int cantprofe) {
		this.cantprofe = cantprofe;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Date getAlta() {
		return alta;
	}

	public void setAlta(Date alta) {
		this.alta = alta;
	}
		
}
