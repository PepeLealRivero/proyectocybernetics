/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.baseservices.BaseServices;
import com.salesianostriana.dam.cyberneticsv1.model.Profesor;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.repository.ProfesorRepository;

/**
 * @author jleal
 *
 */
@Service
public class ProfesorService extends BaseServices<Profesor, Long, ProfesorRepository>{
	
	@Autowired
	EntityManager entityManager;

	public Profesor findOneByNomUser(String username) {

		Profesor result = null;

		TypedQuery<Profesor> query = 
			entityManager.createQuery("select u from Usuario u where u.username = :username",
				Profesor.class);

		try {
			result = query.setParameter("username", username).getSingleResult();
		} catch (NoResultException | NonUniqueResultException ex) {
			result = null;
		}

		return result;
	}

	public List<Profesor> findThemAll() {

		List<Profesor> result = null;

		TypedQuery<Profesor> query = entityManager.createQuery("select u from Usuario u", Profesor.class);

		try {
			result = query.getResultList();
		} catch (NoResultException e) {
			result = null;
		}

		return result;
	}
	
	public Profesor findOneByEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}

}
