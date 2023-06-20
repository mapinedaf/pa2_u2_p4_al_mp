package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

public interface AutorRepository {
    public void crear(Autor autor);
    public void actualizar(Autor autor);
    public void borrar(Integer id);
    public Autor leer(Integer id);

}
