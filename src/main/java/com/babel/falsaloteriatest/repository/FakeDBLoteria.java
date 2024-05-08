package com.babel.falsaloteriatest.repository;

import com.babel.falsaloteriatest.modelo.Loteria;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class FakeDBLoteria implements IFakeDBLoteria{
    private final Loteria loteria;

    public FakeDBLoteria (){
        loteria = new Loteria();
    }


    @Override
    public void introducirNuevoGanador(int numGanador) {
        loteria.getGanadores().add(numGanador);
    }


}
