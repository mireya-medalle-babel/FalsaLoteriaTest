package com.babel.falsaloteriatest;

import com.babel.falsaloteriatest.aplicacion.LoteriaAplicacion;
import com.babel.falsaloteriatest.config.AppConfig;
import com.babel.falsaloteriatest.modelo.Loteria;
import com.babel.falsaloteriatest.servicio.ILoteriaService;
import com.babel.falsaloteriatest.servicio.LoteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FalsaLoteriaTestApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		LoteriaAplicacion application = context.getBean(LoteriaAplicacion.class);
		application.run();
	}

}
