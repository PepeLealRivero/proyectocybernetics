package com.salesianostriana.dam.cyberneticsv1.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.dam.cyberneticsv1.model.Curso;
import com.salesianostriana.dam.cyberneticsv1.repository.CursoRepository;
import com.salesianostriana.dam.cyberneticsv1.storage.StorageService;

@Service
public class UploadService {
	
	@Autowired
	CursoRepository cursoRepository;
	
	@Autowired
	StorageService storageService;
	
	
	/**
	 * 
	 * @param p Debe contener el atributo fileUrl a nulo; si no, su valor será ignorado
	 */
	public void add(Curso c, MultipartFile file) {
				
		String fileName = storageService.store(file);//Guarda la imagen
		//Guardamos nombre de la imagen almacenada en el atributo de la entidad
		c.setImage(fileName);
		//Guardamos la entidad en la base de datos y en ella ya irá el nombre del archivo
		//en la correspondiente propiedad (fileUrl)
		cursoRepository.save(c);
		
	}
	
	/** Método que devuelve una lista de entidades con sus ficheros
	 * a los que se les ha guardado dentro de su atributo URL
	 * el nombre de la URL images/nombredelarchivo.
	 * Este /images/ debe ser el mismo que el que hayamos dado en la clase 
	 * MvcConfig del paquete Hello*/
	
	public List<Curso> list() {
				
		List<Curso> partialResult = cursoRepository.findAll();
		List<Curso> result = new LinkedList<Curso>(partialResult);
		
		for(int i = 0; i < partialResult.size(); i++) {
			String fileName = partialResult.get(i).getImage();
			result.get(i).setImage("/images/"+ fileName);
		}
						
		return result;
	}

}
