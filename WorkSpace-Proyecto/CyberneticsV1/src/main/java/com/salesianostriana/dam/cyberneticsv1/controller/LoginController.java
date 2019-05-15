/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.cyberneticsv1.service.AlumnoService;

/**
 * @author lealr
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private  HttpSession session;
	
	
	@GetMapping("/autentificacion")
	public String verLogin(Model model) {
		return "";
	}
	

}
