/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.baseservices.BaseServices;
import com.salesianostriana.dam.cyberneticsv1.model.Curso;
import com.salesianostriana.dam.cyberneticsv1.repository.CursoRepository;

/**
 * @author jleal
 *
 */

@Service
public class CursoService extends BaseServices<Curso, Long, CursoRepository>{
	
	@Autowired
	EntityManager entityManager;

	public Curso findOneByNombre(String nombre) {

		Curso result = null;

		TypedQuery<Curso> query = 
			entityManager.createQuery("select c from Curso c where c.nombre = :nombre",
				Curso.class);

		try {
			result = query.setParameter("nombre", nombre).getSingleResult();
		} catch (NoResultException | NonUniqueResultException ex) {
			result = null;
		}

		return result;
	}

	public List<Curso> findThemAll() {

		List<Curso> result = null;

		TypedQuery<Curso> query = entityManager.createQuery("select c from Curso c", Curso.class);

		try {
			result = query.getResultList();
		} catch (NoResultException e) {
			result = null;
		}

		return result;
	}
	
	public Curso findOneByFechaInicio(LocalDate fechaInicio) {
		return repositorio.findOneByFechaInicio(fechaInicio);
	}
	
	public boolean addCurso(Curso curso) {
		Curso cursoSaved = repositorio.save(curso);
		if (cursoSaved != null) {
			return true;
		} else {
			return false;
		}
	}

	public void removeCurso(Long id) {
		repositorio.deleteById(id);
	}

	
	

	
}
