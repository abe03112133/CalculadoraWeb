package com.calculadora.controller;

import com.calculadora.model.OperacionRequest;
import com.calculadora.model.OperacionResponse;
import com.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para las operaciones de la calculadora
 * Maneja las peticiones HTTP y coordina con el servicio
 *
 * Historias de Usuario: H1, H2, H3, H4, H5
 * Desarrollado por: Abel Méndez, Luis Ramírez
 *
 * @author Abel Méndez, Luis Ramírez
 * @since 2024-10-22
 */
@Controller
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    /**
     * Muestra la página principal de la calculadora
     * Historia de Usuario H1: Aplicación web accesible desde navegador
     *
     * @return Nombre de la vista (index.html)
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Endpoint para sumar dos números
     * Historia de Usuario H2: Suma
     * Desarrollado por: Abel Méndez
     *
     * @param request Objeto con los dos números a sumar
     * @return ResponseEntity con el resultado de la operación
     */
    @PostMapping("/api/sumar")
    @ResponseBody
    public ResponseEntity<OperacionResponse> sumar(@RequestBody OperacionRequest request) {
        try {
            double resultado = calculadoraService.sumar(
                    request.getNumero1(),
                    request.getNumero2()
            );
            OperacionResponse response = new OperacionResponse(resultado, "suma");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            OperacionResponse response = new OperacionResponse(false, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

    /**
     * Endpoint para restar dos números
     * Historia de Usuario H3: Resta
     * Desarrollado por: Luis Ramírez
     *
     * @param request Objeto con los dos números a restar
     * @return ResponseEntity con el resultado de la operación
     */
    @PostMapping("/api/restar")
    @ResponseBody
    public ResponseEntity<OperacionResponse> restar(@RequestBody OperacionRequest request) {
        try {
            double resultado = calculadoraService.restar(
                    request.getNumero1(),
                    request.getNumero2()
            );
            OperacionResponse response = new OperacionResponse(resultado, "resta");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            OperacionResponse response = new OperacionResponse(false, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

    /**
     * Endpoint para multiplicar dos números
     * Historia de Usuario H4: Multiplicación
     * Desarrollado por: Ana Torres
     *
     * @param request Objeto con los dos números a multiplicar
     * @return ResponseEntity con el resultado de la operación
     */
    @PostMapping("/api/multiplicar")
    @ResponseBody
    public ResponseEntity<OperacionResponse> multiplicar(@RequestBody OperacionRequest request) {
        try {
            double resultado = calculadoraService.multiplicar(
                    request.getNumero1(),
                    request.getNumero2()
            );
            OperacionResponse response = new OperacionResponse(resultado, "multiplicación");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            OperacionResponse response = new OperacionResponse(false, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

    /**
     * Endpoint para dividir dos números
     * Historia de Usuario H5: División con validación
     * Desarrollado por: Abel Méndez
     *
     * @param request Objeto con los dos números a dividir
     * @return ResponseEntity con el resultado de la operación
     */
    @PostMapping("/api/dividir")
    @ResponseBody
    public ResponseEntity<OperacionResponse> dividir(@RequestBody OperacionRequest request) {
        try {
            double resultado = calculadoraService.dividir(
                    request.getNumero1(),
                    request.getNumero2()
            );
            OperacionResponse response = new OperacionResponse(resultado, "división");
            return ResponseEntity.ok(response);
        } catch (ArithmeticException e) {
            OperacionResponse response = new OperacionResponse(false, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        } catch (Exception e) {
            OperacionResponse response = new OperacionResponse(false, "Error en la operación");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}