/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author José Leal
 * @version 1.0
 * 
 * Esta clase contiene la configuración necesaria de nuestro programa.
 * Implementa una Interfaz propia de Spring
 *
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{
	
//	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/");
//		registry.addViewController("/deniedAcces");
//	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("file:files/");
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:static/img/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:static/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:static/js/");
	}
	
	
	
	

}
