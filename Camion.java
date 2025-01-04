package Objetos;

public class Camion {

    // ATRIBUTOS
    private String nombre;
    private int ruedas;
    private int puertas;
    private int retrovisores;
    private String motor;
    private String combustible;
    private String color;

    @Override
    public String toString() {
        return "Camion{" +
                "nombre='" + nombre + '\'' +
                ", ruedas=" + ruedas +
                ", puertas=" + puertas +
                ", retrovisores=" + retrovisores +
                ", motor='" + motor + '\'' +
                ", combustible='" + combustible + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(int retrovisores) {
        this.retrovisores = retrovisores;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Camion(String nombre, String color, String combustible, String motor, int retrovisores, int puertas, int ruedas) {
        this.nombre = nombre;
        this.color = color;
        this.combustible = combustible;
        this.motor = motor;
        this.retrovisores = retrovisores;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    public Camion() {
    }
}
