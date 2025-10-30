package com.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot
 * Proyecto: Calculadora Web
 * Equipo: Abel Méndez, Ana Torres, Luis Ramírez
 * Metodología: Scrum
 *
 * @author Abel Méndez
 * @since 2024-10-21
 */
@SpringBootApplication
public class Application {

    /**
     * Método principal que inicia la aplicación Spring Boot
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("===========================================");
        System.out.println("Calculadora Web iniciada correctamente");
        System.out.println("Accede en: http://localhost:8080");
        System.out.println("===========================================");
    }
}