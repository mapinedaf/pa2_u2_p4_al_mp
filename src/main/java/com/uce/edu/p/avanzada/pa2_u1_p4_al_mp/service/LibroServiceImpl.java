package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.LibroRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;


@Service
public class LibroServiceImpl  implements LibroService{

    @Autowired
    private LibroRepository autorRepository;

    @Override
    public void agregar(Libro autor) {
        autorRepository.crear(autor);
    }

    @Override
    public Libro buscarPorId(Integer id) {
       return  autorRepository.leer(id);
    }

    @Override
    public void actualizarLibro(Libro autor) {
        autorRepository.actualizar(autor);
    }

    @Override
    public void eliminarPorId(Integer id) {
        autorRepository.borrar(id);
    }
    
}
