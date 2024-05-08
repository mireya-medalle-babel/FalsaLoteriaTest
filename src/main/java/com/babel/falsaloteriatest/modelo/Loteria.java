package com.babel.falsaloteriatest.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loteria {
    private List<Bombo> bombos;
    private List<Integer> ganadores;
}
