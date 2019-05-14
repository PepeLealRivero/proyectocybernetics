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
	
	@PostMapping("/inicio")
	public String envio(@ModelAttribute("registroForm") Usuario usuario,  Model model) {
		
		if (usuarioService.findOneByNomUser(usuario.getNomUser()) != null || usuarioService.findOneByEmail(usuario.getEmail()) != null) {
			
			model.addAttribute("errorRegistro", "El usuario o email ya existe");
			return "registro";
		}else {
			usuarioRepository.save(usuario);
			return "inicio";
		}		
		
	}
	
	
	
	//Trabajo Belen
	//https://alojamientos.uva.es/guia_docente/uploads/2013/443/41893/1/Documento6.pdf
	//https://www.ilo.org/wcmsp5/groups/public/---ed_norm/---normes/documents/publication/wcms_087999.pdf

}
