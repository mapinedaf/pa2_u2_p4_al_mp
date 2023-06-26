package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;

public interface MatriculaRepository {
    public void crear(Matricula matricula);
    public void actualizar(Matricula matricula);
    public void borrar(Integer id);
    public Matricula leer(Integer id);

}
