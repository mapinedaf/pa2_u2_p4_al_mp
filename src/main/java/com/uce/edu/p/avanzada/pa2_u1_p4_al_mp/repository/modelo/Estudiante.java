package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

//Setter y Getter
@Setter
@Getter

//Metodo toString
@ToString

//Builder 
@Builder

//Configuracion DDL
@Table(name="estudiante")
@Entity
public class Estudiante {




    @Column(name = "estu_nombre")
    private String nombre;

    @Column(name = "estu_apellido")
    private String apellido;

    @Id
    @Column(name = "estu_cedula")
    private String cedula;
    


    
}
