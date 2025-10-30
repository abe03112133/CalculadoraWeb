package com.calculadora.model;

/**
 * Clase modelo para las peticiones de operaciones
 * Contiene los dos números que se van a operar
 *
 * Historia de Usuario: H1 - Aplicación web con Spring Boot
 * Desarrollado por: Luis Ramírez
 *
 * @author Luis Ramírez
 * @since 2024-10-22
 */
public class OperacionRequest {

    private double numero1;
    private double numero2;

    /**
     * Constructor por defecto
     */
    public OperacionRequest() {
    }

    /**
     * Constructor con parámetros
     * @param numero1 Primer número de la operación
     * @param numero2 Segundo número de la operación
     */
    public OperacionRequest(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters y Setters

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "OperacionRequest{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }
}