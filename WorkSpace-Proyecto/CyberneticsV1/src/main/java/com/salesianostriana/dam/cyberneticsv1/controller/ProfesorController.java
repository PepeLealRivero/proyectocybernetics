/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.dam.cyberneticsv1.formbean.UploadFormBean;
import com.salesianostriana.dam.cyberneticsv1.model.Curso;
import com.salesianostriana.dam.cyberneticsv1.model.Profesor;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.service.UsuarioService;

/**
 * @author Jose
 * @version 1.0
 * 
 *          Esta clase contiene todos los metodos que controlan lo que hace un
 *          profesor.
 *
 */
@Controller
public class ProfesorController {

	@Autowired
	UsuarioService usuarioService;

	/**
	 * Este método crea un nuevo profesor.
	 * 
	 * @param model
	 * @return devuelve el formulario para crear el Profesor
	 */
	@GetMapping("/newProfesor")
	public String newCurso(Model model) {
		model.addAttribute("profesorForm", new Profesor());
		model.addAttribute("profesor", usuarioService.findAll());

		return "admin/newProfesor";
	}

	/**
	 * Este método elimina un profesor.
	 * 
	 * @param id
	 * @return devuelve el listado de profesores
	 */
	@GetMapping("/removeProfesor")
	public String removeUsuario(@RequestParam(name = "id", required = true) Long id) {
		usuarioService.removeUsuario(id);
		return "redirect:/Profesores";
	}

//	@GetMapping("/editCurso")
//	public String editCurso(@RequestParam(name = "id", required = true) Long id, Model model) {
//		Curso cursoEdit = cursoService.findById(id);
//		model.addAttribute("cursoForm", cursoEdit);
//		model.addAttribute("categorias", categoriaService.findAll());
//
//		return "admin/newCurso";
//	}

	/**
	 * Este método crea un profesor nuevo comprobando que no hay profesor existente
	 * con el mismo nombre de usuario.
	 * 
	 * @param usuario
	 * @param model
	 * @return Devuelve el listado de profesores.
	 */

	@PostMapping("/addProfesor")
	public String envio(@ModelAttribute("profesorForm") Usuario usuario, Model model) {
		if (usuario.getId() == null) {
			if (usuarioService.findOneByNomUser(usuario.getNombre()) != null) {

				model.addAttribute("errorRegistro", "Ya hay un profesor con el mismo nombre de usuario");
				model.addAttribute("profesorForm", usuario);
				model.addAttribute("profesor", usuarioService.findAll());
				return "admin/newProfesor";
			} else {
				if (!usuarioService.addUsuario(usuario)) {
					model.addAttribute("errorRegistro", "Error al guardar el curso");
					model.addAttribute("cursoForm", usuario);
					model.addAttribute("profesor", usuarioService.findAll());
					return "admin/newProfesor";
				} else {
					return "redirect:/Profesores";
				}
			}
		} else {
			Usuario usuarioEncontrado = usuarioService.findOneByNomUser(usuario.getNombre());
			if (usuarioEncontrado != null) {
				if (usuarioEncontrado.getId() != usuario.getId()) {
					model.addAttribute("errorRegistro", "Ya hay un profesor con el mismo nombre");
					model.addAttribute("profesorForm", usuario);
					model.addAttribute("profesor", usuarioService.findAll());
					return "admin/newProfesor";
				} else {
					if (!usuarioService.addUsuario(usuario)) {
						model.addAttribute("errorRegistro", "Error al guardar el profesor");
						model.addAttribute("profesorForm", usuario);
						model.addAttribute("profesor", usuarioService.findAll());

						return "admin/newProfesor";
					} else {
						return "redirect:/Profesores";
					}
				}
			} else {
				if (!usuarioService.addUsuario(usuario)) {
					model.addAttribute("errorRegistro", "Error al guardar el profesor");
					model.addAttribute("profesorForm", usuario);
					model.addAttribute("profesores", usuarioService.findAll());
					return "admin/newProfesor";
				} else {
					return "redirect:/Profesores";
				}
			}
		}

	}

}
