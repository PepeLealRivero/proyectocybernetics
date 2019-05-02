/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.cyberneticsv1.model.Pedido;
import com.salesianostriana.dam.cyberneticsv1.repository.PedidoRepository;



/**
 * @author jleal
 * @version 1.0
 *
 */

@Service
public class PedidoService {

	private PedidoRepository pedidoRepository;

	/**
	 * @param pedidoRepository
	 */
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public Pedido add(Pedido ped) {
		return pedidoRepository.save(ped);
	}

	public Pedido edit(Pedido ped) {
		return pedidoRepository.save(ped);
	}

	public void delete(Pedido ped) {
		pedidoRepository.delete(ped);
	}

	public void delete(long id) {
		pedidoRepository.deleteById(id);
	}

	
	public List<Pedido> findAll(){
		return pedidoRepository.findAll();
	}
	
	public Pedido findById(long id) {
		return pedidoRepository.findById(id).orElse(null);
	}

}
