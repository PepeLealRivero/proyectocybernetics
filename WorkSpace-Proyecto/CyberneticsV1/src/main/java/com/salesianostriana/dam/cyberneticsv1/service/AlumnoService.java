/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.baseservices.BaseServices;
import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.repository.AlumnoRepository;

/**
 * @author jleal
 *
 */
@Service
public class AlumnoService extends BaseServices<Alumno, Long, AlumnoRepository>{
	
	public Alumno findByNomUser(String nomUser) {
		return repositorio.findByUsername(nomUser);
	}

}
