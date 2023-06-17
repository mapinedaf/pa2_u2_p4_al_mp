package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Hotel {

    @Id
    private Integer id;
    private String nombre;
    private String direccion;


    @OneToMany(mappedBy = "hotel" )
    private List<Habitacion> Habitaciones;
}
