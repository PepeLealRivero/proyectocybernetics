package com.salesianostriana.dam.cyberneticsv1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.salesianostriana.dam.cyberneticsv1.service.UsuarioService;

@SpringBootApplication
public class CyberneticsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(CyberneticsV1Application.class, args);
			
	}
	public CommandLineRunner init(UsuarioService u) {
		return args -> {
			
			System.out.println(u.findById(1L));
			
					
		};
	}
	

}
