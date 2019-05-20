package com.salesianostriana.dam.cyberneticsv1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.repository.UsuarioRepository;

@SpringBootApplication
public class CyberneticsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(CyberneticsV1Application.class, args);

	}

	

}
