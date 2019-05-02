/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.cyberneticsv1.model.Pedido;

/**
 * @author jleal
 * @version 1.0
 *
 */
public interface PedidoRepository 
				extends JpaRepository<Pedido, Long> {

}
