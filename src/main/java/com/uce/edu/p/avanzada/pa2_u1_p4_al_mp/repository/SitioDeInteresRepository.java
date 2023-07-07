package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.SitioDeInteres;

public interface SitioDeInteresRepository {
    

    public void insertar(SitioDeInteres sitioDeInteres);

    public SitioDeInteres leer(Integer id);

    public void actualizar(SitioDeInteres sitioDeInteres);

    public void borrar(SitioDeInteres sitioDeInteres);

    public List<SitioDeInteres> leerRecomendados(double calificacion, boolean     estaLluviendo);

}
