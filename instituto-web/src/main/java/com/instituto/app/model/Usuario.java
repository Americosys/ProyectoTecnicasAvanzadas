package com.instituto.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dni")
	private int dni;		
	@Column(name = "idrol")
	private int idrol;
	@Column(name = "nickname")
	private String nickname;
	@Column(name = "clave")
	private String clave; 
	@Column(name = "nombre")
	private String nombre;	 
	@Column(name = "nacimiento")
    private Date nacimiento;
	@Column(name = "edad")
    private int edad;
	@Column(name = "email")
    private String email;
	@Column(name = "alta")
    private Date alta; 
	@Column(name = "direccion")
    private String direccion;
	@Column(name = "telefono")
    private String telefono;
	@Column(name = "activo")
    private boolean activo;
    		
	public Usuario() {
		
	}	

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}	
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getClave() {
		return this.clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getNacimiento() {
		return this.nacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAlta() {
		return alta;
	}	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	
}
