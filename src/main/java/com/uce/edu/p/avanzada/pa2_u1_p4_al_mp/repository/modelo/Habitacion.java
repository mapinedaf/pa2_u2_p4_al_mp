package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Habitacion {
    
    @Id
    private Integer id;
    private String numero;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name="habi_id_hotel")
    private Hotel hotel;


}
