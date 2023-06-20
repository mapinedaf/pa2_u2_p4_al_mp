package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.AutorRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

@Service
public class AutorServiceImpl  implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void agregar(Autor autor) {
        autorRepository.crear(autor);
    }

    @Override
    public Autor buscarPorId(Integer id) {
       return  autorRepository.leer(id);
    }

    @Override
    public void actualizarAutor(Autor autor) {
        autorRepository.actualizar(autor);
    }

    @Override
    public void eliminarPorId(Integer id) {
        autorRepository.borrar(id);
    }

    
}
