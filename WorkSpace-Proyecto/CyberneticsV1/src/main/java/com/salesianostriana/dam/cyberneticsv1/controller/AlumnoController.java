/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;

/**
 * @author Jose
 *
 */
@Controller
public class AlumnoController {
	
	@GetMapping("/alumno")
	public String verFormRegistro(Model model) {
		
		model.addAttribute("registroForm", new Alumno());
		return "registro";
	}
	
	@PostMapping("/addAlumno")
	public String envio(@ModelAttribute("registroForm") Alumno alumno,  Model model) {
		
		model.addAttribute("alumno", alumno);
		
		return "inicio";
	}

}
