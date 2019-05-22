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
import com.salesianostriana.dam.cyberneticsv1.service.UploadService;

/**
 * @author Jose
 *
 */
@Controller
public class CursoController {
	
	@Autowired
	UploadService uploadService;
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("uploadBean", new UploadFormBean());
		return "form";
	}
	
	/** Para gestionar este tipo de archivos se utiliza un objeto tipo MultipartFile
	 * Son objetos que, como su nombre indica, son usados en peticiones que 
	 * trabajan con entidades "formadas por partes". Para ello, en este método que
	 * gestiona la petición post (donde el cuerpo va formado por varias partes, etc):
	 * - Le pasamos al modelo la parte recogida del formulario que no es el archivo
	 * con un objeto creado para ello (un Form Bean), en nuestro caso uploadBean,
	 * - También pasamos el archivo MultiPart a tratar, en este caso, file y hay
	 * que hacerlo con la anotación del Framework de Spring (RequestParam). El 
	 * nombre file es el que se usará en el formulario para el botón de subida.
	 * */
	
	@PostMapping("/submit") 
	public String submit(@ModelAttribute("uploadBean") UploadFormBean uploadBean, 
			@RequestParam("file") MultipartFile file, Model model){
		
		/*Creamos un objeto PojoConFichero, pero debemos tener en cuenta, que en este
		 * caso no es como en anteriores donde era el objeto modal completo recogido
		 * en el formulario, sino que le falta la parte del archivo*/
		
		Curso c = new Curso();
		//Seteamos a ese p el nombre recogido del campo de la propiedad cualquiera, 
		//en este caso solo un text.
		c.setNombre(uploadBean.getPropiedadCualquiera());
		//Usamos el servicio de subida para guardar en la BD el objeto POJO por un lado
		//y lo recogido del archivo por otro. Eso es lo que se le da a add y este a su vez,
		//si se mira en el UploadConPojoService usa los dos parámteros para guardar 
		//"todo el pojo completo, propiedad y archivo).
		uploadService.add(c, file);
		
		
		return "redirect:/pojo/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("lista", uploadService.list());
		
		return "list";
	}
	
	@GetMapping("/view/{id}")
	public String viewById(@PathVariable("id") String id, Model model) {
		return "view";
	}

}
