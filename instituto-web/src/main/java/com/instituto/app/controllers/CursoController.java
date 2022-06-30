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

import com.instituto.app.model.Curso;
import com.instituto.app.model.Materia;
import com.instituto.app.model.Usuario;
import com.instituto.app.model.Cursomateriaprofesor;
import com.instituto.app.service.CursoService;
import com.instituto.app.service.CursomateriaprofesorService;



@Controller
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private CursomateriaprofesorService CursoMateProfe;
	
//	@GetMapping("/InterfazCurso")
//	public String interfazCurso(){	
//		return "interfazCurso";
//	}
//
//	
	@GetMapping("/InterfazCurso")
	public String interfazCurso2(Model model){
		Curso curso = new Curso();
		model.addAttribute("curso", curso);		
		return "interfazCurso";
	}
	
	@GetMapping("/GetAllCursos")
	public String materias(Model model){		
		List<Curso> cursos = cursoService.getAllCursos();
		model.addAttribute("cursos",cursos);		
		return "cursos";
	}
	
	@PostMapping("/insertCurso")
	public String guardarCurso(Curso c) {
		cursoService.agregarCurso(c);
		return "redirect:/GetAllCursos";	
	}	
	
	@GetMapping("/getCurso/{idcurso}")
	public String getCurso(@PathVariable int idcurso, Model model){
		Curso curso = cursoService.getCurso(idcurso);
		model.addAttribute("curso", curso);
 		return "interfazCursoEdit";
	} 
		
	@PostMapping("/updateCurso")
	public String updateCurso(Curso c){		
		cursoService.updateCurso(c);
		return "redirect:/GetAllCursos";
	}	
	
	@GetMapping("/deleteCurso/{idcurso}")
	public String deleteCurso(@PathVariable int idcurso){		
		cursoService.deleteCurso(idcurso);
		return "redirect:/GetAllCursos";
	}
	
	@RequestMapping("/buscarCurso")
	public String getCursoId(Model model, @Param("buscarID") int buscarID){
		Curso curso = cursoService.getCurso(buscarID);
		model.addAttribute("curso", curso);
		model.addAttribute("buscarID", buscarID);
		return "interfazCursoEdit";
	} 	

	@GetMapping("/GetAlumnosCurso/{idcurso}")
	public String GetAlumnosCurso(@PathVariable int idcurso, Model model){		
		List<Usuario> usuarios = cursoService.getAlumnosCurso(idcurso);		
		model.addAttribute("usuarios", usuarios);		
		return "usuarios";
	}

	@GetMapping("/GetMateriasProfesoresCurso/{idcurso}")
	public String GetMateriasProfesoresCurso(@PathVariable int idcurso, Model model){		
		List<Cursomateriaprofesor> cmps = CursoMateProfe.getDetalleCurso(idcurso);
		model.addAttribute("Cursomateriaprofesor",cmps);		
		return "detalleDelCurso";		
	}
		

}
