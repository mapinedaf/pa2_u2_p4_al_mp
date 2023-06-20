package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

public interface AutorService {
    public void agregar(Autor autor);

    public Autor buscarPorId(Integer id);

    public void actualizarAutor(Autor autor);

    public void eliminarPorId(Integer id);
}
