package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.service.CuentaService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstdianteService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private CuentaService cuentaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		cuentaService.abrirCuenta("14555", 'A', BigDecimal.valueOf(100));
		System.out.println(cuentaService.buscarCuenta(4));
		
		
	}

}
