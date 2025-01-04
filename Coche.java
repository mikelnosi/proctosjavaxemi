package Objetos;

public class Coche {

    // ATRIBUTOS
    private String nombre;
    private int ruedas;
    private int puertas;
    private int retrovisores;
    private String motor;
    private String combustible;
    private String color;

    // CONSTRUCTOR CON PARAMETROS
    public Coche(String nombre, int ruedas, int puertas, int retrovisores, String motor, String combustible,
            String color) {
        this.nombre = nombre;
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.retrovisores = retrovisores;
        this.motor = motor;
        this.combustible = combustible;
        this.color = color;
    }

    // CONSTRUCTOR VACIO
    public Coche() {
    }

    // METODOS GETTER Y SETTER
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

    // METODO TO STRING
    @Override
    public String toString() {
        return String.format(
                "Nombre= %s, ruedas= %d, puertas= %d, retrovisores= %d, motor= %s, combustible= %s, color= %s",
                nombre, ruedas, puertas, retrovisores, motor, combustible, color);
    }


}
