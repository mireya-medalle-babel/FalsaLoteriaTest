package com.babel.falsaloteriatest;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.servicio.CalcularProbabilidad;
import com.babel.falsaloteriatest.servicio.ICalcularProbabilidad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalcularProbabilidadTest {
    @InjectMocks
    CalcularProbabilidad calcularProbabilidad;

    @BeforeAll
    void beforeAll(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void probabilidadNumeroTrasSalirLaPrimeraVez(){
        // Given
        Bola bolaGanadora = new Bola(0,10,true);

        // When
        calcularProbabilidad.reducirProbabilidad(bolaGanadora);

        // Then
        Assertions.assertEquals(9.1,bolaGanadora.getProbabilidad());
    }

    @Test
    public void probabilidadNumeroTrasSalirSegundaVez(){
        // Given
        Bola bolaGanadora = new Bola(0,9.1,true);

        // When
        calcularProbabilidad.reducirProbabilidad(bolaGanadora);

        // Then
        Assertions.assertEquals(8.2,bolaGanadora.getProbabilidad());
    }

    @Test
    public void probabilidadNumeroPerdedorPorPrimeraVez(){
        //Given
        Bola bolaPerdedora = new Bola(1,10,true);

        //When
        calcularProbabilidad.aumentarProbabilidad(bolaPerdedora);

        //Then
        Assertions.assertEquals(10.1,bolaPerdedora.getProbabilidad());
    }

    @Test
    public void probabilidadNumeroPerdedorPorSegundaVez(){
        //Given
        Bola bolaPerdedora = new Bola(1,10.1,true);

        //When
        calcularProbabilidad.aumentarProbabilidad(bolaPerdedora);

        //Then
        Assertions.assertEquals(10.2,bolaPerdedora.getProbabilidad());
    }

    @Test
    public void probabilidadNumeroTrasSalirLaPrimeraVezYLuegoSalirOtroNumero(){
        //Given
        Bola bolaPerdedora = new Bola(2,9.1,true);

        //When
        calcularProbabilidad.aumentarProbabilidad(bolaPerdedora);

        //Then
        Assertions.assertEquals(9.2,bolaPerdedora.getProbabilidad());
    }

    @Test
    public void probabilidadNegativaNumero(){
        //Given
        Bola bolaPerdedora = new Bola(0,0,true);

        //When
        calcularProbabilidad.reducirProbabilidad(bolaPerdedora);

        //Then
        Assertions.assertFalse(bolaPerdedora.isPuedeSalir());
    }

    @Test
    public void probabilidadIgualZero(){
        //Given
        Bola bolaPerdedora = new Bola(0,0.9,true);

        //When
        calcularProbabilidad.reducirProbabilidad(bolaPerdedora);

        //Then
        Assertions.assertFalse(bolaPerdedora.isPuedeSalir());
    }
    /*
    de un solo bombo (las probabilidades):
    public void saleNumero() -> el numero es del 0 al 9 ///seria de bombo?
    public void probabilidadNumeroTrasSalirLaPrimeraVez() -> dado un numero 0, su probabilidad en el bombo es 9,1%
    public void probabilidadRestoNumerosDadoLaPrimeraVezQueSaleUnNumero() ->
    dado un numero 0 que es la primera vez que sale, la probabilidad del resto de numeros es 10,1% ¿? dentro del mismo test, o test para cada número?¿
    public void probabilidadNumeroTrasSalirSegundaVez() ->
    dado un numero 0 que es la segunda vez que sale, su probabilidad es 8,2%
    public void probabilidadRestoNumerosDadoLaSegundaVezQueSaleUnNumero() ->
    el 0 ha salido dos veces, la probabilidad del resto es 10,2%
    public void probabilidadNumeroTrasSalirLaPrimeraVezYLuegoSalirOtroNumero() ->
    el 0 sale (9,1%) y el resto (10,1%), sale el 1 -> 1 = 9,2% y el 0 = 9,2% y el resto 10,2%
    public void probabilidadNegativaNumero() -> 0 su probabilidad < 0.9% ->
    que no pueda salir ese número (booleano a falso).
     */
}
