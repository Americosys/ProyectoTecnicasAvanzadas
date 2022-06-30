package com.instituto.app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmateria;
	@Column (name = "nombremateria")
	private	String nombremateria;
	@Column (name = "urlprograma")
	private String urlprograma;
	
	public Materia() {
				
	}

	public int getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}

	public String getNombremateria() {
		return nombremateria;
	}

	public void setNombremateria(String nombremateria) {
		this.nombremateria = nombremateria;
	}

	public String getUrlprograma() {
		return urlprograma;
	}

	public void setUrlprograma(String urlprograma) {
		this.urlprograma = urlprograma;
	}
	

}
