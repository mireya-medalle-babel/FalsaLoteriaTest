package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;

import java.util.Set;

public interface IBomboService {

    Bombo inicializarBombo();
    int bolaGanadora(Set<Bola> bolas);

}
