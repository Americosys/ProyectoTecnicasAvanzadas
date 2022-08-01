package com.instituto.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.instituto.app.model.Usuario;
import com.instituto.app.service.UsuarioService;

@Controller
public class UsuarioController {

	
	@Autowired
	private UsuarioService usuarioservice;
	
	/* Redirecciona a la pagina de inicio del directivo */	
	@GetMapping("/InicioInterfazDirectivo")
	public String inicioDirectivo(){			
		return "inicioInterfazDirectivo";
	}	
	
	/* Redirecciona al  menu para ingresar usuarios(integrantes)  */
	@GetMapping("/InterfazDirectivo")
	public String interfazDirectivo(){			
		return "interfazDirectivo";
	}	
	
	/* busca todos lo usuarios que existan y los muestra en usuarios.html*/
	@GetMapping("/GetAllUsuarios")
	public String usuarios(Model model){		
		List<Usuario> usuarios = usuarioservice.getAllUsuarios();
		model.addAttribute("usuarios",usuarios);
		return "usuarios";
		
	}
	
	/* agrega un usuario, busca a todos y los muestra en usuarios.html*/
	@PostMapping("/insertUsuario")
	public String guardarUsuario(Usuario u) {
		usuarioservice.agregarUsuario(u);
		return "redirect:/GetAllUsuarios";	
	}	
	
	/* busca los datos de un usuario y los muetra para ser editados*/
	@GetMapping("/getUsuario/{dni}")
	public String getUsuario(@PathVariable int dni, Model model){
		Usuario usuario = usuarioservice.getUsuario(dni);
		model.addAttribute("usuario",usuario);
		return "interfazDirectivoEdit";
	} 
	
	/* busca los datos de un usuario y los muetra para ser editados*/
	@RequestMapping("/")
	public String getUsuarioDni(Model model, @Param("buscarPorDni") int buscarPorDni){
		Usuario usuario = usuarioservice.getUsuario(buscarPorDni);
		model.addAttribute("usuario",usuario);
		model.addAttribute("buscarPorDni", buscarPorDni);
		return "interfazDirectivoEdit";
	} 	
	
	/* actualiza un usuario, busca a todos y los muestra en usuarios.html*/
	@PostMapping("/updateUsuario")
	public String updateUsuario(Usuario u){		
		usuarioservice.updateUsuario(u);
		return "redirect:/GetAllUsuarios";
	}	
	
	/* baja logica (lo pone como inactivo a un usuario, busca a todos y los muestra en usuarios.html*/
	@GetMapping("/deleteUsuario/{dni}")
	public String deleteUsuario(@PathVariable int dni){		
		usuarioservice.deleteUsuario(dni);
		return "redirect:/GetAllUsuarios";
	}
}
