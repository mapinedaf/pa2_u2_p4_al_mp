package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.model.Cuenta;

public interface CuentaRepository {
    
    public void insertar(Cuenta cuenta);
    public Cuenta leer(Integer id);
    public void actualizar(Cuenta cuenta);
    public void borrar(Integer id );
}
