package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstudianteService;



@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	EstudianteService eservice;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//eservice.agregar( Estudiante.builder().apellido("lugmaña").nombre("marco").build());


		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println(eservice.buscarPorApellidoYNombre("lugmaña", "marco"));
		System.out.println(eservice.reportePorApellido("perez"));
		System.out.println(eservice.buscarPorApellido("lugmaña"));
		System.out.println(eservice.buscarPorApellidoTyped("lugmaña"));
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

	}

}
