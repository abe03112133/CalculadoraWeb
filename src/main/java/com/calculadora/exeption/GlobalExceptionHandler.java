package com.calculadora.exception;

import com.calculadora.model.OperacionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Manejador global de excepciones para la aplicación
 * Captura y procesa las excepciones de manera centralizada
 *
 * Desarrollado por: Abel Méndez
 *
 * @author Abel Méndez
 * @since 2024-10-24
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Maneja excepciones aritméticas (como división por cero)
     * @param e Excepción aritmética lanzada
     * @return ResponseEntity con mensaje de error
     */
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<OperacionResponse> handleArithmeticException(ArithmeticException e) {
        OperacionResponse response = new OperacionResponse(false, e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    /**
     * Maneja excepciones generales no controladas
     * @param e Excepción general
     * @return ResponseEntity con mensaje de error genérico
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<OperacionResponse> handleGeneralException(Exception e) {
        OperacionResponse response = new OperacionResponse(
                false,
                "Error inesperado en el servidor: " + e.getMessage()
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}