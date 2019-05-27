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
import com.salesianostriana.dam.cyberneticsv1.model.Curso;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.repository.UsuarioRepository;

/**
 * @author jleal
 *
 */
@Service
public class UsuarioService extends BaseServices<Usuario, Long, UsuarioRepository>{
	
	@Autowired
	EntityManager entityManager;

	public Usuario findOneByNomUser(String nomUser) {

		Usuario result = null;

		TypedQuery<Usuario> query = 
			entityManager.createQuery("select u from Usuario u where u.nomUser = :nomUser",
				Usuario.class);

		try {
			result = query.setParameter("nomUser", nomUser).getSingleResult();
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
	
	public Usuario findOneByEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}
	
	public boolean addUsuario(Usuario usuario) {
		Usuario usuarioSaved = repositorio.save(usuario);
		if (usuarioSaved != null) {
			return true;
		} else {
			return false;
		}
	}

	public void removeUsuario(Long id) {
		repositorio.deleteById(id);
	}


}
