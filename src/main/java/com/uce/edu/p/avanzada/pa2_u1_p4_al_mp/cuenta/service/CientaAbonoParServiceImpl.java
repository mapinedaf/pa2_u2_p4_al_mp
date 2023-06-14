package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("par")
public class CientaAbonoParServiceImpl implements CuentaAbonoService {

    @Override
    public BigDecimal abonoPorDia(BigDecimal saldo) {

        double descuento = 1.05;

        saldo = saldo.multiply(BigDecimal.valueOf(descuento));

        return saldo; 

        
    }
    
}
