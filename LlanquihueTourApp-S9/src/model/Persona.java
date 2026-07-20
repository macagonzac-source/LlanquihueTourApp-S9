package model;

import utils.ValidacionException;

public abstract class Persona implements Registrable {
    private String rut;
    private String nombre;
    private Direccion direccion;

    public Persona(String rut, String nombre, Direccion direccion) throws ValidacionException {
        if (rut == null || rut.trim().isEmpty()) {
            throw new ValidacionException("El RUT no puede estar vacío.");
        }

        // 2. Expresión regular para validar formato RUT chileno:
        // ^[0-9]{7,8} -> Entre 7 y 8 números al inicio
        // -           -> Un guión obligatorio
        // [0-9kK]$    -> Termina en un dígito del 0 al 9, letra 'k' o 'K'
        String regexRut = "^[0-9]{7,8}-[0-9kK]$";

        if (!rut.matches(regexRut)) {
            throw new ValidacionException("Error de Integridad: El RUT '" + rut + "' no tiene un formato válido chileno (7-8 dígitos, guión y DV).");
        }

        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Dirección: [" + direccion + "]";
    }
}
