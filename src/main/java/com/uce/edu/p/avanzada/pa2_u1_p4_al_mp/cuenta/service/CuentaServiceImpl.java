package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.BiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.CuentaRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.cuenta.repository.model.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Qualifier("par")
    @Autowired
    private CuentaAbonoService servicePar;

    @Qualifier("impar")
    @Autowired
    private CuentaAbonoService serviceImpar;

    @Override
    public void abrirCuenta(String cedula, Character tipo, BigDecimal saldo) {

        LocalDate fecha = LocalDate.now();

        CuentaAbonoService service = fecha.getDayOfMonth() % 2 == 0 ? servicePar : serviceImpar;

        saldo = service.abonoPorDia(saldo);

        Cuenta cuenta = Cuenta.builder()
                .saldo(saldo)
                .cedulaPropietario(cedula)
                .tipo(tipo)
                .fechaApertura(fecha)
                .numero(Math.abs(new Random().nextInt()) + "")
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
