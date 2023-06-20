package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl  implements AutorRepository{
    @PersistenceContext 
    private EntityManager entityManager;

        @Override
        public void crear(Autor autor) {
            this.entityManager.persist(autor);
        }

        @Override
        public void actualizar(Autor autor) {
            this.entityManager.merge(autor);
        }

        @Override
        public void borrar(Integer id) {
            this.entityManager.remove(leer(id));
        }

        @Override
        public Autor leer(Integer id) {
            return this.entityManager.find(Autor.class,id);
        }  
}
