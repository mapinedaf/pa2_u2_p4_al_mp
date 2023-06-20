package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;


@Service("impar")
public class CuentaAbonoImparServiceImpl implements CuentaAbonoService{

    @Override
    public BigDecimal abonoPorDia(BigDecimal saldo) {
    return saldo;
    }
    
}
