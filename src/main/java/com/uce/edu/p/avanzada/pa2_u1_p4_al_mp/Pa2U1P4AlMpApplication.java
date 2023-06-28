package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Mesa;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstudianteService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.MesaService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/* 
		estudianteService.agregar(
			Estudiante.builder()
			.cedula("123332")
			.nombre("Juanito")
			.apellido("Arcoiris")
			.build()
			);
			*/
		System.out.println("Named Typed query");
		System.out.println(estudianteService.busarPorApellidoNamed("Arcoiris"));
		System.out.println("Named query");
		System.out.println(estudianteService.buscarPorApellidoNamedQuery("Arcoiris"));

		System.out.println("Native Query");
		System.out.println(estudianteService.buscarPorApellidoNativeQuery("Arcoiris"));

		System.out.println("Native named query");
		System.out.println(estudianteService.buscarPorApellidoNativeQueryNamed("Arcoiris"));

		System.out.println(" named query nombre");
		System.out.println(estudianteService.busarPorNombreNamed("Juanito"));

		System.out.println("namd native query nombre");
		System.out.println(estudianteService.buscarPorNombreNativeQueryNamed("Juanito"));
	}

}
