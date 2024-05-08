package com.babel.falsaloteriatest.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  Bola {
    private int numero;
    private double probabilidad;
    private boolean puedeSalir;
}
