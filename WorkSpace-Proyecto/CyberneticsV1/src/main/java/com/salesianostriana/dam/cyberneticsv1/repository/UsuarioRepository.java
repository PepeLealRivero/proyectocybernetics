package com.salesianostriana.dam.cyberneticsv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.cyberneticsv1.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findFirstByNomUserAndPass(String nomUser, String pass);

	// List<Usuario> findNombreContainingIgnoreCase(String nombre);

	public Usuario findOneByNomUser(String nomUser);

	public Usuario findFirstByEmail(String email);

}
