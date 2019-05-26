/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.cyberneticsv1.service.TipoFormacionService;

/**
 * @author Jose
 *
 */
@Controller
public class TipoFormacionController {
	
	@Autowired
	TipoFormacionService tipoFormacionService;

	@GetMapping("/formaciones")
	public String listCursos(Model model) {
		model.addAttribute("formaciones", tipoFormacionService.findAll());
		return "cursos";
	}

}
