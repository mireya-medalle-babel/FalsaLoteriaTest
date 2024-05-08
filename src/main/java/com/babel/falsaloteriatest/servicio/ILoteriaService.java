package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;

import java.util.List;
import java.util.Set;

public interface ILoteriaService {
    Set<Bombo> listarGanadores(int size);

    void introducirNuevoGanador(int numGanador);

    List<Bola> mostrarPorBombo(int numBombo);

    List<Bola> mostrarPorDigito(int numAJugar);
}