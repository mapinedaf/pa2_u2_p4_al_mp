package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name="cuenta")
@Entity
public class Cuenta {
    
    @Id
    @Column(name = "cuenta_id")
    @SequenceGenerator(name="cuenta_id",sequenceName = "sec_cuenta", allocationSize = 1)
    @GeneratedValue(generator = "cuenta_id",strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="cuenta_numero")
    private String numero;
    
    @Column(name="cuenta_tipo")
    private Character tipo;
    
    @Column(name="cuenta_fecha_apertura")
    private LocalDate fechaApertura;
    
    @Column(name="cuenta_saldo")
    private BigDecimal saldo;
    
    @Column(name="cuenta_cedula_propietario")
    private String cedulaPropietario;
}
