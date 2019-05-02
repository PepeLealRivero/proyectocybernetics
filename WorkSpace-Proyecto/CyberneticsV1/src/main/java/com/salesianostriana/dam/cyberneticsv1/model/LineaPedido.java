/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jose
 * @version 1.0
 * 
 * Esta clase modela la Línea de Pedido
 *
 */
@Data @NoArgsConstructor
@Entity
public class LineaPedido {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private double pvpUnitario;
	
	@ManyToOne
	private Curso curso;

	/**
	 * @param pvpUnitario Precio Unitario de la linea de pedido
	 */
	public LineaPedido(double pvpUnitario) {
		this.pvpUnitario = pvpUnitario;
	}

	/**
	 * @param id
	 * @param pvpUnitario
	 * @param curso
	 */
	public LineaPedido(double pvpUnitario, Curso curso) {
		this.pvpUnitario = pvpUnitario;
		this.curso = curso;
	}
	
	
	
	
	
	

}
