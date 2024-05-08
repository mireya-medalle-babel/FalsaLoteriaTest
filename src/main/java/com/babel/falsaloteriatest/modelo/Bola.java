package com.babel.falsaloteriatest.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  Bola {
    private int numero;
    private double probabilidad;
    private boolean puedeSalir;


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Bola bolaAComparar = (Bola) obj;
        return numero == bolaAComparar.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
