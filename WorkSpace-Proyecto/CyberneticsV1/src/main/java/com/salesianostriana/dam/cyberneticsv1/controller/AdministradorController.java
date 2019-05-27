/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.cyberneticsv1.model.Curso;
import com.salesianostriana.dam.cyberneticsv1.repository.CursoRepository;
import com.salesianostriana.dam.cyberneticsv1.service.CursoService;

/**
 * @author Jose Leal
 * @version 1.0
 * 
 * Esta clase controla todo lo que va a hacer el Administrador.
 *
 */
@Controller
public class AdministradorController {

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private CursoService cursoService;

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping({ "/", "/list" })
	public String listarTodos(Model model) {
		model.addAttribute("lista", cursoService.findAll());
		return "cursos";
	}

	@GetMapping("/crearCurso")
	public String verRegistroCurso(Model model) {

		model.addAttribute("cursoForm", new Curso());

		return "admin/newCurso";

	}

	// @PostMapping("/addCurso")
	// public String envio(@ModelAttribute("cursooForm") Curso curso, Model model) {
	//
	// if (cursoService.findOneByNombre(curso.getNombre()) != null
	// || cursoService.findOneByFechaInicio(curso.getFechaInicio()) != null) {
	//
	// model.addAttribute("errorRegistro", "Ya hay un curso con el mismo nombre y
	// fecha de inicio.");
	// return "newCurso";
	// } else {
	// cursoRepository.save(curso);
	// return "/cursos";
	// }
	//
	// }

	@GetMapping("/inicio")
	public String verInicio(Model model) {

		return "/inicio";
	}

}
