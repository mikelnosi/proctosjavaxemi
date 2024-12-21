public class Garaje {
    // ATRIBUTOS
    private String nombre; //
    private double tamanio; // metros cuadrados que tien el garaje
    private int horario; // horario de apertura
    private Coche coche[]; // cantidad de coches que puede almacenar *Array de coches*
    private Moto moto[]; // cantidad de coches que puede almacenar *Array de coches*
    private Moto camion[]; // cantidad de coches que puede almacenar *Array de camion*
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
        this.camion = new Camion[capacidad];
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
    public Moto[] getMoto(){
        return moto;
    }
    public void setMoto(Moto[] moto){
        this.moto = moto;
    }
    public void getCoche(){
        return camion;
    }
    public void setCamion(camion[]){
        this camion = camion;
    }

    // METODO PARA MOSTRAR TODOS LOS COCHES QUE HAYA EN EL GARAJE
    public void mostrarCoche() {
        System.out.println("Los coches que hay en el garaje son: ");
        for (int i = 0; i < coche.length; i++) {
            System.out.println(coche[i].toString());
        }
    }
    //METODO PARA MOSTRAR TODOS LOS MOTOS QUE HAYA EN EL GARAJE 'ARRAY MOTOS'
    public void mostrarMoto(){
        System.out.println("las motos que hay en el garaje son");
        for(int i = 0; i < moto.length;i++){
            System.out.println( moto[i].toString());

        }
    }
    //metodo mostrar array camiones
    public void mostrarCamion(){
        System.out.println("camioses que hay el garaje son");
        for(int i =0; i< camion.length;i++){
            System.out.println(camiopn[i].toString);
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