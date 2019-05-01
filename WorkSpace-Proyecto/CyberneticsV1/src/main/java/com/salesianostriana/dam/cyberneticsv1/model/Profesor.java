/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jleal
 * @version 1.0
 * 
 * Esta clase es la entidad de Profesor
 *
 */
@Data @NoArgsConstructor
@Entity
public class Profesor {
	

	private boolean isAdmin;

	/**
	 * @param isAdmin En el caso de que el usuario sea administrador
	 */
	public Profesor(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	
	

}
