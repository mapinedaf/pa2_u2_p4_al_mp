package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.MatriculaRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.EstudianteDTO;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.MatriculaDTO;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstudianteService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.HotelService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.MatriculaService;


@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	EstudianteService estudianteService;

	@Autowired
	MatriculaService matriculaService;

	@Autowired
	HotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//List<EstudianteDTO> lista = estudianteService.buscarTodoDTO();
		//lista.stream().forEach(x -> System.out.println(x));

		//matriculaService.buscarTodosDTO().stream().forEach(x->System.out.println(x));

		hotelService.buscarPorNumero(1).getHabitaciones();
		
	}

}
