/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.repository.UsuarioRepository;
import com.salesianostriana.dam.cyberneticsv1.service.UsuarioService;


/**
 * @author Jose
 *
 */
@Controller
public class RegistroController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/registro")
	public String verFormRegistro(Model model) {
		model.addAttribute("registroForm", new Usuario());
		//model.addAttribute("registroForm", new Usuario());
		return "registro";
	}
	
	@PostMapping("/addUser")
	public String envio(@ModelAttribute("registroForm") Alumno alumno,  Model model) {
		
		if (usuarioService.findOneByNomUser(alumno.getNomUser()) != null || usuarioService.findOneByEmail(alumno.getEmail()) != null) {
			
			model.addAttribute("errorRegistro", "El usuario o email ya existe");
			return "registro";
		}else {
			usuarioRepository.save(alumno);
			return "inicio";
		}		
		
	}
	
	
	
	
}
