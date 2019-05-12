/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.baseservices.BaseServices;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.repository.UsuarioRepository;

/**
 * @author Jose
 *
 */
@Service
public class UsuarioService extends BaseServices<Usuario, Long, UsuarioRepository>{

	

	public Usuario findOneByNomUser(String nomUser) {
		return repositorio.findOneByNomUser(nomUser);
	}
	
	public Usuario findByEmail(String email) {
		return repositorio.findByEmail(email);
	}
}
