/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;

/**
 * @author jleal
 *
 */
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

	public Alumno findFirstByNomUserAndPass(String nomUser, String pass);

	// List<Usuario> findNombreContainingIgnoreCase(String nombre);

	public Alumno findOneByNomUser(String nomUser);

	public Alumno findFirstByEmail(String email);

}
