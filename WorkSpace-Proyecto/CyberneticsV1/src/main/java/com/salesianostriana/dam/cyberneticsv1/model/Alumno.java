/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jleal
 * @version 1.0
 * 
 *          Esta clase es la entidad de Profesor
 */
@Data
@NoArgsConstructor
@Entity
public class Alumno extends Usuario {

	@ManyToOne
	private Pedido pedido;

	/**
	 * @param nomUser
	 * @param pass
	 * @param email
	 * @param nombre
	 * @param apellidos
	 * @param fechaNac
	 * @param ciudad
	 * @param pais
	 * @param dni
	 * @param direccion
	 * @param codigoPostal
	 * @param telefono
	 * @param pedido
	 */
	public Alumno(String nomUser, String pass, String email, String nombre, String apellidos, LocalDate fechaNac,
			String ciudad, String pais, String dni, String direccion, int codigoPostal, float telefono, Pedido pedido) {
		super(nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono);
		this.pedido = pedido;
	}
	
	
	
}
