/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.repository.UsuarioRepository;
import com.salesianostriana.dam.cyberneticsv1.service.UsuarioService;

/**
 * @author lealr
 *
 */
@Controller
public class LoginController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private HttpSession session;

	@GetMapping("/login")
	public String verLogin(Model model) {
		return "/login";
	}

	@PostMapping("/login")
	public String logIn(@ModelAttribute("loginForm") Alumno alumno, Model model) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		alumno.setPass(passwordEncoder.encode(alumno.getPass()));

		if (usuarioService.findOneByNomUser(alumno.getNomUser()) == null
				|| usuarioService.findOneByEmail(alumno.getEmail()) == null) {

			model.addAttribute("errorLogin", "El usuario o email no coinciden");
			return "login";
		} else {
			
			return "inicio";
		}

	}

}
