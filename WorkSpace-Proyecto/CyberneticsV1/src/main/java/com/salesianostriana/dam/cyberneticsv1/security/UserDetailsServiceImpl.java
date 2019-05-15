/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.model.Usuario;

/**
 * @author lealr
 *
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl {

	UsuarioService usuarioService;

	public UserDetailsServiceImpl(UsuarioService servicio) {
		this.usuarioService = servicio;
	}

	@Override
	public UserDetails loadUserByNomUser(String nomUser) throws NomUserNotFoundException {

		Usuario usuario = usuarioService.findFirstByEmail(NomUser);

		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}

		return usuario;

	}

}
