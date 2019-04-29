/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jose
 * @version 1.0
 * 
 * Esta clase modela los Tipos de Formación
 */
@Data @NoArgsConstructor
@Entity
public class TipoFormacion {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;

	/**
	 * @param nombre Nombre del tipo de formación
	 */
	public TipoFormacion(String nombre) {
		this.nombre = nombre;
	}

	
	
	

}
