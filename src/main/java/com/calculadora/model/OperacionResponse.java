package com.calculadora.model;

/**
 * Clase modelo para las respuestas de operaciones
 * Contiene el resultado y el tipo de operación realizada
 *
 * Historia de Usuario: H1 - Aplicación web con Spring Boot
 * Desarrollado por: Luis Ramírez
 *
 * @author Luis Ramírez
 * @since 2024-10-22
 */
public class OperacionResponse {

    private double resultado;
    private String operacion;
    private boolean exito;
    private String mensaje;

    /**
     * Constructor por defecto
     */
    public OperacionResponse() {
    }

    /**
     * Constructor para respuestas exitosas
     * @param resultado Resultado de la operación
     * @param operacion Tipo de operación (suma, resta, etc.)
     */
    public OperacionResponse(double resultado, String operacion) {
        this.resultado = resultado;
        this.operacion = operacion;
        this.exito = true;
        this.mensaje = "Operación realizada exitosamente";
    }

    /**
     * Constructor para respuestas con error
     * @param exito Estado de la operación
     * @param mensaje Mensaje de error
     */
    public OperacionResponse(boolean exito, String mensaje) {
        this.exito = exito;
        this.mensaje = mensaje;
    }

    // Getters y Setters

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "OperacionResponse{" +
                "resultado=" + resultado +
                ", operacion='" + operacion + '\'' +
                ", exito=" + exito +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}