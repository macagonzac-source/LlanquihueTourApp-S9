package model;

public class Direccion {
    private String calle;
    private String comuna;
    private String region;

    public Direccion(String calle, String comuna, String region) {
        this.calle = calle;
        this.comuna = comuna;
        this.region = region;
    }

    // Getters y Setters (Encapsulamiento)
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }
    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    @Override
    public String toString() {
        return calle + ", " + comuna + ", Región " + region;
    }
}
