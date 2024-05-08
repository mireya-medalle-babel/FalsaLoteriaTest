package com.babel.falsaloteriatest.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loteria {
    private Set<Bombo> bombos;
}
