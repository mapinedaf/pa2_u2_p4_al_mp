package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.BiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.CuentaRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.model.Cuenta;


@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public void abrirCuenta(String cedula, Character tipo, BigDecimal saldo)  {
        
        LocalDate fecha = LocalDate.now();

        int dia = Integer.parseInt(fecha.toString().split("-")[2]);

        double descuento = 1;
        
        if(dia % 2 ==0 )
            descuento = 1.05;
        
        saldo = saldo.multiply(BigDecimal.valueOf(descuento));

        Cuenta cuenta = Cuenta.builder()
                        .saldo(saldo)
                        .cedulaPropietario(cedula)
                        .tipo(tipo)
                        .fechaApertura(fecha.toString())
                        .numero(new Random().nextInt()+"")
                        .build();

        cuentaRepository.insertar(cuenta);

    }

    @Override
    public Cuenta buscarCuenta(Integer id) {
        return this.cuentaRepository.leer(id);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        this.cuentaRepository.actualizar(cuenta);
    }

    @Override
    public void eliminarCuenta(Integer id) {
        this.cuentaRepository.borrar(id);
    }
    
}
