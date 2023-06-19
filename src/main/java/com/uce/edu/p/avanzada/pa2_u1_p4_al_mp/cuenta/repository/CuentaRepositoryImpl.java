package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.model.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepositoryImpl implements CuentaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Cuenta cuenta) {
        this.entityManager.persist(cuenta);
    }

    @Override
    public Cuenta leer(Integer id) {
        return this.entityManager.find(Cuenta.class,id);
    }

    @Override
    public void actualizar(Cuenta cuenta) {
        this.entityManager.merge(cuenta);
    }

    @Override
    public void borrar(Integer id) {
        this.entityManager.remove(leer(id));
    }
    
}
