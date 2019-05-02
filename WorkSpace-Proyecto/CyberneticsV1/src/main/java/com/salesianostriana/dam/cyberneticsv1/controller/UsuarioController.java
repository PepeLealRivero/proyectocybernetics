package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/registro")
@Controller
public class UsuarioController {
	
	@GetMapping
	public String registro(Model model) {
		
		return "registro";
	}
	

}
