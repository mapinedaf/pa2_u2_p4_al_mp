package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstdianteService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private EstdianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante estudiante = Estudiante.builder()
			.nombre("Marco")
			.apellido("Fernandez")
			.cedula("1718677205")
			.build();

		System.out.println("Insertando: " + estudiante);
		
		
		estudianteService.agregar(estudiante);
		

		System.out.println("buscando: " + estudiante.getCedula() );

		estudianteService.buscarPorCedula(estudiante.getCedula());

		
		String nuevoNombre = "Andre";
		System.out.println( "Actualizando: " +estudiante.getNombre() + " a "+ nuevoNombre );

		estudiante.setNombre(nuevoNombre);
		estudianteService.actualizarEstudiante(estudiante);
		
		System.out.println(estudianteService.buscarPorCedula(estudiante.getCedula()));

		System.out.println("Borrando: " + estudiante.getCedula());

		estudianteService.eliminarPorCedula(estudiante.getCedula());
		
	}

}
