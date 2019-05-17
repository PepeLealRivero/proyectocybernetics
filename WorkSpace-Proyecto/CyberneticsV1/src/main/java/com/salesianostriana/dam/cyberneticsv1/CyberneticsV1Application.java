package com.salesianostriana.dam.cyberneticsv1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.salesianostriana.dam.cyberneticsv1.model.Alumno;
import com.salesianostriana.dam.cyberneticsv1.model.Profesor;
import com.salesianostriana.dam.cyberneticsv1.model.Usuario;
import com.salesianostriana.dam.cyberneticsv1.service.UsuarioService;

@SpringBootApplication
public class CyberneticsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(CyberneticsV1Application.class, args);
	}
		@Bean
		public CommandLineRunner init(UsuarioService servicio, BCryptPasswordEncoder passwordEncoder) {
			return args -> {
				
				Usuario user = new Profesor();
				user.setNomUser("lmlopez");
				user.setPass(passwordEncoder.encode("1234"));
				
				servicio.save(user);
				
				Usuario user2 = new Alumno();
				user.setEmail("angel.naranjo@email.com");
				user.setPass(passwordEncoder.encode("1234"));
				
				servicio.save(user2);
				
				
						
			};
	}

}
