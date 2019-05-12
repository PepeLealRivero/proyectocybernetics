/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.baseservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jleal
 *
 */
public abstract class BaseServices <T, ID, R extends JpaRepository<T, ID>>{
	
	@Autowired
	protected R repositorio;

	
	
	public T add(T T) {
		return repositorio.save(T);
	}

	public T edit(T T) {
		return repositorio.save(T);
	}

	public void delete(T t) {
		repositorio.delete(t);
	}

	public void deleteById(ID id) {
		repositorio.deleteById(id);
	}

	
	public List<T> findAll(){
		return repositorio.findAll();
	}
	
	public T findById(ID id) {
		return repositorio.findById(id).orElse(null);
	}


}
