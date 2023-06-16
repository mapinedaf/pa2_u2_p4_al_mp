package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EmpleadoService;


@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	EmpleadoService eService;

	@Autowired
	CiudadanoService cService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Empleado empleado = Empleado.builder().cargo("admin").build();
		eService.agregar(empleado);
		Ciudadano ciudadano = Ciudadano.builder().nombre("jose").build();

		ciudadano.setEmpleado(empleado);
		empleado.setCiudadano(ciudadano);

		cService.agregar(ciudadano);
		

		
	}

}
