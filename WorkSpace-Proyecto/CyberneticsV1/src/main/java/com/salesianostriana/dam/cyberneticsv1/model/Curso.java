/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

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
	private Long id;
	
	private String nombre;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaInicio;
	private int duracion;
	private String descripcion;
	private double precio;
	private String image;
	
	@OneToMany(mappedBy = "curso")
	private List<LineaPedido> lineaPedido;
	
	@ManyToOne
	private Categoria categoria;
	
	
	@ManyToMany
	@JoinTable(
		joinColumns = @JoinColumn(name="curso_id"),
		inverseJoinColumns = @JoinColumn(name="profesor_id")
	)
	private List<Profesor> profesores = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(
		joinColumns = @JoinColumn(name="curso_id"),
		inverseJoinColumns = @JoinColumn(name="alumno_id")
	)
	private List<Alumno> alumnos = new ArrayList<>();
	
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
	
	public void addProfesor(Profesor p) {
		profesores.add(p);
		p.getCursos().add(this);
	}
	
	public void deleteProfesor(Profesor p) {
		profesores.remove(p);
		p.getCursos().remove(this);
	}
	
	public void addAlumno(Alumno a) {
		alumnos.add(a);
		a.getCursos().add(this);
	}
	
	public void deleteAlumnos(Alumno a) {
		alumnos.remove(a);
		a.getCursos().remove(this);
	}
	
	
	

}
