package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;

import java.util.List;

public interface ILoteriaService {
    void inicializarLoteria();
    List<Integer> listarGanadores(int size);

    void introducirNuevoGanador(int numGanador);

    List<Bola> mostrarPorBombo(int numBombo);

    List<Bola> mostrarPorDigito(int numAJugar);

}
