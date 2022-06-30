package com.example.institutoweb.controller;
import java.util.List;
import com.example.institutoweb.interfaceService.IrolService;
import com.example.institutoweb.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class rolController {
    
    @Autowired
    private IrolService service;

    @GetMapping("/listar")    
    public String listar(Model model){

        List<Rol>roles=service.listar();
        model.addAttribute("Roles", roles);
        return "index";
    }

}
