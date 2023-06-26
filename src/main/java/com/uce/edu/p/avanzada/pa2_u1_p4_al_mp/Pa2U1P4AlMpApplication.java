package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Mesa;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.MesaService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	MesaService mesaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * mesaService.guardar(
		 * Mesa.builder()
		 * .fabricante("Fabri Mesa")
		 * .material("Caoba")
		 * .paisOrigen("Angola")
		 * .precio(BigDecimal.valueOf(100))
		 * .build());
		 * 
		 * mesaService.guardar(
		 * Mesa.builder()
		 * .fabricante("Black Mesa")
		 * .material("Ebano")
		 * .paisOrigen("Peru")
		 * .precio(BigDecimal.valueOf(100))
		 * .build());
		 * mesaService.guardar(
		 * Mesa.builder()
		 * .fabricante("Mesa Inc")
		 * .material("Ebano")
		 * .paisOrigen("Venezuela")
		 * .precio(BigDecimal.valueOf(100))
		 * .build());
		 * mesaService.guardar(
		 * Mesa.builder()
		 * .fabricante("Mi Mesa")
		 * .material("Caoba")
		 * .paisOrigen("Mexico")
		 * .precio(BigDecimal.valueOf(100))
		 * .build());
		 */

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Query Single Result");
		System.out.println(mesaService.buscarPorFabricante("Black Mesa"));
		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Typed Query Single Result");
		System.out.println(mesaService.buscarPorPais("Mexico"));
		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Query List Result");
		System.out.println(mesaService.buscarListaPorMaterial("Ebano"));
		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Typed Query List Result");
		System.out.println(mesaService.buscarListaPorPrecio(BigDecimal.valueOf(100)));
		System.out.println("-------------------------------------------------------------------------------------");

	}

}
