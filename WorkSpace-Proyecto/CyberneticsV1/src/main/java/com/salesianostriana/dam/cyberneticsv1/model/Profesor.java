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
public class Profesor extends Usuario{
	

	private boolean isAdmin;

	/**
	 * @param nomUser      Nombre de Usuario
	 * @param pass         Contraseña
	 * @param email        Correo electrónico
	 * @param nombre       Nombre de pila del usuario
	 * @param apellidos    Apellidos del usuario
	 * @param fechaNac     Fecha de nacimiento del usuario
	 * @param ciudad       Ciudad en la que está empadronado (dni) el usuario
	 * @param pais         País de origen del usuario
	 * @param dni          Documento identificativo del usuario
	 * @param direccion    Dirección postal del usuario
	 * @param codigoPostal Codigo Postal
	 * @param telefono     Número de contacto
	 */
	public Profesor(String nomUser, String pass, String email, String nombre, String apellidos, LocalDate fechaNac,
			String ciudad, String pais, String dni, String direccion, int codigoPostal, float telefono,
			boolean isAdmin) {
		super(nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono);
		this.isAdmin = isAdmin;
	}

	
	
	
	
	
	
	

}
