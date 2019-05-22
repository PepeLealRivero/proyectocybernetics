/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.service.UsuarioService;

/**
 * @author lealr
 *
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UsuarioService usuarioService;

	public UserDetailsServiceImpl(UsuarioService servicio) {
		this.usuarioService = servicio;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioService.findOneByEmail(username);
	
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}

		return usuario;

	}

}
