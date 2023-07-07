package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.SitioDeInteres;

public interface SitioDeInteresService {
        public void registrarSitio(SitioDeInteres sitioDeInteres);

    public SitioDeInteres buscarSitioPorId(Integer id);

    public void actualizarSitio(SitioDeInteres sitioDeInteres);

    public void borrarSitio(SitioDeInteres sitioDeInteres);

    public List<SitioDeInteres> reporteSitiosRecomendados();
}
