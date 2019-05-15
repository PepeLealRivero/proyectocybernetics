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
import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.repository.AlumnoRepository;

/**
 * @author jleal
 *
 */
@Service
public class AlumnoService extends BaseServices<Alumno, Long, AlumnoRepository>{
	
	@Autowired
	EntityManager entityManager;

	public Alumno findOneByNomUser(String username) {

		Alumno result = null;

		TypedQuery<Alumno> query = 
			entityManager.createQuery("select u from Usuario u where u.username = :username",
				Alumno.class);

		try {
			result = query.setParameter("username", username).getSingleResult();
		} catch (NoResultException | NonUniqueResultException ex) {
			result = null;
		}

		return result;
	}

	public List<Alumno> findThemAll() {

		List<Alumno> result = null;

		TypedQuery<Alumno> query = entityManager.createQuery("select u from Usuario u", Alumno.class);

		try {
			result = query.getResultList();
		} catch (NoResultException e) {
			result = null;
		}

		return result;
	}
	
	public Alumno findOneByEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}

}
