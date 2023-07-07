package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.SitioDeInteres;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class SitioDeInteresRepositoryImpl implements SitioDeInteresRepository { 

    @Autowired
    private EntityManager entityManager;

    @Override
    public void insertar(SitioDeInteres sitioDeInteres) {
        this.entityManager.persist(sitioDeInteres);
    }

    @Override
    public SitioDeInteres leer(Integer id) {
        return this.entityManager.find(SitioDeInteres.class, id);
    }

    @Override
    public void actualizar(SitioDeInteres sitioDeInteres) {
        this.entityManager.merge(sitioDeInteres);
    }

    @Override
    public void borrar(SitioDeInteres sitioDeInteres) {
        this.entityManager.remove(sitioDeInteres);
    }

    @Override
    public List<SitioDeInteres> leerRecomendados(double calificacion, boolean estaLluviendo) {



        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery <SitioDeInteres> query = builder.createQuery(SitioDeInteres.class);

        Root<SitioDeInteres> miTablaFrom = query.from(SitioDeInteres.class);

        Predicate rating = builder.greaterThan(miTablaFrom.get("calificacion"),calificacion );

        Predicate techo = builder.equal(miTablaFrom.get("esAireLibre"), false);

        Predicate pFinal = estaLluviendo ? builder.and(rating, techo) : rating;

        query.select(miTablaFrom).where(pFinal);

        TypedQuery<SitioDeInteres> finalQuery = this.entityManager.createQuery(query);
        return finalQuery.getResultList();
    }
    
}
