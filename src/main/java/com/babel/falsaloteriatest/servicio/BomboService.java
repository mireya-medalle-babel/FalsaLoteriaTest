package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class BomboService implements IBomboService {


    @Override
    public Bombo inicializarBombo() {
        Set<Bola> bolas = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            bolas.add(new Bola(i,10,true));
        }
        return new Bombo(bolas);
    }

    @Override
    public int bolaGanadora(Set<Bola> bolas) {
        Random random = new Random();
        double valorAleatorio = random.nextDouble();
        double probabilidadAcumulada = 0;

        for (Bola bola : bolas) {
            probabilidadAcumulada += bola.getProbabilidad();
            if (valorAleatorio <= probabilidadAcumulada) {
                return bola.getNumero();
            }
        }
        return -1;
    }

}
