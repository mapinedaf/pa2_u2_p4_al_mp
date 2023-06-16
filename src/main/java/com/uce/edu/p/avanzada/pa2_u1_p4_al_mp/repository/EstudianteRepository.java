package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;


public interface EstudianteRepository {

    public void insertar(Estudiante estudiante);

    public Estudiante leer(String edula);

    public void actualizar(Estudiante estudiante);

    public void borrar(String cedula);

    
}
