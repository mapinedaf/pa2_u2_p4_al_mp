package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;


public interface EstudianteRepository {

    public void insertar(Estudiante estudiante);

    public Estudiante leer(String edula);

    public void actualizar(Estudiante estudiante);

    public void borrar(String cedula);

    public Estudiante seleccionarPorApellido(String apellido);

    public List<Estudiante> seleccionarListaPorApellido(String apellido);

    public Estudiante seleccionarPorApellidoYNombew(String apellido,String nombre);

    public Estudiante seeleccionarPorApellidoTyped(String apellido);
}
