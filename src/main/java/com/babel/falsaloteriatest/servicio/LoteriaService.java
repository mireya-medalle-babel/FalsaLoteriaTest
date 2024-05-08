package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;
import com.babel.falsaloteriatest.modelo.Loteria;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class LoteriaService implements ILoteriaService{

    private final IBomboService bomboService;

    @Override
    public Loteria inicializarLoteria() {
        List<Bombo> bombos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bombos.add(bomboService.inicializarBombo());
        }
        return new Loteria(bombos);
    }

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

    @Override
    public int realizarSorteo() {
        return 0;
    }
}
