package utils;

// Excepción personalizada para control de reglas de negocio
public class ValidacionException extends Exception {
    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}
