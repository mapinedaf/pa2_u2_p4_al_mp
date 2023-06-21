package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class MatriculaRepositoryImpl implements MatriculaRepository {
      @PersistenceContext 
    private EntityManager entityManager;

        @Override
        public void crear(Matricula matricula) {
            this.entityManager.persist(matricula);
        }

        @Override
        public void actualizar(Matricula matricula) {
            this.entityManager.merge(matricula);
        }

        @Override
        public void borrar(Integer id) {
            this.entityManager.remove(leer(id));
        }

        @Override
        public Matricula leer(Integer id) {
            return this.entityManager.find(Matricula.class,id);
        }  
}
