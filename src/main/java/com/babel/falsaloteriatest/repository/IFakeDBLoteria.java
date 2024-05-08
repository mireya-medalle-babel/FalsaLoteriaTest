package com.babel.falsaloteriatest.repository;

import com.babel.falsaloteriatest.modelo.Loteria;
import org.springframework.stereotype.Repository;


public interface IFakeDBLoteria {
    Loteria getLoteria();

    void introducirNuevoGanador(int numGanador);
}
