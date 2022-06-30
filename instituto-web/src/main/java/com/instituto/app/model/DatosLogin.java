package com.instituto.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@Table(name = "DatosLogin")
@NamedStoredProcedureQuery(name = "usuario.login", 
procedureName = "spLogin", parameters = {
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "dni", type = Integer.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "clave", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "idrol", type = Integer.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "msj", type = String.class)})
public class DatosLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dni")
	private int dni;	
	@Column(name = "clave")
	private String clave; 
	
	public DatosLogin() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
