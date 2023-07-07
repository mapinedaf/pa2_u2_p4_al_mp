package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.SitioDeInteres;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.SitioDeInteresService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	SitioDeInteresService sitioDeInteresService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SitioDeInteres sitio1 = SitioDeInteres.builder()
				.nombre("Parque alborada")
				.ubicacion("AV3 & pasage")
				.horaApertura(LocalTime.of(6, 0))
				.horaCierre(LocalTime.of(20, 0))
				.esAireLibre(true)
				.calificacion(4.7)
				.costoDeEntrada(BigDecimal.valueOf(0))
				.categoria("parque")
				.build();
		SitioDeInteres sitio2 = SitioDeInteres.builder()
				.nombre("Museo de quimica")
				.ubicacion("AV2 & Smirnof")
				.horaApertura(LocalTime.of(9, 0))
				.horaCierre(LocalTime.of(22, 0))
				.esAireLibre(false)
				.calificacion(4.6)
				.costoDeEntrada(BigDecimal.valueOf(5))
				.categoria("museo")
				.build();
		SitioDeInteres sitio3 = SitioDeInteres.builder()
				.nombre("Mirador Bellavista")
				.ubicacion("Cerro solitario")
				.horaApertura(LocalTime.of(6, 0))
				.horaCierre(LocalTime.of(20, 0))
				.esAireLibre(true)
				.calificacion(4.9)
				.costoDeEntrada(BigDecimal.valueOf(0))
				.categoria("mirador")
				.build();
		SitioDeInteres sitio4 = SitioDeInteres.builder()
				.nombre("Museo Arqueologico")
				.ubicacion("AV Indiana & Jones")
				.horaApertura(LocalTime.of(9, 0))
				.horaCierre(LocalTime.of(20, 0))
				.esAireLibre(false)
				.calificacion(4.75)
				.costoDeEntrada(BigDecimal.valueOf(6))
				.categoria("museo")
				.build();


				/* 
		this.sitioDeInteresService.registrarSitio(sitio1);
		this.sitioDeInteresService.registrarSitio(sitio2);
		this.sitioDeInteresService.registrarSitio(sitio3);
		this.sitioDeInteresService.registrarSitio(sitio4);
	*/

		System.out.println("Recomienda sitios co mas de 4.5 de calificacion y si esta lluviendo solo los que no son al aire libre");


		System.out.println(this.sitioDeInteresService.reporteSitiosRecomendados());
		
	}

}
