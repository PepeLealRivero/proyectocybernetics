/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jose
 * @version 1.0
 * 
 * Esta clase modela los Tipos de Formación
 */
@Data @NoArgsConstructor
@Entity
public class TipoFormacion {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	@OneToMany(mappedBy = "tipoFormacion")
	private List<Categoria> categorias;

	/**
	 * @param nombre Nombre del tipo de formación
	 */
	public TipoFormacion(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCategoria(Categoria cat) {
		this.categorias.add(cat);
		cat.setTipoFormacion(this);
	}
	
	public void removeCategoria(Categoria cat) {
		this.categorias.remove(cat);
		cat.setTipoFormacion(null);
	}

	
	
	

}
