/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.baseservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jleal
 * @version 1.0
 * 
 * Esta clase es la que contiene todos los metedos generales que tendrán todos los repositorios de 
 * nuestro programa, es por ello que se trabaja con un parámetro genérico.
 *
 */
public abstract class BaseServices <T, ID, R extends JpaRepository<T, ID>>{
	
	@Autowired
	protected R repositorio;

	
	/**
	 * 
	 * @param t Es un parámetro genérico que nos sirve para cada repositorio
	 * @return El método devuelve el objeto guardado en el repositorio.
	 */
	public T save(T t) {
		return repositorio.save(t);
	}
	
	/**
	 * Localizamos una entidad en base a su Id
	 * 
	 * @param id El id de la entidad a buscar
	 * @return Devuelve la entidad encontrado por el id
	 */
	public T findById(ID id) {
		return repositorio.findById(id).orElse(null);
	}
	
	/**
	 * Obtenemos todas las entidades de un tipo de entidad
	 * @return Devuelve la lista de entidades
	 */
	public List<T> findAll() {
		return repositorio.findAll();
	}
	
	/**
	 * Editamos una instancia de una entidad (si no tiene Id, la insertamos).
	 * @param t
	 * @return La entidad guardada
	 */
	public T edit(T t) {
		return repositorio.save(t);
	}
	
	/**
	 * Eliminamos una instancia de una entidad
	 * @param t
	 */
	public void delete(T t) {
		repositorio.delete(t);
	}
	
	/**
	 * Eliminamos una instancia en base a su ID
	 * @param id
	 */
	public void deleteById(ID id) {
		repositorio.deleteById(id);
	}

}
