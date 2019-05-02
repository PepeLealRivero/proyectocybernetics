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
 * Esta clase es la entidad de Curso
 *
 */
@Data @NoArgsConstructor
@Entity
public class Curso {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private LocalDate fechaInicio;
	private int duracion;
	private String descripcion;
	private double precio;
	private String image;
	
	@OneToMany(mappedBy = "curso")
	private List<LineaPedido> lineaPedido;
	
	/**
	 * @param nombre Nombre del curso
	 * @param fechaInicio Fecha de inicialización del curso
	 * @param duracion Duración del curso
	 * @param descripcion Descripcion del curso
	 * @param precio Precio del curso
	 * @param image Imagen del curso
	 */
	public Curso(String nombre, LocalDate fechaInicio, int duracion, String descripcion, double precio, String image) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.image = image;
	}
	
	public void addLineaPedido(LineaPedido lin) {
		this.lineaPedido.add(lin);
		lin.setCurso(this);
	}
	
	public void removeLineaPedido(LineaPedido lin) {
		this.lineaPedido.remove(lin);
		lin.setCurso(null);
	}
	
	
	

}
