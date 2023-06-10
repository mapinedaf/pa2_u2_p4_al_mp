package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;



import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Estudiante estudiante) {
        
        this.entityManager.persist(estudiante);
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        
        this.entityManager.merge(estudiante);

    }

    @Override
    public void borrar(String cedula) {

        this.entityManager.remove(leer(cedula));

    }

    @Override
    public Estudiante leer(String edula) {
        
        return this.entityManager.find(Estudiante.class,edula);
    }
    
}
