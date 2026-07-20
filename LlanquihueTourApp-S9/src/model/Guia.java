package model;

import utils.ValidacionException;

public class Guia extends Persona {
    private String idiomaCertificado;

    public Guia(String rut, String nombre, Direccion direccion, String idiomaCertificado) throws ValidacionException {
        super(rut, nombre, direccion);
        this.idiomaCertificado = idiomaCertificado;
    }

    public String getIdiomaCertificado() { return idiomaCertificado; }

    @Override
    public void registrar() {
        System.out.println("✅ Registrando de forma exitosa al Guía: " + getNombre());
    }

    @Override
    public String obtenerResumen() {
        return "[GUÍA] " + getNombre() + " (Idiomas: " + idiomaCertificado + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " | Idioma: " + idiomaCertificado;
    }
}
