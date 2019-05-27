/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author jleal
 * @version 1.0
 * 
 * Esta clase es la entidad de Profesor
 *
 */
@Getter @Setter 
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity(name = "Profesor")
public class Profesor extends Usuario{
	
	@ManyToMany(mappedBy="profesores")
	private List<Curso> cursos = new ArrayList<>();
	

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
			String ciudad, String pais, String dni, String direccion, String codigoPostal, String telefono,
			boolean isAdmin, boolean cuentaCaducada,
			boolean cuentaBloqueada, boolean credencialesCaducadas) {
		super(nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono, cuentaCaducada, cuentaBloqueada, credencialesCaducadas);
		this.isAdmin = isAdmin;
	}
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
//	}
	
	

	
	
	
	
	
	
	

}
