package com.instituto.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.instituto.app.model.Usuario;
import com.instituto.app.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioservice;
	
	@GetMapping("/GetAllUsuarios")
	public String usuarios(Model model ){
		
		List<Usuario> usuarios = usuarioservice.getAllUsuarios();
		model.addAttribute("usuarios",usuarios);
		
		return "usuarios";
	}
	
	//con esto cuando el usuario presione agregar lo va a llevar al
	//form para agregar un usuario
	@GetMapping("/newUsuario")
	public String insertUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "formAgregarUsuario";
	}
	
	// aca guardamos el nuevo usuario y lo mostramos en la pantalla getAllUsuarios
	@PostMapping("/insertUsuario")
	//@RequestMapping(value = "/insertUsuario",RequestMethod.POST)
	public String guardarUsuario(Usuario u) {
		usuarioservice.agregarUsuario(u);
		return "redirect:/GetAllUsuarios";	
	}
	
}
