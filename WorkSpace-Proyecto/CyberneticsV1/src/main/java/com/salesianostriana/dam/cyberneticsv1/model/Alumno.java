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
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author jleal
 * @version 1.0
 * 
 *          Esta clase es la entidad de Profesor
 */
@Getter @Setter 
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity(name = "Alumno")
public class Alumno extends Usuario {

	@ManyToOne
	private Pedido pedido;
	
	@ManyToMany(mappedBy="alumnos", fetch=FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();

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
			String ciudad, String pais, String dni, String direccion, String codigoPostal, String telefono, Pedido pedido, boolean cuentaCaducada,
			boolean cuentaBloqueada, boolean credencialesCaducadas) {
		super(nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono, cuentaCaducada, cuentaBloqueada, credencialesCaducadas);
		this.pedido = pedido;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}
}
