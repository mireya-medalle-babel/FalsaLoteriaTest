package com.babel.falsaloteriatest;

import com.babel.falsaloteriatest.modelo.Loteria;
import com.babel.falsaloteriatest.repository.FakeDBLoteria;
import com.babel.falsaloteriatest.repository.IFakeDBLoteria;
import com.babel.falsaloteriatest.servicio.CalcularProbabilidad;
import com.babel.falsaloteriatest.servicio.LoteriaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoteriaTest {
    @Mock
    IFakeDBLoteria fakeDBLoteria;

    @InjectMocks
    LoteriaService loteriaService;





    @BeforeAll
    void beforeAll(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void daElNumeroCorrectoDeGanadores() {
        //Given
        int numGanadoresEsperado = 2;
        Loteria loteria = new Loteria();
        loteria.setGanadores(Arrays.asList(12345, 54321));
        Mockito.doNothing().when(fakeDBLoteria).introducirNuevoGanador(12345);
        Mockito.doNothing().when(fakeDBLoteria).introducirNuevoGanador(54321);
        Mockito.when(fakeDBLoteria.getLoteria()).thenReturn(loteria);

        //When
        int ganadores = loteriaService.listarGanadores(2).size();

        //Then
        Assertions.assertEquals(numGanadoresEsperado, ganadores);

    }

    @Test
    public void sizeQueLePasaMayorASizeGanadores() {
        //Given

        //When

        //Then
    }

    @Test
    public void noHayGanadores() {
        //Given

        //When

        //Then
    }


}
