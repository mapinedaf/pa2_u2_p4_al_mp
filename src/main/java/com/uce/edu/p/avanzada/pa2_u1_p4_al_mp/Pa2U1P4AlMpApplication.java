package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Habitacion;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EmpleadoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.HabitacionService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.HotelService;


@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	EmpleadoService eService;

	@Autowired
	CiudadanoService cService;

		@Autowired
	private HotelService hotelService;
	@Autowired
	private HabitacionService habitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

Hotel hotel1 = new Hotel();
		List<Habitacion> listHab = new ArrayList<>();
		Habitacion habitacion = new Habitacion();
		Habitacion habitacion2 = new Habitacion();
		

		habitacion.setNumero("42524");
		habitacion.setValor(new BigDecimal(2300));
		habitacion.setHotel(hotel1);
		habitacion2.setHotel(hotel1);
		habitacion2.setNumero("354654");
		habitacion2.setValor(new BigDecimal(23425));

		listHab.add( habitacion);
		listHab.add( habitacion2);

		hotel1.setNombre("Holliday inn");
		hotel1.setDireccion("Francisco de orellana");
		hotel1.setHabitaciones(listHab);

		this.hotelService.agregar(hotel1);
		listHab.add(Habitacion.builder().numero("ert").hotel(hotel1).build());
		this.hotelService.actualizar(hotel1);
		this.hotelService.eliminar(hotel1.getId());

		
	}

}
