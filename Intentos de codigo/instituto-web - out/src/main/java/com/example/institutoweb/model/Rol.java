package com.example.institutoweb.model;
//import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

//@Entity
// @Table(name = "rol")
public class Rol {    
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
    private String rol;

    public Rol() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }       
}