package com.calculadora.service;

import org.springframework.stereotype.Service;

/**
 * Servicio que contiene la lógica de negocio para las operaciones matemáticas
 *
 * Historias de Usuario: H2, H3, H4, H5
 * Desarrollado por: Abel Méndez, Ana Torres, Luis Ramírez
 *
 * @author Equipo Scrum
 * @since 2024-10-22
 */
@Service
public class CalculadoraService {

    /**
     * Realiza la suma de dos números
     * Historia de Usuario H2: Suma de dos números
     * Desarrollado por: Abel Méndez
     *
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Resultado de la suma
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Realiza la resta de dos números
     * Historia de Usuario H3: Resta de dos números
     * Desarrollado por: Luis Ramírez
     *
     * @param num1 Primer número (minuendo)
     * @param num2 Segundo número (sustraendo)
     * @return Resultado de la resta
     */
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Realiza la multiplicación de dos números
     * Historia de Usuario H4: Multiplicación de dos números
     * Desarrollado por: Ana Torres
     *
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Resultado de la multiplicación
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Realiza la división de dos números con validación
     * Historia de Usuario H5: División con validación de división por cero
     * Desarrollado por: Abel Méndez
     *
     * @param num1 Primer número (dividendo)
     * @param num2 Segundo número (divisor)
     * @return Resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return num1 / num2;
    }
}