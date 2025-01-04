package Objetos;

public class Garaje {
    // ATRIBUTOS
    private String nombre; //
    private double tamanio; // metros cuadrados que tien el garaje
    private int horario; // horario de apertura
    private Coche coche[]; // cantidad de coches que puede almacenar *Array de coches*
    private Moto moto[]; // cantidad de coches que puede almacenar *Array de coches*
    private Camion camiones[]; // cantidad de coches que puede almacenar *Array de camion*

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
        this.moto = new Moto[capacidad];
        this.camiones = new Camion[capacidad];
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

    public Moto[] getMoto() {
        return moto;
    }

    public void setMoto(Moto[] moto) {
        this.moto = moto;
    }

    public Camion[] getCamion() {
        return camiones;
    }

    public void setCamion(Camion[] camion) {
        this.camiones = camion;
    }

    // METODO PARA MOSTRAR TODOS LOS COCHES QUE HAYA EN EL GARAJE
    public void mostrarCoche() {
        System.out.println("Los coches que hay en el garaje son: ");
        for (int i = 0; i < coche.length; i++) {
            if(coche[i] != null) {
                System.out.println(coche[i].toString());
            } else {
                System.out.println("Posición " + i + ": Vacía.");
            }

        }
    }

    //METODO PARA MOSTRAR TODOS LOS MOTOS QUE HAYA EN EL GARAJE 'ARRAY MOTOS'
    public void mostrarMoto() {
        System.out.println("las motos que hay en el garaje son");
        for (int i = 0; i < moto.length; i++) {
            if(moto[i] != null) {
                System.out.println(moto[i].toString());
            } else {
                System.out.println("Posición " + i + ": Vacía.");
            }
        }
    }

    //metodo mostrar array camiones
    public static void mostrarCamion() {
        System.out.println("Camiones que hay en el garaje:");
        for (int i = 0; i < camiones.length; i++) {
            if (camiones[i] != null) {
                System.out.println(camiones[i].toString());
            } else {
                System.out.println("Posición " + i + ": Vacía.");
            }
        }
    }

    public void agregarCamion(int posicion, Camion camion) {
        if (posicion >= 0 && posicion < camiones.length) {
            camiones[posicion] = camion;
        } else {
            System.out.println("Posición fuera de rango.");
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
//