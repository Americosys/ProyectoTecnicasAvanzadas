package com.instituto.app.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.instituto.app.model.DatosLogin;
import com.instituto.app.model.Usuario;
import com.instituto.app.service.LoginService;
import com.instituto.app.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private UsuarioService usuarioservice;
	
	@GetMapping("/login")
	public String login(){			
		return "login";
	}	
	
	
	
	@PostMapping("/conectar")
	public String conectar(Model model, DatosLogin u, HttpSession session){
//	public String conectar(Model model, DatosLogin u){	
		int rol = 0;
		String mensaje = null;
		Map<String, Integer> mapa = loginService.conectar(u.getDni(), u.getClave());
		for(Map.Entry entry:mapa.entrySet()){
			if ("idrol".equals(entry.getKey()))
			{
				rol = (int)entry.getValue();
			}
			if ("msj".equals(entry.getKey()))
			{
				mensaje = (String)entry.getValue();
			}
		}
		
		Usuario usuario = usuarioservice.getUsuario(u.getDni());
		
		
		session.setAttribute("nickname", usuario.getNickname());
		
		if (rol == 0)
		{
			model.addAttribute("mensaje",mensaje);
			return "login";
					}
		else if (usuario.getIdrol() == 1)
		{
			model.addAttribute("usuario",usuario);
			return "inicioInterfazDirectivo";
		}
		else if (usuario.getIdrol() == 2)
		{
			model.addAttribute("usuario",usuario);
			return "inicioInterfazProfesor";
		}
		else
		{
			model.addAttribute("usuario",usuario);
			return "inicioInterfazAlumno";
		}
	}
}
