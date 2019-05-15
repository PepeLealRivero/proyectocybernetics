/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jose
 * @version 1.0
 * 
 *          Esta clase es la entidad de Profesor
 */

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nomUser;
	private String pass;
	private String email;
	private String nombre;
	private String apellidos;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNac;
	private String ciudad;
	private String pais;
	private String dni;
	private String direccion;
	private int codigoPostal;
	private float telefono;
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

	public Usuario(String nomUser, String pass, String email, String nombre, String apellidos, LocalDate fechaNac,
			String ciudad, String pais, String dni, String direccion, int codigoPostal, float telefono) {
		this.nomUser = nomUser;
		this.pass = pass;
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.ciudad = ciudad;
		this.pais = pais;
		this.dni = dni;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
	}

}
