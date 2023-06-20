package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.LibroService;



@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {


	@Autowired
	LibroService lService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libro libro = Libro.builder().titulo("Luna de pluon").editorial("alfaguara").build();
		Libro libro2 = Libro.builder().titulo("Luna de pluton 2").editorial("alfaguara").build();		
		Autor autor = Autor.builder().apellido("Rotzank").nombre("dross").build();
		Autor autor1= Autor.builder().apellido("Revilla").nombre("Angel").build();

		Set<Autor> setAutores = Set.of(autor,autor1);
		Set<Libro> setLibros = Set.of(libro,libro2);
		
		libro.setAutores(setAutores);
		autor.setLibros(setLibros);
		lService.agregar(libro);

		//libro2.setAutores(Set.of(autor,autor1));
		//autor1.setLibros(Set.of(libro,libro2));
		//lService.agregar(libro2);

	}

}
