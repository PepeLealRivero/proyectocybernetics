/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.cyberneticsv1.model.Profesor;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;

/**
 * @author jleal
 *
 */
public interface ProfesorRepository 
				extends JpaRepository<Profesor, Long>{
	
	public Profesor findFirstByNomUserAndPass(String nomUser, String pass);

	// List<Usuario> findNombreContainingIgnoreCase(String nombre);

	public Profesor findOneByNomUser(String nomUser);

	public Profesor findFirstByEmail(String email);

}
