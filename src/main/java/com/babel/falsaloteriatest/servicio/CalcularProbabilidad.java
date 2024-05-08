package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import org.springframework.stereotype.Service;

@Service
public class CalcularProbabilidad implements ICalcularProbabilidad{
    @Override
    public void aumentarProbabilidad(Bola bola) {
        double probabilidadAumentada = bola.getProbabilidad()+ 0.1;
        bola.setProbabilidad(probabilidadAumentada);
    }

    @Override
    public void reducirProbabilidad(Bola bola) {
        double probabilidadReducida = bola.getProbabilidad() - 0.9;
        if (probabilidadReducida <= 0){
            bola.setPuedeSalir(false);
        }
        bola.setProbabilidad(probabilidadReducida);
    }
}
