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

import com.salesianostriana.dam.cyberneticsv1.model.Usuario;

/**
 * @author Jose
 *
 */
@Service
public class UsuarioService {

	

	@Autowired
	EntityManager entityManager;

	public Usuario findOneByNomUser(String username) {

		Usuario result = null;

		TypedQuery<Usuario> query = 
			entityManager.createQuery("select u from Usuario u where u.username = :username",
				Usuario.class);

		try {
			result = query.setParameter("username", username).getSingleResult();
		} catch (NoResultException | NonUniqueResultException ex) {
			result = null;
		}

		return result;
	}

	public List<Usuario> findThemAll() {

		List<Usuario> result = null;

		TypedQuery<Usuario> query = entityManager.createQuery("select u from Usuario u", Usuario.class);

		try {
			result = query.getResultList();
		} catch (NoResultException e) {
			result = null;
		}

		return result;
	}
}
