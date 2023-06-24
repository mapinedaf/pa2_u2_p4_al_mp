package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

public interface EstudianteService {

    public void agregar(Estudiante estudiante);

    public Estudiante buscarPorCedula(String cedula);

    public void actualizarEstudiante(Estudiante estudiante);

    public void eliminarPorCedula(String cedula);

    public Estudiante buscarPorApellido(String apellido);

    public List<Estudiante> reportePorApellido(String apellido);

    public Estudiante buscarPorApellidoYNombre(String apellido, String nombre);
    
    public Estudiante buscarPorApellidoTyped(String apellido);

}
