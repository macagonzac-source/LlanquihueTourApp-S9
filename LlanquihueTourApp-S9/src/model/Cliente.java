package model;

import utils.ValidacionException;

public class Cliente extends Persona {
    private String tipoCliente; // ej: "Nacional" o "Extranjero"

    public Cliente(String rut, String nombre, Direccion direccion, String tipoCliente) throws ValidacionException {
        super(rut, nombre, direccion);
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() { return tipoCliente; }

    @Override
    public void registrar() {
        System.out.println("✅ Registrando de forma exitosa al Cliente: " + getNombre());
    }

    @Override
    public String obtenerResumen() {
        return "[CLIENTE] " + getNombre() + " (" + tipoCliente + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipoCliente;
    }
}
