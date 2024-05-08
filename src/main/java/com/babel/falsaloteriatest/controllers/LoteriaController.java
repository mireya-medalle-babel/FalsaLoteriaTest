package com.babel.falsaloteriatest.controllers;

import com.babel.falsaloteriatest.modelo.Bola;
import com.babel.falsaloteriatest.servicio.ILoteriaService;
import com.babel.falsaloteriatest.servicio.LoteriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/loteria")
public class LoteriaController {
    private final ILoteriaService loteriaService;

    public LoteriaController(ILoteriaService loteriaService) {
        this.loteriaService = loteriaService;
    }

    @GetMapping(value = "/ganadores")
    public List<Integer> listarGanadores(Integer size){
        return loteriaService.listarGanadores(size);
    }

    @PostMapping(value = "/{numGanador}")
    public void introducirGanador(Integer numGanador) {
        loteriaService.introducirNuevoGanador(numGanador);
    }
    @PostMapping(value = "/{numBombo}/probabilidad")
    public List<Bola> mostrarPorBombo(Integer numBombo){
        return loteriaService.mostrarPorBombo(numBombo);
    }
    public List<Bola> mostrarPorDigito(Integer digito){
        return loteriaService.mostrarPorDigito(digito);
    }
    public void cacularProbabilidad(Integer numeroAJugar){
    }
    /*
    Listar ganadores (Integer size) { Te da los "size" ultimos números ganadores }
    Introducir nuevo ganador(Integer numGanador) { Add a la lista de ganadores }
    Mostrar por bombo (Integer numBombo) { Te devuelve los pesos de todos los dígitos posibles en el bombo 'numBombo' }
    Mostrar por dígito (Integer digito) { Te devuelve los pesos del dígito introducido en cada bombo }
    Calcular probabilidad (Integer numeroAJugar) { Maravilloso }
     */
}
