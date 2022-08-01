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

import com.instituto.app.model.Materia;
import com.instituto.app.service.MateriaService;

@Controller
public class MateriaController {

	@Autowired
	private MateriaService materiaService;
	
	/* redireccionar a la pagina de materias*/
	@GetMapping("/InterfazMateria")
	public String interfazMateria(){	
		return "interfazMateria";
	}
	
    /* devulve todas las materias y las muestra en materias.html*/
	@GetMapping("/GetAllMaterias")
	public String materias(Model model){		
		List<Materia> materias = materiaService.getAllMateria();
		model.addAttribute("materias",materias);		
		return "materias";
	}
	
	/* Agrega una materia, busca todas las materias y las muestra en materias.html*/
	@PostMapping("/insertMateria")
	public String guardarMateria(Materia m) {
		materiaService.insertMateria(m);
		return "redirect:/GetAllMaterias";	
	}	
	
	/* busca los datos una materia y redirecciona a la pagina para ser editada*/
	@GetMapping("/getMateria/{idmateria}")
	public String getMateria(@PathVariable int idmateria, Model model){
		Materia materia = materiaService.getMateria(idmateria);
		model.addAttribute("materia", materia);
 		return "interfazMateriaEdit";
	} 

	/* busca los datos una materia y redirecciona a la pagina para ser editada*/	
	@RequestMapping("/getMateriaId")
	public String getMateriaId(Model model, @Param("buscarPorID") int buscarPorID){
		Materia materia = materiaService.getMateria(buscarPorID);
		model.addAttribute("materia",materia);
		model.addAttribute("buscarPorDni", buscarPorID);
		return "interfazMateriaEdit";
	} 	
	
	/* actualizo una materia y busca al resto para mostrar en materias.html*/
	@PostMapping("/updateMateria")
	public String updateMateria(Materia m){		
		materiaService.updateMateria(m);
		return "redirect:/GetAllMaterias";
	}	
	
	/* Elimino a una materia y busca al resto para mostrar en materias.html*/
	@GetMapping("/deleteMateria/{idmateria}")
	public String deleteMateria(@PathVariable int idmateria){		
		materiaService.deleteMateria(idmateria);
		return "redirect:/GetAllMaterias";
	}
}
