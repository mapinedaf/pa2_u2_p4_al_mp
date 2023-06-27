package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

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

        return this.entityManager.find(Estudiante.class, edula);
    }

    @Override
    public Estudiante seleccionarPorApellido(String apellido) {
        // sql
        // SELECT * FROM estudiante e WHERE estu_apellido =

        // JPQL
        // SELECT e FROM Estudiante e WHERE e.apellido = variable vv
        Query query = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
        query.setParameter("datoApellido", apellido);
        return (Estudiante) query.getSingleResult(); // casteo
    }

    @Override
    public Estudiante seleccionarPorApellidoYNombew(String apellido, String nombre) {
        Query query = this.entityManager
                .createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
        query.setParameter("datoApellido", apellido);
        query.setParameter("datoNombre", nombre);
        return (Estudiante) query.getSingleResult();

    }

    @Override
    public List<Estudiante> seleccionarListaPorApellido(String apellido) {
        Query query = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
        query.setParameter("datoApellido", apellido);
        return query.getResultList();
    }

    @Override
    public Estudiante seeleccionarPorApellidoTyped(String apellido) {

        TypedQuery<Estudiante> query = this.entityManager.createQuery(
                "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido",
                Estudiante.class);

        query.setParameter("datoApellido", apellido);
        return query.getSingleResult();
    }

    @Override
    public Estudiante seeleccionarPorApellidoNamed(String apellido) {
        
        TypedQuery<Estudiante> query= this.entityManager
            .createNamedQuery("Estudiante.buscaPorApellido",Estudiante.class);

        query.setParameter("datoApellido", apellido);
        return query.getSingleResult();
    }

}
