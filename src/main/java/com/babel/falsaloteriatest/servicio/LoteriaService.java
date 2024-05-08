package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LoteriaService implements ILoteriaService{

    @Override
    public Set<Bombo> listarGanadores(int size) {
        return Set.of();
    }

    @Override
    public void introducirNuevoGanador(int numGanador) {

    }

    @Override
    public List<Bola> mostrarPorBombo(int numBombo) {
        return List.of();
    }

    @Override
    public List<Bola> mostrarPorDigito(int numAJugar) {
        return List.of();
    }
}
