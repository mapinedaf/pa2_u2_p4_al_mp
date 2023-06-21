package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Alumno;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Materia;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.LibroService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.MatriculaService;



@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {


	@Autowired
	MatriculaService lService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Materia materia = Materia.builder().nombre("calculo").build();
		Alumno alumno = Alumno.builder().nombre("juan").build();
		Matricula matricula = Matricula.builder().numero("1").fecha(LocalDate.now()).build();
		ArrayList<Matricula> matriculas = new ArrayList<>();
		matriculas.add(matricula);
		alumno.setMatriculas(matriculas);
		materia.setMatriculas(matriculas);
		matricula.setAlumno(alumno);
		matricula.setMateria(materia);
		lService.agregar(matricula);


	}

}
