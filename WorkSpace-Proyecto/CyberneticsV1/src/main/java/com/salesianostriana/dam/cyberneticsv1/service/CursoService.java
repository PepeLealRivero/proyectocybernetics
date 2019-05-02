/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.model.Curso;
import com.salesianostriana.dam.cyberneticsv1.model.Pedido;
import com.salesianostriana.dam.cyberneticsv1.repository.CursoRepository;

/**
 * @author jleal
 *
 */

@Service
public class CursoService {
	
	private CursoRepository cursoRepository;

	/**
	 * @param cursoRepository
	 */
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}

	public Curso add(Curso cur) {
		return cursoRepository.save(cur);
	}

	public Curso edit(Curso cur) {
		return cursoRepository.save(cur);
	}

	public void delete(Curso cur) {
		cursoRepository.delete(cur);
	}

	public void delete(long id) {
		cursoRepository.deleteById(id);
	}

	
	public List<Curso> findAll(){
		return cursoRepository.findAll();
	}
	
	public Curso findById(long id) {
		return cursoRepository.findById(id).orElse(null);
	}

}
