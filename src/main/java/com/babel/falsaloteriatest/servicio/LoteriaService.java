package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;
import com.babel.falsaloteriatest.repository.IFakeDBLoteria;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class LoteriaService implements ILoteriaService{

    private final IBomboService bomboService;
    private final IFakeDBLoteria fakeDBLoteria;

    @Override
    public void inicializarLoteria() {
        List<Bombo> bombos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bombos.add(bomboService.inicializarBombo());
        }
        fakeDBLoteria.getLoteria().setBombos(bombos);
    }

    @Override
    public List<Integer> listarGanadores(int size) {
        try {
            List<Integer> ganadores = this.fakeDBLoteria.getLoteria().getGanadores();
            return ganadores.subList(ganadores.size()-1-size, ganadores.size()-1);
        } catch (Error error) {
            return null;
        }
    }

    @Override
    public void introducirNuevoGanador(int numGanador) {
        this.fakeDBLoteria.introducirNuevoGanador(numGanador);
    }

    @Override
    public List<Bola> mostrarPorBombo(int numBombo) {
        Bombo bombo = this.fakeDBLoteria.getLoteria().getBombos().get(numBombo);
        return new ArrayList<>(bombo.getBolas());
    }

    @Override
    public List<Bola> mostrarPorDigito(int numAJugar) {
        List<Bombo> bombos = this.fakeDBLoteria.getLoteria().getBombos();

        return bombos.stream()
                .flatMap(b -> b.getBolas()
                        .stream()
                        .filter(bola -> bola.getNumero() == numAJugar)).toList();
    }

}
