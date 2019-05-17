/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.cyberneticsv1.model.Curso;

/**
 * @author jleal
 *
 */
public interface CursoRepository 
				extends JpaRepository<Curso, Long>{
	
	public Curso findOneByNombre(String nombre);
	
	public Curso findOneByFechaInicio(LocalDate fechaInicio);
	
	public Curso findOneByNombreAndFechaInicio(String nombre, LocalDate fechaInicio);
	
	

}
