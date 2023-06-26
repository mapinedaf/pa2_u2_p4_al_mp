package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.EstudianteRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

@Service 
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public void agregar(Estudiante estudiante) {
        this.estudianteRepository.insertar(estudiante);
    }

    @Override
    public Estudiante buscarPorCedula(String cedula) {
       return this.estudianteRepository.leer(cedula);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        this.estudianteRepository.actualizar(estudiante);
    }

    @Override
    public void eliminarPorCedula(String cedula) {
        this.estudianteRepository.borrar(cedula);
    }

    @Override
    public Estudiante buscarPorApellido(String apellido) {
        return this.estudianteRepository.seleccionarPorApellido(apellido);
    }

    @Override
    public List<Estudiante> reportePorApellido(String apellido) {
        return this.estudianteRepository.seleccionarListaPorApellido(apellido);
    }

    @Override
    public Estudiante buscarPorApellidoYNombre(String apellido, String nombre) {
       return this.estudianteRepository.seleccionarPorApellidoYNombew(apellido, nombre);
    }

    @Override
    public Estudiante buscarPorApellidoTyped(String apellido) {
        return this.estudianteRepository.seeleccionarPorApellidoTyped(apellido);
    }

}
