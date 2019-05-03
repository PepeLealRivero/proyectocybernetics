/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jose
 * @version 1.0
 * 
 * Esta clase modela las categorías dentro del tipo de Formacion concreto
 *
 */
@Data @NoArgsConstructor
@Entity
public class Categoria {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	@ManyToOne
	private TipoFormacion tipoFormacion;
	
	@OneToMany(mappedBy = "categoria")
	private List<Curso> cursos;

	/**
	 * @param nombre Nombre del tipo de categoria
	 */
	public Categoria(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCurso(Curso cu) {
		this.cursos.add(cu);
		cu.setCategoria(this);
	}
	
	public void removeCurso(Curso cu) {
		this.cursos.remove(cu);
		cu.setCategoria(null);
	}
	
	

}
