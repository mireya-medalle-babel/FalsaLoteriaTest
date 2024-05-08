package com.babel.falsaloteriatest.servicio;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.modelo.Bombo;

public interface ICalcularProbabilidad {
    void aumentarProbabilidad(Bola bola);
    void reducirProbabilidad(Bola bola);
    void modificarProbabilidadBombo(Bombo bombo, Bola bola);
}
