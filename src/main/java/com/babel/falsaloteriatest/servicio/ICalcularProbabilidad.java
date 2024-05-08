package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;

public interface ICalcularProbabilidad {
    void aumentarProbabilidad(Bola bola);
    void reducirProbabilidad(Bola bola);
}
