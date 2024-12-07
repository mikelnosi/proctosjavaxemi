public class Garaje {
    // ATRIBUTOS
    private String nombre; //
    private double tamanio; // metros cuadrados que tien el garaje
    private int horario; // horario de apertura
    private Coche coche[]; // cantidad de coches que puede almacenar
    /*
     * añadimos el atributo de array de motos
     * añadimos al constructor con parametros el array de motos
     * añadimos getter y setter de moto como el de coche
     * añadimos al toString tambien las motos, igual que el de coche
     */

    // CONSTRUCTOR VACIO
    public Garaje() {
    }

    // CONSTRUCTOR CON PARAMETROS Y HORARIO AUTOMATICO
    public Garaje(String nombre, double tamanio, int capacidad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.horario = 8;
        this.coche = new Coche[capacidad];
        // this.moto = new Moto[capacidad];
    }

    // METODOS GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getHorario() {
        return horario;
    }

    // HEMOS QUITADO EL SET HORARIO PORQUE NO QUEREMOS QUE SE PUEDA MODIFICAR

    public Coche[] getCoche() {
        return coche;
    }

    public void setCoche(Coche[] coche) {
        this.coche = coche;
    }

    // METODO PARA MOSTRAR TODOS LOS COCHES QUE HAYA EN EL GARAJE
    public void mostrarCoche() {
        System.out.println("Los coches que hay en el garaje son: ");
        for (int i = 0; i < coche.length; i++) {
            System.out.println(coche[i].toString());
        }
    }

    // METODO TO STRING PARA MOSTRAR INFORMACION DEL GARAJE
    public String toString(int posicion) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del garaje: " + this.getNombre() + '\n' + " Garaje{" + "tamanio=" + tamanio + ", horario="
                + horario + ", coche=" + coche[posicion] + '}');
        return sb.toString();
    }

}
