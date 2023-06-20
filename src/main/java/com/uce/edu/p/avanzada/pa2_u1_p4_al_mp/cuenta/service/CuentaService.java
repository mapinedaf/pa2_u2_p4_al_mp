package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.service;

import java.math.BigDecimal;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.model.Cuenta;

public interface CuentaService {
    

    public void abrirCuenta(String cedula,Character tipo, BigDecimal saldo);

    public Cuenta buscarCuenta(Integer id);

    public void actualizarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Integer id);
}
