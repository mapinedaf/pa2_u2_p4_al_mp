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

		Estudiante estudiante = Estudiante.builder()
				.cedula("123098")
				.nombre("Dani")
				.apellido("Milagro")
				.peso(Double.valueOf(110))
				.build();

		Estudiante estudiante2 = Estudiante.builder()
				.cedula("123548")
				.nombre("David")
				.apellido("Noboa")
				.peso(Double.valueOf(90))
				.build();

		// estudianteService.agregar(estudiante);

		// estudianteService.agregar(estudiante2);

		System.out.println(estudianteService.buscarEstudianteDinamico("Dani", "Milagro", 110.0));

		System.out.println(estudianteService.buscarEstudianteDinamico("David", "Noboa", 90.0));

		System.out.println(estudianteService.eliminarPorNombre("Dani"));

		System.out.println(estudianteService.actualizarPorApellido("Kevin", "Noboa"));

	}

}
