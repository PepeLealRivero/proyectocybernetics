/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;

/**
 * @author Jose
 *
 */
@Controller
public class AlumnoController {
	
	@GetMapping("/registro")
	public String verFormRegistro(Model model) {
		
		model.addAttribute("registroForm", new Alumno());
		return "registro";
	}

}
