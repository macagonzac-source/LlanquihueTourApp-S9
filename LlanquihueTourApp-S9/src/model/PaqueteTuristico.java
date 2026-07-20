package model;

public class PaqueteTuristico {
    private String idCodigo;
    private String destino;
    private double precioBase;

    public PaqueteTuristico(String idCodigo, String destino, double precioBase) {
        this.idCodigo = idCodigo;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    public String getIdCodigo() { return idCodigo; }
    public String getDestino() { return destino; }
    public double getPrecioBase() { return precioBase; }

    @Override
    public String toString() {
        return "Código: " + idCodigo + " | Destino: " + destino + " | Precio: $" + precioBase;
    }
}
