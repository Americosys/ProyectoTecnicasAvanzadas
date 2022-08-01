package com.instituto.app.service;

import java.util.Map;

/* Interface de la clase login   
 * lista los metodos que se pueden utilizar y acceder  
 * */

public interface LoginService {
	
	// si el dni y la clave son correcto, conectar te permite acceder a la app
	public Map<String, Integer> conectar(int dni, String clave);
    

}