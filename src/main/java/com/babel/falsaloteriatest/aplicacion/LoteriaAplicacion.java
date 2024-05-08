package com.babel.falsaloteriatest.aplicacion;

import com.babel.falsaloteriatest.modelo.Loteria;
import com.babel.falsaloteriatest.servicio.IBomboService;
import com.babel.falsaloteriatest.servicio.ILoteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoteriaAplicacion {
    @Autowired
    ILoteriaService loteriaService;
    @Autowired
    IBomboService bomboService;
    public void run() {
        Loteria loteria = loteriaService.inicializarLoteria();
        System.out.println(loteria);
    }
}
