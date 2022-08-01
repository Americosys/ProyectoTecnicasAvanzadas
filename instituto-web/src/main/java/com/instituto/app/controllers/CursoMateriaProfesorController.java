package com.instituto.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import com.instituto.app.model.Curso;
import com.instituto.app.model.Cursomateriaprofesor;
import com.instituto.app.model.Usuario;
import com.instituto.app.service.CursoService;
import com.instituto.app.service.CursomateriaprofesorService;
import com.instituto.app.service.UsuarioService;


@Controller
public class CursoMateriaProfesorController {
	
	@Autowired
	private CursomateriaprofesorService CursoMateProfe;
	@Autowired
	private CursoService cursoService;
	@Autowired
	private UsuarioService usuarioService;
	
	
	/* Inserta un profesor y su materia a ser dada en un curos
	 * incrementa la cantidad
	 * y muestra informacion del curso, es decir, lo que tenia mas lo que acaba de ingresar
	 * redireccionando a infoCurso.html */
	@RequestMapping("/InsertCursoMateriaProfesor")
	public String insertMateriaProfesorAlCurso(Model model, Cursomateriaprofesor cmp, 
			@Param("idmateria") int idmateria,  @Param("dniprofesor") int dniprofesor) {
	
		// agregarmos un materia y profesor a un curso
		// y actualizo cantidad de materias y profesores en uno
		CursoMateProfe.insertCursoMateProfe(cmp);		
		List<Cursomateriaprofesor> registros = CursoMateProfe.getDetalleCurso(cmp.getIdcurso());
		model.addAttribute("registros",registros);	
		
		
		// mostramos la info que tiene el curso modificado
		return "infoCurso";		
		
	}

	/* Inserta un alumno a un curos
	 * incrementa la cantidad
	 * y muestra los alunos que pertenecen al curso
	 * redireccionando a usuarios.html */
	@RequestMapping("/agregarAlumnoCurso")
	public String agregarAlumnoAlCurso(Model model, @Param("idcurso") int idcurso, 
			@Param("dnialumno") int dnialumno) {
	    
		
		//actualizado el alumno al curso e incremento en uno la cantidad de alumnos
		usuarioService.actualizarCursoAlumno(dnialumno, idcurso);
		
		//devuelvo todos los alumnos
	    List<Usuario> usuarios = usuarioService.getAlumnosCurso(idcurso);
		model.addAttribute("usuarios", usuarios);	
		
		return "usuarios";		
		
	}
		
	/* Eliminar un registro del curso, es decir un profesor con su materia
	 * decrementa la cantidad
	 * y muestra info del curso 
	 * redireccionando a curso.html */	
	@GetMapping("/deleteRegistroCurso/{id}")
	public String deleteRegistroCurso(Model model, @PathVariable int id){
		
		//int idCurso	= CursoMateProfe.getIdCursoRegistro(id);
		// eliminarmos el registro y actualizamos la cantidad de profesores y materias del curso
		CursoMateProfe.deleteRegistroCurso(id);
		
		//List<Cursomateriaprofesor> cmps = CursoMateProfe.getDetalleCurso(idCurso);
		//model.addAttribute("Cursomateriaprofesor",cmps);	
        
		return "redirect:/GetAllCursos";
	}

	
	//Muestra las materias y los profesores de un curso
	@RequestMapping("/DetalleDelCurso")
	public String detalleDelCurso2(Model model, @Param("idcurso")  int idcurso){		
		List<Cursomateriaprofesor> registros = CursoMateProfe.getDetalleCurso(idcurso);
		model.addAttribute("registros",registros);		
		return "infoCurso";
	}
	
	
	//Muestra los alumnos de un curso
	@RequestMapping("/GetAlumnosCurso2")
	public String getAlumnosAlCurso(Model model, @Param("idcurso") int idcurso) {
	
		//devuelvo todos los alumnos
	    List<Usuario> usuarios = usuarioService.getAlumnosCurso(idcurso);
		model.addAttribute("usuarios", usuarios);	
		
		return "usuarios";		
		
	}
	
	
	
	
}
