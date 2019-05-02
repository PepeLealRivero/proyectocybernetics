/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jleal
 * @version 1.0
 * 
 * Esta clase modela los Pedidos
 *
 */
@Data @NoArgsConstructor
@Entity
public class Pedido {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long idPedido;
	
	private LocalDate fechaPedido;
	private double total;
	
	@OneToMany(mappedBy = "pedido")
	private List<Alumno> alumno;
	/**
	 * @param fechaPedido Fecha que se realiza el pedido
	 * @param total Precio total del pedido
	 */
	public Pedido(LocalDate fechaPedido, double total) {
		this.fechaPedido = fechaPedido;
		this.total = total;
	}
	
	

}
